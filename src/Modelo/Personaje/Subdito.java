package Modelo.Personaje;



public class Subdito extends Personaje {
	String nombreReino;
	String [] nombreSubditos;
	public Subdito(String[]nombreSubditos,String nombreReino, int fuerza, int vida, int velocidad, int mana, int inteligencia) {
		super(nombreSubditos,nombreReino, fuerza, vida, velocidad, mana, inteligencia);
		this.nombreReino=nombreReino;
		this.nombreSubditos=nombreSubditos;
		super.fuerza=fuerza*2;
		super.inteligencia=inteligencia*2;
		super.mana=mana*2;
		super.vida=vida*2;
	}

	public String getNombreReino() {
		return this.nombreReino;
	}


    public String getNombreSubditos() {
		return this.nombreSubditos[i];
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
