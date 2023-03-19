package Modelo.Reinos;

import Modelo.Personaje.Personaje;
import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class ReinoGigante extends Reino {
	private Rey reyGigante;
	protected  String [] subditosGigantes={ "Mag el Poderoso", "Wun Weg Wun Dar Wun", "Dongo el gigante"}
	private 
	public ReinoGigante() {
		super("Gigante de hierro",getSubditosGigantes(), "Reino Gigante", 2);
		super
	


}
	public String[] getSubditosGigantes() {
		return subditosGigantes;
	}

	public void setSubditosGigantes(String[] subditosGigantes) {
		this.subditosGigantes = subditosGigantes;
	}

	

	@Override
	public void debilidad(Personaje personaje) {
		personaje.esquivar(getNivel());
		
	}

	@Override
	protected boolean comprobarDebilidad() {
		return true;
	}


	

}
