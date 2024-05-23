package model;
import model.Servicio;
/**
 *
 * @author Geanc12
 */
public class Cita{

    // Atributos Cita
    private static int idCita;
    private String fechaCita;     // Tipo de Dato Fecha
    private String horaInicio;   // Tipo de Dato Fecha
    private String horaFin;     // Tipo de Dato Fecha
    private String lugarCita;
    private String estadoCita;

    //private int idMascota_FK;
    //private int idServicio_FK;
    
    // Getters y setters  Cita

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getLugarCita() {
        return lugarCita;
    }

    public void setLugarCita(String lugarCita) {
        this.lugarCita = lugarCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }
    
   /* // Getters Foraneos Cita
    public int getIdMascotaFK() {
        return Mascota.getIdMascota();
    }
    */
    public int getIdServicioFK() {
        return Servicio.getIdServicio();
    }
}
