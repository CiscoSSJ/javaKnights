package Modelo.Personaje;

public class Protagonista extends Personaje {
	private  String nombreProtagonista;

	public Protagonista() {
		super();
	}

	public void setAtributosProtagonista(int fuerza, int vida, int velocidad) {
		this.fuerza = fuerza;
		this.vida = vida;
		this.velocidad = velocidad;
	}

	public void setNombreProtagonista(String nombreProta) {
		this.nombreProtagonista = nombreProta + " I";
	}

	public  String getNombreProtagonista() {
		return nombreProtagonista;
	}

	public int getVida() {
		return this.vida;
	}

	public int getFuerza() {
		return this.fuerza;
	}

	@Override
	public void hablar() {
   // TODO document why this method is empty
 }

	@Override
	public void esquivar() {
   // TODO document why this method is empty
 }

	@Override
	public void defender() {
   // TODO document why this method is empty
 }

	@Override
	public void desgastar() {
   // TODO document why this method is empty
 }

	@Override
	public void silencio() {
   // TODO document why this method is empty
 }

}
