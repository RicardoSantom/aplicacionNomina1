
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public class SistemaNominas {
    private List<Empleado> empleados;
    
    
    public SistemaNominas() {
         empleados=new ArrayList<> ();
    }
    
    public boolean incluirEmpleado(Empleado empleado){
    
    return empleados.add(empleado);
    
    
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public boolean eliminarEmpleado(Empleado empleado){
        boolean salida;
        salida=false;
        
        if(empleado!=null){
            salida=empleados.remove(empleado);
        }
        return salida;
    }
    
    public List<Empleado> listarEmpleados(){
        return new ArrayList<> (empleados);
    }
    
    public List<Empleado> listarEmpleadosPorSueldo(){
        
        return new ArrayList<> (empleados.sort(new ComparadorSueldo()));
    }
    
}
