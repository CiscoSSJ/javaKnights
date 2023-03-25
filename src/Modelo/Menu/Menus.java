package Modelo.Menu;

import javax.swing.JOptionPane;

import Modelo.Partida.Partida;
import Modelo.Personaje.Personaje;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class Menus {

	/**
	 * 
	 * @param partida Se le pasa la partida iniciada previamente
	 */
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
			JOptionPane.showMessageDialog(null, "Has fallado muchas veces");
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
	// Se define un método llamado combateReinos que recibe como parámetro una instancia de la clase Partida.
	public void combateReinos(Partida partida) {
		// Se declara una variable booleana llamada combate e inicialmente se establece como false.
		boolean combate = false;
		// Se inicia un ciclo do-while que se ejecuta hasta que la variable combate sea true.
		do {
			/**
			 * Se verifica si el reino número 4 de la partida tiene un rey asignado.
			 * Si tiene un rey, se llama al método menuCombateSubditos que permite
			 * al usuario elegir un subdito para el combate.
			 * Luego, se llama al método menuCombateRey que simula un combate
			 * entre el rey del reino y el subdito elegido por el usuario.
			 * Finalmente, se actualiza la variable combate a false.
			 */
			if (partida.getReinos()[4].getRey() != null) {
				menuCombateSubditos(partida);
				menuCombateRey(partida);
				// Si el reino número 4 de la partida no tiene un rey asignado, se actualiza la variable combate a true para salir del ciclo do-while.
			} else {
				combate = true;
			}
		} while (!combate);

	}

	/**
	 * Se define un método llamado "menuCombateSubditos" con dos parámetros:
	 * una instancia de la clase "Partida" y un valor booleano llamado "protaMuerto"
	 * @param partida
	 * @param protaMuerto
	 * @return
	 */
	public boolean menuCombateSubditos(Partida partida) {
		// Se inicializa la variable booleana "combateReinos" con el valor de "protaMuerto"
		boolean combateReinos = false;
		// Se declara y se inicializa la variable "eleccionMenuCombate" 
		//como una cadena de caracteres vacía.
		String eleccionMenuCombate;

		do {
			// Se muestra un cuadro de diálogo con el nombre del reino y el nombre de los subditos.
			JOptionPane.showMessageDialog(null,
					"<html><div style='text-align: left;'>Estas en el " + partida.getReino().getNombreReino()
							+ "<hr>ï¿½Lucha con " + partida.getReino().getNombreSubditos()
							+ " para conquistarlo!</div></html>");
			Subdito subdito = partida.getReino().getSubdito();
			eleccionMenuCombate = "<html><div style='text-align: left;'>" + subdito.getNombre()
					+ " te esta desafiando!<hr>ï¿½Que haras para derrotarle?<br>" + "1. Hablar<br>" + "2. Esquivar<br>"
					+ "3. Defender<br>" + "4. Desgastar<br>" + "5. Estar en silencio</div></html>";
			// Se ejecuta un bloque switch que dependiendo de la elección del usuario, ejecutará el
			//método "debilidad" del reino correspondiente en el arreglo "partida.getReinos()".
			switch (tryCatchInt(eleccionMenuCombate)) {
			case 1:
				partida.getReinos()[0].debilidad(subdito);
				break;
			case 2:
				partida.getReinos()[1].debilidad(subdito);
				break;
			case 3:
				partida.getReinos()[2].debilidad(subdito);
				break;
			case 4:
				partida.getReinos()[3].debilidad(subdito);
				break;
			case 5:
				partida.getReinos()[4].debilidad(subdito);
				break;
			default:
				break;
			}
			// Se verifica si el protagonista ha perdido la batalla contra el subdito.
			combateReinos = condicionVidaProtagonista(partida, subdito);
			if (partida.getReino().getSubdito() == null)
				combateReinos = true;
		} while (!combateReinos);
		return combateReinos;
	}
	/**
	 * Define un método público que devuelve un valor booleano 
	 * y toma dos argumentos: una instancia de la clase Partida y un valor booleano
	 * @param partida
	 * @return
	 */
	public boolean menuCombateRey(Partida partida) {
		// Declara e inicializa una variable booleana con el valor del segundo argumento.
		boolean combateReinos = false;
		String eleccionMenuCombate;
		// Declara una variable String y muestra un mensaje
		//emergente de diálogo utilizando la clase JOptionPane
		do {
			// Crea un ciclo do-while que se ejecutará al menos una vez y
			//se repetirá mientras la variable combateReinos sea falsa
			JOptionPane.showMessageDialog(null,
					"<html><div style='text-align: left;'>Estas en el " + partida.getReino().getNombreReino()
							+ "<hr>ï¿½Lucha con " + partida.getReino().getRey().getNombre()
							+ " para conquistarlo!</div></html>");
			// Obtiene el rey del reino actual
			Rey rey = partida.getReino().getRey();
			eleccionMenuCombate = "<html><div style='text-align: left;'>" + rey.getNombre()
					+ " te esta desafiando!<hr>ï¿½Que haras para derrotarle?<br>" + "1. Hablar<br>" + "2. Esquivar<br>"
					+ "3. Defender<br>" + "4. Desgastar<br>" + "5. Estar en silencio</div></html>";
			// Utiliza un switch para determinar qué reino utilizar según la opción seleccionada
			//por el jugador utilizando el método tryCatchInt para obtener la opción seleccionada
			switch (tryCatchInt(eleccionMenuCombate)) {
			case 1:
				partida.getReinos()[0].debilidad(rey);
				break;
			case 2:
				partida.getReinos()[1].debilidad(rey);
				break;
			case 3:
				partida.getReinos()[2].debilidad(rey);
				break;
			case 4:
				partida.getReinos()[3].debilidad(rey);
				break;
			case 5:
				partida.getReinos()[4].debilidad(rey);
				break;
			default:
				break;
			}
			// Verifica si el rey actual ha sido derrotado y
			//actualiza la variable combateReinos en consecuencia
			combateReinos = condicionVidaProtagonista(partida, rey);

		} while (!combateReinos);
		return combateReinos;
	}
	/**
	 * Comentario que describe la función condicionVidaProtagonista, 
	 * que toma una instancia de Partida y una instancia de Personaje como parámetros.
	 * @param partida
	 * @param personaje
	 * @return
	 */
	public boolean condicionVidaProtagonista(Partida partida, Personaje personaje) {
		// Condicion para cuando el subdito no muere y se le ataca al protagonista
		boolean condicionVida = false;
		// Condicion para cuando el subdito no muere y se le ataca al protagonista
		if (personaje.getVida() > 0) {
			partida.getProtagonistaPartida().setAtaqueAProtagonista();
			JOptionPane.showMessageDialog(null,
					"ï¿½" + personaje.getNombre() + " te ha quitado vida ten cuidado o moriras!");

		} else {
			partida.getReino().eliminarPersonaje(personaje);
		}
		//Condicion para cuando muere el rey de un reino pase al siguiente reino para 
		//combatir con los subditos del siguiente reino
		if (personaje.getNombreReino().equals("Reino vencido"))
			condicionVida=true;
		//Condicion para cuando muere el rey del último reino salga del bucle y acabe el juego 
		if(partida.getReinos()[4].getNombreReino().equals("Reino vencido")) 
			condicionVida=true;
		
		// Condicion para cuando el protagonista ha muerto
		if (partida.getProtagonistaPartida().getVida() == 0) {
			mensajeHasMuerto(partida, personaje);
			partida.getReinos()[4].setRey(null);
			condicionVida = true;
		}

		return condicionVida;
	}

	/**
	 * Con este metodo comprobamos que el personaje que le pasamos tiene
	 * concordancia con el reino al que quiere atacar y si es asi que devuelva true
	 * 
	 * @param personaje
	 * @return
	 */

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
				if (eleccionTryInt > 5)
					salirTryInt = false;
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
