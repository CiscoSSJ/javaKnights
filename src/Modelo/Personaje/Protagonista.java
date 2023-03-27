package Modelo.Personaje;

public class Protagonista extends Personaje {

	/**
	 * Construtor de la clase personaje.
	 */
	public Protagonista() {
		super();
	}

	public void setNombreReino(String nombreReino) {
		this.nombre = this.nombre + " I del " + nombreReino;
	}

	public String getNombreProtagonista() {
		return nombre;
	}

	public void setNombreProtagonista(String nombreProta) {
		this.nombre = nombreProta;
	}

	public int getVida() {
		return this.vida;
	}

	/**
	 * Modifica los valores del protagonista.
	 * 
	 * @param fuerza
	 * @param vida
	 * @param velocidad
	 */
	public void setAtributosProtagonista(int fuerza, int vida, int velocidad) {
		this.fuerza = fuerza;
		this.vida = vida;
		this.velocidad = velocidad;
	}

	public void setAtaqueAProtagonista() {

		this.vida--;

	}

	@Override
	public void hablar() {

	}

	@Override
	public void esquivar() {
	}

	@Override
	public void defender() {
	}

	@Override
	public void desgastar() {
	}

	@Override
	public void silencio() {
	}

}
