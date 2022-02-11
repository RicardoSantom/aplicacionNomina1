/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoFijo extends Empleado{

    private float salario;

    public EmpleadoFijo(String dni, String nombre, float salario ) {
        super(dni, nombre);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "EmpleadoFijo{" + "salario=" + salario + '}';
    }
    
    @Override
    public float ingresos() {
        return salario;
    }
    
}
