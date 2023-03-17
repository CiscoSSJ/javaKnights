package Modelo.Personaje;
public class Subdito extends Personaje {


	

	public Subdito(String nombreSubdito, String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreSubdito, nombreReino, fuerza, vida, velocidad);

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

	@Override
	public void atacar() {
		getProtagonista.getvida -= this.fuerza;
	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void curar() {
		// TODO Auto-generated method stub
		
	}

}
