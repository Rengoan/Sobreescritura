
package com.ceep.dominio;


public class Empleado {
    private String nombre;
    private double sueldo;
    
    //Constructor

    public Empleado(String nombre, double sueldo) {
       
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }
    
    //Getter and Setters
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //Metodos
    
    public void MostrarDetalles(){
        
    }
    
    
    
}
