package model;
import model.Cliente;
import model.Especie;
import model.Raza;
/**
 *
 * @author Alfredo
 */
public class Mascota {
    
    // Atributos Mascota
    private static int idMascota;
    private String nombreMascota;
    private int pesoMascota;
    private int edadMascota;
    private String sexoMascota; // Valores: M y H (Solo una letra)

    //private int idCliente_FK;
    //private int idEspecie_FK;
    //private int idRaza_FK;
    
    // Getters y setters Mascota
    public static int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(int pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getSexoMascota() {
        return sexoMascota;
    }

    public void setSexoMascota(String sexoMascota) {
        this.sexoMascota = sexoMascota;
    }
    
    // Getters Foraneos Mascota
    public int getIdClienteFK() {
        return Cliente.getIdCliente();
    }
    
    public int getIdEspecieFK() {
        return Especie.getIdEspecie();
    }
    
    public int getIdRazaFK() {
        return Raza.getIdRaza();
    }

}
