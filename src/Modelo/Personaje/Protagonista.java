package Modelo.Personaje;

public class Protagonista extends Personaje {
	private String nombreProtagonista;

	public Protagonista() {
		super();
	}

	public void setNombreReino(String nombreReino) {
		this.nombreProtagonista = this.nombreProtagonista + " I del " + nombreReino;
	}

	public String getNombreProtagonista() {
		return nombreProtagonista;
	}

	public void setNombreProtagonista(String nombreProta) {
		this.nombreProtagonista = nombreProta;
	}

	public int getVida() {
		return this.vida;
	}

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
