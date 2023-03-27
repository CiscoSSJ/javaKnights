package Modelo.Reinos;

import Modelo.Personaje.Personaje;

/**
 * Esta es la clase "ReinoDragon" que extiende la clase abstracta "Reino". La
 * clase define el constructor "ReinoDragon" y el metodo "debilidad" que anula
 * el metodo abstracto de la clase padre "Reino".
 */
public class ReinoDragon extends Reino {

	/**
	 * Constructor de la clase "ReinoDragon" que llama al constructor de la clase
	 * padre "Reino" con los siguientes parámetros: "Veighar" (nombre del rey),
	 * ["Droghon", "Raeghal", "Viserion"] (nombres de los dragones), "Reino Dragon"
	 * (nombre del reino), 1 (nivel del reino).
	 */
	public ReinoDragon() {
		super("Veighar", new String[] { "Droghon", "Raeghal", "Viserion" }, "Reino Dragon", 1);

	}

	/**
	 * Este metodo anula el método abstracto "debilidad" de la clase padre "Reino".
	 * Si el parámetro "comprobar" es verdadero, el metodo invoca al metodo
	 * "hablar" del objeto "personaje" pasado como parametro.
	 */
	@Override
	public void debilidad(Personaje personaje) {
		if (personaje.getNombreReino().equals(getNombreReino()))
			personaje.hablar();

	}

}
