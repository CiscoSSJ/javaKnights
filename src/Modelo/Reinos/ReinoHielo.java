package Modelo.Reinos;



import Modelo.Personaje.Rey;
import Modelo.Personaje.Subdito;

public class ReinoHielo extends Reino {
	protected static Rey reyHielo;
	protected static Subdito[] subditosHielo;
	protected static String[] nombreSubditos = { "Elsa de Frozen", "Caminante Blanco", "Gared Tollett" };

	public ReinoHielo() {
		super("Rey de la noche", nombreSubditos, "Reino Dragon", 4, reyHielo, subditosHielo);
	}

}
