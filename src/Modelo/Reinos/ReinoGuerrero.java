package Modelo.Reinos;

import Modelo.Personaje.Personaje;

public class ReinoGuerrero extends Reino {

	public ReinoGuerrero() {
		super("Alejandro Magno", new String[] { "Jon Nieve", "Jaime Lannister", "Brienne de Tarth" }, "Reino Guerrero",
				3);

	}

	@Override
	public void debilidad(Personaje personaje) {
		comprobarDebilidad();
		personaje.defender(getNivel());

	}

	@Override
	protected boolean comprobarDebilidad() {
		// TODO Auto-generated method stub
		return true;
	}

}
