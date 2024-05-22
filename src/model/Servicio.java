package model;
/**
 *
 * @author Geanc12
 */
public class Servicio {

    // Atributos Servicio
    private static int idServicio;
    private String tipoServicio;

    // Getters y setters  Servicio
    public static int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
}
