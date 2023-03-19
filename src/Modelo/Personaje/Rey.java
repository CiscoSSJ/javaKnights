package Modelo.Personaje;

public class Rey extends Personaje {

	protected Protagonista protagonista;

	public Rey(String nombreRey, String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreRey, nombreReino, fuerza * fuerza, vida * vida, velocidad * velocidad);

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

	public void debilidadRey(int nivelReino) {
		if (this.vida == 1)
			setVida(vida - nivelReino);
		else {
			setVida(vida -= nivelReino / 2);
		}
	}

	@Override
	public void hablar(int nivelReino) {
		debilidadRey(nivelReino);

	}

	@Override
	public void esquivar(int nivelReino) {
		debilidadRey(nivelReino);
	}

	@Override
	public void defender(int nivelReino) {
		debilidadRey(nivelReino);
	}

	@Override
	public void desgastar(int nivelReino) {
		debilidadRey(nivelReino);
	}

	@Override
	public void silencio(int nivelReino) {
		debilidadRey(nivelReino);
	}

	// ¿Velocidad?
	/*
	 * if(protagonista.velocidad<this.velocidad) protagonista.vida-=this.fuerza;
	 * 
	 */

}
