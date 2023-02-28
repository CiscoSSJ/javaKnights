package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoGigante extends Reino {
		
	public ReinoGigante() {
		super("Reino Gigante", 4, null, null);
		super.nombreReino="Reino Gigante";
		super.nivel=4;
		super.rey=new Rey(nombreReino, super.getNivel(), super.getNivel(), super.getNivel(),
				super.getNivel(), super.getNivel(),getNombreReino());
		super.subditos = new Subditos[8];
		super.subditos.nombre= {"Grog","Hilda","Thorgrim","Ulfgar","Brunhilda","Farkas","Gunnar","Helga"};
		for (int i = 0; i < subditos.length; i++) {
			subditos[i] =  new Subditos(nombreSubditos, super.getNivel(), super.getNivel(),
					super.getNivel(), super.getNivel(), super.getNivel());
		}
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
