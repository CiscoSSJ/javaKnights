package Modelo.Personaje;



public class Subditos extends Personaje {
	String nombreReino;
	String [] nombreSubditos;
	public Subditos(String nombreReino, int fuerza, int vida, int velocidad, int mana, int inteligencia,String[]nombreSubditos) {
		super(nombreReino, fuerza, vida, velocidad, mana, inteligencia);
		this.nombreReino=nombreReino;
		super.nombreSubditos=nombreSubditos[];
		super.fuerza=fuerza*2;
		super.inteligencia=inteligencia*2;
		super.mana=mana*2;
		super.vida=vida*2;
	}

	public String getNombreSubditos() {
		return this.nombre;
	}
	public int getVidaSubditos() {
		return this.vida;
	}
	public int getFuerzaSubditos() {
		return this.fuerza;
	}
	public int getInteligenciaSubditos() {
		return this.inteligencia;
	}
	public int getManaSubditos() {
		return this.mana;
	}
	

}
