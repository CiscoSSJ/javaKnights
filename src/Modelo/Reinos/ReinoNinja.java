package Modelo.Reinos;

import Modelo.Personaje.Protagonista;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;


public class ReinoNinja extends Reino {
	protected static Rey reyNinja;
	protected static String nombreRey="NinjaGayden";
	protected static Subdito []subditosNinjas;
	protected static String []nombreSubditos= {"Hattori Hanzo", "Goemon Ishikawa", "Saizo Kirigakure"};
	protected static Protagonista protagonistaNinja;
	public ReinoNinja() {
		super(nombreRey,nombreSubditos,"Reino Dragon", 5, reyNinja, subditosNinjas,protagonistaNinja);
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


	@Override
	protected boolean protagonista(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}
