/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematicounidad4;

import dao.DaoEmpleadoOficina;
import dao.DaoEmpleadoProduccion;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Martin Majewsky
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoEmpleadoOficina DEmpO = new DaoEmpleadoOficina();
        DaoEmpleadoProduccion DEmpP = new DaoEmpleadoProduccion();
        
        EmpleadoOficina EmpO1 = new EmpleadoOficina("Perez", 200.0, 1, "Juan", 5500.0);
        
        EmpleadoOficina EmpO3 = new EmpleadoOficina("Hernandez", 120.0, 3, "Logan", 7200.0);
        
        
        EmpleadoProduccion EmpP2 = new EmpleadoProduccion("Garcia", 300.0, 5, "Alfredo", 8900.0, 2000.0);
        EmpleadoProduccion EmpP3 = new EmpleadoProduccion("Lopez", 100.0, 6, "Mario", 6700.0, 1200.0);
        
        DEmpO.agregarRegistro(EmpO1);
        DEmpO.agregarRegistro("Lopez", 100.0, 2, "Mario", 6100.0);
        DEmpO.agregarRegistro(EmpO3);
        
        DEmpP.agregarRegistro("Castillo", 200.0, 1, "Jose", 5500.0, 1000.0);
        DEmpP.agregarRegistro(EmpP2);
        DEmpP.agregarRegistro(EmpP3);
        
        DEmpO.mostrarRegistros();
        DEmpP.mostrarRegistros();
    }
    
}
