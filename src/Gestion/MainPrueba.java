package Gestion;

import javax.swing.JOptionPane;

import Modelo.Personaje.Protagonista;
import Modelo.Personaje.Rey;
import Modelo.Reinos.ListaReinosNoCreados;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class MainPrueba {
	public static ReinoDragon reinoDragon = new ReinoDragon();
	public static ReinoGigante reinoGigante = new ReinoGigante();
	public static ReinoGuerrero reinoGuerrero = new ReinoGuerrero();
	public static ReinoHielo reinoHielo = new ReinoHielo();
	public static ReinoNinja reinoNinja = new ReinoNinja();
	public static void main(String[] args) {

		

		

		/**
		 * ReinoGigante dos=new ReinoGigante(); System.out.println(dos.getNombreRey());
		 * System.out.println(dos.getNombreReino());
		 * System.out.println(dos.getNombreSubditos());
		 * System.out.println(dos.getNombreProtagonista()); ReinoDragon tres=new
		 * ReinoDragon(); System.out.println(tres.getFuerzaRey());
		 */
		/*
		 * ReinoGuerrero uno=new ReinoGuerrero();
		 * 
		 * System.out.println(uno.getNombreRey());
		 * System.out.println(uno.getNombreProtagonista());
		 * System.out.println(uno.getNombreSubditos());
		 * System.out.println(uno.getVidaRey());
		 */
		menuPersonaje();
	}




	public static void menuPersonaje(){
		String nombreProtagonista = "";
		int reinoPerteneciente = 0;
		boolean salir = false;
		boolean continuarExcepcion = false;

		do {
			do {
				try {
					if (nombreProtagonista.equals("")){
						nombreProtagonista = JOptionPane.showInputDialog(null, "Como te llamas");
						if (nombreProtagonista.length() <= 0){
							throw EStringVacio();
						}
					}
					reinoPerteneciente = Integer.parseInt(JOptionPane.showInputDialog(null,
						"¿A qué reino quieres pertenecer?\n" 
							+ "1. Dragon\n"
							+ "2. Gigante\n"
							+ "3. Guerrero\n"
							+ "4. Hielo\n"
							+ "5. Ninja\n"));
					continuarExcepcion = true;
				} catch (NumberFormatException reino) {
					JOptionPane.showMessageDialog(null, "Introduce uno de los 5 reinos");
				} catch (Exception vacio){
					JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio");
				}
			} while (!continuarExcepcion);
			switch (reinoPerteneciente) {
				case 1: {
					Protagonista jugador = new Protagonista(nombreProtagonista, reinoDragon.getNombreReino(),
					reinoDragon.getNivel(), reinoDragon.getNivel(), reinoDragon.getNivel());
					reinoDragon.setProtagonista(jugador);
				}
					break;
				case 2: {
					Protagonista jugador = new Protagonista(nombreProtagonista, reinoGigante.getNombreReino(),
					reinoGigante.getNivel(), reinoGigante.getNivel(), reinoGigante.getNivel());
					reinoGigante.setProtagonista(jugador);
				}
					break;
				case 3: {
					Protagonista jugador = new Protagonista(nombreProtagonista, reinoGuerrero.getNombreReino(),
					reinoGuerrero.getNivel(), reinoGuerrero.getNivel(), reinoGuerrero.getNivel());
					reinoGuerrero.setProtagonista(jugador);
				}
					break;
				case 4: {
					Protagonista jugador = new Protagonista(nombreProtagonista, reinoHielo.getNombreReino(),
					reinoHielo.getNivel(), reinoHielo.getNivel(), reinoHielo.getNivel());
					reinoHielo.setProtagonista(jugador);
				}
					break;
				case 5: {
					Protagonista jugador = new Protagonista(nombreProtagonista, reinoNinja.getNombreReino(),
					reinoNinja.getNivel(), reinoNinja.getNivel(), reinoNinja.getNivel());
					reinoNinja.setProtagonista(jugador);
				}
					break;
			}
		} while (salir);
	}



	private static Exception EStringVacio() {
		return null;
	}
}
