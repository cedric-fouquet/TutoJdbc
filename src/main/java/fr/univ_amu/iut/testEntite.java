package fr.univ_amu.iut;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by f16007622 on 21/09/17.
 */
public class testEntite {

        public static void main(String[] args) throws SQLException {
            // Connexion a la base
            System.out.println("Connexion");
            try (Connection conn = ConnexionUnique.getInstance().getConnection()){
                System.out.println("Connecte\n");

                //stmt.close();
                System.out.println("\nOk.\n");
            } catch (SQLException e) {
                e.printStackTrace();// Arggg!!!
                System.out.println(e.getMessage() + "\n");
            }

    }

}
