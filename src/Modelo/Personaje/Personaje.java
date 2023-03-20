package Modelo.Personaje;

public abstract class Personaje {
	protected String nombre;
	protected String nombreReino;
	protected int fuerza;
	protected int vida;
	protected int velocidad;

	public Personaje(String nombre, String nombreReino, int fuerza, int vida, int velocidad) {
		this.nombre = nombre;
		this.nombreReino = nombreReino;
		this.fuerza = fuerza;
		this.vida = vida;
		this.velocidad = velocidad;
	}

	public Personaje() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreReino() {
		return nombreReino;
	}

	public void setNombreReino(String nombreReino) {
		this.nombreReino = nombreReino;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}



	public abstract void hablar();
	public abstract void esquivar();
	public abstract void defender();
	public abstract void desgastar();
	public abstract void silencio();
}
