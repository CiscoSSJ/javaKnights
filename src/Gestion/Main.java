package Gestion;


public class Main {
	public static void main(String[] args) {
        /*

        
        /*
        
		Definir una lista de todos los posibles reinos
	    ArrayList<Reino> posiblesReinos = new ArrayList<Reino>();
	    posiblesReinos.add(new ReinoDragon("ReinoDragon", 1));
	    posiblesReinos.add(new ReinoGigante("Reino Gigante", 2));
	    posiblesReinos.add(new ReinoGuerrero("Reino Guerrero", 3));
	    posiblesReinos.add(new ReinoHielo("Reino Hielo", 4));
	    posiblesReinos.add(new ReinoNinja("Reino Ninja", 5));
        

        ArrayList<Reino> reinos = new ArrayList<Reino>();
        reinos.add(nombreProtagonista);
        reinos.add(reinoGigante);
        reinos.add(reinoGuerrero);
        reinos.add(reinoHielo);
        reinos.add(reinoNinja);
        */
        /**Protagonista cobalk = new Protagonista("cobalk",nombreProtagonista);
        Protagonista maen = new Protagonista("Maen",reinoGigante);
        Protagonista golem = new Protagonista("Golem", reinoGigante);
        
        Rey shrek=new Rey("shrek", 0, 0, 0, 0, 0, reinoNinja);

       
        System.out.println(maen.getVida());
        System.out.println(cobalk.getFuerza());
        System.out.println(cobalk.getVida());
        System.out.println(golem.getFuerza());
        System.out.println(golem.getVida());
        System.out.println(ReinoHielo.getNivel());
        System.out.println(shrek.getNombre());
       
         
        
            	do {
            	String nombreProtagonista=(JOptionPane.showInputDialog(null,"Introduce el nombre de tu pj"));
            	String eleccion=JOptionPane.showInputDialog("Ahora elige cual es tu reino origen"
						+ "\t1.- Reino Dragon --> + Inteligencia\n" + "\t2.- Reino Gigante --> + Vida\n"
						+ "\t3.- Reino Guerrero --> + Fuerza\n" + "\t4.- Reino Hielo --> + Mana\n"
						+ "\t5.- Reino Ninja --> + Velocidad");
				try {
            	switch (eleccion) {
				case "1":
					Protagonista protagonistaDragon =new Protagonista(nombreProtagonista, new ReinoDragon("ReinoDragon",1));
					break;
				case "2":
					Protagonista protagonistaGigante =new Protagonista(nombreProtagonista, new ReinoGigante("Reino Gigante", 2));
					break;
				case "3":
					Protagonista protagonistaGuerrero =new Protagonista(nombreProtagonista, new ReinoGuerrero("Reino Guerrero", 3));
					break;
				case "4":
					Protagonista protagonistHielo =new Protagonista(nombreProtagonista, new ReinoGuerrero("Reino Hielo", 4));
					break;
				case "5":
					ReinoNinja reinoNinja = new ReinoNinja("Reino Ninja", 5);
					break;
            	}
            	}catch(NumberFormatException e) {
            		
            	}
            	 finally {
            		 // 

            		    // Crear una lista de reinos creados
            		    List<Reino> reinosCreados = new ArrayList<>();

            		    // Recorrer la lista de posibles reinos y crear aquellos que no hayan sido creados
            		    for (Reino reino : posiblesReinos) {
            		        boolean creado = false;
            		        if (protagonistaDragon != null && protagonistaDragon.getReino().equals(reino)) {
            		            creado = true;
            		        }
            		        if (protagonistaGigante != null && protagonistaGigante.getReino().equals(reino)) {
            		            creado = true;
            		        }
            		        if (protagonistaGuerrero != null && protagonistaGuerrero.getReino().equals(reino)) {
            		            creado = true;
            		        }
            		        if (protagonistHielo != null && protagonistHielo.getReino().equals(reino)) {
            		            creado = true;
            		        }
            		        if (reinoNinja != null && reinoNinja.equals(reino)) {
            		            creado = true;
            		        }
            		        if (!creado) {
            		            Reino nuevoReino = crearReino(reino);
            		            reinosCreados.add(nuevoReino);
            		        }
            		    }
            		}
				}
                

                System.out.println(protagonista);
            
                System.out.println("¿Quieres borrar el personaje?S/N");
                String opcionString = inputString.nextLine().toLowerCase();
                if(opcionString.equals("s")){
                    Personaje.protagonistaCreado = false;
                    System.out.println(Personaje.protagonistaCreado);
                    System.out.println("Introduce el nombre de tu pj");
                    String nombre = inputString.nextLine();
                    System.out.println("Ahora elige cual es tu reino origen");
                    System.out.println("\t1.- Reino Dragon --> + Inteligenicia\n" +
                    "\t2.- Reino Gigante --> + Vida\n" +
                    "\t3.- Reino Guerrero --> + Fuerza\n" +
                    "\t4.- Reino Hielo --> + Mana\n" + 
                    "\t5.- Reino Ninja --> + Velocidad");
                    int opcion = inputInt.nextInt();

                    Personaje protagonista = new Personaje(false,true,nombre,reinos.get(opcion-1));
                    Personaje.protagonistaCreado = true;
                    System.out.println(protagonista);
                }else if(opcionString.equals("n")){
                    System.out.println("Perfecto!");
                }            
            
       

       

    }
}while(true);
}

}
*/
	}
}