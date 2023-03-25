package Modelo.Reinos;

import Modelo.Personaje.Personaje;

/**
 * Esta es la clase "ReinoDragon" que extiende la clase abstracta "Reino".
 * La clase define el constructor "ReinoDragon" y el método "debilidad" que
 * anula el método abstracto de la clase padre "Reino".
 */
public class ReinoDragon extends Reino {

	/**
	 * Constructor de la clase "ReinoDragon" que llama al constructor de la clase
	 * padre "Reino" con los siguientes parámetros: "Veighar" (nombre del rey),
	 * ["Droghon", "Raeghal", "Viserion"] (nombres de los dragones), 
	 * "Reino Dragon" (nombre del reino), 1 (nivel del reino).
	 */
	public ReinoDragon() {
		super("Veighar", new String[] { "Droghon", "Raeghal", "Viserion" }, "Reino Dragon", 1);

	}

	/**
	 * Este método anula el método abstracto "debilidad" de la clase padre "Reino".
	 * Si el parámetro "comprobar" es verdadero, el método invoca al método
	 * "hablar" del objeto "personaje" pasado como parámetro.
	 */
	@Override
	public void debilidad(Personaje personaje, boolean comprobar) {
		if (comprobar)
			personaje.hablar();

	}

}
