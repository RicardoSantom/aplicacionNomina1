
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class SistemaNominas {

    private List<Empleado> empleados;

    public SistemaNominas() {
        empleados = new ArrayList<>();
    }

    public boolean incluirEmpleado(Empleado empleado) {
        boolean salida = false;
        if (empleado != null && !empleados.contains(empleado)) {
            salida = empleados.add(empleado);
        }
        return salida;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado getEmpleado(String dni) {
        for (Empleado e : empleados) {
            if (e.getDni().equals(dni)) {
                return e;
            }
        }
        return null;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public boolean eliminarEmpleado(Empleado e) {
        boolean salida;
        salida = false;

        if (e != null) {
            salida = empleados.remove(e);
        }
        return salida;
    }

    public List<Empleado> listarEmpleados() {
        List<Empleado> salida=new ArrayList<>(empleados);
        Collections.sort(salida);
        return salida;
        //sin ordenar.
        /*return new ArrayList<>(empleados);*/
    }

    public List<Empleado> listarEmpleadosPorSueldo() {
        List<Empleado> salida=null;
        salida=new ArrayList<>(empleados);
        Collections.sort(salida, new ComparadorSueldo());
        return salida;
    }
    
    public List<Empleado> listarEmpleadosPorNombre(){
         List<Empleado> salida=new ArrayList<>(empleados);
        
        Collections.sort(salida, new Comparator<Empleado>() {
             @Override
             public int compare(Empleado o1, Empleado o2) {
                 return o1.getNombre().compareTo(o2.getNombre());
             }
         });
        return salida;
    }

    public float getTotalSalarios() {
        float acumulador = 0;
        
        //con ListIterator
        /*ListIterator<Empleado> li=empleados.listIterator();
        
        while(li.hasNext()){
            acumulador+=li.next().ingresos();
        }*/

        for (Empleado e : empleados) {
            acumulador += e.ingresos();
        }
        return acumulador;
    }

}
