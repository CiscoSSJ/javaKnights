package Modelo.Reinos;

public class Personaje extends Reino {
    protected String nombre;
    protected int fuerza;
    protected int vida;
    protected int velocidad;
    protected boolean isProtagonista;
    protected boolean isRey;
    protected Reino reinoPerteneciente;

    public Personaje(boolean isRey, String nombre, Reino reinoPerteneciente ) {
        if(isRey){
            this.reinoPerteneciente = reinoPerteneciente;
            this.nombre = nombre;
            this.fuerza = 5+(3*reinoPerteneciente.getNivel());
            this.vida = 5+(3*reinoPerteneciente.getNivel());
            this.velocidad = 5+(3*reinoPerteneciente.getNivel());
            
        }else{
            this.fuerza = 5*reinoPerteneciente.getNivel();
            this.vida = 5*reinoPerteneciente.getNivel();
            this.velocidad = 5*reinoPerteneciente.getNivel();
        }
    }

    public Personaje(String nombre, Reino reinoPerteneciente,boolean isProtagonista ) {
        if(isProtagonista){
            this.reinoPerteneciente = reinoPerteneciente;
            this.nombre = nombre;
            this.fuerza = 5+(3*reinoPerteneciente.getNivel());
            this.vida = 5+(3*reinoPerteneciente.getNivel());
            this.velocidad = 5+(3*reinoPerteneciente.getNivel());
            
        }else{
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
                + ", isProtagonista=" + isProtagonista + ", isRey=" + isRey + ", reinoPerteneciente="
                + reinoPerteneciente + "]";
    }

    public int cantidadFuerza(Reino reinoPerteneciente){
        reinoPerteneciente.getNombreReino().toString();
        return 0;
    }
}
