package Modelo.Reinos;

public class Personaje extends Reino {
    protected String nombre;
    protected int fuerza;
    protected int vida;
    protected int velocidad;
    protected int mana;
    protected int inteligencia;
    protected boolean isProtagonista;
    protected boolean isRey;
    protected Reino reinoPerteneciente;
    public static boolean protagonistaCreado = false;

    public Personaje(boolean isRey, boolean isProtagonista, String nombre, Reino reinoPerteneciente) {
        if(isRey){
            this.isRey = isRey;
            this.isProtagonista = isProtagonista;
            this.reinoPerteneciente = reinoPerteneciente;
            this.nombre = nombre;
            this.fuerza = 5+(3*reinoPerteneciente.getNivel());
            this.vida = 5+(3*reinoPerteneciente.getNivel());
            this.velocidad = 5+(3*reinoPerteneciente.getNivel());
            this.mana = 5+(3*reinoPerteneciente.getNivel());
            this.inteligencia = 5+(3*reinoPerteneciente.getNivel());
            reinoPerteneciente.setRey(this);
        }else if(isProtagonista){
            this.isRey = isRey;
            this.isProtagonista = isProtagonista;
            this.reinoPerteneciente = reinoPerteneciente;
            this.nombre = nombre;
            this.fuerza = 5+(3*reinoPerteneciente.getNivel());
            this.vida = 5+(3*reinoPerteneciente.getNivel());
            this.velocidad = 5+(3*reinoPerteneciente.getNivel());
        }else{
            this.isRey = isRey;
            this.isProtagonista = isProtagonista;
            this.reinoPerteneciente = reinoPerteneciente;
            this.nombre = nombre;
            this.fuerza = 5*reinoPerteneciente.getNivel();
            this.vida = 5*reinoPerteneciente.getNivel();
            this.velocidad = 5*reinoPerteneciente.getNivel();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getVida() {
        return vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Reino getReinoPerteneciente() {
        return reinoPerteneciente;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", fuerza=" + fuerza + ", vida=" + vida + ", velocidad=" + velocidad
                + ", mana=" + mana + ", inteligencia=" + inteligencia + ", isProtagonista=" + isProtagonista
                + ", isRey=" + isRey + ", reinoPerteneciente=" + reinoPerteneciente + "]";
    }



}
