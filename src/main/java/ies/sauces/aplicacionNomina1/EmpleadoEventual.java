package ies.sauces.aplicacionNomina1;


/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoEventual extends Empleado {

    private float salarioHora;
    private int horas;

    /**
     *
     */
    public EmpleadoEventual() {
    }

    /**
     *
     * @param dni
     * @param nombre
     * @param salarioHora
     * @param horas
     */
    public EmpleadoEventual(Dni dni, String nombre, float salarioHora, int horas) {
        super(dni, nombre);
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    /**
     *
     * @return
     */
    public float getSalarioHora() {
        return salarioHora;
    }

    /**
     *
     * @return
     */
    public int getHoras() {
        return horas;
    }

    /**
     *
     * @param salarioHora
     */
    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    /**
     *
     * @param horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    

    @Override
    public String toString() {
        return super.toString() + "," + salarioHora + "," + horas;
    }

    /**
     *
     * @return
     */
    @Override
    public float ingresos() {
        return salarioHora * horas;
    }

}
