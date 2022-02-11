
/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoEventual extends Empleado {

    private float salarioHora;
    private int horas;

    public EmpleadoEventual() {
    }

    public EmpleadoEventual(String dni, String nombre, float salarioHora, int horas) {
        super(dni, nombre);
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    

    @Override
    public String toString() {
        return super.toString() + "," + salarioHora + "," + horas;
    }

    @Override
    public float ingresos() {
        return salarioHora * horas;
    }

}
