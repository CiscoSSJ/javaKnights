package Modelo.OpcionesMenu;

import javax.swing.JOptionPane;

public class Menu {
	private static String eleccionString;
	private static String eleccionStringInt;
	private static String eleccionStringTry;
	private static int eleccionInt;
	private static boolean salir;

	public void menuPrincipal(Partida partida) {
		eleccionString = "<html><div style='text-align: center;'>¡Bienvenido a Java Knights!<br><br>Este es un juego creado en Java donde tendrás que demostrar tus habilidades de estrategia y combate para convertirte en un verdadero caballero.<br><br>A medida que avances en el juego, tendrás la oportunidad de enfrentarte a desafiantes enemigos y ganar valiosos tesoros.<br><br>¡Prepárate para embarcarte en una emocionante aventura en el mundo medieval de Java Knights!</div></html>";
		eleccionString=  "<html><div style='text-align: center;'>Indícanos cuál es tu nombre, caballer@!<br><br></div></html>";
		tryCatchString();
		partida.setNombreProtagonista(eleccionString);
		eleccionString = "<html><div style='text-align: center;'>¿A qué reino quieres pertenecer?<br><br>"
				+ "1. Dragon<br>" + "2. Gigante<br>" + "3. Guerrero<br>" + "4. Hielo<br>" + "5. Ninja</div></html>";
		;
		tryCatchInt();
		switch (eleccionInt) {
		case 1:
			menuPartida();
			break;
		case 2:
			menuCreditos();
			break;
		case 3:
			menuOpciones();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "¡Hasta pronto  " + partida.getProtagonista().getNombre() + " !");
			break;
		}
		resetearCaracteristicas();
	}

	private void resetearCaracteristicas() {
		 eleccionString=null;
		 eleccionStringInt=null;
		 eleccionStringTry=null;
		 eleccionInt=0;
		 salir=false;
	}

	private void menuOpciones() {
		eleccionString="Empieza el combate de los JavaKnigths";
		tryCatchInt();
		switch (eleccionInt) {
		case 1:
			menuPartida();

			break;
		case 2:
			menuCreditos();
			break;
		case 3:
			menuOpciones();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "¡Hasta pronto  " + partida.getProtagonista().getNombre() + " !");
			break;
		}
		resetearCaracteristicas();
	}
	

	private void menuCreditos() {
		resetearCaracteristicas();
	}

	public void menuPartida() {
		resetearCaracteristicas();
	}

	/**
	 * Metodo tryCatch para la entrada de datos de String con bucle incorporado
	 */
	public static void tryCatchString() {

		do {
			try {
				// Escaner de entrada de datos
				eleccionStringTry = JOptionPane.showInputDialog(eleccionString);
				// Si todo va bien sale del bucle y del metodo
				salir = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "Dato mal introducido");
				salir = false;
			}
		} while (!salir);
	}

	/**
	 * Metodo tryCatch para la entrada de datos de int con bucle incorporado
	 */
	public static void tryCatchInt() {
		do {
			try {
				// Escaner de entrada de datos
				eleccionInt = Integer.parseInt(JOptionPane.showInputDialog(eleccionStringInt));
				// Si todo va bien sale del bucle y del metodo
				salir = true;
			} catch (Exception e) {
				// Si todo no va bien vuelve a entrar en el bucle sin salir del metodo
				JOptionPane.showMessageDialog(null, "Dato mal introducido");
				salir = false;
			}
		} while (!salir);
	}
	
}
