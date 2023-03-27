package Modelo.Reinos;

import Modelo.Personaje.Personaje;

/**
 * Esta clase se llama ReinoHielo y extiende la clase abstracta Reino.
 * Representa un reino de hielo en un mundo ficticio.
 */
public class ReinoHielo extends Reino {

	/**
	 * Llama al constructor de la clase Reino pasando el nombre del rey, un arreglo
	 * de nombres de personajes importantes en el reino, el nombre del reino y el
	 * nivel.
	 */
	public ReinoHielo() {
		super("Rey de la noche", new String[] { "Elsa de Frozen", "Caminante Blanco", "Gared Tollett" }, "Reino Hielo",
				4);

	}

	/**
	 * Un metodo que representa la debilidad del reino de hielo. Si comprobar es
	 * verdadero, entonces el personaje pierde resistencia al desgaste.
	 */
	@Override
	public void debilidad(Personaje personaje) {
		if (personaje.getNombreReino().equals(getNombreReino()))
			personaje.hablar();

	}

}
