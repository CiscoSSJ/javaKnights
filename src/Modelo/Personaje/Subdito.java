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
	public void debilidadSubdito(int nivelReino) {
		setVida(vida-nivelReino);
	}

	@Override
	public void hablar(int nivelReino) {
		debilidadSubdito(nivelReino);
	}

	@Override
	public void esquivar(int nivelReino) {
		debilidadSubdito(nivelReino);		
	}

	@Override
	public void defender(int nivelReino) {
		debilidadSubdito(nivelReino);		
	}

	@Override
	public void desgastar(int nivelReino) {
		debilidadSubdito(nivelReino);		
	}

	@Override
	public void silencio(int nivelReino) {
		debilidadSubdito(nivelReino);		
	}

	


}
