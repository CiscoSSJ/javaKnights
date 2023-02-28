package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoGigante extends Reino {
		private static  Rey reyGigante;
		private static Subditos[] subditosGigante;
	public ReinoGigante() {
		super("Reino Gigante", 4, reyGigante, subditosGigante);
		super.nombreReino="Reino Gigante";
		super.nivel=4;
		super.rey=reyGigante;
		Rey reyGigante = new Rey(nombreReino, super.getNivel(), super.getNivel(), super.getNivel(),
				super.getNivel(), super.getNivel());
		
		
		Subditos subditosGigante = new Subditos(super.getNombreReino(), super.getNivel(), super.getNivel(),
				super.getNivel(), super.getNivel(), super.getNivel());
		Subditos[] subditosGigantes = new Subditos[8];
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
