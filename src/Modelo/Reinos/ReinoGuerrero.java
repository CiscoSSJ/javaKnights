package Modelo.Reinos;

public class ReinoGuerrero extends Reino {

    public ReinoGuerrero(String nombreReino, int nivel) {
        super(nombreReino, nivel);
    }
    
    @Override
    public void mejoraEstadisticaAux(Personaje personaje) {
        personaje.setVida(5);
        personaje.setFuerza((5*getNivel()));
        personaje.setVelocidad(5);
        personaje.setInteligencia(5);
        personaje.setMana(5);
    }
}
