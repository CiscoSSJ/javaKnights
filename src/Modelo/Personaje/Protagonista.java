package Modelo.Personaje;



public class Protagonista extends Personaje {
	private static String nombreProtagonista;
	public Protagonista () {
		super();
	}
	

	
	
	public void setAtributosProtagonista(int fuerza, int vida, int velocidad) {
		this.fuerza=fuerza;
		this.vida=vida;
		this.velocidad=velocidad;
	}

	public void setNombreProtagonista(String nombreProtagonista) {
		this.nombreProtagonista=nombreProtagonista+" I del "+super.nombreReino;
	}
	public static String getNombreProtagonista() {
		return nombreProtagonista;
	}
	public int getVida() {
		return this.vida;
	}

	public int getFuerza() {
		return this.fuerza;
	}



	@Override
	public void atacar() {
		
	}



	@Override
	public void defender() {
		
	}



	@Override
	public void curar() {
		
	}
	






	







	

}
