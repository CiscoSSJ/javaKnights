package Modelo.OpcionesMenu;



import Examen2Modelo.ComicEstandar;
import Modelo.Personaje.Protagonista;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class Partida {
	public static int numeroPartidasCreadas = 0;
	private Reino[] reinos = { new ReinoDragon(), new ReinoGigante(), new ReinoGuerrero(), new ReinoHielo(),
			new ReinoNinja() };
	private Partida[] partidasGuardadas = new Partida[numeroPartidasCreadas];
	private Protagonista protagonista =new Protagonista();
	private Menu menu =new Menu();
	public Partida() {
		numeroPartidasCreadas++;

	}

	public int getNumeroPartidasCreadas() {
		return numeroPartidasCreadas;
	}

	public Reino[] getReinos() {
		return reinos;
	}

	public void setReinos(Reino[] reinos) {
		this.reinos = reinos;
	}

	public Partida[] getPartidasGuardadas() {
		return partidasGuardadas;
	}
	public void crearComicEstandar() {
		for (int i = 0; i < partidasGuardadas.length && !(partidasGuardadas[i] == null); i++) {

			if (comicsClasicos[i] == null) {
				comicsClasicos[i] = new Partida();
				comicCreado = comicsClasicos[i];
			}

		}
	}
	public void setPartidasGuardadas(Partida[] partidasGuardadas) {
		for (int i = 0; i < partidasGuardadas.length; i++) {

		}
		this.partidasGuardadas = partidasGuardadas;
	}

	public void setNombreProtagonista(String nombreProtagonista) {
		protagonista.setNombreProtagonista(nombreProtagonista);

	}

	public void reinoPerteneciente(int eleccion) {

		switch (eleccion) {
		case 1:
			reinos[0].setProtagonista(protagonista);
			break;
		case 2:
			reinos[1].setProtagonista(protagonista);
			break;
		case 3:
			reinos[2].setProtagonista(protagonista);
			break;
		case 4:
			reinos[3].setProtagonista(protagonista);
			break;
		case 5:
			reinos[4].setProtagonista(protagonista);
		}

	}

	/**
	 * @return the protagonista
	 */
	public Protagonista getProtagonista() {
		return protagonista;
	}
	public combate() {
		
	}


	public Menu getMenus() {
		return menu;
	}

	

	

}
