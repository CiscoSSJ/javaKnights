package Modelo.Personaje;



public class Protagonista extends Personaje {
	public static boolean isCreado=false;
	public static String nombreProtagonista;
	
	public Protagonista (String nombre,String nombreReino, int fuerza, int vida, int velocidad) {
		super(nombreProtagonista+"I del "+nombreReino,nombreReino, fuerza, vida, velocidad);
		
	}


	
	public static boolean isCreado() {
		return isCreado;
	}
	

	
	public static String getNombreProtagonista() {
		return nombreProtagonista;
	}



	

	public int getVida() {
		// TODO Auto-generated method stub
		return this.vida;
	}

	public int getFuerza() {
		// TODO Auto-generated method stub
		return this.fuerza;
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
