package Modelo.Personaje;



public class Rey extends Personaje {
	String nombreReino;

	public Rey(String[] nombre,String nombre, int fuerza, int vida, int velocidad, int mana, int inteligencia,String nombreReino) {
		super(nombre,nombre, fuerza, vida, velocidad, mana, inteligencia,nombreReino);
		this.nombreReino=nombreReino;
		super.nombre="Rey del "+nombreReino;
		super.fuerza=fuerza*2;
		super.inteligencia=inteligencia*2;
		super.mana=mana*2;
		super.vida=vida*2;
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
