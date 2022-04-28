/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sauces.aplicacionNomina1.appNomina;

import es.sauces.aplicacionNomina1.controlador.Controlador;
import es.sauces.aplicacionNomina1.modelo.SistemaNominas;
import es.sauces.aplicacionNomina1.vista.Ventana;

/**
 *
 * @author Usuario
 */
public class PrincipalNominas {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
         Ventana vista=new Ventana();
        SistemaNominas modelo=new SistemaNominas();
        Controlador controlador=new Controlador(vista, modelo);
        vista.setControlador(controlador);
        controlador.iniciar();
    }
}
