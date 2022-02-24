/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daw1
 */
public class EmpleadoFijoTest {

    public EmpleadoFijoTest() {
    }

    public void testIngresos() {
        try {
            System.out.println("ingresos");
            EmpleadoFijo instance = new EmpleadoFijo(Dni.valueOf("71013659D"), "1", 100);
            float expResult = 100.0F;
            float result = instance.ingresos();
            assertEquals(expResult, result, 0.0);
        } catch (DniException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
