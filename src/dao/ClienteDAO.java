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

    // Agregar Cliente
    public void addCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombre, apellido, sexo, direccion, telefono, correo, dni ) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getSexo());
            stmt.setString(4, cliente.getDireccion());
            stmt.setInt(5, cliente.getTelefono());
            stmt.setString(6, cliente.getEmail());
            stmt.setInt(7, cliente.getCodDocumento());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Listar Cliente
    public List<Cliente> buscarClientes(String criterio, String valor) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes WHERE " + criterio + " LIKE ?";
               
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, "%" + valor + "%");
    
             try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setTelefono(rs.getInt("telefono"));
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
