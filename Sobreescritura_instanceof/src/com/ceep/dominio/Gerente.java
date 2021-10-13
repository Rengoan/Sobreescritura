package com.ceep.dominio;

public class Gerente extends Empleado {

    private String departamento;

    //Constructor
    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //Getter and Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Metodos
//    public void mostrarDetalles() {
//        System.out.println("Gerente: " + this.nombre + ", " + this.sueldo + ", " + this.departamento);
//    }
    
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() +", Gerente: " + this.departamento;
    }


}
