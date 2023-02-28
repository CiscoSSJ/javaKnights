package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoGuerrero extends Reino {

	public ReinoGuerrero() {
		super();
		ReinoGuerrero.nombreReino = "Reino Guerrero";
		ReinoGuerrero.nivel = 3;
		Rey reyGuerrero = new Rey(ReinoGuerrero.nombreReino, ReinoGuerrero.nivel * ReinoGuerrero.nivel,
				ReinoGuerrero.nivel, ReinoGuerrero.nivel, ReinoGuerrero.nivel, ReinoGuerrero.nivel);
		Subditos subditosGuerrero = new Subditos(ReinoGuerrero.nombreReino, ReinoGuerrero.nivel * ReinoGuerrero.nivel,
				ReinoGuerrero.nivel, ReinoGuerrero.nivel, ReinoGuerrero.nivel, ReinoGuerrero.nivel);
		Subditos[] subditosGuerreros = new Subditos[6];
	}

	@Override
	public void atacar() {

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
