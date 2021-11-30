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
public class EmpleadoProduccion extends Empleado{
    private double bono;

    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(String apellidos, double horasExtras, int id, 
            String nombre, double salarioBase, double bono) {
        super(apellidos, horasExtras, id, nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "EmpleadoProduccion{ID:" + getId()  
                + " Nombre: " + getNombre() + " Apellido: " + getApellidos()
                + " Salario base: " + getSalarioBase() 
                + " Horas extras: " + getHorasExtras() 
                + " bono: " + getBono() + '}';
    }
    
    
}
