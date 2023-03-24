package Gestion;

import Modelo.Partida.Partida;

public class Main {

	public static void main(String[] args) {
		//Inica la partida
		Partida partida1 = new Partida();
		partida1.getMenus().menuPrincipal(partida1);
	}
}
