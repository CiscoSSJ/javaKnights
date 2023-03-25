package Modelo.Reinos;

import Modelo.Personaje.Personaje;

public class ReinoNinja extends Reino {

	public ReinoNinja() {
		super("Bruce Lee", new String[] { "Hattori Hanzo", "Goemon Ishikawa", "Saizo Kirigakure" }, "Reino Ninja", 5);
	}

	@Override
	public void debilidad(Personaje personaje) {
		if (personaje.getNombreReino().equals(getNombreReino()))
			personaje.silencio();
			
		
	}

}
