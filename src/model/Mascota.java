package model;
import model.Cliente;
import model.Especie;
import model.Raza;

public class Mascota {
    
    // Atributos Mascota
    private int idMascota;
    private String nombreMascota;
    private int pesoMascota;
    private int edadMascota;
    private String sexoMascota; // Valores: M y H (Solo una letra)

    private int idClienteFK;
    private int idEspecieFK;
    private int idRazaFK;
    
    // Getters y setters Mascota
    public int getIdMascota() {
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
    
    // Getters y setters Foraneos Mascota
    public int getIdClienteFK() {
        return idClienteFK;
    }

    public void setIdClienteFK(int idClienteFK) {
        this.idClienteFK = idClienteFK;
    }

    public int getIdEspecieFK() {
        return idEspecieFK;
    }

    public void setIdEspecieFK(int idEspecieFK) {
        this.idEspecieFK = idEspecieFK;
    }

    public int getIdRazaFK() {
        return idRazaFK;
    }

    public void setIdRazaFK(int idRazaFK) {
        this.idRazaFK = idRazaFK;
    }
}
