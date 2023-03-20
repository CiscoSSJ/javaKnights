package Modelo.Menu;

import javax.swing.JOptionPane;

import Modelo.Partida.Partida;
import Modelo.Personaje.Personaje;

public class Menus {

	private Partida partidaCreada;

	public void menuPrincipal(Partida partida) {
		String eleccionMenuPrincipal;
		setPartidaCreada(partida);
		JOptionPane.showMessageDialog(null,
				"<html><div style='text-align: center;'>�Bienvenido a Java Knights!<br><br>Este es un juego creado en Java donde tendr�s que demostrar tus habilidades de estrategia y combate para convertirte en un verdadero caballero.<br><br>A medida que avances en el juego, tendr�s la oportunidad de enfrentarte a desafiantes enemigos y ganar valiosos tesoros.<br><br>�Prep�rate para embarcarte en una emocionante aventura en el mundo medieval de Java Knights!</div></html>");
		eleccionMenuPrincipal = "<html><div style='text-align: center;'>Ind�canos cu�l es tu nombre, caballer@!<br><br></div></html>";
		tryCatchString(eleccionMenuPrincipal);
		partidaCreada.setNombreProtagonista(tryCatchString(eleccionMenuPrincipal));
		menuOpciones();

	}

	public void menuOpciones() {
		String eleccionMenuOpciones;
		eleccionMenuOpciones = "<html><div style='text-align: center;'>�Que quieres hacer?<br><br>"
				+ "1. Iniciar partida<br>" + "2. Ver creditos<br>" + "3. Opciones<br>" + "4. Salir<br></div></html>";
		tryCatchInt(eleccionMenuOpciones);
		switch (tryCatchInt(eleccionMenuOpciones)) {
		case 1:
			menuPartida();
			break;
		case 2:
			menuCreditos();
			break;
		case 3:
			menuTutorial();
			break;
		case 4:
			JOptionPane.showMessageDialog(null,
					"�Hasta pronto  " + partidaCreada.getProtagonistaPartida().getNombre() + " !");
			break;
		}

	}

	public void menuTutorial() {
		// TODO document why this method is empty
	}

	public void menuCreditos() {
		System.out.println("Los m�quinas");

	}

	public void menuPartida() {
		String eleccionMenuPartida;
		eleccionMenuPartida = "<html><div style='text-align: center;'>�A qu� reino quieres pertenecer?<br><br>"
				+ "1. Dragon<br>" + "2. Gigante<br>" + "3. Guerrero<br>" + "4. Hielo<br>" + "5. Ninja</div></html>";

		setReinoPerteneciente(tryCatchInt(eleccionMenuPartida));
		combateReinos();
		JOptionPane.showMessageDialog(null, "Gracias por jugar");

	}

	public void combateReinos() {
		boolean combateReinos = false;
		do {
			menuCombateSubditos();
			combateReinos = menuCombateSubditos();
			menuCombateRey(combateReinos);
			combateReinos = menuCombateRey(combateReinos);
		} while (partidaCreada.getReino() != null || !combateReinos);

	}

	public boolean menuCombateSubditos(Personaje personaje) {
		boolean subditoSalir = false;
		String eleccionMenuCombateSubditos;
		do {
			do {
				eleccionMenuCombateSubditos = partidaCreada.getReino().getSubdito().getNombreSubditos()
						+ " tee esta desafiando �Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar"
						+ "\n" + "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio";
				tryCatchString(eleccionMenuCombateSubditos);
				switch (tryCatchInt(eleccionMenuCombateSubditos)) {
				case 1:
					if(partidaCreada.getReino().isComprobarDebilidad()==true)
					partidaCreada.getReinos()[0].debilidad(partidaCreada.getReino().getSubdito().hablar(partidaCreada.getReino().getNivel()));
					break;
				case 2:
					partidaCreada.getReinos()[1].debilidad(partidaCreada.getReino().getSubdito().esquivar(partidaCreada.getReino().getNivel()));
					break;
				case 3:
					partidaCreada.getReinos()[2].debilidad(partidaCreada.getReino().getSubdito().defender(partidaCreada.getReino().getNivel()));
					break;
				case 4:
					partidaCreada.getReinos()[3].debilidad(partidaCreada.getReino().getSubdito().desgastar(partidaCreada.getReino().getNivel()));
					break;
				case 5:
					partidaCreada.getReinos()[4].debilidad(partidaCreada.getReino().getSubdito().silencio(partidaCreada.getReino().getNivel()));
					break;
				default:
					break;
				}
				if (partidaCreada.getReino().getSubdito().getVida() != 0) {
					JOptionPane.showMessageDialog(null, "�" + partidaCreada.getReino().getNombreSubditos()
							+ " te ha quitado vida ten cuidado o moriras");
				}
					
			} while (partidaCreada.getReino().getSubdito().getVidaSubditos() != 0
					|| partidaCreada.getProtagonistaPartida().getVida() != 0);
			if (partidaCreada.getReino().getSubdito().getVida() != 0) {
				partidaCreada.getReino().setSubdito(null);

			} else {
				mensajeHasMuerto();
				subditoSalir = true;
			}
		} while (partidaCreada.getReino().getSubdito() != null || !subditoSalir);
		return subditoSalir;
	}

