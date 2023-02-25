package Modelo.Personaje;

import java.util.Arrays;

import Modelo.Reinos.Reino;

public class Rey extends Personaje {
		
		
	
	

	public Rey(String nombre, int fuerza, int vida, int velocidad, int mana, int inteligencia,Reino reinoPerteneciente) {
		super(nombre, fuerza, vida, velocidad, mana, inteligencia, reinoPerteneciente);
		Rey.nombre=nombre;
		Rey.fuerza=fuerza*Reino.getNivel();
		Rey.inteligencia=inteligencia*Reino.getNivel();
		Rey.mana=mana*Reino.getNivel();
		Rey.vida=vida*Reino.getNivel();
	}




	
	@Override
	public String toString() {
		return "Rey [nombre=" + nombre + ", fuerza=" + fuerza + ", vida=" + vida + ", velocidad=" + velocidad
				+ ", mana=" + mana + ", inteligencia=" + inteligencia + ", reinoPerteneciente=" + reinoPerteneciente
				+ ", rey=" + rey + ", subditos=" + Arrays.toString(subditos) + ", protagonista=" + protagonista + "]";
	}





	public String getNombre() {
		// TODO Auto-generated method stub
		return Rey.nombre;
	}







	
}
