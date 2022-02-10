
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class ComparadorSueldo implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        int salida;
        salida=0;
        if(o1.ingresos()>o2.ingresos()){
            salida=1;
        }else{
            if(o1.ingresos()<o2.ingresos()){
                salida=-1;
            }
        }
        return salida;
    }
    
}
