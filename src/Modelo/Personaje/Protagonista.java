package Modelo.Personaje;

import Modelo.Reinos.Reino;

public class Protagonista extends Personaje {

	public Protagonista( Reino nombre, Reino reinoPerteneciente) {
		super( nombre, reinoPerteneciente);
	}
	

	public Reino getReinoPerteneciente() {
		return reinoPerteneciente;
	}

	public int getVida() {
		// TODO Auto-generated method stub
		return Protagonista.vida;
	}

	public int getFuerza() {
		// TODO Auto-generated method stub
		return Protagonista.fuerza;
	}

	

}
