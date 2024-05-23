package dao;

import model.Cliente;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    private Connection connection;

    public ClienteDAO() {
        connection = DatabaseConnection.getConnection();
    }

    // Agregar Cliente
<<<<<<< HEAD
    public int addCliente(Cliente cliente) throws SQLException {
        //int generatedId = -1;
        String sql = "INSERT INTO cliente (nombre, apellido, sexo, direccion, telefono, correo, dni ) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){ 
            
=======
    public void addCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (nombre, apellido, sexo, direccion, telefono, correo, dni ) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
>>>>>>> origin
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getSexo());
            stmt.setString(4, cliente.getDireccion());
            stmt.setInt(5, cliente.getTelefono());
            stmt.setString(6, cliente.getEmail());
            stmt.setInt(7, cliente.getCodDocumento());
            stmt.executeUpdate();
            
            int affectedRows = stmt.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            
        } 
       
    }

    // Listar Cliente
    public List<Cliente> buscarClientes(String criterio, String valor) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE " + criterio + " LIKE ?";
               
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
