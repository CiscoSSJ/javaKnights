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
		super(nombreRey,nombreSubditos,"Reino Dragon", 5, reyNinja, subditosNinjas);
	}

}
