package Gestion;

import java.time.Period;

import Modelo.Reinos.Personaje;
import Modelo.Reinos.ReinoDragon;

public class Main {
    public static void main(String[] args) {
        ReinoDragon reinoDragon = new ReinoDragon();
        Personaje cobalk = new Personaje(true, "cobalk");

        System.out.println(cobalk.getNombre());
        System.out.println(cobalk);
    }
}
