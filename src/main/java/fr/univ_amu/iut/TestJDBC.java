package fr.univ_amu.iut;// Ne pas faire un copier/coller du pdf...

// Importer les classes jdbc
import java.sql.*;

public class TestJDBC {
	// Chaine de connexion
	static final String CONNECT_URL = "jdbc:mysql://mysql-nilcair.alwaysdata.net:3306/nilcair_20";
	static final String LOGIN = "nilcair_admin";
	static final String PASSWORD = "123";
	public static void main(String[] args) throws SQLException {
		// Connexion a la base
		System.out.println("Connexion a " + CONNECT_URL);
		try (Connection conn = DriverManager.getConnection(CONNECT_URL,LOGIN,PASSWORD)){
			System.out.println("Connecte\n");


			//stmt.close();
			System.out.println("\nOk.\n");
		} catch (SQLException e) {
			e.printStackTrace();// Arggg!!!
			System.out.println(e.getMessage() + "\n");
		}
	}
}
