package Modelo.Reinos;

import Modelo.Personaje.Personaje;

public class ReinoGuerrero extends Reino {

	public ReinoGuerrero() {
		super("Alejandro Magno", new String[] { "Jon Nieve", "Jaime Lannister", "Brienne de Tarth" }, "Reino Guerrero",
				3);

	}

	@Override
	public void debilidad(Personaje personaje, boolean comprobar) {
		if (comprobar)
			personaje.defender();

	}

}
