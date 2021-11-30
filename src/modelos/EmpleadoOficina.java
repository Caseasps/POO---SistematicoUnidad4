/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Martin Majewsky
 */
public class EmpleadoOficina extends Empleado{

    public EmpleadoOficina() {
    }

    public EmpleadoOficina(String apellidos, double horasExtras, int id, String nombre, double salarioBase) {
        super(apellidos, horasExtras, id, nombre, salarioBase);
    }

    @Override
    public String toString() {
        return "EmpleadoProduccion{ID:" + getId()  
                + " Nombre: " + getNombre() + " Apellido: " + getApellidos()
                + " Salario base: " + getSalarioBase() 
                + " Horas extras: " + getHorasExtras() + '}';
    }
    
    
}
