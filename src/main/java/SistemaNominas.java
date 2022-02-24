
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

    private Map<Dni,Empleado> empleados;

    /**
     *
     */
    public SistemaNominas() {
        empleados = new TreeMap<>();
    }

    /**
     *
     * @param empleado
     * @return
     */
    public boolean incluirEmpleado(Empleado empleado) {
        boolean salida = false;
        if (empleados.putIfAbsent(empleado.getDni(), empleado)==null) {
            salida = true;
        }
        return salida;
    }

    /**
     *
     * @return
     */
    public Map<Dni,Empleado> getEmpleados() {
        return empleados;
    }

    /**
     *
     * @param dni
     * @return
     */
    public Empleado getEmpleado(Dni dni) {
        if (empleados.containsKey(dni)){
            return empleados.get(dni);
        }
        return null;
    }
    
    /**
     *
     * @param dni
     * @return
     * @throws DniException
     */
    public Empleado getEmpleado(String dni) throws DniException{
            return empleados.get(Dni.valueOf(dni));
    }

    /**
     *
     * @param empleados
     */
    public void setEmpleados(Map<Dni,Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     *
     * @param e
     * @return
     */
    public boolean eliminarEmpleado(Empleado e) {
        return empleados.remove(e.getDni())!=null;
    }

    /**
     *
     * @return
     */
    public List<Empleado> listarEmpleados() {
        return new ArrayList<>(empleados.values());
    }

    /**
     *
     * @return
     */
    public List<Empleado> listarEmpleadosPorSueldo() {
        List<Empleado> lista = new ArrayList<>(empleados.values());
        Collections.sort(lista, new ComparadorSueldo());
        return lista;
    }
    
    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
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
