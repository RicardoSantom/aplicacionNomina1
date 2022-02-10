/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class EmpleadoFijo extends Empleado{

    private float salario;

    public EmpleadoFijo(float salario, String dni, String nombre) {
        super(dni, nombre);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "salario=" + salario ;
    }
    
    @Override
    public float ingresos() {
        return salario;
    }
    
}
