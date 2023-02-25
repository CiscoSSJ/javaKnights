package Modelo.Reinos;

import java.util.Arrays;

import Modelo.Personaje.Protagonista;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public abstract class Reino {
    protected String nombreReino;
    private static int nivel;
    
    
    
    
    
    public String getNombreReino() {
		return nombreReino;
	}
	public void setNombreReino(String nombreReino) {
		this.nombreReino = nombreReino;
	}
	public Rey getRey() {
		return rey;
	}
	public void setRey(Rey rey) {
		this.rey = rey;
	}
	public String getSubditos(Subditos subditos []) {
		return Arrays.toString(subditos);
	}
	public void setSubditos(Subditos[] subditos) {
		this.subditos = subditos;
	}
	public Protagonista getProtagonista() {
		return protagonista;
	}
	public void setProtagonista(Protagonista protagonista) {
		this.protagonista = protagonista;
	}
	protected Rey rey;
    protected Subditos subditos[];
    protected Protagonista protagonista;
    
  
    /*
     * Métodos de acción 
     */
    abstract public void atacar();
    abstract public void defender();
    abstract public void curar();
    abstract String nombreReino();

 
    public Reino(String nombreReino, int nivel) {
        this.nombreReino = nombreReino;
        this.setNivel(nivel);
    }


    @Override
    public String toString() {
        return "Reino [nombreReino=" + nombreReino + "]";
    }
   /*
    public void setEstadisticas(Personaje personaje){
        if(personaje.reinoPerteneciente.getNombreReino().equals(this.getNombreReino())){
            if(personaje.isRey || personaje.isProtagonista)
                mejoraEstadisticaAux(personaje);
            else{
                personaje.setVida(5);
                personaje.setFuerza(5);
                personaje.setVelocidad(5);
                personaje.setInteligencia(5);
                personaje.setMana(5);
            }
        }
    }
    */
    
	/**
	 * @return the nivel
	 */
	public static int getNivel() {
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public static void setNivel(int nivel) {
		Reino.nivel = nivel;
	}

}
    

