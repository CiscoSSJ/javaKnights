package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public abstract class Reino {
	protected String nombreReino;
	protected int nivel;
	protected Rey rey;
	protected Subditos subditos[];
	protected Subditos subditoss;

	/*
	 * M�todos de acci�n
	 */
	abstract public void atacar();

	abstract public void defender();

	abstract public void curar();

	public Reino(String nombreReino, int nivel, Rey rey, Subditos[] subditos) {

	}

	public int getNivel() {
		return this.nivel;
	}

	public String getNombreReino() {
		// TODO Auto-generated method stub
		return this.nombreReino;
	}

	/**
	 * Getters de los atributos del rey
	 * 
	 * @return
	 */
	public Rey getRey() {
		return rey;
	}

	public String getNombreRey() {
		return rey.getNombreRey();
	}

	public int getVidaRey() {
		return rey.getVidaRey();
	}

	public int getFuerzaRey() {
		return rey.getFuerzaRey();
	}

	public int getInteligenciaRey() {
		return rey.getInteligenciaRey();
	}

	public int getManaRey() {
		return rey.getManaRey();
	}

	/**
	 * Getters de los atributos de los s�bditos
	 * 
	 * @return
	 */
	public String getNombreSubditoss() {
		return getNombreSubditos();

	}

	public Subditos[] getSubditos() {
		return subditos;
	}

}
