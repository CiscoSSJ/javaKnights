package Modelo.Reinos;

import Modelo.Personaje.Personaje;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class ReinoGuerrero extends Reino {
	protected static Rey reyGuerrero;
	protected static Subdito[] subditosGuerreros;
	protected static String[] nombreSubditos = { "Jon Nieve", "Jaime Lannister", "Brienne de Tarth" };

	public ReinoGuerrero() {
		super("Alejandro Magno", nombreSubditos, "Reino Guerrero", 3, reyGuerrero, subditosGuerreros);

	}


	@Override
	void debilidad(Personaje personaje) {
		personaje.defender();
	}

}
