/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Cliente;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Yeder LV
 */
public class ClienteDAO {
    private Connection connection;

    public ClienteDAO() {
        connection = DatabaseConnection.getConnection();
    }

    public void addCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombre, apellido, direccion, telefono,codDocumento, email, sexo ) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getDireccion());
            stmt.setString(4, cliente.getTelefono());
            stmt.setInt(5, cliente.getCodDocumento());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getSexo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> buscarClientes(String criterio, String valor) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes WHERE " + criterio + " LIKE ?";
       
        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
             pstmt.setString(1, "%" + valor + "%");
    
             try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }
          }
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    
    // Otros métodos como updateCliente, deleteCliente, etc.
}
