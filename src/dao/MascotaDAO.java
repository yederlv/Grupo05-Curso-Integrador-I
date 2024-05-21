/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Mascota;
import util.DatabaseConnection;

import java.sql.*;



public class MascotaDAO {
    
    private Connection connection;
    
     public MascotaDAO() {
        connection = DatabaseConnection.getConnection();
    }
     
      public void addMascota(Mascota mascota) {
        String sql = "INSERT INTO mascota (nombreMascota, especie, raza, edad, peso, sexo, desparasitacion, fechaRegistroDespa, producto, vacunacion, fechaRegistroVacu, tipoVacunacion, marca, lote, enfermedadesAnteriores, tratamiento) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, mascota.getNombreMascota());
            stmt.setString(2, mascota.getEspecie());
            stmt.setString(3, mascota.getRaza());
            stmt.setInt(4, mascota.getEdad());
            stmt.setString(5, mascota.getPeso());
            stmt.setString(6, mascota.getSexo());
            stmt.setString(7, mascota.getDesparasitacion());
            stmt.setString(8, mascota.getFechaRegistroDespa());
            stmt.setString(9, mascota.getProducto());
            stmt.setString(10, mascota.getVacunacion());
            stmt.setString(11, mascota.getFechaRegistroVacu());
            stmt.setString(12, mascota.getTipoVacunacion());
            stmt.setString(13, mascota.getMarca());
            stmt.setString(14, mascota.getLote());
            stmt.setString(15, mascota.getEnfermedadesAnteriores());
            stmt.setString(16, mascota.getTratamiento());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
