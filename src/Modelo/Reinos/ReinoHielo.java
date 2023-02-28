package Modelo.Reinos;

import Modelo.Personaje.Rey;
import Modelo.Personaje.Subditos;

public class ReinoHielo extends Reino {

    public ReinoHielo() {
        ReinoHielo.nombreReino="Reino Guerrero";
        ReinoHielo.nivel=2;
        Rey reyHielo=new Rey(ReinoHielo.nombreReino, ReinoHielo.nivel, ReinoHielo.nivel, ReinoHielo.nivel, ReinoHielo.nivel, ReinoHielo.nivel);
        Subditos subditosHielo=new Subditos(ReinoHielo.nombreReino, ReinoHielo.nivel, ReinoHielo.nivel, ReinoHielo.nivel, ReinoHielo.nivel, ReinoHielo.nivel);
        Subditos []subditosHielos=new Subditos[4];
    }
    
 
	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void curar() {
		// TODO Auto-generated method stub
		
	}

	
}
