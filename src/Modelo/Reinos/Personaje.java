package Modelo.Reinos;

public class Personaje{
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
            reinoPerteneciente.setEstadisticas(this);
            reinoPerteneciente.setRey(this);
        }else if(isProtagonista){
            this.isRey = isRey;
            this.isProtagonista = isProtagonista;
            this.reinoPerteneciente = reinoPerteneciente;
            this.nombre = nombre;
            reinoPerteneciente.setEstadisticas(this);
            protagonistaCreado = true;
        }else{
            this.isRey = isRey;
            this.isProtagonista = isProtagonista;
            this.reinoPerteneciente = reinoPerteneciente;
            this.nombre = nombre;
            reinoPerteneciente.setEstadisticas(this);
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

    public int getMana() {
        return mana;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public boolean isProtagonista() {
        return isProtagonista;
    }

    public boolean isRey() {
        return isRey;
    }

    public static boolean isProtagonistaCreado() {
        return protagonistaCreado;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setProtagonista(boolean isProtagonista) {
        this.isProtagonista = isProtagonista;
    }

    public void setRey(boolean isRey) {
        this.isRey = isRey;
    }

    public void setReinoPerteneciente(Reino reinoPerteneciente) {
        this.reinoPerteneciente = reinoPerteneciente;
    }

    public static void setProtagonistaCreado(boolean protagonistaCreado) {
        Personaje.protagonistaCreado = protagonistaCreado;
    }
    
    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", fuerza=" + fuerza + ", vida=" + vida + ", velocidad=" + velocidad
                + ", mana=" + mana + ", inteligencia=" + inteligencia + ", isProtagonista=" + isProtagonista
                + ", isRey=" + isRey + ", reinoPerteneciente=" + reinoPerteneciente + "]";
    }



}
