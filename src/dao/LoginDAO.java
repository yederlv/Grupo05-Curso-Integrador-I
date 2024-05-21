/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class LoginDAO {
    
     private Connection connection;

    public LoginDAO() {
        connection = DatabaseConnection.getConnection();
    }

    public boolean authenticate(String username, String password) {
        String sql = "SELECT * FROM usuario WHERE Usuario = ? AND Contraseña = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Devuelve true si se encontró una fila que coincide
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
