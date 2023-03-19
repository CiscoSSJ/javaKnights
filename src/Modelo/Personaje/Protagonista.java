package Modelo.Personaje;

public class Protagonista extends Personaje {
	private static String nombreProtagonista;

	public Protagonista() {
		super();
	}

	public void setAtributosProtagonista(int fuerza, int vida, int velocidad) {
		this.fuerza = fuerza;
		this.vida = vida;
		this.velocidad = velocidad;
	}

	public void setNombreProtagonista(String nombreProta) {
		nombreProtagonista = nombreProta + " I del " + super.nombreReino;
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
	public void hablar(int nivelReino) {
   // TODO document why this method is empty
 }

	@Override
	public void esquivar(int nivelReino) {
   // TODO document why this method is empty
 }

	@Override
	public void defender(int nivelReino) {
   // TODO document why this method is empty
 }

	@Override
	public void desgastar(int nivelReino) {
   // TODO document why this method is empty
 }

	@Override
	public void silencio(int nivelReino) {
   // TODO document why this method is empty
 }

}
