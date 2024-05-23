/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class DatabaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/dbveterinaria";
    private static final String USER = "root";
    private static final String PASSWORD = "Admin";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa a la base de datos.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al conectar a la base de datos.");
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isConnectionValid() {
        try {
            return connection != null && connection.isValid(2);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (isConnectionValid()) {
            System.out.println("La conexión es válida.");
        } else {
            System.out.println("La conexión no es válida.");
        }
        closeConnection();
    }
    
}
