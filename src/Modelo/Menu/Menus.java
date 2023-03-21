package Modelo.Menu;

import javax.swing.JOptionPane;

import Modelo.Partida.Partida;
import Modelo.Personaje.Personaje;

public class Menus {

	

	public void menuPrincipal(Partida partida) {
		String eleccionMenuPrincipal;
		JOptionPane.showMessageDialog(null,
				"<html>"
					+ "<div style='text-align: center;'>"
						+ "¿Bienvenido a Java Knights!<br><br>"
						+ "Este e un juego creado en Java donde tendrias que demostrar tus habilidades"
						+ " de estrategia y combate para convertirte en un verdadero caballero."
						+ "<br><br>"
						+ "A medida que avances en el juego, tendras la oportunidad de enfrentarte"
						+ " a desafiantes enemigos y ganar valiosos tesoros."
						+ "<br><br>"
						+ "¿Preparate para embarcarte en una emocionante aventura en el mundo medieval"
						+ " de Java Knights!"
					+ "</div>"
				+ "</html>",
				"Java Knights", JOptionPane.PLAIN_MESSAGE);
		eleccionMenuPrincipal = "<html><div style='text-align: center;'>Indicanos cual es tu nombre, caballer@!<br><br></div></html>";
		String nombreProtagonista = tryCatchString(eleccionMenuPrincipal);
		if (nombreProtagonista == null) { // El usuario hizo clic en Cancelar
			System.exit(0); // Salir del programa
		}
		partida.setNombreProtagonista(nombreProtagonista);
		menuOpciones(partida);
	}

