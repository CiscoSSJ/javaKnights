package Modelo.Reinos;

import Modelo.Personaje.Personaje;
import Modelo.Personaje.Protagonista;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public abstract class Reino {
	/**
	 * Vamos a crear los atributos de cada reino que despues van a ser setteados en
	 * cada uno de los reinos de forma indepediente en cada constructor de reino
	 */
	private String nombreReino;
	private String nombreRey;
	private String mensajeGanadorReino;
	private String nombresSubditos = "";
	private String[] nombreSubditos;
	private int nivel;
	private Rey rey;
	private Subdito[] subditos;
	private Subdito subditoConsultado = null;
	static Protagonista protagonista=null;
	/*
	 * M�todos de acci�n
	 */
	
	protected Reino(String nombreRey, String[] nombreSubditos, String nombreReino, int nivel, Rey rey,
			Subdito[] subditos) {
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
	 *
	 * 
	 * @return Rey del reino
	 */
	public Rey getRey() {
		return rey;
	}

	public void setRey(Rey rey) {
		this.rey = rey;
	}

	/**
	 * Este set lo utilizaremos solamente para el combate cuando el subdito pierda
	 * la vida
	 * 
	 * @param subdito
	 */
	public void setSubditoConsultado(Subdito subdito) {
		 this.subditoConsultado= subdito;
	}

	/**
	 * Hemos creado este get para que depende de la posicion en el que este el
	 * subdito creado en el constructor coja el nombre de ese subdito en cada reino
	 * por si el usuario quiere saber el nombre de los subditos del reino en
	 * concreto
	 *
	 * 
	 * @return
	 */
	public String getNombreSubditos() {
		StringBuilder bld = new StringBuilder();
		for (int j = 0; j < this.nombreSubditos.length; j++) {
			bld.append(this.nombreSubditos[j] + ",");
		}
		nombresSubditos = bld.toString();
		return nombresSubditos;
	}

	/**
	 * En este get lo que hacemos es que el subdito estatico el cual estamos
	 * setteando en el bucle for para que podamos hacer las acciones del combate lo
	 * devuelva
	 * 
	 * @return subdito
	 */
	public Subdito getSubdito() {
		for (int i = 0; i < subditos.length && subditos[i] != null; i++) {
			subditoConsultado = (subditos[i]);
		}
		return subditoConsultado;
	}

	/**
	 * @param nombreRey the nombreRey to set
	 */
	public void setNombreRey(String nombreRey) {
		this.nombreRey = nombreRey;
	}

	public String getNombreRey() {
		return this.nombreRey;
	}

	/**
	 * @return the mensajeGanadorReino
	 */
	public String getMensajeGanadorReino() {
		return mensajeGanadorReino;
	}

	/**
	 * @param mensajeGanadorReino the mensajeGanadorReino to set
	 */
	public void setMensajeGanadorReino(String mensajeGanadorReino) {
		this.mensajeGanadorReino = mensajeGanadorReino;
	}
	
	public abstract void debilidad(Personaje personaje);
	

	public void setProtagonista(Protagonista protagonistaPartida) {
		protagonista=protagonistaPartida;
	}

	protected abstract boolean comprobarDebilidad();
	

	
}
