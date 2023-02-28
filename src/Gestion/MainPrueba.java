package Gestion;
import Modelo.Personaje.Protagonista;
import Modelo.Personaje.Rey;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class MainPrueba {

	public static void main(String[] args) {
		ReinoGigante uno=new ReinoGigante();
		
		System.out.println(uno.getNivel());
		System.out.println(uno.getNombreReino());
		System.out.println(uno.getNombreRey());
	}

}
