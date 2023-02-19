package Modelo.Reinos;

public class Personaje extends Reino {
    protected String nombre;
    protected int fuerza;
    protected int vida;
    protected int velocidad;
    protected int expActual;
    protected boolean isRey;
    protected ReinoDragon reinoPerteneciente;

    public Personaje(boolean isRey, String nombre) {
        if(isRey){
            this.nombre = nombre;
            this.fuerza = fuerza+(3*reinoPerteneciente.getNivel());
            this.vida = vida+(3*reinoPerteneciente.getNivel());
            this.velocidad = velocidad+(3*reinoPerteneciente.getNivel());
            
        }else{
            this.fuerza = fuerza*getNivel();
            this.vida = vida*getNivel();
            this.velocidad = velocidad*getNivel();
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

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", fuerza=" + fuerza + ", vida=" + vida + ", velocidad=" + velocidad
                + ", expActual=" + expActual + ", isRey=" + isRey + "]";
    }
    
}
