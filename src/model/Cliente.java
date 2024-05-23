package model;

/**
 *
 * @author Yeder LV
 */
public class Cliente {
    
    // Atributos
    private static int idCliente;
    private String nombre;
    private String apellido;
    private String sexo;  
    private String direccion;
    private int telefono;
    private String correo;
    private int dni;
    
    
    
    // Getters y setters Cliente
    public static int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return correo;
    }

    public void setEmail(String correo) {
        this.correo = correo;
    }

    public int getCodDocumento() {
        return dni;
    }

    public void setCodDocumento(int dni) {
        this.dni = dni;
    }

}
