package src.Modelo.Reinos;

import Modelo.Reinos.Personaje;

public abstract class Reino {
    protected String nombreReino;
    protected int nivel;
    protected Personaje rey;
    protected Personaje subditos[];
    protected Personaje protagonista;

    public Reino() {
    }

    public int getNivel(){
        return nivel;
    }

	abstract String nombreReino();

	public void setNombreReino(String nombreReino) {
		this.nombreReino = nombreReino;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
