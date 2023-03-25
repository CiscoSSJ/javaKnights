package Modelo.Reinos;

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
	private int nivel;
	private Rey rey;
	private Subdito[] subditos;

	/*
	 * Constructor que vamos a utilizar para los diferentes reinos
	 */

	public Reino(String nombreRey, String[] nombreSubditos, String nombreReino, int nivel) {
		this.nombreRey = nombreRey;
		this.nombreSubditos = nombreSubditos;
		this.nombreReino = nombreReino;
		this.nivel = nivel;
		this.subditos = new Subdito[nombreSubditos.length];
		for (int i = 0; i < subditos.length; i++) {
			for (int j = 0; j < nombreSubditos.length; j++) {
				this.subditos[i] = new Subdito(nombreSubditos[i], nombreReino, nivel + 2, nivel + 2, nivel + 2);
			}
		}
		this.rey = new Rey(nombreRey, nombreReino, nivel + 4, nivel + 4, nivel + 4);

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
	 * Este set lo utilizaremos solamente para el combate cuando el rey del reino
	 * pierda la vida y lo settearemos a null
	 * 
	 * @param rey
	 */
	public void setRey(Rey rey) {
		this.rey = rey;
	}

	/**
	 * Getter y setter de los subditos que se utilizaran mas adelante en el
	 * menuCombate
	 */

	/**
	 * Este get lo utilizaremos para devolver el subdito en la posicion de ese
	 * momento si si encontrado es igual a false ,y si es igual a true se parara y
	 * dara el subdito de esa posicion a traves del subdito declarado a null
	 * 
	 * @return subdito
	 */
	public Subdito getSubdito() {
		Subdito subdito = null;
		boolean encontrado = false;

		for (int i = 0; i < subditos.length && !encontrado; i++) {

			if (subditos[i] != null) {
				subdito = subditos[i];
				encontrado = true;
			}

		}
		return subdito;
	}

	/**
	 * 
	 * @return subditos
	 */
	public Subdito[] getSubditos() {
		return subditos;

	}

	/**
	 * Este get se utiliza para comprobar posicion en el que este el subdito creado
	 * y a su vez el constructor coja el nombre de ese subdito en cada reino por si
	 * el usuario quiere saber el nombre de los subditos del reino en concreto
	 *
	 * 
	 * @return nombreSubditos
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
	 * @param subdito a null
	 */
	public void setSubdito(Subdito subdito) {
		boolean encontrado = false;
		for (int i = 0; i < subditos.length && !encontrado; i++) {

			if (subditos[i] != null) {
				encontrado = true;
				subditos[i] = subdito;

			}
		}
	}

	/**
	 * Metodo abstracto para todos los reinos para que compruebe la debilidad de
	 * cada reino y si coincide el reino con el reino del personaje ,este perdera
	 * vida segun este implementado en su subclase de personaje
	 * 
	 * @param personaje El personaje a comprobar.
	 * @param comprobar El booleano que indica si se debe comprobar o no.
	 */
	public abstract void debilidad(Personaje personaje);

	/**
	 * Define un metodo para obtener el mensaje del ganador del reino.
	 * 
	 * @return the mensajeGanadorReino
	 */
	public String getMensajeGanadorReino() {
		return mensajeGanadorReino;
	}

	/**
	 * Define un metodo para eliminar un subdito del reino.
	 * 
	 * @param personaje El personaje a eliminar.
	 * @return El subdito eliminado.
	 */
	public Subdito eliminarSubdito(Personaje personaje) {
		boolean encontrado = false;
		Subdito subdito = null;
		for (int i = 0; i < subditos.length && !encontrado; i++) {

			if (subditos[i] != null) {
				subdito = subditos[i];
				encontrado = true;
			}
			subdito = (Subdito) personaje;

		}
		return subdito;

	}

	/**
	 * Define un metodo para eliminar un personaje del reino.
	 * 
	 * @param personaje El personaje a eliminar.
	 */
	public void eliminarPersonaje(Personaje personaje) {
		if (personaje.equals(rey)) {
			setRey(null);
			setNombreReino("Reino vencido");
		} else {
			setSubdito(null);
		}

	}

	/**
	 * Define un metodo para establecer el nombre del reino.
	 * 
	 * @param nulo
	 */
	public void setNombreReino(String nulo) {
		this.nombreReino = nulo;
	}
}
