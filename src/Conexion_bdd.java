import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion_bdd {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String usuario = "root";
	private static String password = "Jesus1234*";
	private static String url = "jdbc:mysql://localhost:3306/automovil";
	static {
		try {
			Class.forName(driver);
			JOptionPane.showMessageDialog(null, "Driver Conectado");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Driver no conectado");
		}
	}
	Connection con = null;
	public Connection getConnection() {
		try {
			con=DriverManager.getConnection(url, usuario, password);
			JOptionPane.showMessageDialog(null, "Conexión a MySQL correcta");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error de conexión ");
		}
		return con;
		
	}
	public Connection close() {
		try {
			con.close();
			JOptionPane.showMessageDialog(null, "Conexión cerrada");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error de conexión ");
		}
		return con;
	}
	public static void main(String[] args) {
		Conexion_bdd automovil=new Conexion_bdd();
		automovil.getConnection();
	}
}
