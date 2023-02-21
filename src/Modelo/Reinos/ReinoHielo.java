package Modelo.Reinos;

public class ReinoHielo extends Reino {

    public ReinoHielo(String nombreReino, int nivel) {
        super(nombreReino, nivel);
    }
    
    @Override
    public void mejoraEstadisticaAux(Personaje personaje) {
        personaje.setVida(5);
        personaje.setFuerza(5);;
        personaje.setVelocidad(5);
        personaje.setInteligencia(5);
        personaje.setMana((5*getNivel()));
    }
}
