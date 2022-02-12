
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class AppNominas {

    public static void main(String[] args) {
        SistemaNominas sn = new SistemaNominas();
        int opcion;
        Scanner teclado = new Scanner(System.in);
        List<Empleado> listado;

        do {
            System.out.println("1.Crear empleado fijo");
            System.out.println("2.Crear empleado eventual");
            System.out.println("3.Consultar empleado");
            System.out.println("4.Eliminar empleado");
            System.out.println("5.Listar empleados (DNI)");
            System.out.println("6.Listar empleados (SUELDO)");
            System.out.println("7.Listar empleados (NOMBRE)");
            System.out.println("8.Consultar total salarios");
            System.out.println("0.Salir");
            System.out.println("Introduzca opcion:");
            while (!teclado.hasNextInt()) {
                teclado.nextLine();
            }
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    String dni,
                     nombre;
                    float salarioHora,
                     salario;
                    int horas;
                    System.out.println("1.Crear empleado fijo");
                    System.out.println("Introduzca dni:");
                    dni = teclado.nextLine();
                    System.out.println("Introduzca nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Introduzca salario:");
                    salario = teclado.nextFloat();
                    if (sn.incluirEmpleado(new EmpleadoFijo(dni, nombre, salario))) {
                        System.out.println("Empleado incluido en el sistema:");
                    } else {
                        System.out.println("No se ha podido incluir al empleado en el sistema:");
                    }
                    System.out.println("-------------------------------------");
                    break;

                case 2:
                    System.out.println("2.Crear empleado eventual");
                    System.out.println("Introduzca dni:");
                    dni = teclado.nextLine();
                    System.out.println("Introduzca nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Introduzca salarioHora:");
                    salarioHora = teclado.nextFloat();
                    System.out.println("Introduzca número de horas:");
                    horas = teclado.nextInt();
                    if (sn.incluirEmpleado(new EmpleadoEventual(dni, nombre, salarioHora, horas))) {
                        System.out.println("Empleado incluido en el sistema.");
                    } else {
                        System.out.println("No se ha podido incluir al empleado en el sistema.");
                    }
                    System.out.println("-------------------------------------");
                    break;

                case 3:
                    System.out.println("3.Consultar empleado");
                    System.out.println("Introduzca dni para consultar empleado.");
                    dni = teclado.nextLine();
                    if (sn.getEmpleado(dni) != null) {
                        System.out.println(sn.getEmpleado(dni));
                    } else {
                        System.out.println("No se ha encontrado un empleado con este dni.");
                    }
                    System.out.println("-------------------------------------");
                    break;
                    
                case 4:
                    System.out.println("4.Eliminar empleado");
                    System.out.println("Introduzca dni del empleado.");
                    if (sn.getEmpleado(dni = teclado.nextLine()) != null) {
                        sn.eliminarEmpleado(sn.getEmpleado(dni));
                        System.out.println("Empleado eliminado.");
                    } else {
                        System.out.println("No se ha encontrado un empleado con este dni.");
                    }
                    System.out.println("-------------------------------------");
                    break;

                case 5:
                    for (Empleado empleado1 : sn.listarEmpleados()) {
                        System.out.println(empleado1.toString());
                    }
                    System.out.println("-------------------------------------");
                    break;
                    
                case 6:
                    for (Empleado empleado1 : sn.listarEmpleadosPorSueldo()) {
                        System.out.println(empleado1.toString());
                    }
                    System.out.println("-------------------------------------");
                    break;
                    
                case 7:
                    for (Empleado empleado1 : sn.listarEmpleadosPorNombre()) {
                        System.out.println(empleado1.toString());
                    }
                    System.out.println("-------------------------------------");
                    break;
                    
                case 8:
                    System.out.println("8.Consultar total salarios");
                    System.out.println("Total salarios:" + sn.getTotalSalarios());
                    System.out.println("-------------------------------------");
                    break;
                    
                case 0:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    System.out.println("-------------------------------------");
            }
        } while (opcion != 0);
    }
}
