
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *@version 1.3
 * @since 16/02/2022
 * @author Ricardo Santiago Tomé
 */
public class SistemaNominas {

    private Map<String,Empleado> empleados;

    public SistemaNominas() {
        empleados = new TreeMap<>();
    }

    public boolean incluirEmpleado(Empleado empleado) {
        boolean salida = false;
        if (empleados.putIfAbsent(empleado.getDni(), empleado)==null) {
            salida = true;
        }
        return salida;
    }

    public Map<String,Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado getEmpleado(String dni) {
        if (empleados.containsKey(dni)){
            return empleados.get(dni);
        }
        return null;
    }

      public void setEmpleados(Map<String,Empleado> empleados) {
        this.empleados = empleados;
    }


    public boolean eliminarEmpleado(Empleado e) {
        return empleados.remove(e.getDni())!=null;
    }

    public List<Empleado> listarEmpleados() {
        return new ArrayList<>(empleados.values());
    }

    public List<Empleado> listarEmpleadosPorSueldo() {
        List<Empleado> lista = new ArrayList<>(empleados.values());
        Collections.sort(lista, new ComparadorSueldo());
        return lista;
    }
    
    public List<Empleado> listarEmpleadosPorNombre() {
        List<Empleado> salida = new ArrayList<>(empleados.values());

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

        for (Empleado e : empleados.values()) {
            acumulador += e.ingresos();
        }
        return acumulador;
    }

}
