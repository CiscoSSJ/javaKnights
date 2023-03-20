package Modelo.Reinos;

import Modelo.Personaje.Personaje;


public class ReinoNinja extends Reino {

	public ReinoNinja() {
		super("Bruce Lee", new String[] { "Hattori Hanzo", "Goemon Ishikawa", "Saizo Kirigakure" }, "Reino Dragon", 5);
	}

	@Override
	public void debilidad(Personaje personaje) {
		comprobarDebilidad();
		personaje.silencio(getNivel());

	}

	@Override
	protected boolean comprobarDebilidad() {
		return true;
	}
}
