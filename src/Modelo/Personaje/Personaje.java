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

	public String getNombreReino() {
		return nombreReino;
	}

	public void debilidad() {
		this.vida = 0;
	}

	abstract public void atacar();

	abstract public void defender();

	abstract public void curar();
}
