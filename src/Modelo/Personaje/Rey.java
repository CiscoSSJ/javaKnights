package Modelo.Personaje;

public class Rey extends Personaje {

	/**
	 * Constructor de la clase rey en la que tienes que introducir los siguientes
	 * valores.
	 * 
	 * @param nombreRey
	 * @param nombreReino
	 * @param fuerza
	 * @param vida
	 * @param velocidad
	 */
	
	public Rey(String nombreRey, String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreRey, nombreReino, fuerza, vida, velocidad);

	}

	/**
	 * Modifica los valores del rey dependiendo de la dificultad que se le pase por
	 * parametros.
	 * 
	 * @param dificultad
	 */
	public void setAtributosRey(int dificultad) {
		this.fuerza -= (dificultad - fuerza);
		this.vida -= (dificultad - vida);
		this.velocidad -= (dificultad - velocidad);

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

	/**
	 * Metodos que se aplica se aciertas la debilidad.
	 */
	public void debilidadRey() {
		setVida(0);
	}

	@Override
	public void hablar() {
		debilidadRey();

	}

	@Override
	public void esquivar() {
		debilidadRey();
	}

	@Override
	public void defender() {
		debilidadRey();
	}

	@Override
	public void desgastar() {
		debilidadRey();
	}

	@Override
	public void silencio() {
		debilidadRey();
	}

}
