package Modelo.OpcionesMenu;

import Modelo.Personaje.Protagonista;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class Partida {
	static boolean saliReinos;
	private Reino[] reinos = { new ReinoDragon(), new ReinoGigante(), new ReinoGuerrero(), new ReinoHielo(),
			new ReinoNinja() };

	private Partida[] partidasGuardadas;
	private Dificultad dificultad=new Dificultad(null);
	private Protagonista protagonistaPartida = new Protagonista();
	private Menu menu = new Menu();
	

	public void setReinoConsultado(Reino reino) {
		reinoConsultado = reino;
	}

	public void setReinos(Reino[] reinos) {
		this.reinos = reinos;
	}

	public void setPartidasGuardadas(Partida partida) {
		for (int i = 0; i < partidasGuardadas.length && partidasGuardadas[i] != null; i++) {

			if (partidasGuardadas[i] == null) {
				partidasGuardadas[i] = partida;

			}

		}
	}
	
	public  void setProtagonistaPartida(Protagonista protagonistaMenu) {
		if (protagonistaPartida!=null) {
			protagonistaMenu.setAtributosProtagonista( getReino().getNivel(), getReino().getNivel(), getReino().getNivel());
			protagonistaPartida = protagonistaMenu;
		}
	}
	 void setNombreProtagonista(String nombreProtagonista) {
		protagonistaPartida.setNombreProtagonista(nombreProtagonista);
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
	    for (Reino r : reinos) {
	        if (r != null) {
	            return r;
	        }
	    }
	    return null; // Si no se encuentra ning�n elemento no nulo, devuelve null
	}

	/**
	public Reino getReino() {
		for (int i = 0; i < reinos.length && reinos[i] != null; i++) {
			reinoConsultado = reinos[i];
		}
		return reinoConsultado;
	}
	*/
	public Menu getMenus() {
		return menu;
	}

	public Partida[] getPartidasGuardadas() {
		return partidasGuardadas;
	}

	/**
	 * @return the dificultad
	 */
	public Dificultad getDificultad() {
		return dificultad;
	}

	/**
	 * @param dificultad the dificultad to set
	 */
	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

	/**
	 * @return the mensajeGanadorPartida
	 */
	public String getMensajeGanadorPartida() {
		return "Enhorabuena "+protagonistaPartida.getNombre()+" has pasado de ser un javakngth cualquiera al aunt�ntico rey";
	}
}
