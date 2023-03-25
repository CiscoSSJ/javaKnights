package Modelo.Menu;

//Se importa la librería de Swing de Java para poder utilizar
//los elementos gráficos de la interfaz de usuario
import javax.swing.JOptionPane;

import Modelo.Partida.Partida;
import Modelo.Personaje.Personaje;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class Menus {

	/**
	 * Este método muestra el menú principal del juego.
	 * 
	 * @param partida Se le pasa la partida iniciada previamente
	 */
	public void menuPrincipal(Partida partida) {
		// Se declara la variable eleccionMenuPrincipal de tipo String para almacenar la
		// elección del usuario.
		String eleccionMenuPrincipal;
		// Se muestra un mensaje de bienvenida con información sobre el juego utilizando
		// el método showMessageDialog de la librería Swing.
		JOptionPane.showMessageDialog(null, 
				"<html>"
					+ "<div style='text-align: left;'>"
						+ "¿Bienvenido a Java Knights!"
						+ "<hr><br>"
						+ "Este es un juego creado en Java donde tendrias que demostrar tus habilidades de estrategia "
						+ "y combate para convertirte en un verdadero caballero."
						+ "<br>"
						+ "A medida que avances en el juego, tendras la oportunidad de enfrentarte a desafiantes enemigos"
						+ " y ganar valiosos tesoros."
						+ "<br>"
						+ "Preparate para embarcarte en una emocionante aventura en el mundo medieval de Java Knights!"
					+ "</div>"
				+ "</html>");
		/*
		 * Se muestra un mensaje para pedirle al usuario que ingrese su nombre
		 * utilizando el método setNombreProtagonista de la clase Partida. Se utiliza la
		 * variable eleccionMenuPrincipal para almacenar el mensaje.
		 */
		eleccionMenuPrincipal = 
				"<html>" 
					+ "<div style='text-align: left;'>"
						+ "¿Indicanos cual es tu nombre, caballer@!" 
						+ "<br><br>" 
					+ "</div>"
				+ "</html>";
		partida.setNombreProtagonista(tryCatchString(eleccionMenuPrincipal));
		menuOpciones(partida);

	}

	/**
	 * Este método muestra las opciones del menú principal y llama a otros métodos
	 * dependiendo de la elección del usuario.
	 * 
	 * @param partida Se le pasa como parámetro la partida iniciada previamente.
	 */
	public void menuOpciones(Partida partida) {
		String eleccionMenuOpciones;
		eleccionMenuOpciones = 
				"<html>"
					+ "<div style='text-align: left;'>"
						+ "¿Que quieres hacer?"
						+ "<hr><br>"
						+ "1. Iniciar partida<br>"
						+ "2. Ver creditos<br>"
						+ "3. Opciones<br>"
						+ "4. Salir<br>"
					+ "</div>"
				+ "</html>";
		
		/**
		 * Se utiliza el switch para llamar a otros métodos dependiendo de la elección del usuario. 
		 * Se utiliza el método tryCatchInt para llamar a una venta ofreciendo un numero.
		 */
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
					"<html>"
						+ "<div style='text-align: left;'>"
							+ "¿Hasta pronto "
							+ partida.getProtagonistaPartida().getNombre()
							+ " nos vemos en la siguiente batalla!"
						+ "</div>"
					+ "</html>");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Has fallado muchas veces");
		}

	}

	/**
	 * Este es el encabezado del método menuPartida,
	 * que toma un objeto Partida como argumento y no devuelve nada.
	 * @param partida
	 */
	public void menuPartida(Partida partida) {
		String eleccionMenuPartida;
		eleccionMenuPartida = 
				"<html>"
					+ "<div style='text-align: left;'>"
						+ "¿A que reino quieres pertenecer?<hr><br>"
						+ "1. Dragon<br>"
						+ "2. Gigante<br>"
						+ "3. Guerrero<br>"
						+ "4. Hielo<br>"
						+ "5. Ninja"
					+ "</div>"
				+ "</html>";

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

	/**
	 * Esta función devuelve el nombre de un reino según la elección del usuario.
	 * La variable eleccion es un número entero que representa
	 * el reino elegido por el usuario.
	 * La función utiliza la sentencia switch para asignar
	 * el nombre del reino a la variable nombreReino.
	 * Si eleccion es un número diferente de 1 a 5, la función devuelve null.
	 * @param partida
	 * @param eleccion
	 * @return
	 */
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
		eleccionMenuDificultad = 
				"<html>"
					+ "<div style=text align:left>"
						+ "Elige a continuacion la dificultad de la partida<hr><br>"
						+ " 1. Facil - Puedes conquistar reinos facilmente.<br><br>"
						+ " 2. Media - Vas a poder conquistar con facilidad los "
						+ "reinos aunque algun que otro subdito te pondra las cosas dificiles<br><br>"
						+ " 3. Dificil - En cada reino te cuestionaras si merecio "
						+ " la pena ir a conquistar ese reino<br>"
					+ "</div>"
				+ "</html>";
		
		/**
		 * Se llama al método tryCatchInt para llamar a una ventana en la que pide de un numero entero.
		 * El valor ingresado es el texto HTML que se muestra en la variable eleccionMenuDificultad.
		 * Luego, dependiendo del valor ingresado, se establece la dificultad de la partida.
		 * El valor de dificultad se asigna a las propiedades correspondientes de la instancia de la clase Partida.
		 */
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
				menuCombateRey(partida, comprobarCondicion(menuCombateSubditos(partida, combate)));
				combate = false;
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
	public boolean menuCombateSubditos(Partida partida, boolean protaMuerto) {
		// Se inicializa la variable booleana "combateReinos" con el valor de "protaMuerto"
		boolean combateReinos = protaMuerto;
		// Se declara y se inicializa la variable "eleccionMenuCombate" como una cadena de caracteres vacía.
		String eleccionMenuCombate;

		// Se muestra un cuadro de diálogo con el nombre del reino y el nombre de los subditos.
		JOptionPane.showMessageDialog(null,
				"<html>"
					+ "<div style='text-align: left;'>"
						+ "Estas en el " + partida.getReino().getNombreReino()
						+ "<hr>¿Lucha con " + partida.getReino().getNombreSubditos()
						+ " para conquistarlo!"
					+ "</div>"
				+ "</html>");
		
		// Se ejecuta un bucle do-while que se repetirá hasta que "combateReinos" sea verdadero.
		do {
			Subdito subdito = partida.getReino().getSubdito();
			eleccionMenuCombate = 
					"<html>"
						+ "<div style='text-align: left;'>"
							+ subdito.getNombre() + " te esta desafiando!<hr>"
							+ "¿Que haras para derrotarle?<br>"
							+ "1. Hablar<br>"
							+ "2. Esquivar<br>"
							+ "3. Defender<br>"
							+ "4. Desgastar<br>"
							+ "5. Estar en silencio"
						+ "</div>"
					+ "</html>";
		
			// Se ejecuta un bloque switch que dependiendo de la elección del usuario, ejecutará el método "debilidad" del reino correspondiente en el arreglo "partida.getReinos()".
			switch (tryCatchInt(eleccionMenuCombate)) {
			case 1:
				partida.getReinos()[0].debilidad(subdito, condicionReinoPersonaje(partida, subdito));
				break;
			case 2:
				partida.getReinos()[1].debilidad(subdito, condicionReinoPersonaje(partida, subdito));
				break;
			case 3:
				partida.getReinos()[2].debilidad(subdito, condicionReinoPersonaje(partida, subdito));
				break;
			case 4:
				partida.getReinos()[3].debilidad(subdito, condicionReinoPersonaje(partida, subdito));
				break;
			case 5:
				partida.getReinos()[4].debilidad(subdito, condicionReinoPersonaje(partida, subdito));
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

	//Define un método público que devuelve un valor booleano 
	//y toma dos argumentos: una instancia de la clase Partida y un valor booleano
	public boolean menuCombateRey(Partida partida, boolean protaMuerto) {
		// Declara e inicializa una variable booleana con el valor del segundo argumento.
		boolean combateReinos = protaMuerto;
		String eleccionMenuCombate;
		
		// Declara una variable String y muestra un mensaje
		//emergente de diálogo utilizando la clase JOptionPane
		JOptionPane.showMessageDialog(null,
				"<html>"
					+ "<div style='text-align: left;'>"
						+ "Estas en el " + partida.getReino().getNombreReino()+"<hr>"
						+ "¿Lucha con " + partida.getReino().getRey().getNombre()
						+ " para conquistarlo!"
					+ "</div>"
				+ "</html>");
		// Crea un ciclo do-while que se ejecutará al menos una vez y
		//se repetirá mientras la variable combateReinos sea falsa
		do {
			// Obtiene el rey del reino actual
			Rey rey = partida.getReino().getRey();
			
			// Define una cadena de texto utilizando HTML para mostrar el menú
			//de combate en un diálogo emergente de JOptionPane
			eleccionMenuCombate = 
					"<html>"
						+ "<div style='text-align: left;'>"
							+ rey.getNombre()
							+ " te esta desafiando!<hr>"
							+ "¿Que haras para derrotarle?<br>"
							+ "1. Hablar<br>"
							+ "2. Esquivar<br>"
							+ "3. Defender<br>"
							+ "4. Desgastar<br>"
							+ "5. Estar en silencio"
						+ "</div>"
					+ "</html>";
			// Utiliza un switch para determinar qué reino utilizar según la opción seleccionada
			//por el jugador utilizando el método tryCatchInt para obtener la opción seleccionada
			switch (tryCatchInt(eleccionMenuCombate)) {
			case 1:
				partida.getReinos()[0].debilidad(rey, condicionReinoPersonaje(partida, rey));
				break;
			case 2:
				partida.getReinos()[1].debilidad(rey, condicionReinoPersonaje(partida, rey));
				break;
			case 3:
				partida.getReinos()[2].debilidad(rey, condicionReinoPersonaje(partida, rey));
				break;
			case 4:
				partida.getReinos()[3].debilidad(rey, condicionReinoPersonaje(partida, rey));
				break;
			case 5:
				partida.getReinos()[4].debilidad(rey, condicionReinoPersonaje(partida, rey));
				break;
			default:
				break;
			}
			// Verifica si el rey actual ha sido derrotado y
			//actualiza la variable combateReinos en consecuencia
			if (partida.getReino().getRey().getVida() <= 0) {
				partida.getReino().setRey(null);
				combateReinos = true;
			} else {
				combateReinos = condicionVidaProtagonista(partida, rey);
			}

		} while (!combateReinos);
		return combateReinos;
	}

	/** Define un método público que devuelve un valor booleano
	 * y toma una instancia de la clase Partida y un Personaje como argumentos
	 */
	public boolean condicionReinoPersonaje(Partida partida, Personaje personaje) {
		boolean condicionReinoPersonaje = false;
		if (comprobarReino(partida, personaje)) {
			condicionReinoPersonaje = true;
		}
		return condicionReinoPersonaje;
	}

	/**
	 * Comentario que describe la función condicionVidaProtagonista, 
	 * que toma una instancia de Partida y una instancia de Personaje como parámetros.
	 * @param partida
	 * @param personaje
	 * @return
	 */
	public boolean condicionVidaProtagonista(Partida partida, Personaje personaje) {
		boolean condicionVida = false;
		// Condicion para cuando el subdito no muere y se le ataca al protagonista
		if (personaje.getVida() > 0) {
			partida.getProtagonistaPartida().setAtaqueAProtagonista();
			JOptionPane.showMessageDialog(null,
					"¿" + personaje.getNombre()
					+ " te ha quitado vida ten cuidado o moriras!");

		}

		// Condicion para cuando el protagonista ha muerto
		if (partida.getProtagonistaPartida().getVida() == 0) {
			mensajeHasMuerto(partida, personaje);
			partida.getReinos()[4].setRey(null);
			condicionVida = true;

		}
		// Condicion para cuando el subdito o rey muere
		if (personaje.getVida() == 0)
			partida.getReino().eliminarPersonaje(personaje);

		return condicionVida;
	}

	/**
	 * Este método recibe un parámetro booleano llamado menuCombate 
	 * y devuelve otro booleano llamado comprobarCondicion.
	 * @param menuCombate
	 * @return
	 */
	public boolean comprobarCondicion(boolean menuCombate) {
		boolean comprobarCondicion = false;
		if (menuCombate)
			comprobarCondicion = menuCombate;
		return comprobarCondicion;
	}

	/**
	 * Con este metodo comprobamos que el personaje que le pasamos tiene
	 * concordancia con el reino al que quiere atacar y si es asi que devuelva true
	 * 
	 * @param personaje
	 * @return
	 */
	public boolean comprobarReino(Partida partida, Personaje personaje) {
		boolean retorno = false;
		if (partida.getReino().getNombreReino().equals(personaje.getNombreReino())) {
			retorno = true;
		}
		return retorno;
	}

	/**
	 * Este método muestra un mensaje en una ventana emergente 
	 * utilizando la clase JOptionPane de Java Swing.
	 * El mensaje indica que el personaje pasado como argumento 
	 *  ha muerto y quién lo ha matado.
	 * @param partida
	 * @param personaje
	 */
	public void mensajeHasMuerto(Partida partida, Personaje personaje) {
		JOptionPane.showMessageDialog(null,
				"<html>"
					+ "<div style='text-align: left;'>"
						+ "Has muerto "
						+ partida.getProtagonistaPartida().getNombreProtagonista()
						+ "<br>Te ha matado "
						+ personaje.getNombre()
					+ "</div>"
				+ "</html>");
	}
	
	/**
	 * Este método llamado tryCatchString utiliza un bucle do-while 
	 * para intentar obtener una entrada de datos correcta desde 
	 * el usuario mediante la interfaz gráfica de JOptionPane.showInputDialog().
	 * Si el usuario introduce una entrada incorrecta, 
	 * se captura la excepción y se muestra un mensaje de 
	 * error mediante JOptionPane.showMessageDialog().
	 * El bucle continúa hasta que se introduce una entrada de datos correcta 
	 * y el valor de la variable booleana salirTryString se establece en true.
	 * El valor de la entrada de datos se devuelve como una cadena de texto.
	 * @param pregunta
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
				JOptionPane.showMessageDialog(null, 
						"Palabra mal introducida, vuelve a intentarlo");

			}
		} while (!salirTryString);
		// Devolvemos la entrada de datos como una cadena de texto
		return eleccionTryString;
	}

	/**
	 * Método que solicita al usuario un número entero a través de una ventana de diálogo,
	 * y que utiliza un bloque try-catch para evitar errores en caso de que el usuario
	 * introduzca un valor que no sea numérico.
	 * @param pregunta El mensaje que se muestra al usuario para solicitar el número.
	 * @return El número entero introducido por el usuario.
	 */
	public int tryCatchInt(String pregunta) {
		
		// Inicialización de la variable que almacena el número entero introducido por el usuario.
		int eleccionTryInt = 0;
		// Variable que controla si se ha introducido un número válido.
		boolean salirTryInt = false;
		
		// Bucle do-while para solicitar el número hasta que se introduzca uno válido.
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
				JOptionPane.showMessageDialog(null, 
						"<html>"
							+ "<div style=text-align:left>"
								+ "Numero mal introducido" 
								+ "<hr>"
								+ "Vuelve a intentarlo con una de las opciones"
							+ "</div>"
						+ "</html>");

			}
		} while (!salirTryInt);
		// Se devuelve el número entero introducido por el usuario.
		return eleccionTryInt;
	}
}
