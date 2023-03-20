package Modelo.Reinos;

import Modelo.Personaje.Personaje;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class ReinoDragon extends Reino {
	protected static Rey reyDragon;
	protected static Subdito[] subditosDragones;
	protected static String[] nombreSubditos = { "Droghon", "Raeghal", "Viserion" };

	public ReinoDragon() {
		super("Veighar", new String[] { "Droghon", "Raeghal", "Viserion" }, "Reino Dragon", 1);

	}

	@Override
	public void debilidad(Personaje personaje) {
		super.setComprobarDebilidad(true);
		personaje.hablar(getNivel());

	}

	@Override
	protected boolean comprobarDebilidad() {
		// TODO Auto-generated method stub
		return true;
	}

}
