package Modelo.Personaje;

import Modelo.Reinos.Reino;

public class Rey extends Personaje {
	Reino reino;
	
	public Rey( Reino reino,String nombre, int fuerza, int vida, int velocidad, int mana,
			int inteligencia) {
				super(nombre, fuerza*reino.getNivel(), vida*2, velocidad*Reino.getNivel(), mana, inteligencia);
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
