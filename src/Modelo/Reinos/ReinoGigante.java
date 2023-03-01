package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoGigante extends Reino {
		String[]nombreSubditos={"Grog","Hilda","Thorgrim","Ulfgar","Brunhilda","Farkas","Gunnar","Helga"};
	public ReinoGigante() {
		super("Reino Gigante", 4, null, null);
		super.nombreReino="Reino Gigante";
		super.nivel=4;
		super.rey=new Rey(nombreReino, super.getNivel(), super.getNivel(), super.getNivel(),
		super.getNivel(), super.getNivel(),getNombreReino());
		super.subditos=new Subditos[8];
		
		for (int i = 0; i < subditos.length; i++) {
			subditos[i] =  new Subditos(nombreSubditos,nombreReino, super.getNivel(), super.getNivel(),
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
