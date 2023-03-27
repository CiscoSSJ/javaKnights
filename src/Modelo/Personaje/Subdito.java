package Modelo.Personaje;

public class Subdito extends Personaje {

	/**
	 * Constructor de la clase Subdito en la que te exige los siguientes parametros.
	 * 
	 * @param nombreSubdito
	 * @param nombreReino
	 * @param fuerza
	 * @param vida
	 * @param velocidad
	 */
	public Subdito(String nombreSubdito, String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreSubdito + " del " + nombreReino, nombreReino, fuerza, vida, velocidad);

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

	/**
	 * Cuando aciertas la de debilidad del subdito se setea la vida a 0.
	 */
	public void debilidadSubdito() {
		setVida(0);
	}

	/**
	 * Metodos que se aplica se aciertas la debilidad.
	 */
	@Override
	public void hablar() {
		debilidadSubdito();
	}

	@Override
	public void esquivar() {
		debilidadSubdito();
	}

	@Override
	public void defender() {
		debilidadSubdito();
	}

	@Override
	public void desgastar() {
		debilidadSubdito();
	}

	@Override
	public void silencio() {
		debilidadSubdito();
	}

}
