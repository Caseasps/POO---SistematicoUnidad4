/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Martin Majewsky
 */
public class DaoEmpleadoProduccion implements IOperaciones{
    ArrayList<EmpleadoProduccion> emp = new ArrayList();
    
    @Override
    public void agregarRegistro(Object registro) {
        emp.add((EmpleadoProduccion)registro);
    }

    @Override
    public void mostrarRegistros() {
        for(EmpleadoProduccion p : emp){
            System.out.println(p.toString());
        }
    }
}
