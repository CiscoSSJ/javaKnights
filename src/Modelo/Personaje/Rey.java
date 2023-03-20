package Modelo.Personaje;

public class Rey extends Personaje {

	protected Protagonista protagonista;
	private int dificultad;
	
	public Rey(String nombreRey, String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreRey, nombreReino, fuerza , vida , velocidad );

	}
	public void  setAtributosRey(int dificultad) {
		this.fuerza*=dificultad;
		this.vida*=dificultad;
		this.velocidad*=dificultad;
		this.dificultad=dificultad;
		
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
		if (this.vida == 1)
			setVida(0);
		else {
			setVida(vida -=(this.dificultad/ 2));
		}
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
	
	// ¿Velocidad?
	/*
	 * if(protagonista.velocidad<this.velocidad) protagonista.vida-=this.fuerza;
	 * 
	 */

}
