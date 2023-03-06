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

	public static void main(String[] args) {

		String nombreProtagonista = "";
		Protagonista.nombreProtagonista = nombreProtagonista;
		String reinoPerteneciente;
		boolean salir = false;

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
		try {
			do {

				nombreProtagonista = JOptionPane.showInputDialog(null, "Como te llamas");
				reinoPerteneciente = JOptionPane.showInputDialog(null,
						"¿A qué reino quieres pertenecer?" + "\n" + "1.Dragon");
				switch (reinoPerteneciente) {
				case "1": {
					ReinoDragon reinoDragon = new ReinoDragon(true);
					Protagonista.isCreado = false;
					System.out.println(Protagonista.getNombreProtagonista());

				}
					break;
				case "2": {
					ReinoGigante reinoGigante = new ReinoGigante(true);
					Protagonista.isCreado = false;
				}
					break;
				case "3": {
					ReinoGuerrero reinoGuerrero = new ReinoGuerrero(true);
					Protagonista.isCreado = false;
				}
					break;
				case "4": {
					ReinoHielo reinoHielo = new ReinoHielo(true);
					Protagonista.isCreado = false;
				}
					break;
				case "5": {
					ReinoGigante reinoGigante = new ReinoGigante(true);
					Protagonista.isCreado = false;
				}
					break;
				}
			} while (salir);
		} catch (Exception e) {

		} finally {
			ListaReinosNoCreados listaReinosNoCreados = new ListaReinosNoCreados();
			System.out.println(listaReinosNoCreados.getReinosNoCreados());

		}

		do

			try {
				do {

				} while (salir);
			} catch (Exception e) {
				// TODO: handle exception
			}
		while (!salir);

	}
}
