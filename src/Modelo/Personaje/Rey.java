package Modelo.Personaje;

import Modelo.Reinos.Reino;

public class Rey extends Personaje {
	String nombreReino;

	public Rey( String nombre, int fuerza, int vida, int velocidad, int mana,
			int inteligencia) {
				super(nombre, fuerza*, vida*2, velocidad*Reino.getNivel(), mana, inteligencia);
	}

}

	public String getNombreRey() {
		return this.nombre;
	}

	public int getVidaRey() {
		return this.vida;
	}

	public int getFuerzaRey() {
		return this.fuerza;
	}

	public int getInteligenciaRey() {
		return this.inteligencia;
	}

	public int getManaRey() {
		return this.mana;
	}

}