	public void menuOpciones(Partida partida) {
		String eleccionMenuOpciones;
		eleccionMenuOpciones = "<html><div style='text-align: center;'>¿Que quieres hacer?<br><br>"
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

			JOptionPane.showMessageDialog(null, "¡Hasta pronto  " + partida.getProtagonistaPartida().getNombre()
					+ " nos vemos en la siguiente batalla!", "Java Knights - Adios", JOptionPane.PLAIN_MESSAGE);
			break;
		}

	}

	public void menuTutorial() {

	}

	public void menuCreditos() {
		JOptionPane.showMessageDialog(null,
				"<html>"
					+ "<div style='text-align: center;'>"
						+ "Los Maquinas."
					+ "</div>"
				+ "</html>",
				"Java Knights", JOptionPane.PLAIN_MESSAGE);

	}

	public void menuPartida(Partida partida) {
		String eleccionMenuPartida;
		eleccionMenuPartida = "<html><div style='text-align: center;'>¿ A que reino quieres pertenecer?<br><br>"
				+ "1. Dragon<br>" + "2. Gigante<br>" + "3. Guerrero<br>" + "4. Hielo<br>" + "5. Ninja</div></html>";

		partida.getProtagonistaPartida().setNombreReino(setReinoPerteneciente(partida, tryCatchInt(eleccionMenuPartida)));
		menuDificultad(partida);
		combateReinos(partida);
		

	}

	public String setReinoPerteneciente(Partida partida,int eleccion) {
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

	public void combateReinos(Partida partida) {
		boolean combateReinos = false;
		
			
		while (partida.getReinos()[4].getRey() != null || !combateReinos) {
		combateReinos = menuCombateRey(partida, menuCombateSubditos(partida));
		}
		
		JOptionPane.showMessageDialog(null, partida.getMensajeGanadorPartida(), "Java Knights", JOptionPane.PLAIN_MESSAGE);
	}

	// ¿Implementacion de un solo metodo para que se le pase personaje?
	public boolean menuCombateSubditos(Partida partida) {
	    boolean subditoSalir = false;
	    String eleccionMenuCombateSubditos;
	    JOptionPane.showMessageDialog(null, "Estas en el " + partida.getReino().getNombreReino() + "\n"
	            + "¡Lucha con sus subditos para conquistarlo!", "Java Knights", JOptionPane.PLAIN_MESSAGE);
	    do {
	        eleccionMenuCombateSubditos = partida.getReino().getSubdito().getNombreSubditos()
	                + " te esta desafiando ¿Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar" + "\n"
	                + "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio";
	        switch (tryCatchInt(eleccionMenuCombateSubditos)) {
	            case 1:
	                partida.getReinos()[0].debilidad(partida.getReino().getSubdito());
	                break;
	            case 2:
	                partida.getReinos()[1].debilidad(partida.getReino().getSubdito());
	                break;
	            case 3:
	                partida.getReinos()[2].debilidad(partida.getReino().getSubdito());
	                break;
	            case 4:
	                partida.getReinos()[3].debilidad(partida.getReino().getSubdito());
	                break;
	            case 5:
	                partida.getReinos()[4].debilidad(partida.getReino().getSubdito());
	                break;
	            default:
	                break;
	        }

	        // Condicion para cuando el protagonista falla y se le quita vida a este
	        if (partida.getReino().getSubdito().getVida() != 0) {
	            partida.getProtagonistaPartida().setAtaqueAProtagonista();
	            JOptionPane.showMessageDialog(null, "¡" + partida.getReino().getSubdito().getNombreSubditos()
	                    + " te ha quitado vida ten cuidado o moriras!", "Java Knights - Aviso", JOptionPane.PLAIN_MESSAGE);
	            if (partida.getProtagonistaPartida().getVida() <= 0) {
	                mensajeHasMuerto(partida, partida.getReino().getSubdito());
	                subditoSalir = true;
	            }
	        }
	        // Condicion para cuando el subdito muere y se le setea a null
	        else {
	            partida.getReino().setSubdito(null);
	            subditoSalir = true;
	        }
	    } while (partida.getReino().getSubdito() != null && partida.getProtagonistaPartida().getVida() != 0
	            && partida.getReino() != null && !subditoSalir);
	    return subditoSalir;
	}

	public boolean menuCombateSubditos2(Partida partida) {
		boolean subditoSalir = false;
		String eleccionMenuCombateSubditos;
		JOptionPane.showMessageDialog(null, "Estas en el " + partida.getReino().getNombreReino() + "\n"
				+ "¡Lucha con sus subditos para conquistarlo!", "Java Knights", JOptionPane.PLAIN_MESSAGE);
		do {



			eleccionMenuCombateSubditos = partida.getReino().getSubdito().getNombreSubditos()
					+ " te esta desafiando ¿Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar" + "\n"
					+ "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio";
			switch (tryCatchInt(eleccionMenuCombateSubditos)) {
			case 1:
				partida.getReinos()[0].debilidad(partida.getReino().getSubdito());
				break;
			case 2:
				partida.getReinos()[1].debilidad(partida.getReino().getSubdito());
				break;
			case 3:
				partida.getReinos()[2].debilidad(partida.getReino().getSubdito());
				break;
			case 4:
				partida.getReinos()[3].debilidad(partida.getReino().getSubdito());
				break;
			case 5:
				partida.getReinos()[4].debilidad(partida.getReino().getSubdito());
				break;
			default:
				break;
			}
		
			// Condicion para cuando falla el protagonista y se le quita vida a este
			if(partida.getReino().getSubdito().getVida() != 0){
				partida.getProtagonistaPartida().setAtaqueAProtagonista();
				JOptionPane.showMessageDialog(null, "¡" + partida.getReino().getSubdito().getNombreSubditos()
						+ " te ha quitado vida ten cuidado o moriras!");

			}
			// Condicion para cuando acierta y se le quita vida al subdito
			else if (partida.getReino().getSubdito().getVida() == 0) {
				partida.getReino().setSubdito(null);
			}

			// Condicion para cuando el protagonista ha fallado muchas veces y le han
			// quitado la vida ,entonces muere y se acaba
			// el combate
			 if (partida.getProtagonistaPartida().getVida() <= 0) {
				mensajeHasMuerto(partida, partida.getReino().getSubdito());
				subditoSalir = true;
			}

		} while (partida.getReino().getSubdito() != null && partida.getProtagonistaPartida().getVida() != 0
				&& partida.getReino() != null || !subditoSalir);
		
		return subditoSalir;
	}

	public boolean menuCombateRey(Partida partida,boolean seguir) {
		boolean combateRey = seguir;
		String eleccionMenuCombateRey;
		while(!combateRey) {
			do {
			eleccionMenuCombateRey = "<html><div style=text align:left>" + partida.getReino().getNombreRey()
					+ " te esta desafiando ¿Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar"
					+ "\n" + "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio</div></html>";
			switch (tryCatchInt(eleccionMenuCombateRey)) {
			case 1:
				partida.getReinos()[0].debilidad(partida.getReino().getRey());
				break;
			case 2:
				partida.getReinos()[1].debilidad(partida.getReino().getRey());
				break;
			case 3:
				partida.getReinos()[2].debilidad(partida.getReino().getRey());
				break;
			case 4:
				partida.getReinos()[3].debilidad(partida.getReino().getRey());
				break;
			case 5:
				partida.getReinos()[4].debilidad(partida.getReino().getRey());
				break;
			default:
				break;
			}
			if (partida.getReino().getRey().getVida() != 0) {
				partida.getReino().setRey(null);

			} else {
				partida.getProtagonistaPartida().setAtaqueAProtagonista();
				JOptionPane.showMessageDialog(null, "¡" + partida.getReino().getRey().getNombreRey()
						+ " te ha quitado vida ten cuidado o moriras!", "Java Knights - Aviso", JOptionPane.PLAIN_MESSAGE);
			if(partida.getProtagonistaPartida().getVida()==0)
				mensajeHasMuerto(partida, partida.getReino().getRey());
				combateRey = true;
			}
			while ((partida.getReino().getRey().getVida() != 0)
					|| (partida.getProtagonistaPartida().getVida() != 0)||!combateRey)
				;
		
		} while (partida.getReino().getRey() != null||!combateRey);
		
		}
		return combateRey;
	}

	public void menuDificultad(Partida partida) {
		String eleccionMenuDificultad;
		int dificultad = 0;
		eleccionMenuDificultad = "Elige a continuacion la dificultad de la partida:"
				+ "\n 1. Facil - Puedes conquistar reinos facilmente."
				+ "\n 2. Media - Vas a poder conquistar con facilidad los reinos aunque algun que otro subdito te pondra las cosas dificiles."
				+ "\n 3. Dificil - En cada reino te cuestionaras si merecio la pena ir a conquistar ese reino.";
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

	public void mensajeHasMuerto(Partida partida,Personaje personaje) {
		JOptionPane.showMessageDialog(null, "Has muerto " + partida.getProtagonistaPartida().getNombre()+". \n Te ha matado "+personaje.getNombre());
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
	            eleccionTryString = JOptionPane.showInputDialog(null, pregunta, "Java Knights", JOptionPane.PLAIN_MESSAGE);
	            if (eleccionTryString == null) { // El usuario hizo clic en Cancelar
	                break; // Salir del bucle
	            }
	            if (eleccionTryString.length() <= 0) {
	                throw stringVacio();
	            }
	            // Si todo va bien sale del bucle y del metodo
	            salirTryString = true;
	        } catch (Exception e) {
	            // Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
	            JOptionPane.showMessageDialog(null, "Palabra mal introducida,vuelve a intentarlo", "Java Knights", JOptionPane.ERROR_MESSAGE);
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
	            String input = JOptionPane.showInputDialog(null, pregunta, "Java Knights", JOptionPane.PLAIN_MESSAGE);
	            if (input == null) { // El usuario hizo clic en Cancelar
	                break; // Salir del bucle
	            }
	            eleccionTryInt = Integer.parseInt(input);
	            // Si todo va bien sale del bucle y del metodo
	            salirTryInt = true;
	        } catch (Exception e) {
	            // Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
	            JOptionPane.showMessageDialog(null,
	                    "Numero mal introducido,vuelve a intentarlo con una de las opciones", "Java Knights", JOptionPane.ERROR_MESSAGE);

	        }
	    } while (!salirTryInt);
	    return eleccionTryInt;
	}

	private static Exception stringVacio() {
	    return null;
	}
}
