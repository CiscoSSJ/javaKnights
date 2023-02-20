package Gestion;

import javax.swing.plaf.synth.SynthSpinnerUI;

import Modelo.Reinos.Personaje;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;

public class Main {
    public static void main(String[] args) {
        ReinoDragon reinoDragon = new ReinoDragon("Reino Dragon",1);
        ReinoGigante reinoGigante = new ReinoGigante("Reino Gigante",2);
        ReinoGuerrero reinoGuerrero = new ReinoGuerrero("Reino Guerrero",3);
        ReinoHielo reinoHielo = new ReinoHielo("Reino Hielo",4);
        ReinoNinja reinoNinja = new ReinoNinja("Reino Ninja",5);

        Personaje cobalk = new Personaje(true, "cobalk",reinoDragon);
        Personaje maen = new Personaje(true,"Maen",reinoGigante);

        System.out.println(cobalk.getReinoPerteneciente().getNivel());
        System.out.println(maen.getReinoPerteneciente().getNivel());

        //System.out.println(cobalk.getNombre());
        //System.out.println(cobalk);
    }
}