	public boolean menuCombateRey(boolean seguir) {
		boolean combateRey = seguir;
		String eleccionMenuCombateRey;
		do {

			eleccionMenuCombateRey = partidaCreada.getReino().getNombreRey()
					+ " tee esta desafiando �Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar"
					+ "\n" + "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio";
			tryCatchString(eleccionMenuCombateRey);
			switch (tryCatchInt(eleccionMenuCombateRey)) {
			case 1:
				partidaCreada.getReinos()[0].debilidad(partidaCreada.getReino().getRey());
				break;
			case 2:
				partidaCreada.getReinos()[1].debilidad(partidaCreada.getReino().getRey());
				break;
			case 3:
				partidaCreada.getReinos()[2].debilidad(partidaCreada.getReino().getRey());
				break;
			case 4:
				partidaCreada.getReinos()[3].debilidad(partidaCreada.getReino().getRey());
				break;
			case 5:
				partidaCreada.getReinos()[4].debilidad(partidaCreada.getReino().getRey());
				break;
			default:
				break;
			}
			while ((partidaCreada.getReino().getRey().getVida() != 0)
					|| (partidaCreada.getProtagonistaPartida().getVida() != 0))
				;
			if (partidaCreada.getReino().getRey().getVida() != 0) {
				partidaCreada.getReino().setRey(null);
				combateRey = false;
			} else {
				mensajeHasMuerto();
				combateRey = true;
			}
		} while (partidaCreada.getReino().getRey() != null || !combateRey);
		return combateRey;
	}

	public void setReinoPerteneciente(int eleccion) {

		switch (eleccion) {
		case 1:
			partidaCreada.getReinos()[0].setProtagonista(partidaCreada.getProtagonistaPartida());
			break;
		case 2:
			partidaCreada.getReinos()[1].setProtagonista(partidaCreada.getProtagonistaPartida());
			break;
		case 3:
			partidaCreada.getReinos()[2].setProtagonista(partidaCreada.getProtagonistaPartida());
			break;
		case 4:
			partidaCreada.getReinos()[3].setProtagonista(partidaCreada.getProtagonistaPartida());
			break;
		case 5:
			partidaCreada.getReinos()[4].setProtagonista(partidaCreada.getProtagonistaPartida());
		default:
		}

	}

	public void mensajeHasMuerto() {
		JOptionPane.showMessageDialog(null, "Has muerto" + partidaCreada.getProtagonistaPartida().getNombre());
	}

	/**
	 * Metodo tryCatch para la entrada de datos de String con bucle incorporado
	 * 
	 * @return
	 */
	public String tryCatchString(String eleccion) {
		String eleccionTryString = null;
		boolean salirTryString = false;
		do {
			try {
				// Escaner de entrada de datos
				eleccionTryString = JOptionPane.showInputDialog(eleccion);
				if (eleccionTryString.length() <= 0){
					throw stringVacio();
				}
				// Si todo va bien sale del bucle y del metodo
				salirTryString = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "Dato mal introducido");

			}
		} while (!salirTryString);
		return eleccionTryString;
	}

	/**
	 * Metodo tryCatch para la entrada de datos de int con bucle incorporado
	 */
	public int tryCatchInt(String pregunta) {
		int eleccionTryInt = 0;
		boolean salirTryInt = false;
		do {
			try {
				// Escaner de entrada de datos
				eleccionTryInt = Integer.parseInt(JOptionPane.showInputDialog(pregunta));
				
				// Si todo va bien sale del bucle y del metodo
				salirTryInt = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "Dato mal introducido");

			}
		} while (!salirTryInt);
		return eleccionTryInt;
	}

	/**
	 * @return the partidaCreada
	 */
	public Partida getPartidaCreada() {
		return partidaCreada;
	}

	/**
	 * @param partidaCreada the partidaCreada to set
	 */
	public void setPartidaCreada(Partida partida) {
		partidaCreada = partida;
	}
	private static Exception stringVacio() {
		return null;
	}
}
