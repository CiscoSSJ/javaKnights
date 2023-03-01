package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public abstract class Reino {
	protected String nombreReino;
	protected String[] nombreSubditos;
	protected int nivel;
	protected Rey rey;
	protected Subdito [] subditos;
	

	/*
	 * M�todos de acci�n
	 */
	abstract public void atacar();

	abstract public void defender();

	abstract public void curar();

	public Reino(String nombreReino,String nombreSubditos[], int nivel, Rey rey, Subdito [] subditos) {
		this.nivel=nivel;
		this.nombreReino=nombreReino;
		this.nombreSubditos=nombreSubditos;
		this.subditos=subditos;
		this.rey=new Rey(nombreSubditos, this.nombreReino, this.nivel, this.nivel, this.nivel,
		this.nivel, this.nivel,this.nombreReino);
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


	public String getSubditos() {
		return subditos.getNombreSubditos();
	}

}
