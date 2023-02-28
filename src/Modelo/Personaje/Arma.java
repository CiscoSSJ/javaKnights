package Modelo.Personaje;

import Modelo.Reinos.Reino;

public class Arma extends Reino {
	
	enum Tipo{
		Llama,Tempano,Espada,Mazo,Shuriken
	}
	Tipo arma;
	
	@Override
	public void atacar() {
		Llama=nivel++;
		
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
