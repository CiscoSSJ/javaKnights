package Modelo.Reinos;

public abstract class Reino {
    protected String nombreReino;
    protected int nivel;
    protected Personaje rey;
    protected Personaje subditos[];
    protected Personaje protagonista;

    public Reino() {
    }

    public Reino(String nombreReino, int nivel, Personaje rey, Personaje[] subditos, Personaje protagonista) {
        this.nombreReino = nombreReino;
        this.nivel = nivel;
        this.rey = rey;
        this.subditos = subditos;
        this.protagonista = protagonista;
    }

    public Reino(String nombreReino, int nivel) {
        this.nombreReino = nombreReino;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombreReino() {
        return nombreReino;
    }
}
