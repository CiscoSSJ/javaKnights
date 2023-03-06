package Modelo.Personaje;



public class Rey extends Personaje {

	
	protected Protagonista protagonista;

	public Rey(String nombreRey,String nombreReino, int fuerza, int vida, int velocidad) {
				super(nombreRey,nombreReino, fuerza*fuerza, vida*vida, velocidad*velocidad);
				
	}


	public String getNombreRey() {
		return this.nombre;
	}

	public int getVidaRey() {
		return this.vida;
	}

	public int getFuerzaRey() {
		return this.fuerza;
	}



	@Override
	public void atacar() {
		if(protagonista.velocidad<this.velocidad)
		protagonista.vida-=this.fuerza;
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
