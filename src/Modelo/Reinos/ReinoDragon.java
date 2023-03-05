package Modelo.Reinos;


import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class ReinoDragon extends Reino {
	protected static Rey reyDragon;
	protected static Subdito[] subditosDragones;
	protected static String[] nombreSubditos = { "Droghon", "Raeghal", "Viserion" };

	public ReinoDragon(boolean isCreado) {
		super("Veighar", nombreSubditos, "Reino Dragon", 1, reyDragon, subditosDragones, isCreado);

	}

}
