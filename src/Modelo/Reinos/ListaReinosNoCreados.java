package Modelo.Reinos;

import java.util.ArrayList;

public class ListaReinosNoCreados {
    private ArrayList<Reino> reinosNoCreados;
    
    public ListaReinosNoCreados() {
        reinosNoCreados = new ArrayList<>();
    }
    
    public void agregarReino(Reino reino) {
        if (!reino.equals(null)) {
            reinosNoCreados.add(reino);
        }
    }
    
    public ArrayList<Reino> getReinosNoCreados() {
        return reinosNoCreados;
    }
}