package dao;

import model.Mascota;
import util.DatabaseConnection;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



public class MascotaDAO {
    
    private Connection connection;
    
     public MascotaDAO() {
        connection = DatabaseConnection.getConnection();
    }
     
    // Agregar Mascota
      public void addMascota(Mascota mascota) {
        String sql = "INSERT INTO mascota (nombreMascota, pesoMascota, edadMascota, sexoMascota, idCliente, idEspecie, idRaza)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, mascota.getNombreMascota());
            stmt.setInt(2, mascota.getPesoMascota());
            stmt.setInt(3, mascota.getEdadMascota());
            stmt.setString(4, mascota.getSexoMascota());
            stmt.setInt(5, mascota.getIdClienteFK());
            stmt.setInt(6, mascota.getIdEspecieFK());
            stmt.setInt(7, mascota.getIdRazaFK());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
      public void RellenarComboBox(String tabla, String valor, JComboBox combo){
          String sql = "SELECT * FROM " + tabla;
          Statement st;
     
          try
          {
              st = connection.createStatement();
              ResultSet rs = st.executeQuery(sql);
              while(rs.next())
              {
                  combo.addItem(rs.getString(valor));
              }
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "ERROR" + e.toString());
          }
      }
 
}
