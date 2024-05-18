/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alfredo
 */
public class Mascota {
    private int id;
    private String nombreMascota;
    private String especie;
    private String raza;
    private int edad;
    private String peso;
    private String sexo;
    private String desparasitacion;
    private String fechaRegistroDespa;
    private String producto;
    private String vacunacion;
    private String fechaRegistroVacu;
    private String tipoVacunacion;
    private String marca;
    private String lote;
    private String enfermedadesAnteriores;
    private String tratamiento;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombreMascota(){
        return nombreMascota;
    }
    
    public void setNombreMascota(String nombreMascota){
        this.nombreMascota = nombreMascota;
    }
    
    public String getEspecie(){
        return especie;
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public String getPeso(){
        return peso;
    }
    
    public void setPeso(String peso){
        this.peso = peso;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getDesparasitacion(){
        return desparasitacion;
    }
    
    public void setDesparasitacion(String desparasitacion){
        this.desparasitacion = desparasitacion;
    }
    
    public String getFechaRegistroDespa(){
        return fechaRegistroDespa;
    }
    
    public void setFechaRegistroDespa(String fechaRegistroDespa){
        this.fechaRegistroDespa = fechaRegistroDespa;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public String getVacunacion(){
        return vacunacion;
    }
    
    public void setVacunacion(String vacunacion){
        this.vacunacion = vacunacion;
    }
    
    public String getFechaRegistroVacu(){
        return fechaRegistroVacu;
    }
    
    public void setFechaRegistroVacu (String fechaRegistroVacu){
        this.fechaRegistroVacu = vacunacion;
    }
    
    public String getTipoVacunacion(){
        return tipoVacunacion;
    }
    
    public void setTipoVacunacion(String tipoVacunacion){
        this.tipoVacunacion = tipoVacunacion;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getLote(){
        return lote;
    }
    
    public void setLote(String lote){
        this.lote = lote;
    }
    
    public String getEnfermedadesAnteriores(){
        return enfermedadesAnteriores;
    }
    
    public void setEnfermedadesAnteriores(String enfermedadesAnteriores){
        this.enfermedadesAnteriores = enfermedadesAnteriores;
    }
    
    public String getTratamiento(){
        return tratamiento;
    }
    
    public void setTratamiento(String tratamiento){
        this.tratamiento = tratamiento;
    }
}
