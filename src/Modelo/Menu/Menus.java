package Modelo.Menu;

import javax.swing.JOptionPane;

import Modelo.Partida.Partida;
import Modelo.Personaje.Personaje;

public class Menus {

	public void menuPrincipal(Partida partida) {
		String eleccionMenuPrincipal;
		JOptionPane.showMessageDialog(null,
				"<html><div style='text-align: left;'>�Bienvenido a Java Knights!<hr><br>Este es un juego creado en Java donde tendrias que demostrar tus habilidades de estrategia y combate para convertirte en un verdadero caballero.<br>A medida que avances en el juego, tendras la oportunidad de enfrentarte a desafiantes enemigos y ganar valiosos tesoros.<br>Preparate para embarcarte en una emocionante aventura en el mundo medieval de Java Knights!</div></html>");
		eleccionMenuPrincipal = "<html><div style='text-align: left;'>�Indicanos cual es tu nombre, caballer@!<br><br></div></html>";
		partida.setNombreProtagonista(tryCatchString(eleccionMenuPrincipal));
		menuOpciones(partida);

	}

	public void menuOpciones(Partida partida) {
		String eleccionMenuOpciones;
		eleccionMenuOpciones = "<html><div style='text-align: left;'>�Que quieres hacer?<hr><br>"
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
					"<html><div style='text-align: left;'>�Hasta pronto " + partida.getProtagonistaPartida().getNombre()
							+ " nos vemos en la siguiente batalla!</div></html>");
			break;
		}

	}

	public void menuTutorial() {

	}

	public void menuCreditos() {
		System.out.println("Los maquinas");

	}

	public void menuPartida(Partida partida) {
		String eleccionMenuPartida;
		eleccionMenuPartida = "<html><div style='text-align: left;'>� A que reino quieres pertenecer?<hr><br>"
				+ "1. Dragon<br>" + "2. Gigante<br>" + "3. Guerrero<br>" + "4. Hielo<br>" + "5. Ninja</div></html>";

		partida.getProtagonistaPartida()
				.setNombreReino(setReinoPerteneciente(partida, tryCatchInt(eleccionMenuPartida)));
		menuDificultad(partida);
		combateReinos(partida);

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

	public void combateReinos(Partida partida) {
		boolean combateReinos = false;

		while (!combateReinos) {
			menuCombateSubditos(partida);
			menuCombateRey(partida,partida.getReino().getRey(),partida.getProtagonistaPartida());
			if(partida.getReinos()[4].getRey() == null ) {
				JOptionPane.showMessageDialog(null, partida.getMensajeGanadorPartida());
				combateReinos = true;
			}else if(partida.getProtagonistaPartida().getVida() <= 0) {
				combateReinos = true;
			}
		}
			
		
	}

	// �Implementacion de un solo metodo para que se le pase personaje?
	public void menuCombateSubditos(Partida partida) {
		boolean subditoSalir = true;
		String eleccionMenuCombateSubditos;
<<<<<<< HEAD

		JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>Estas en el "
				+ partida.getReino().getNombreReino() + "<hr>�Lucha con sus subditos para conquistarlo!</div></html>");
=======
		
		JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>Estas en el " + partida.getReino().getNombreReino() + "<hr>�Lucha con sus subditos para conquistarlo!</div></html>");
>>>>>>> branch 'jesus' of https://github.com/CiscoSSJ/javaKnights.git
		do {
			eleccionMenuCombateSubditos = "<html><div style='text-align: left;'>"
					+ partida.getReino().getSubdito().getNombre()
					+ " te esta desafiando!<hr>�Que haras para derrotarle?<br>" + "1. Hablar<br>" + "2. Esquivar<br>"
					+ "3. Defender<br>" + "4. Desgastar<br>" + "5. Estar en silencio</div></html>";
			switch (tryCatchInt(eleccionMenuCombateSubditos)) {
			case 1:
				if(partida.getReinos()[0].comprobarReino(partida.getReino().getSubdito())) {
					partida.getReinos()[0].debilidad(partida.getReino().getSubdito());
				}
					
				break;
			case 2:
				if(partida.getReinos()[1].comprobarReino(partida.getReino().getSubdito())) {
					partida.getReinos()[1].debilidad(partida.getReino().getSubdito());
				}
				break;
			case 3:
				if(partida.getReinos()[2].comprobarReino(partida.getReino().getSubdito())) {
					partida.getReinos()[2].debilidad(partida.getReino().getSubdito());
				}
				break;
			case 4:
				if(partida.getReinos()[3].comprobarReino(partida.getReino().getSubdito())) {
					partida.getReinos()[3].debilidad(partida.getReino().getSubdito());
				}
				break;
			case 5:
				if(partida.getReinos()[4].comprobarReino(partida.getReino().getSubdito())) {
					partida.getReinos()[4].debilidad(partida.getReino().getSubdito());
				}
				break;
			default:
				break;
			}
			subditoSalir=condicionReinoSubdito(partida, condicionVida(partida));
			
<<<<<<< HEAD
		} while ( !subditoSalir);
		return subditoSalir;
=======
			if (partida.getReino().getSubdito().getVidaSubditos() > 0) {
				partida.getProtagonistaPartida().setAtaqueAProtagonista();
				JOptionPane.showMessageDialog(null,
						"<html><div style='text-align: left;'>�" + partida.getReino().getSubdito().getNombreSubditos()
								+ " te ha quitado vida ten cuidado o moriras!</div></html>");
			}
			
			
			// Condicion para cuando el subdito muere y se le setea a null
			
			if(partida.getReino().getSubdito().getVidaSubditos()==0){
					partida.getReino().eliminarSubdito(partida.getReino().getSubdito());
			}
			if(partida.getReino().getSubdito()==null)
				subditoSalir=false;
			if (partida.getProtagonistaPartida().getVida() <= 0) {
				mensajeHasMuerto(partida, partida.getReino().getSubdito());
				subditoSalir = false;
			}
			
			
		} while (subditoSalir);
