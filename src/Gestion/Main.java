package Gestion;

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

public class Main extends JFrame implements ActionListener {

    JButton botonIniciar;
    JLabel etiquetaTitulo;
    JPanel panel;

    public Main() {
        // Configurar la ventana
        setTitle("Mi juego");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear componentes
        etiquetaTitulo = new JLabel("Bienvenido al juego");
        botonIniciar = new JButton("Iniciar");

        // Configurar el botón de inicio
        botonIniciar.addActionListener(this);

        // Crear un panel y agregar componentes
        panel = new JPanel(new BorderLayout());
        panel.add(etiquetaTitulo, BorderLayout.CENTER);
        panel.add(botonIniciar, BorderLayout.SOUTH);

        // Agregar el panel a la ventana
        getContentPane().add(panel);

        // Mostrar la ventana
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new Main();
        // Mensaje de Inicio de juego
        System.out.println("Iniciando juego...");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonIniciar) {
            // Acción al presionar el botón de inicio
            dispose(); // Cerrar la ventana actual
            MenuPrincipal menuPrincipal = new MenuPrincipal(); // Crear un nuevo menú
            menuPrincipal.setVisible(true); // Mostrar el nuevo menú
        }
    }

}

class MenuPrincipal extends JFrame implements ActionListener {

    JButton botonIniciarPartida;
    JButton botonIniciarTutorial;
    JButton botonConfiguracion;
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

        // Configurar los botones
        botonIniciarPartida.addActionListener(this);
        botonIniciarTutorial.addActionListener(this);
        botonConfiguracion.addActionListener(this);

        // Crear un panel y agregar componentes
        panel = new JPanel(new GridLayout(4, 1));
        panel.add(etiquetaTitulo);
        panel.add(botonIniciarPartida);
        panel.add(botonIniciarTutorial);
        panel.add(botonConfiguracion);

        // Agregar el panel a la ventana
        getContentPane().add(panel);

        // Mostrar la ventana
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonIniciarPartida) {
            // Acción al presionar el botón de iniciar partida
            System.out.println("Iniciando partida...");
            dispose(); // Cerrar la ventana actual
            MenuIniciarPartida MenuIniciarPartida = new MenuIniciarPartida(); // Crear un nuevo menú
            MenuIniciarPartida.setVisible(true); // Mostrar el nuevo menú
            
        } else if (e.getSource() == botonIniciarTutorial) {
            // Acción al presionar el botón de iniciar tutorial
            System.out.println("Iniciando tutorial...");
            dispose(); // Cerrar la ventana actual
        } else if (e.getSource() == botonConfiguracion) {
            // Acción al presionar el botón de configuración
            System.out.println("Abriendo configuración...");
            dispose(); // Cerrar la ventana actual
        }
    }

}

class MenuIniciarPartida extends JFrame implements ActionListener {
	
	JButton botonNuevaPartida;
    JButton botonCargarPartida;
    JLabel etiquetaTitulo;
    JPanel panel;

    public MenuIniciarPartida() {
        // Configurar la ventana
        setTitle("Menú iniciar partida");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear componentes
        etiquetaTitulo = new JLabel("Menú inicio de partida");
        botonNuevaPartida = new JButton("Nueva partida");
        botonCargarPartida = new JButton("Cargar partida");

        // Configurar los botones
        botonNuevaPartida.addActionListener(this);
        botonCargarPartida.addActionListener(this);

        // Crear un panel y agregar componentes
        panel = new JPanel(new GridLayout(3, 1));
        panel.add(etiquetaTitulo);
        panel.add(botonNuevaPartida);
        panel.add(botonCargarPartida);

        // Agregar el panel a la ventana
        getContentPane().add(panel);

        // Mostrar la ventana
        setVisible(true);
    }
	
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonNuevaPartida) {
            // Acción al presionar el botón de iniciar partida
            System.out.println("Iniciando partida...");
            MenuNuevaPartida MenuNuevaPartida = new MenuNuevaPartida(); // Crear un nuevo menú
            MenuNuevaPartida.setVisible(true); // Mostrar el nuevo menú
            dispose(); // Cerrar la ventana actual
            
        } else if (e.getSource() == botonCargarPartida) {
            // Acción al presionar el botón de cargar partida
            System.out.println("Cargando partida...");
            dispose(); // Cerrar la ventana actual
        }
    }
}

class MenuNuevaPartida extends JFrame implements ActionListener {
	
