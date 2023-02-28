package Modelo.Personaje;

import Modelo.Reinos.Reino;

public class Rey extends Personaje {
	Reino nombreReino;
	public Rey(String nombre, int fuerza, int vida, int velocidad, int mana, int inteligencia) {
		super(nombre, fuerza, vida, velocidad, mana, inteligencia);
		super.nombre="Rey del "+this.nombreReino;
		super.fuerza=fuerza*2;
		super.inteligencia=inteligencia*2;
		super.mana=mana*2;
		super.vida=vida*2;
	}
	
}
