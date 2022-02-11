
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class AppNominas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaNominas nominas = new SistemaNominas();
        int opcion,opcion2;
        Scanner teclado = new Scanner(System.in);
        List<Empleado> listado;
        Empleado  empleado2;
        
        do {
            System.out.println("1.Crear empleado");
            System.out.println("2.Consultar empleado");
            System.out.println("3.Eliminar empleado");
            System.out.println("4.Listar empleados");
            System.out.println("5.Listar empleados por sueldo");
            System.out.println("5.Consultar total salarios");
            System.out.println("0.Salir");
            System.out.println("Introduzca opcion:");
            while (!teclado.hasNextInt()) {
                teclado.nextLine();
            }
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    String dni,nombre;
                    float salarioHora;
                    int horas;
                    System.out.println("1.Crear empleado");
                    System.out.println("Introduzca dni:");
                    dni=teclado.nextLine();
                    System.out.println("Introduzca nombre:");
                    nombre=teclado.nextLine();
                    Empleado empleado1= new EmpleadoEventual(dni,nombre,salarioHora,horas);
                    if(nominas.incluirEmpleado(empleado1)){
                        
                    }
                    break;
            }
        } while (opcion != 0);
    }
    
}
