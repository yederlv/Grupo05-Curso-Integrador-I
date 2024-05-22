package dao;

import model.Cita;
import util.DatabaseConnection;

import java.sql.*;

/**
 *
 * @author Geanc12
 */
public class CitaDAO {
    
    private Connection connection;
    
     public CitaDAO() {
        connection = DatabaseConnection.getConnection();
    }
     
    // Agregar Cita
    public void addCita(Cita cita) {
        String sql = "INSERT INTO cita (FechaCita, HoraInicio, HoraFin, LugarCita, EstadoCita, idMascota, idServicio)"
            + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cita.getFechaCita());   // Tipo de Dato Fecha
            stmt.setString(2, cita.getHoraInicio()); // Tipo de Dato Fecha
            stmt.setString(3, cita.getHoraFin());   // Tipo de Dato Fecha
            stmt.setString(4, cita.getLugarCita()); 
            stmt.setString(5, cita.getEstadoCita());
            stmt.setInt(6, cita.getIdMascotaFK());
            stmt.setInt(7, cita.getIdServicioFK());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
}
