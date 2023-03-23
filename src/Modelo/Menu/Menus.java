package Modelo.Menu;

import javax.swing.JOptionPane;

import Modelo.Partida.Partida;
import Modelo.Personaje.Personaje;

public class Menus {

	public void menuPrincipal(Partida partida) {
		String eleccionMenuPrincipal;
		JOptionPane.showMessageDialog(null,
				"<html><div style='text-align: left;'>ï¿½Bienvenido a Java Knights!<hr><br>Este es un juego creado en Java donde tendrias que demostrar tus habilidades de estrategia y combate para convertirte en un verdadero caballero.<br>A medida que avances en el juego, tendras la oportunidad de enfrentarte a desafiantes enemigos y ganar valiosos tesoros.<br>Preparate para embarcarte en una emocionante aventura en el mundo medieval de Java Knights!</div></html>");
		eleccionMenuPrincipal = "<html><div style='text-align: left;'>ï¿½Indicanos cual es tu nombre, caballer@!<br><br></div></html>";
		partida.setNombreProtagonista(tryCatchString(eleccionMenuPrincipal));
		menuOpciones(partida);

	}

	public void menuOpciones(Partida partida) {
		String eleccionMenuOpciones;
		eleccionMenuOpciones = "<html><div style='text-align: left;'>ï¿½Que quieres hacer?<hr><br>"
				+ "1. Iniciar partida<br>" + "2. Ver creditos<br>" + "3. Opciones<br>" + "4. Salir<br></div></html>";
		switch (tryCatchInt(eleccionMenuOpciones)) {
		case 1:
			menuPartida(partida);
			break;
		case 2:
			menuCreditos();
			break;
		case 3:
			menuTutorial();
			break;
		case 4:

			JOptionPane.showMessageDialog(null,
					"<html><div style='text-align: left;'>ï¿½Hasta pronto "
							+ partida.getProtagonistaPartida().getNombre()
							+ " nos vemos en la siguiente batalla!</div></html>");
			break;
			default:
				JOptionPane.showMessageDialog(null,"Has fallado muchas veces");
		}

	}

	public void menuPartida(Partida partida) {
		String eleccionMenuPartida;
		eleccionMenuPartida = "<html><div style='text-align: left;'>ï¿½ A que reino quieres pertenecer?<hr><br>"
				+ "1. Dragon<br>" + "2. Gigante<br>" + "3. Guerrero<br>" + "4. Hielo<br>" + "5. Ninja</div></html>";

		partida.getProtagonistaPartida()

		.setNombreReino(setReinoPerteneciente(partida, tryCatchInt(eleccionMenuPartida)));
		menuDificultad(partida);
		combateReinos(partida);

	}

	public void menuCreditos() {
		System.out.println("Los maquinas");

	}

	public void menuTutorial() {
   // TODO document why this method is empty
 }

	public String setReinoPerteneciente(Partida partida, int eleccion) {
		String nombreReino = null;
		switch (eleccion) {
		case 1:
			nombreReino = partida.getReinos()[0].getNombreReino();
			break;
		case 2:
			nombreReino = partida.getReinos()[1].getNombreReino();
			break;
		case 3:
			nombreReino = partida.getReinos()[2].getNombreReino();
			break;
		case 4:
			nombreReino = partida.getReinos()[3].getNombreReino();
			break;
		case 5:
			nombreReino = partida.getReinos()[4].getNombreReino();
			break;
		default:
		}
		return nombreReino;

	}

	public void menuDificultad(Partida partida) {
		String eleccionMenuDificultad;
		int dificultad = 0;
		eleccionMenuDificultad = "<html><div style=text align:left>Elige a continuacion la dificultad de la partida<hr>"
				+ "<br>" + " 1. Facil - Puedes conquistar reinos facilmente." + "<br>" + "<br>"
				+ " 2. Media - Vas a poder conquistar con facilidad los reinos aunque algun que otro subdito te pondra las cosas dificiles"
				+ "<br>" + "<br>"
				+ " 3. Dificil - En cada reino te cuestionaras si merecio la pena ir a conquistar ese reino" + "<br>"
				+ "</div></html>";
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
		partida.setAtributosRey(dificultad);
		partida.setProtagonistaPartida(dificultad);

	}

