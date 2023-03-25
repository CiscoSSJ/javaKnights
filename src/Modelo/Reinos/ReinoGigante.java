package Modelo.Reinos;

import Modelo.Personaje.Personaje;

/**
 * Clase que representa el Reino de los Gigantes en el modelo.
 * La clase ReinoGigante hereda de la clase Reino.
 */
public class ReinoGigante extends Reino {

	/**
	 * Constructor de la clase ReinoGigante que inicializa los atributos específicos del reino gigante
	 */
	public ReinoGigante() {
		super("Gigante de hierro", new String[] { "Mag el Poderoso", "Wun Weg Wun Dar Wun", "Dongo el gigante" },
				"Reino Gigante", 2);

	}

	/**
	 * Implementación del método debilidad de la clase Reino que permite a un personaje esquivar.
	 */
	@Override
	public void debilidad(Personaje personaje,boolean comprobar) {
		if(comprobar)
			personaje.esquivar();

	}

}
