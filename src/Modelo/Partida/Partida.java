package Modelo.Partida;

import Modelo.Menu.Menus;
import Modelo.Personaje.Protagonista;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

/**
 * Clase Partida que representa una partida del juego con un protagonista y varios reinos.
 */
public class Partida {
	
	/**
	 * Array de objetos Reino, inicializado con una instancia de cada subclase de Reino: Dragon, Gigante, Guerrero, Hielo, Ninja
	 */
	private Reino[] reinos = { new ReinoDragon(), new ReinoGigante(), new ReinoGuerrero(), new ReinoHielo(),
			new ReinoNinja() };
	/**
	 * Objeto Protagonista que representa al jugador en la partida, inicializado con una nueva instancia de Protagonista.
	 */
	private Protagonista protagonistaPartida = new Protagonista();
	
	/**
	 * Objeto Menus que se utiliza para mostrar y gestionar los menús en la partida, inicializado con una nueva instancia de Menus.
	 */
	private Menus menus = new Menus();

	/**
	 * Getters y setters de los atributos de Partida
	 */
	/**
	 * 
	 * @param dificultad
	 */
	public void setProtagonistaPartida(int dificultad) {
		this.protagonistaPartida.setAtributosProtagonista(dificultad, dificultad, dificultad);

	}

	/**
	 * 
	 * @param nombreProtagonista
	 */
	public void setNombreProtagonista(String nombreProtagonista) {
		this.protagonistaPartida.setNombre(nombreProtagonista);
	}

	/**
	 * Este set de rey va a servir para cuando elijamos las dificultad que el rey
	 * settee sus valores conforme a la dificultad que se escoga
	 * 
	 * @param dificultad
	 */
	public void setAtributosRey(int dificultad) {
		for (Reino r : reinos) {
			r.getRey().setAtributosRey(dificultad);

		}

	}

	/**
	 * @return the protagonista
	 */
	public Protagonista getProtagonistaPartida() {

		return protagonistaPartida;
	}

	/**
	 * 
	 * @return array reinos
	 */
	public Reino[] getReinos() {

		return reinos;

	}

	/**
	 * Este metodo devuelve el reino mientras que la variable encontrado sea true
	 * asi que si el reino no es null va a pararse la iteraccion y reino va a ser
	 * reino[i]
	 * 
	 * @return reino (encontrado)
	 */
	public Reino getReino() {
		Reino reino = null;
		boolean encontrado = false;

		for (int i = 0; i < reinos.length && !encontrado; i++) {
			if(reinos[i].getRey()==null) {
				reinos[i].setNombreReino("Reino vencido");
			}
			if (!reinos[i].getNombreReino().equals("Reino vencido")) {
				reino = reinos[i];
				encontrado = true;
			}

		}
		return reino;
	}

	/**
	 * 
	 * @return menus
	 */
	public Menus getMenus() {
		return menus;
	}

	/**
	 * @return the mensajeGanadorPartida
	 */
	public String getMensajeGanadorPartida() {
		return "Enhorabuena " + protagonistaPartida.getNombre()
				+ " has pasado de ser un javaknigth cualquiera al auntentico rey";
	}

}
