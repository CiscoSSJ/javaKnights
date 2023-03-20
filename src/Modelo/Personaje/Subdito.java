package Modelo.Personaje;



public class Subdito extends Personaje {


	

	public Subdito(String nombreSubdito, String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreSubdito+" del " +nombreReino, nombreReino, fuerza, vida, velocidad);

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
	public void debilidadSubdito() {
		setVida(0);
	}

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
