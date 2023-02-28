package Modelo.Personaje;

import Modelo.Reinos.Reino;

public abstract class Personaje {
	protected String nombre;
	protected int fuerza;
	protected int vida;
	protected int velocidad;
	protected int mana;
	protected int inteligencia;
	private Rey rey;
	protected Subditos subditos[];
	protected Protagonista protagonista;

	public Personaje(String nombre, int fuerza, int vida, int velocidad, int mana, int inteligencia) {
	
	}

	

}
