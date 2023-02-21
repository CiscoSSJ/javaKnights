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

    public Personaje getRey() {
        return rey;
    }

    public Personaje[] getSubditos() {
        return subditos;
    }

    public Personaje getProtagonista() {
        return protagonista;
    }

    public void setRey(Personaje rey) {
        this.rey = rey;
    }

    @Override
    public String toString() {
        return "Reino [nombreReino=" + nombreReino + "]";
    }

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
    public abstract void mejoraEstadisticaAux(Personaje personaje);
    
}
