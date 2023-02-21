package Modelo.Reinos;

public class ReinoNinja extends Reino{

    public ReinoNinja(String nombreReino, int nivel) {
        super(nombreReino, nivel);
    }
    
    @Override
    public void mejoraEstadisticaAux(Personaje personaje) {
        personaje.setVida(5);
        personaje.setFuerza(5);
        personaje.setVelocidad((5*getNivel()));
        personaje.setInteligencia(5);
        personaje.setMana(5);
    }
}
