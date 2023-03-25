package Gestion;

import Modelo.Partida.Partida;

public class Main {

	public static void main(String[] args) {
		//Crea e inicia una partida nueva
		Partida partida1 = new Partida();
		partida1.getMenus().menuPrincipal(partida1);
	}
}
