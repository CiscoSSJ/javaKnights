package Modelo.Reinos;

import Modelo.Personaje.Personaje;


public class ReinoDragon extends Reino {
	

	public ReinoDragon() {
		super("Veighar", new String[] { "Droghon", "Raeghal", "Viserion" }, "Reino Dragon", 1);

	}

	@Override
	public void debilidad(Personaje personaje) {
		if(personaje.getNombreReino().equals(getNombreReino()))
			personaje.hablar();
		
			

	}


}
