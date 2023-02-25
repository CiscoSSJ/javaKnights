package Gestion;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Reinos.Personaje;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class Main {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        ReinoDragon reinoDragon = new ReinoDragon("Reino Dragon",1);
        ReinoGigante reinoGigante = new ReinoGigante("Reino Gigante",2);
        ReinoGuerrero reinoGuerrero = new ReinoGuerrero("Reino Guerrero",3);
        ReinoHielo reinoHielo = new ReinoHielo("Reino Hielo",4);
        ReinoNinja reinoNinja = new ReinoNinja("Reino Ninja",5);

        ArrayList<Reino> reinos = new ArrayList<Reino>();
        reinos.add(reinoDragon);
        reinos.add(reinoGigante);
        reinos.add(reinoGuerrero);
        reinos.add(reinoHielo);
        reinos.add(reinoNinja);
        
        Personaje cobalk = new Personaje(true,false, "cobalk",reinoDragon);
        Personaje maen = new Personaje(true,false,"Maen",reinoGigante);
        Personaje golem = new Personaje(false,false,"Golem", reinoGigante);
        

        System.out.println(cobalk.getReinoPerteneciente().getNivel());
        System.out.println(maen.getReinoPerteneciente().getNivel());
        System.out.println(maen.getVida());
        System.out.println(cobalk.getFuerza());
        System.out.println(cobalk.getInteligencia());
        System.out.println(golem.getFuerza());
        System.out.println(golem.getVida());
        System.out.println(reinoDragon.getRey().getNombre());

        while(true){
            if(!Personaje.protagonistaCreado){
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

                System.out.println(protagonista);
            }else{
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
        }

        

    }
}
