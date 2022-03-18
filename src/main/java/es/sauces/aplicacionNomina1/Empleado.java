package es.sauces.aplicacionNomina1;


import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo Santiago Tomé
 */
public abstract class Empleado implements Comparable<Empleado>,Serializable {

    private Dni dni;
    private String nombre;

    /**
     *
     */
    public Empleado() {

    }

    /**
     *
     * @param dni
     * @param nombre
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
     * @return
     */
    public Dni getDni() {
        return dni;
    }

    /**
     *
     * @param dni
     */
    public void setDni(Dni dni) {
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
     * @return
     */
    public abstract float ingresos();

}
