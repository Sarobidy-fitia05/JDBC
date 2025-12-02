package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            String url = "jdbc:postgresql://localhost:5432/connexionbdd";
            String user = "sarobidy";
            String password = "sarobidy";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion établie !");

            conn.close();
        } catch (SQLException e) {
            System.err.println("Erreur de connexion : " + e.getMessage());
        }
        }
    }
}