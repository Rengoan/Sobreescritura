
package com.ceep.dominio;


public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;
    

    public Escritor(TipoEscritura tipoEscritura, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() +" ,Escritor: " + this.tipoEscritura;
    }
    
    
}
