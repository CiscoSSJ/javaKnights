package Modelo.Personaje;

import Modelo.Reinos.Reino;

public abstract class Personaje {
	protected String nombre;
	protected int fuerza;
	protected int vida;
	protected int velocidad;
	protected int mana;
	protected int inteligencia;
	

	public Personaje( String nombre, int fuerza, int vida, int velocidad, int mana,
			int inteligencia) {
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.vida = vida;
		this.velocidad = velocidad;
		this.mana = mana;
		this.inteligencia = inteligencia;
	}
}
