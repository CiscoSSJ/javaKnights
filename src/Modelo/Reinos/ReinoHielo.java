package Modelo.Reinos;

import Modelo.Personaje.Personaje;

public class ReinoHielo extends Reino {

	public ReinoHielo() {
		super("Rey de la noche", new String[] { "Elsa de Frozen", "Caminante Blanco", "Gared Tollett" }, "Reino Hielo",
				4);

	}

	@Override

	public void debilidad(Personaje personaje, boolean comprobar) {
		if (comprobar)
			personaje.desgastar();

	}

}
