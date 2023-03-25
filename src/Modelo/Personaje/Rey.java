package Modelo.Personaje;

public class Rey extends Personaje {

	

	public Rey(String nombreRey, String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreRey, nombreReino, fuerza, vida, velocidad);

	}

	public void setAtributosRey(int dificultad) {
		this.fuerza -= (dificultad - fuerza) ;
		this.vida -= (dificultad - vida) ;
		this.velocidad -= (dificultad - velocidad) ;

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
