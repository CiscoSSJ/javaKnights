package Modelo.Reinos;

import Modelo.Personaje.Protagonista;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;
public abstract class Reino {
	protected String nombreReino;
	protected String nombreRey;
	protected String nombresSubditos="";
	protected String[] nombreSubditos;
	protected int nivel;
	protected Rey rey;
	protected Subdito[] subditos;
	private Protagonista protagonista=null;

	/*
	 * M�todos de acci�n
	 */


	public Reino(String nombreRey, String nombreSubditos[], String nombreReino, int nivel, Rey rey, Subdito[] subditos,Protagonista protagonista) {
		this.nombreRey = nombreRey;
		this.nombreSubditos = nombreSubditos;
		this.nombreReino = nombreReino;
		this.nivel = nivel;
		this.subditos = new Subdito[nombreSubditos.length];
		for (int i = 0; i < nombreSubditos.length; i++) {
			for (int j = 0; j < nombreSubditos.length; j++) {
				this.subditos[i] = new Subdito(nombreSubditos[i], nombreReino, nivel, nivel, nivel);
			}
		}
		this.rey = new Rey(nombreRey, nombreReino, nivel, nivel, nivel);
	}

	
	public int getNivel() {
		return this.nivel;
	}

	public String getNombreReino() {
		return this.nombreReino;
	}

	/**
	 * Getters de los atributos del rey
	 * 
	 * @return
	 */
	public Rey getRey() {
		return rey;
	}

	public String getNombreRey() {
		return this.rey.getNombreRey();
	}

	public int getVidaRey() {
		return this.rey.getVidaRey();
	}

	public int getFuerzaRey() {
		return rey.getFuerzaRey();
	}

	/**
	 * @return the nombreSubditos
	 */

	/**
	 * @param nombreSubditos the nombreSubditos to set
	 */

	/**
	 * Getters de los atributos de los s�bditos
	 * 
	 * @return
	 */

	public String getNombreSubditos() {
		for (int j = 0; j < this.nombreSubditos.length; j++) {
			nombresSubditos+=this.nombreSubditos[j]+",";
			
		}
		return nombresSubditos;
	}

	/**
	 * Getters de los atributos del protagonista
	 */
	public String getNombreProtagonista() {
		return getProtagonista().getNombre();
	}
	
	public void setProtagonista(Protagonista protagonista){
		if(!this.protagonista.equals(null)){
			protagonista.setAtributosProtagonista(getNivel(), getNivel(), getNivel());
			this.protagonista=protagonista;
		}
	}


	/**
	 * @return the protagonista
	 */
	public  Protagonista getProtagonista() {
		return this.protagonista;
	}
	
}