>>>>>>> branch 'jesus' of https://github.com/CiscoSSJ/javaKnights.git
	}

<<<<<<< HEAD
	public boolean condicionReinoSubdito(Partida partida,boolean condicionVida) {
		boolean condicionReinoSubdito=condicionVida;
		if(partida.getReino().getSubditos()[2].getVida()==0) {
			condicionReinoSubdito=true;
			}
		return condicionReinoSubdito;
	}
		
	

	public boolean  condicionVida(Partida partida) {
		boolean condicionVida=false;
		// Condicion para cuando el subdito muere y se le setea a null
		if (partida.getReino().getSubdito().getVidaSubditos() != 0&& partida.getProtagonistaPartida().getVida() != 0) {
			partida.getProtagonistaPartida().setAtaqueAProtagonista();
			JOptionPane.showMessageDialog(null, "�" + partida.getReino().getSubdito().getNombreSubditos()
					+ " te ha quitado vida ten cuidado o moriras!");
			
		}	
		if (partida.getProtagonistaPartida().getVida() == 0) {
			mensajeHasMuerto(partida, partida.getReino().getSubdito());
			condicionVida= true;
		}
		return condicionVida;
	}

	/**public boolean menuCombateSubditos2(Partida partida) {
		boolean subditoSalir = false;
		String eleccionMenuCombateSubditos;
		JOptionPane.showMessageDialog(null, "Estas en el " + partida.getReino().getNombreReino() + "<hr>"
				+ "�Lucha con sus subditos para conquistarlo!");
		do {
=======
>>>>>>> branch 'jesus' of https://github.com/CiscoSSJ/javaKnights.git

<<<<<<< HEAD
			eleccionMenuCombateSubditos = partida.getReino().getSubdito(0).getNombreSubditos()
					+ " te esta desafiando �Que haras para derrotarle?" + "\n" + "1.Hablar" + "\n" + "2.Esquivar" + "\n"
					+ "3.Defender" + "\n" + "4.Desgastar" + "\n" + "5.Silencio";
			switch (tryCatchInt(eleccionMenuCombateSubditos)) {
			case 1:
				partida.getReinos()[0].debilidad(partida.getReino().getSubdito(0));
				break;
			case 2:
				partida.getReinos()[1].debilidad(partida.getReino().getSubdito(0));
				break;
			case 3:
				partida.getReinos()[2].debilidad(partida.getReino().getSubdito(0));
				break;
			case 4:
				partida.getReinos()[3].debilidad(partida.getReino().getSubdito(0));
				break;
			case 5:
				partida.getReinos()[4].debilidad(partida.getReino().getSubdito(0));
				break;
			default:
				break;
			}
			
			// Condicion para cuando acierta y se le quita vida al subdito
		

			

		} while (!subditoSalir);

		return subditoSalir;
	}
	*/

	public boolean menuCombateRey(Partida partida, boolean seguir) {
		boolean combateRey = seguir;
=======
	public boolean menuCombateRey(Partida partida, Personaje personaje, Personaje protagonista) {
		boolean combateRey = false;
>>>>>>> branch 'jesus' of https://github.com/CiscoSSJ/javaKnights.git
		String eleccionMenuCombateRey;
<<<<<<< HEAD
		while (!combateRey) {
			do {
				eleccionMenuCombateRey = "<html><div style=text align:left>" + partida.getReino().getNombreRey()
						+ " te esta desafiando �Que haras para derrotarle?" + "<br>" + "1.Hablar" + "<br>"
						+ "2.Esquivar" + "<br>" + "3.Defender" + "<br>" + "4.Desgastar" + "<br>"
						+ "5.Silencio</div></html>";
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

				if (partida.getReino().getRey().getVidaRey() == 0) {
					partida.getReino().setRey(null);

				} else {
					partida.getProtagonistaPartida().setAtaqueAProtagonista();
					JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>�"
							+ partida.getReino().getRey() + " te ha quitado vida ten cuidado o moriras!</div></html>");
					if (partida.getProtagonistaPartida().getVida() == 0)
						mensajeHasMuerto(partida, partida.getReino().getRey());
					combateRey = true;
				}
				while ((partida.getReino().getRey().getVidaRey() != 0)
						|| (partida.getProtagonistaPartida().getVida() != 0) || !combateRey)
					;

			} while (partida.getReino().getRey() != null || !combateRey);

=======
		if(protagonista.getVida() > 0) {
			while (!combateRey) {
				do {
					eleccionMenuCombateRey = "<html><div style=text align:left>" + partida.getReino().getNombreRey()
							+ " te esta desafiando �Que haras para derrotarle?" + "<br>" + "1.Hablar" + "<br>"
							+ "2.Esquivar" + "<br>" + "3.Defender" + "<br>" + "4.Desgastar" + "<br>"
							+ "5.Silencio</div></html>";
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
					
					if (partida.getReino().getRey().getVidaRey() == 0) {
						partida.getReino().setRey(null);
	
					} else {
						partida.getProtagonistaPartida().setAtaqueAProtagonista();
						JOptionPane.showMessageDialog(null, "<html><div style='text-align: left;'>�"
								+ partida.getReino().getRey() + " te ha quitado vida ten cuidado o moriras!</div></html>");
						if (partida.getProtagonistaPartida().getVida() == 0)
							mensajeHasMuerto(partida, partida.getReino().getRey());
						combateRey = true;
					}
					//Posible fallo de cuando matas al primer rey (probablemente poner una condición)
					while ((partida.getReino().getRey().getVidaRey() != 0) || (partida.getProtagonistaPartida().getVida() != 0)
							|| !combateRey);
	
				} while (partida.getReino().getRey() != null || !combateRey);
			}
>>>>>>> branch 'jesus' of https://github.com/CiscoSSJ/javaKnights.git
		}
		return combateRey;
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



	public void mensajeHasMuerto(Partida partida, Personaje personaje) {
		JOptionPane.showMessageDialog(null,
				"<html><div style='text-align: left;'>Has muerto"
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
				JOptionPane.showMessageDialog(null, "<html><div style=text-align:left>Numero mal introducido" + "<hr>"
						+ "Vuelve a intentarlo con una de las opciones");

			}
		} while (!salirTryInt);
		return eleccionTryInt;
	}

	public static Exception stringVacio() {
		return null;
	}
}
