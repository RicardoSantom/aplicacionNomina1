package ies.sauces.aplicacionNomina1;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo Santiago Tomé
 */
public class ComparadorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado e1, Empleado e2) {
        int salida;
        salida = 0;
        float sueldo1, sueldo2;
        sueldo1 = e1.ingresos();
        sueldo2 = e2.ingresos();

        if (sueldo1 > sueldo2) {
            salida = 1;
        } else if (sueldo1 < sueldo2) {
            salida = -1;
        }

        return salida;
    }

}