	public void combateReinos(Partida partida) {
		boolean combate=false;
		do {
			menuCombate(partida, partida.getReino().getRey(),comprobarCondicion(menuCombate(partida, partida.getReino().getSubdito(), combate)));
			JOptionPane.showMessageDialog(null, partida.getMensajeGanadorPartida());
		} while (partida.getReinos()[4].getRey() != null);

	}

	public boolean comprobarCondicion(boolean menuCombate) {
		boolean comprobarCondicion=false;
		if(menuCombate==true)	
			comprobarCondicion=menuCombate;
		return comprobarCondicion;
	}

	// ï¿½Implementacion de un solo metodo para que se le pase personaje?
	public boolean menuCombate(Partida partida, Personaje personaje,boolean protaMuerto) {
		boolean combateReinos =protaMuerto;
		String eleccionMenuCombate;
		JOptionPane.showMessageDialog(null,
				"<html><div style='text-align: left;'>Estas en el " + partida.getReino().getNombreReino()
						+ "<hr>¡Lucha con "+personaje.getNombre()+" para conquistarlo!</div></html>");
		
		do {
			eleccionMenuCombate = "<html><div style='text-align: left;'>" + personaje.getNombre()
					+ " te esta desafiando!<hr>ï¿½Que haras para derrotarle?<br>" + "1. Hablar<br>" + "2. Esquivar<br>"
					+ "3. Defender<br>" + "4. Desgastar<br>" + "5. Estar en silencio</div></html>";
			switch (tryCatchInt(eleccionMenuCombate)) {
			case 1:
				partida.getReinos()[0].debilidad(personaje, condicionReinoPersonaje(partida, personaje));
				break;
			case 2:
				partida.getReinos()[1].debilidad(personaje, condicionReinoPersonaje(partida, personaje));
				break;
			case 3:
				partida.getReinos()[2].debilidad(personaje, condicionReinoPersonaje(partida, personaje));
				break;
			case 4:
				partida.getReinos()[3].debilidad(personaje, condicionReinoPersonaje(partida, personaje));
				break;
			case 5:
				partida.getReinos()[4].debilidad(personaje, condicionReinoPersonaje(partida, personaje));
				break;
			default:
				break;
			}
			combateReinos = condicionVidaProtagonista(partida, personaje);
		} while (!combateReinos);
		return combateReinos;
	}

	public boolean condicionReinoPersonaje(Partida partida, Personaje personaje) {
		boolean condicionReinoPersonaje = false;
		if (partida.comprobarReino(personaje)==true) {
			condicionReinoPersonaje = true;
		}
		return condicionReinoPersonaje;
	}

	public boolean condicionVidaProtagonista(Partida partida, Personaje personaje) {
		boolean condicionVida = false;
		// Condicion para cuando el subdito muere y se le setea a null
		if (personaje.getVida() > 0) {
			partida.getProtagonistaPartida().setAtaqueAProtagonista();
			JOptionPane.showMessageDialog(null,
					"¡" + personaje.getNombre() + " te ha quitado vida ten cuidado o moriras!");

		} else if(personaje.getVida()==0) {
			partida.getReino().eliminarSubdito(personaje);
		}

		if (partida.getProtagonistaPartida().getVida() == 0) {
			mensajeHasMuerto(partida, partida.getReino().getSubdito());
			partida.getReinos()[4].setRey(null);
			condicionVida = true;
			
		}

		return condicionVida;
	}

	public void mensajeHasMuerto(Partida partida, Personaje personaje) {
		JOptionPane.showMessageDialog(null,
				"<html><div style='text-align: left;'>Has muerto "
						+ partida.getProtagonistaPartida().getNombreProtagonista() + "<br>Te ha matado "
						+ personaje.getNombre() + "</div></html>");
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
				if(eleccionTryInt>5)
					salirTryInt=false;
				// Si todo va bien sale del bucle y del metodo
				salirTryInt = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "<html><div style=text-align:left>Numero mal introducido" + "<hr>"
						+ "Vuelve a intentarlo con una de las opciones");

			}
		} while (!salirTryInt);
		return eleccionTryInt;
	}

}
