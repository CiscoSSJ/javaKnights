package Modelo.Reinos;

import Modelo.Personaje.Personaje;


public class ReinoNinja extends Reino {

	/**
	 * Constructor para la clase ReinoNinja que llama al constructor de la superclase Reino.
	 */
	public ReinoNinja() {
		super("Bruce Lee", new String[] { "Hattori Hanzo", "Goemon Ishikawa", "Saizo Kirigakure" }, "Reino Ninja", 5);
	}

	/**
	 * Método que establece la debilidad de un personaje de acuerdo a un booleano comprobar.
	 * Si el booleano es verdadero, 
	 * se llama al método silencio() del objeto Personaje recibido como parámetro.
	 */
	@Override
	public void debilidad(Personaje personaje, boolean comprobar) {
		if (comprobar)
			personaje.silencio();

	}

}
