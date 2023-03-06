package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoGigante extends Reino {
		
	public ReinoGigante() {
		super("Reino Gigante", 4, , null);
		super.rey=new Rey(nombreReino, super.getNivel(), super.getNivel(), super.getNivel(),
		super.getNivel(), super.getNivel(),getNombreReino());
		super.subditos=new Subditos[8];
		
		for (int i = 0; i < subditos.length; i++) {
			subditos[i] =  new Subdito(nombreSubditos[i],nombreReino, super.getNivel(), super.getNivel(),
					super.getNivel(), super.getNivel(), super.getNivel());
		}
	}
	
	@Override
	public void atacar() {

	}

	@Override
	public void defender() {

	}

	@Override
	public void curar() {

	}

}
