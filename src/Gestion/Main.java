

package Gestion;

import javax.swing.JOptionPane;

import Modelo.OpcionesMenu.Partida;
import Modelo.Personaje.Protagonista;
import Modelo.Personaje.Rey;
import Modelo.Reinos.ListaReinosNoCreados;
import Modelo.Reinos.Reino;
import Modelo.Reinos.ReinoDragon;
import Modelo.Reinos.ReinoGigante;
import Modelo.Reinos.ReinoGuerrero;
import Modelo.Reinos.ReinoHielo;
import Modelo.Reinos.ReinoNinja;
=======
import Modelo.Partida.Partida;
>>>>>>> branch 'main' of https://github.com/CiscoSSJ/javaKnights.git

<<<<<<< HEAD
/*
Este código es un ejemplo básico de cómo crear una ventana de Java Swing y manejar eventos de botón en Java.
La clase Main es la clase principal que extiende la clase JFrame, lo que significa que es una ventana.
La ventana tiene una etiqueta de título y un botón de inicio que se
configura para llamar a un método de acción cuando se hace clic.
Cuando se hace clic en el botón de inicio, la ventana actual
se cierra y se abre una nueva ventana de menú principal.

La clase MenuPrincipal es la segunda ventana que se abre cuando se hace clic en el botón de inicio.
La ventana tiene tres botones: uno para iniciar una partida,
otro para iniciar un tutorial y otro para abrir una ventana de configuración.
Cada botón se configura para llamar a un método de acción diferente cuando se hace clic.
En cada método de acción, en un principio simplemente imprime un mensaje en la consola que indica lo que está sucediendo.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Main extends JFrame implements ActionListener {

    JButton botonIniciar;
    JLabel etiquetaTitulo;
    JPanel panel;

    public Main() {
        // Configurar la ventana
        setTitle("Mi juego");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiquetaTitulo = new JLabel("Bienvenido al juego");
        botonIniciar = new JButton("Iniciar");
        botonIniciar.addActionListener(this);

        panel = new JPanel(new BorderLayout());
        panel.add(etiquetaTitulo, BorderLayout.CENTER);
        panel.add(botonIniciar, BorderLayout.SOUTH);

        getContentPane().add(panel);
        setVisible(true);  
    }

    public static void main(String[] args) {
        new Main();
        System.out.println("Iniciando juego...");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonIniciar) {
            dispose();
            new MenuPrincipal().setVisible(true);
        }
    }
}

class MenuPrincipal extends JFrame implements ActionListener {

    JButton botonIniciarPartida, botonIniciarTutorial, botonConfiguracion;
    JLabel etiquetaTitulo;
    JPanel panel;

    public MenuPrincipal() {
        // Configurar la ventana
        setTitle("Menú principal");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear componentes
        etiquetaTitulo = new JLabel("Menú principal");
        botonIniciarPartida = new JButton("Iniciar partida");
        botonIniciarTutorial = new JButton("Iniciar tutorial");
        botonConfiguracion = new JButton("Configuración");

        botonIniciarPartida.addActionListener(this);
        botonIniciarTutorial.addActionListener(this);
        botonConfiguracion.addActionListener(this);

        panel = new JPanel(new GridLayout(4, 1));
        panel.add(etiquetaTitulo);
        panel.add(botonIniciarPartida);
        panel.add(botonIniciarTutorial);
        panel.add(botonConfiguracion);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource() == botonIniciarPartida) {
            new MenuIniciarPartida().setVisible(true);
        } else if (e.getSource() == botonIniciarTutorial) {
            System.out.println("Iniciando tutorial...");
        } else if (e.getSource() == botonConfiguracion) {
            System.out.println("Abriendo configuración...");
        }
    }

public class Main {

	public static void main(String[] args) {
		// Crea una nueva instancia de Partida
		Partida partida1 = new Partida();
		/**
		 * Llama al método menuPrincipal() de la clase Menus de la
		 * instancia de Partida creada anteriormente.
		 */
		partida1.getMenus().menuPrincipal(partida1);
	}
}

class MenuIniciarPartida extends JFrame implements ActionListener {


	JButton botonNuevaPartida, botonCargarPartida;
    JLabel etiquetaTitulo;
    JPanel panel;

    public MenuIniciarPartida() {
        setTitle("Menú iniciar partida");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiquetaTitulo = new JLabel("Menú inicio de partida");
        botonNuevaPartida = new JButton("Nueva partida");
        botonCargarPartida = new JButton("Cargar partida");

        botonNuevaPartida.addActionListener(this);
        botonCargarPartida.addActionListener(this);

        panel = new JPanel(new GridLayout(3, 1));
        panel.add(etiquetaTitulo);
        panel.add(botonNuevaPartida);
        panel.add(botonCargarPartida);

        getContentPane().add(panel);
        setVisible(true);
    }
	
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource() == botonNuevaPartida) {
            new MenuNuevaPartida().setVisible(true);
        } else if (e.getSource() == botonCargarPartida && Partida.partida) {
            System.out.println("Cargando partida...");
        } else {
            System.out.println("No hay partida cargada");
        }
    }
}

class MenuNuevaPartida extends JFrame implements ActionListener {
	
    static Partida partida = new Partida();

	JButton facil, medio, dificil;
    JButton iniciar;
    String dificultadSeleccionada;

    public MenuNuevaPartida() {

    	// Configurar la ventana
        setTitle("Menú nueva partida");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Crear componentes
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(3, 1));

        JLabel mensaje = new JLabel("Seleccione la dificultad");
        mensaje.setHorizontalAlignment(JLabel.CENTER);
        contenedor.add(mensaje);

        JPanel panelBotones = new JPanel(new GridLayout(1, 3));
        facil = new JButton("Fácil");
        medio = new JButton("Medio");
        dificil = new JButton("Difícil");
        panelBotones.add(facil);
        panelBotones.add(medio);
        panelBotones.add(dificil);
        contenedor.add(panelBotones);

        iniciar = new JButton("Iniciar partida");
        iniciar.setEnabled(false);
        contenedor.add(iniciar);

        // Configurar los botones
        facil.addActionListener(this);
        medio.addActionListener(this);
        dificil.addActionListener(this);

        iniciar.addActionListener(this);

        // Mostrar la ventana
        setVisible(true);
    }
	
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == facil) {
    		// Acción al presionar el botón de dificultad fácil
            iniciar.setEnabled(true);
            medio.setEnabled(false);
            dificil.setEnabled(false);
            dificultadSeleccionada = "Fácil";
        }

        if (e.getSource() == medio) {
        	// Acción al presionar el botón de dificultad medio
            iniciar.setEnabled(true);
            facil.setEnabled(false);
            dificil.setEnabled(false);
            dificultadSeleccionada = "Medio";
        }

        if (e.getSource() == dificil) {
        	// Acción al presionar el botón de dificultad difícil
            iniciar.setEnabled(true);
            facil.setEnabled(false);
            medio.setEnabled(false);
            dificultadSeleccionada = "Difícil";
        }

        if (e.getSource() == iniciar) {
            JOptionPane.showMessageDialog(null, "Iniciando partida en modo " + dificultadSeleccionada + "...");
            dispose(); // cierra la ventana principal
            JOptionPane.getRootFrame().dispose(); // cierra el mensaje de diálogo
            partida.menuPersonaje(dificultadSeleccionada);
        }
    }
}

