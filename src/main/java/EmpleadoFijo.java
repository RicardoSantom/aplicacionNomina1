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

    /**
     *
     */
    public EmpleadoFijo() {
    }

    /**
     *
     * @param dni
     * @param nombre
     * @param salario
     */
    public EmpleadoFijo(Dni dni, String nombre, float salario ) {
        super(dni, nombre);
        this.salario = salario;
    }

    /**
     *
     * @return
     */
    public float getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    

    @Override
    public String toString() {
        return super.toString()+ "," + salario ;
    }
    
    /**
     *
     * @return
     */
    @Override
    public float ingresos() {
        return salario;
    }
    
}
