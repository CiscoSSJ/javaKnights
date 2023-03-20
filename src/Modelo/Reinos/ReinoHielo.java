package Modelo.Reinos;

import Modelo.Personaje.Personaje;


public class ReinoHielo extends Reino {

	public ReinoHielo() {
		super("Rey de la noche", new String[] { "Elsa de Frozen", "Caminante Blanco", "Gared Tollett" }, "Reino Dragon",
				4);

	}

	@Override

	public void debilidad(Personaje personaje) {
		personaje.desgastar(getNivel());

	}

	@Override
	protected boolean comprobarDebilidad() {
		return true;

	}

}
