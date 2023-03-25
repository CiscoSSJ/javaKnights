package Modelo.Reinos;

import Modelo.Personaje.Personaje;

/**
 * La siguiente clase Java extiende la clase Reino y representa un Reino
 * Guerrero.
 */
public class ReinoGuerrero extends Reino {

	/**
	 * Constructor de la clase ReinoGuerrero que llama al constructor de la clase
	 * padre Reino.
	 */
	public ReinoGuerrero() {
		super("Alejandro Magno", new String[] { "Jon Nieve", "Jaime Lannister", "Brienne de Tarth" }, "Reino Guerrero",
				3);

	}

	/**
	 * Sobrescribe el metodo debilidad de la clase padre Reino. Si comprobar es
	 * verdadero, el personaje defiende.
	 */
	@Override
	public void debilidad(Personaje personaje) {
		if (personaje.getNombreReino().equals(getNombreReino()))
			personaje.hablar();

	}

}
