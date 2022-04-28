package es.sauces.aplicacionNomina1.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public abstract class Empleado implements Comparable<Empleado>,Serializable {

    private Dni dni;
    private String nombre;

    /**
     *Constructor sin parámetros para instanciar un Empleado
     */
    public Empleado() {

    }

    /**
     *
     * @param dni de tipo Dni, representa el Dni del empleado.
     * @param nombre de tipo String, establece el nombre del empleado.
     * Constructor de instancias de la clase Empleado compuestos de un Dni
     * y un mombre.
     */
    public Empleado(Dni dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return dni.toString() + "," + nombre;
    }

    /**
     *
     * @return  dni de una instancia de Empleado.
     */
    public Dni getDni() {
        return dni;
    }

    /**
     *
     * @param dni modifica el dni establecido de los objetos Empleado.
     */
    public void setDni(Dni dni) {
        this.dni = dni;
    }

    /**
     *
     * @return nombre de los objetos Empleados
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre modifica el nombre de los objetos empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Empleado empleado) {
        return this.dni.compareTo(empleado.dni);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Empleado){
            Empleado other= (Empleado) obj;
            if(Objects.equals(this.dni, other.dni)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return metodo abstracto que declara ingresos para los Empleados.
     */
    public abstract float ingresos();

}
