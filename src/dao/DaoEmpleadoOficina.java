/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import modelos.EmpleadoOficina;

/**
 *
 * @author Martin Majewsky
 */
public class DaoEmpleadoOficina implements IOperaciones{
    ArrayList<EmpleadoOficina> emp = new ArrayList();

    @Override
    public void agregarRegistro(Object registro) {
        emp.add((EmpleadoOficina)registro);
    }
    
    public void agregarRegistro(String apellidos, double horasExtras, int id, 
            String nombre, double salarioBase) {
        emp.add(new EmpleadoOficina(apellidos, 
                horasExtras, id, nombre, salarioBase));
    }
    
    @Override
    public void mostrarRegistros() {
        for (EmpleadoOficina e : emp){
            System.out.println(e.toString());
        } 
    }
    
}
