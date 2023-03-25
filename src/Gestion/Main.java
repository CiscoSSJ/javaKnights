package Gestion;

import Modelo.Partida.Partida;

public class Main {

	public static void main(String[] args) {
		// Crea una nueva instancia de Partida
		Partida partida1 = new Partida();
		/**
		 * Llama al método menuPrincipal() de la clase Menus de la
		 * instancia de Partida creada anteriormente.
		 */
		partida1.getMenus().menuPrincipal(partida1);
	}
}