	private static boolean dificultadSeleccionada = false;
	JButton botonDificultad;
    JButton botonIniciarTutorial;
    JButton botonIniciarCreador;
    JLabel etiquetaTitulo;
    JPanel panel;

    public MenuNuevaPartida() {
        // Configurar la ventana
        setTitle("Menú nueva partida");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear componentes
        etiquetaTitulo = new JLabel("Menú nueva partida");
        botonDificultad = new JButton("Dificultad");
        botonIniciarTutorial = new JButton("Iniciar partida");
        botonIniciarCreador = new JButton("Iniciar creador");

        // Configurar los botones
        botonDificultad.addActionListener(this);
		botonIniciarTutorial.addActionListener(this);
		if (!dificultadSeleccionada) {
			botonIniciarCreador.setEnabled(false); // deshabilitar el botón
        } else {
        	botonIniciarCreador.addActionListener(this); // dejarlo habilitado
        }

        // Crear un panel y agregar componentes
        panel = new JPanel(new GridLayout(4, 1));
        panel.add(etiquetaTitulo);
        panel.add(botonDificultad);
        panel.add(botonIniciarTutorial);
        panel.add(botonIniciarCreador);

        // Agregar el panel a la ventana
        getContentPane().add(panel);

        // Mostrar la ventana
        setVisible(true);
    }
	
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonDificultad) {
            // Acción al presionar el botón de elegir dificultad
            System.out.println("Iniciando seleccion de dificultad...");
            dispose(); // Cerrar la ventana actual
            MenuSeleccionDificultad menuSeleccionDificultad = new MenuSeleccionDificultad(); // Crear un nuevo menú
            menuSeleccionDificultad.setVisible(true); // Mostrar el nuevo menú
            
        } else if (e.getSource() == botonIniciarTutorial) {
            // Acción al presionar el botón de iniciar tutorial
            System.out.println("Iniciando tutorial...");
            dispose(); // Cerrar la ventana actual
            
        } else if (e.getSource() == botonIniciarCreador) {
            // Acción al presionar el botón de iniciar creador
            System.out.println("Iniciando creador de personaje...");
            dispose(); // Cerrar la ventana actual
        }
    }
}

class MenuSeleccionDificultad extends JFrame implements ActionListener {
	
	JButton botonSeleccionPrincipiante;
    JButton botonSeleccionAficionado;
    JButton botonSeleccionAvanzado;
    JLabel etiquetaTitulo;
    JPanel panel;

    public MenuSeleccionDificultad() {
        // Configurar la ventana
        setTitle("Menú para la seleccion de dificultad");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear componentes
        etiquetaTitulo = new JLabel("Menú nueva partida");
        botonSeleccionPrincipiante = new JButton("Principiante");
        botonSeleccionAficionado = new JButton("Aficionado");
        botonSeleccionAvanzado = new JButton("Avanzado");

        // Configurar los botones
        botonSeleccionPrincipiante.addActionListener(this);
        botonSeleccionAficionado.addActionListener(this);
        botonSeleccionAvanzado.addActionListener(this);

        // Crear un panel y agregar componentes
        panel = new JPanel(new GridLayout(4, 1));
        panel.add(etiquetaTitulo);
        panel.add(botonSeleccionPrincipiante);
        panel.add(botonSeleccionAficionado);
        panel.add(botonSeleccionAvanzado);

        // Agregar el panel a la ventana
        getContentPane().add(panel);

        // Mostrar la ventana
        setVisible(true);
    }
	
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonSeleccionPrincipiante) {
            // Acción al presionar el botón de elegir dificultad principiante
            System.out.println("Dificultad principiante seleccionada");
            dispose(); // Cerrar la ventana actual
            MenuNuevaPartida MenuNuevaPartida = new MenuNuevaPartida(); // Crear un nuevo menú
            MenuNuevaPartida.setVisible(true); // Mostrar el nuevo menú
            
            
        } else if (e.getSource() == botonSeleccionAficionado) {
            // Acción al presionar el botón de elegir dificultad aficionado
            System.out.println("Dificultad aficionado seleccionada");
            dispose(); // Cerrar la ventana actual
            MenuNuevaPartida MenuNuevaPartida = new MenuNuevaPartida(); // Crear un nuevo menú
            MenuNuevaPartida.setVisible(true); // Mostrar el nuevo menú
            
        } else if (e.getSource() == botonSeleccionAvanzado) {
            // Acción al presionar el botón de elegir dificultad avanzado
            System.out.println("Dificultad avanzado seleccionada");
            dispose(); // Cerrar la ventana actual
        }
    }
}
