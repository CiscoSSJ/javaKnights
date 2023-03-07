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



	public void debilidad() {
		this.vida = 0;
	}

	abstract public void atacar();

	abstract public void defender();

	abstract public void curar();
}
