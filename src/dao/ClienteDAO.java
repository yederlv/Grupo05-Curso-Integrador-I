
package dao;

import model.Cliente;
import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD  {
    //private Connection connection;
    PreparedStatement ps;
    Connection con;    
    ResultSet rs;
    DatabaseConnection conectar = new DatabaseConnection();
    Cliente cliente = new Cliente ();

    public ClienteDAO() {
        con = DatabaseConnection.getConnection();
    }

    public void addCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombre, apellido, direccion, telefono, codDocumento, email, sexo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
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
    
    


    
    public List lista(String criterio) {
        List<Cliente> datos = new ArrayList<>();
        String sql="SELECT c.idCliente , c.DNI , c.Nombre , c.Apellido , c.Telefono , c.Correo  FROM cliente c WHERE DNI = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt(1));
                cliente.setCodDocumento(rs.getInt(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));         
                cliente.setTelefono(rs.getString(5));
                cliente.setEmail(rs.getString(6));  
                        
                datos.add(cliente);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    
}