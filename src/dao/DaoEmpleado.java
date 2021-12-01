/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Martin Majewsky
 */
public class DaoEmpleado {
    
    public double calcularSalarioBruto(double salarioBase, double horasExtra){

        return salarioBase + horasExtra;
    }
    
    public float calcularSalarioNeto(double salarioBase, double horasExtra, double bono){
        float salarioNeto = (float)((salarioBase + horasExtra + bono) 
                - this.calcularSeguro(salarioBase, horasExtra));
        
        return salarioNeto;
    }
    
    public double calcularSeguro(double salarioBase, double horasExtra){
        double seguro = this.calcularSalarioBruto(salarioBase, horasExtra);
        
        return seguro*0.07;
    }
}
