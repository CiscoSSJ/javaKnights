package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class ReinoGigante extends Reino {
	protected static Rey reyGigante;
	protected static String nombreReyGigante = "Gigante de hierro";
	protected static Subdito[] subditosGigantes;
	protected static String[] nombreSubditos = { "Mag el Poderoso", "Wun Weg Wun Dar Wun", "Dongo el gigante" };

	public ReinoGigante() {
		super(nombreReyGigante, nombreSubditos, "Reino Gigante", 2, reyGigante, subditosGigantes, getProtagonista());

	}
}
