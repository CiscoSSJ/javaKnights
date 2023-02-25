package Modelo.Personaje;

import Modelo.Reinos.Reino;

public abstract class Personaje{
    protected static String nombre;
    protected static int fuerza;
    protected static int vida;
    protected static int velocidad;
    protected static int mana;
    protected static int inteligencia;
    protected static Reino reinoPerteneciente;
    protected Rey rey ;
    protected Subditos subditos[];
    protected Protagonista protagonista;
    
    
	public Personaje(String nombre, int fuerza, int vida, int velocidad, int mana, int inteligencia, Reino reinoPerteneciente) {
		Personaje.nombre = nombre;
		Personaje.fuerza = fuerza;
		Personaje.vida = vida;
		Personaje.velocidad = velocidad;
		Personaje.mana = mana;
		Personaje.inteligencia = inteligencia;
		Personaje.reinoPerteneciente = reinoPerteneciente;
	}
	public Personaje(String nombre,Reino reinoPerteneciente) {
		Personaje.nombre=nombre;
		Personaje.reinoPerteneciente=reinoPerteneciente;
	}
 
    

}
