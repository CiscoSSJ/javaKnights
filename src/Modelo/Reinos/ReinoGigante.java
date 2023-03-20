package Modelo.Reinos;

import Modelo.Personaje.Personaje;

public class ReinoGigante extends Reino {

	public ReinoGigante() {
		super("Gigante de hierro", new String[] { "Mag el Poderoso", "Wun Weg Wun Dar Wun", "Dongo el gigante" },
				"Reino Gigante", 2);

	}

	@Override
	public void debilidad(Personaje personaje) {
		comprobarDebilidad();
		personaje.esquivar(getNivel());

	}

	@Override
	protected boolean comprobarDebilidad() {
		// TODO Auto-generated method stub
		return true;
	}

}
