package Modelo.Partida;

import Modelo.Menu.Menus;
import Modelo.Menu.Opciones.Dificultad;
import Modelo.Personaje.Protagonista;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class Partida {
	static boolean saliReinos;
	
	private Reino[] reinos = { new ReinoDragon(), new ReinoGigante(), new ReinoGuerrero(), new ReinoHielo(),
			new ReinoNinja() };
	private Partida[] partidasGuardadas;
	private Dificultad dificultad;
	private Protagonista protagonistaPartida = new Protagonista();
	private Menus menus = new Menus();
	

	
		
	public Reino setReino(Reino reinos) {
		for (int i = 0; i < this.reinos.length;) {
			
			if(this.reinos[i]!=null) {
			this.reinos[i]=reinos;
			return this.reinos[i];
			}
			i++;	
		}
		return reinos;
		
	}

	public void setPartidasGuardadas(Partida partida) {
		for (int i = 0; i < partidasGuardadas.length && partidasGuardadas[i] != null; i++) {

			if (partidasGuardadas[i] == null) {
				partidasGuardadas[i] = partida;

			}

		}
	}
	
	public  void setProtagonistaPartida(int dificultad) {
           this.protagonistaPartida.setAtributosProtagonista(dificultad,dificultad,dificultad);
       
	}
	 public void setNombreProtagonista(String nombreProtagonista) {
		this.protagonistaPartida.setNombre(nombreProtagonista);
	}
	
	


	/**
	 * @return the protagonista
	 */
	public Protagonista getProtagonistaPartida() {
		
		return protagonistaPartida;
	}

	public Reino[] getReinos() {

		return reinos;
	
	}
	public Reino getReino() {
	    for (Reino r : reinos) {
	        if (r != null) {
	            return r;
	        }
	    }
	    return null; // Si no se encuentra ning�n elemento no nulo, devuelve null
	}
	public void setAtributosRey(int dificultad) {
		  for (Reino r : reinos) {
		       r.getRey().setAtributosRey(dificultad);
		       
		    }
		    
	}

	/**
	public Reino getReino() {
		for (int i = 0; i < reinos.length && reinos[i] != null; i++) {
			reinoConsultado = reinos[i];
		}
		return reinoConsultado;
	}
	*/
	public Menus getMenus() {
		return menus;
	}

	public Partida[] getPartidasGuardadas() {
		return partidasGuardadas;
	}

	/**
	 * @return the dificultad
	 */
	public Dificultad getDificultad() {
		return dificultad;
	}

	/**
	 * @param dificultad the dificultad to set
	 */
	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

	/**
	 * @return the mensajeGanadorPartida
	 */
	public String getMensajeGanadorPartida() {
		return "Enhorabuena "+protagonistaPartida.getNombre()+" has pasado de ser un javaknigth cualquiera al aunt�ntico rey";
	}
	
}
