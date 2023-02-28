package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoNinja extends Reino {

	public ReinoNinja() {
		ReinoNinja.nombreReino = "Reino Ninja";
		ReinoNinja.nivel = 5;
		Rey reyNinja = new Rey(ReinoNinja.nombreReino, ReinoNinja.nivel, ReinoNinja.nivel,
				ReinoNinja.nivel * ReinoNinja.nivel, ReinoNinja.nivel, ReinoNinja.nivel);
		Subditos subditosNinja = new Subditos(ReinoNinja.nombreReino, ReinoNinja.nivel * ReinoGuerrero.nivel,
				ReinoGuerrero.nivel, ReinoGuerrero.nivel, ReinoGuerrero.nivel, ReinoGuerrero.nivel);
		Subditos[] subditosNinjas = new Subditos[8];
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void curar() {
		// TODO Auto-generated method stub

	}

}
