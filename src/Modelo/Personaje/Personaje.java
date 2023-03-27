package Modelo.Personaje;

/** 
 * Atributos de la clase "Personaje".
 * "nombre", "nombreReino", "fuerza", "vida" y "velocidad" son las propiedades de un personaje.
 */
public abstract class Personaje {
	protected String nombre;
	protected String nombreReino;
	protected int fuerza;
	protected int vida;
	protected int velocidad;

	/** 
	 * Constructor para la clase "Personaje" que toma un nombre, nombreReino, fuerza, vida y velocidad como argumentos.
	 * Inicializa los atributos con los valores de los argumentos.
	 */
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

	/** 
	 * Método para comparar si un objeto es igual al personaje.
	 * Devuelve verdadero si el objeto es igual al personaje en términos de su vida, falso en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return vida == other.vida;
	}

	public abstract void hablar();

	public abstract void esquivar();

	public abstract void defender();

	public abstract void desgastar();

	public abstract void silencio();
}
