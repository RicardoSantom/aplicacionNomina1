/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoEventual extends Empleado{

    private float salarioHora;
    private int horas;

    public EmpleadoEventual( int horas, String dni, String nombre, float salarioHora) {
        super(dni, nombre);
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public String toString() {
        return  salarioHora + "," + horas;
    }
    
    @Override
    public float ingresos() {
        return salarioHora*horas;
    }
    
}
