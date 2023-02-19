package Modelo.Reinos;

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

}
