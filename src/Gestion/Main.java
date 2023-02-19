package Gestion;

import Modelo.Reinos.Personaje;
import Modelo.Reinos.ReinoDragon;

public class Main {
    public static void main(String[] args) {
        ReinoDragon reinoDragon = new ReinoDragon();
        Personaje cobalk = new Personaje(true, "cobalk");

        System.out.println(reinoDragon.nombreReino());

        //System.out.println(cobalk.getNombre());
        //System.out.println(cobalk);
    }
}
