package Modelo.Reinos;

import Modelo.Menu.Opciones.Dificultad;
import Modelo.Personaje.Personaje;
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
	private boolean comprobarDebilidad;
	private int nivel;
	private Rey rey;
	private Subdito[] subditos;
	private Dificultad dificultad;
	/*
	 * M�todos de accion 
	 */

	public Reino(String nombreRey, String[] nombreSubditos, String nombreReino, int nivel) {
		this.nombreRey = nombreRey;
		this.nombreSubditos = nombreSubditos;
		this.nombreReino = nombreReino;
		this.nivel = nivel;
		this.subditos = new Subdito[nombreSubditos.length];
		for (int i = 0; i < subditos.length; i++) {
			for (int j = 0; j < nombreSubditos.length; j++) {
				this.subditos[i] = new Subdito(nombreSubditos[i], nombreReino, nivel, nivel, nivel);
			}
		}
		this.rey = new Rey(nombreRey, nombreReino, nivel, nivel, nivel);

	}

	/**
	 * Getters de los atributos del reino
	 */

	/**
	 * 
	 * @return nivel
	 */

	public int getNivel() {
		return this.nivel;
	}

	/**
	 * 
	 * @return nombreReino
	 */
	public String getNombreReino() {
		return this.nombreReino;
	}

	/**
	 * Getter y setter del rey que se utilizaran mas adelante en el menuCombate
	 */

	/**
	 *
	 * @return rey
	 */
	public Rey getRey() {
		return rey;
	}
	
	/**
	 * 
	 * @return nombreRey
	 */
	public String getNombreRey() {
		return this.nombreRey;
	}
	/**
	 * Este set lo utilizaremos solamente para el combate cuando el rey del reino pierda
	 * la vida y lo settearemos a null
	 * @param rey
	 */
	public void setRey(Rey rey) {
		this.rey = rey;
	}

	/**
	 * Getter y setter de los subditos que se utilizaran mas adelante en el menuCombate
	 */
	
	
	/**
	 * En este get lo que hacemos es que el subdito estatico el cual estamos
	 * setteando en el bucle for para que podamos hacer las acciones del combate lo
	 * devuelva
	 * 
	 * @return subdito
	 */
	public Subdito getSubdito() {
		for (int i = 0; i < this.subditos.length;) {
			if(this.subditos[i]==null) {
				i++;
				return subditos[i];
			}
			else {
				return subditos[i];
			}
			
			
		}
		// Si no se encuentra ning�n elemento no nulo, devuelve null
		return null;
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
	 * Este set lo utilizaremos solamente para el combate cuando el subdito pierda
	 * la vida y lo settearemos a null
	 * 
	 * @param subdito
	 */
	
	public Subdito setSubdito(Subdito subdito) {
		for (int i = 0; i < this.subditos.length;) {
			
			if(this.subditos[i]!=null) {
			this.subditos[i]=subdito;
			return this.subditos[i];
			}
			i++;	
		}
		return subdito;
		
	}
	
	/**}for(

	int i = 0;i<subditos.length&&subditos[i]!=null;i++)
	{
		subditoConsultado = (subditos[i]);
	}return subditoConsultado;
	}
	*/
	


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


	public boolean isComprobarDebilidad() {
		return comprobarDebilidad;
	}

	public void setComprobarDebilidad(boolean comprobarDebilidad) {
		this.comprobarDebilidad = comprobarDebilidad;
	}

	/**
	 * @return the dificultad
	 */
	public Dificultad getDificultad() {
		return dificultad;
	}


}
