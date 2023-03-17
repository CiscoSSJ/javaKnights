package Gestion;

import javax.swing.JOptionPane;

import Modelo.OpcionesMenu.Partida;

public class JavaKnights {

	public static void main(String[] args) {
		Partida partida1=new Partida();
		JOptionPane.showMessageDialog(null,partida1.getMensajeBienvenida());
		partida1.getMenus().menuPrincipal(partida1);
		
	}

}
