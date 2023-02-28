package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public abstract class Reino {
	protected String nombreReino;
	protected int nivel;
	protected Rey rey;
	protected Subditos subditos[];
	
	/*
	 * M�todos de acci�n
	 */
	abstract public void atacar();

	abstract public void defender();

	abstract public void curar();

	public Reino(String nombreReino, int nivel,Rey rey,Subditos []subditos) {
	}

	
	public int getNivel() {
		return this.nivel;
	}

	public String getNombreReino() {
		// TODO Auto-generated method stub
		return this.nombreReino;
	}

	public String getNombreRey() {
		return this.getNombreRey();
	}


	public Subditos[] getSubditos() {
		return subditos;
	}


	
}
