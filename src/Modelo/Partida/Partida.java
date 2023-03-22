package Modelo.Partida;

import Modelo.Menu.Menus;
import Modelo.Personaje.Protagonista;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class Partida {
	private Reino[] reinos = { new ReinoDragon(), new ReinoGigante(), new ReinoGuerrero(), new ReinoHielo(),
			new ReinoNinja() };
	private Protagonista protagonistaPartida = new Protagonista();
	private Menus menus = new Menus();

	public Reino setReino(Reino reinos) {
		for (int i = 0; i < this.reinos.length;) {

			if (this.reinos[i] != null) {
				this.reinos[i] = reinos;
				return this.reinos[i];
			}
			i++;
		}
		return reinos;

	}

	public void setProtagonistaPartida(int dificultad) {
		this.protagonistaPartida.setAtributosProtagonista(dificultad, dificultad, dificultad);

	}

	public void setNombreProtagonista(String nombreProtagonista) {
		this.protagonistaPartida.setNombre(nombreProtagonista);
	}

	/**
	 * @return the protagonista
	 */
	public Protagonista getProtagonistaPartida() {

		return protagonistaPartida;
	}

	public Reino[] getReinos() {

		return reinos;

	}

	public Reino getReino() {
		Reino reino = null;
		boolean encontrado = false;
		
		for (int i=0;i<reinos.length&&!encontrado;i++) {
			if (reinos[i] != null) {
				reino = reinos[i];
				encontrado = true;
			}
		}
		return reino;
	}

	public void setAtributosRey(int dificultad) {
		for (Reino r : reinos) {
			r.getRey().setAtributosRey(dificultad);

		}

	}

	/**
	 * public Reino getReino() { for (int i = 0; i < reinos.length && reinos[i] !=
	 * null; i++) { reinoConsultado = reinos[i]; } return reinoConsultado; }
	 */
	public Menus getMenus() {
		return menus;
	}

	/**
	 * @return the mensajeGanadorPartida
	 */
	public String getMensajeGanadorPartida() {
		return "Enhorabuena " + protagonistaPartida.getNombre()
				+ " has pasado de ser un javaknigth cualquiera al aunt�ntico rey";
	}

}
