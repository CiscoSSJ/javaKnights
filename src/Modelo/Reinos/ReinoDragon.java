package Modelo.Reinos;

import Modelo.Personaje.Personaje;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class ReinoDragon extends Reino {
	

	public ReinoDragon() {
		super("Veighar", new String[] { "Droghon", "Raeghal", "Viserion" }, "Reino Dragon", 1);

	}

	@Override
	public void debilidad(Personaje personaje,boolean comprobarDebilidad) {
		super.setComprobarDebilidad(true);
		personaje.hablar(getNivel());

	}


}
