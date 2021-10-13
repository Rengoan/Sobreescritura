package com.ceep.test;

import com.ceep.dominio.*;

public class Test {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Santiago", 23000.0);
//        emp1.mostrarDetalles();
        imprimir(emp1);

        Gerente gerent1 = new Gerente("IT", "Luis", 35000.0);
//        gerent1.mostrarDetalles();
        imprimir(gerent1);

        Empleado emp2;
        emp2 = new Escritor(TipoEscritura.CLASICO, "Cervantes", 55000);
        imprimir(emp2);
        System.out.println(((Escritor) emp2).getTipoEscritura().getDescripcion());
        
        
        Escritor esc1 = (Escritor) emp2; //El empleado pasa a ser de la clase Escritor
        esc1.getTipoEscritura();
        
        Empleado emp3 = (Empleado)esc1;

    }

    public static void imprimir(Empleado emp) {
        System.out.println(emp.mostrarDetalles());

    }

    public static void determinarTipo(Empleado emp) {
        if (emp instanceof Gerente) {
            System.out.println("Empleado es de tipo gerente.");
            System.out.println(((Gerente) emp).getDepartamento());
            //Convierte el empleado en gerente

        }
        if (emp instanceof Empleado) {
            System.out.println("Empleado es de tipo Empleado.");

        }
        if (emp instanceof Object) {
            System.out.println("Empleado es de tipo Object");

        }
    }
}
