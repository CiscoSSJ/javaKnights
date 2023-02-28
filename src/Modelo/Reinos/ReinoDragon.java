package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoDragon extends Reino {

    public ReinoDragon() {
        super("Reino Dragón", 1);
        Rey reyDragon = new Rey(getNombreReino(), getNivel(), getNivel(), getNivel(),
                getNivel(), getNivel() * getNivel());
        Subditos subditosDragon = new Subditos(getNombreReino(), getNivel(), getNivel(),
                getNivel(), getNivel(), getNivel());
        Subditos[] subditosDragones = new Subditos[2];
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
