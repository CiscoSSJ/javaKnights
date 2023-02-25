package Modelo.Reinos;


import Modelo.Reinos.Reino;

public class ReinoDragon extends Reino {
    public ReinoDragon(String nombreReino, int nivel) {
        super(nombreReino, nivel);
    }

public class ReinoDragon extends Reino {
		
	
    public ReinoDragon() {
        nivel = getNivel();
        nombreReino = "Reino Dragon";
    }
    @Override
    public void mejoraEstadisticaAux(Personaje personaje) {
        personaje.setVida(5);
        personaje.setFuerza(5);
        personaje.setVelocidad(5);
        personaje.setInteligencia((5+1));
        personaje.setMana(5);

    }
    
}

@Override
String nombreReino() {
	// TODO Auto-generated method stub
	return "Reino Dragón";
}

@Override
public void mejoraEstadisticaAux(Personaje personaje) {
	// TODO Auto-generated method stub
	
}
