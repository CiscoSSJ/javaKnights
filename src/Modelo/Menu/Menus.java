package Modelo.Menu;

import javax.swing.JOptionPane;

import Modelo.Partida.Partida;

public class Menus {

	private Partida partidaCreada;

	public void menuPrincipal(Partida partida) {
		String eleccionMenuPrincipal;
		setPartidaCreada(partida);
		JOptionPane.showMessageDialog(null,
				"<html><div style='text-align: center;'>¿Bienvenido a Java Knights!<br><br>Este es un juego creado en Java donde tendrias que demostrar tus habilidades de estrategia y combate para convertirte en un verdadero caballero.<br><br>A medida que avances en el juego, tendras la oportunidad de enfrentarte a desafiantes enemigos y ganar valiosos tesoros.<br><br>¿Preparate para embarcarte en una emocionante aventura en el mundo medieval de Java Knights!</div></html>");
		eleccionMenuPrincipal = "<html><div style='text-align: center;'>Indicanos cual es tu nombre, caballer@!<br><br></div></html>";
		partidaCreada.setNombreProtagonista(tryCatchString(eleccionMenuPrincipal));
		menuOpciones();

	}

	public void menuOpciones() {
		String eleccionMenuOpciones;
		eleccionMenuOpciones = "<html><div style='text-align: center;'>¿Que quieres hacer?<br><br>"
				+ "1. Iniciar partida<br>" + "2. Ver creditos<br>" + "3. Opciones<br>" + "4. Salir<br></div></html>";
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

			JOptionPane.showMessageDialog(null, "¡Hasta pronto  " + partidaCreada.getProtagonistaPartida().getNombre()
					+ " nos vemos en la siguiente batalla!");
			break;
		}

	}

	public void menuTutorial() {

	}

	public void menuCreditos() {
		System.out.println("Los maquinas");

	}

	public void menuPartida() {
		String eleccionMenuPartida;
		eleccionMenuPartida = "<html><div style='text-align: center;'>¿ A que reino quieres pertenecer?<br><br>"
				+ "1. Dragon<br>" + "2. Gigante<br>" + "3. Guerrero<br>" + "4. Hielo<br>" + "5. Ninja</div></html>";

		partidaCreada.getProtagonistaPartida().setNombreReino(setReinoPerteneciente(tryCatchInt(eleccionMenuPartida)));
		menuDificultad();
		combateReinos();
		JOptionPane.showMessageDialog(null, partidaCreada.getMensajeGanadorPartida());

	}

	public String setReinoPerteneciente(int eleccion) {
		String nombreReino = null;
		switch (eleccion) {
		case 1:
			nombreReino = partidaCreada.getReinos()[0].getNombreReino();
			break;
		case 2:
			nombreReino = partidaCreada.getReinos()[1].getNombreReino();
			break;
		case 3:
			nombreReino = partidaCreada.getReinos()[2].getNombreReino();
			break;
		case 4:
			nombreReino = partidaCreada.getReinos()[3].getNombreReino();
			break;
		case 5:
			nombreReino = partidaCreada.getReinos()[4].getNombreReino();
			break;
		default:
		}
		return nombreReino;

	}

	public void combateReinos() {
		boolean combateReinos = false;
		do {
			combateReinos = menuCombateRey(menuCombateSubditos());

		} while (partidaCreada.getReinos()[4].getRey() != null || !combateReinos);

	}

	// ¿Implementacion de un solo metodo para que se le pase personaje?
	public boolean menuCombateSubditos() {
		boolean subditoSalir = false;
		boolean subditoSalirBucle=false;
		String eleccionMenuCombateSubditos;
		JOptionPane.showMessageDialog(null, "Estas en el " + partidaCreada.getReino().getNombreReino() + "\n"
				+ "¡Lucha con sus subditos para conquistarlo!");
		do {

			eleccionMenuCombateSubditos = partidaCreada.getReino().getSubdito().getNombreSubditos()
					+ " te esta desafiando ¿Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar" + "\n"
					+ "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio";
			switch (tryCatchInt(eleccionMenuCombateSubditos)) {
			case 1:
				partidaCreada.getReinos()[0].debilidad(partidaCreada.getReino().getSubdito());
				break;
			case 2:
				partidaCreada.getReinos()[1].debilidad(partidaCreada.getReino().getSubdito());
				break;
			case 3:
				partidaCreada.getReinos()[2].debilidad(partidaCreada.getReino().getSubdito());
				break;
			case 4:
				partidaCreada.getReinos()[3].debilidad(partidaCreada.getReino().getSubdito());
				break;
			case 5:
				partidaCreada.getReinos()[4].debilidad(partidaCreada.getReino().getSubdito());
				break;
			default:
				break;
			}
			// Condicion para cuando falla el protagonista y se le quita vida a este
			if (partidaCreada.getReino().getSubdito() != null) {
				partidaCreada.getProtagonistaPartida().setAtaqueAProtagonista();
				JOptionPane.showMessageDialog(null, "¡" + partidaCreada.getReino().getSubdito().getNombreSubditos()
						+ " te ha quitado vida ten cuidado o moriras!");

			}

			// Condicion para cuando acierta y se le quita vida al subdito
			else if (partidaCreada.getReino().getSubdito().getVida() == 0) {
				partidaCreada.getReino().setSubdito(null);
			}

			// Condicion para cuando ya no hay ningun subdito que ponga ese reino a null y
			// pase al siguiente
			if (partidaCreada.getReino().getSubdito() == null) {

			}

			// Condicion para cuando el protagonista ha fallado muchas veces y le han
			// quitado la vida ,entonces muere y se acaba
			// el combate
			if (partidaCreada.getProtagonistaPartida().getVida() == 0) {
				mensajeHasMuerto();
				subditoSalirBucle = true;
			}

		} while (partidaCreada.getReino().getSubdito() != null && partidaCreada.getProtagonistaPartida().getVida() != 0
				&& partidaCreada.getReino() != null || !subditoSalirBucle);
		if (partidaCreada.getProtagonistaPartida().getVida() == 0) {
			subditoSalir = true;
		}
		return subditoSalir;
	}

	public boolean menuCombateRey(boolean seguir) {
		boolean combateRey = seguir;
		String eleccionMenuCombateRey;
		do {

			eleccionMenuCombateRey = "<html><div style=text align:left>" + partidaCreada.getReino().getNombreRey()
					+ " tee esta desafiando ¿Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar"
					+ "\n" + "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio</div></html>";
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

			} else {
				mensajeHasMuerto();
				combateRey = true;
			}
		} while (partidaCreada.getReino().getRey() != null || !combateRey);
		return combateRey;
	}

	public void menuDificultad() {
		String eleccionMenuDificultad;
		int dificultad = 0;
		eleccionMenuDificultad = " <html><div style='text-align: left;'>Elige a continuacion la dificultad de la partida"
				+ "\n 1. Facil - Puedes conquistar reinos facilmente."
				+ "\n 2. Media - Vas a poder conquistar con facilidad los reinos aunque algun que otro subdito te pondra las cosas dificiles"
				+ "\n 3. Dificil - En cada reino te cuestionaras si merecio la pena ir a conquistar ese reino</div></html>";
		switch (tryCatchInt(eleccionMenuDificultad)) {
		case 1:
			dificultad = 5;
			break;

		case 2:
			dificultad = 3;
			break;
		case 3:
			dificultad = 1;
		}
		partidaCreada.getReino().getRey().setAtributosRey(dificultad);
		partidaCreada.setProtagonistaPartida(dificultad);

	}

	public void mensajeHasMuerto() {
		JOptionPane.showMessageDialog(null, "Has muerto" + partidaCreada.getProtagonistaPartida().getNombre());
	}

	/**
	 * Metodo tryCatch para la entrada de datos de String con bucle incorporado
	 * 
	 * @return
	 */
	public String tryCatchString(String pregunta) {
		String eleccionTryString = null;
		boolean salirTryString = false;
		do {
			try {
				// Escaner de entrada de datos
				eleccionTryString = JOptionPane.showInputDialog(pregunta);
				if (eleccionTryString.length() <= 0) {
					throw stringVacio();
				}
				// Si todo va bien sale del bucle y del metodo
				salirTryString = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "Palabra mal introducida,vuelve a intentarlo");

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
				JOptionPane.showMessageDialog(null,
						"Numero mal introducido,vuelve a intentarlo con una de las opciones");

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
