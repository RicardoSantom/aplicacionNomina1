package es.sauces.aplicacionNomina1;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ricardo Santiago Tomé
 * @version 1.0
 */
public class AppNominas {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SistemaNominas sn = new SistemaNominas();
        int opcion;
        Scanner teclado = new Scanner(System.in);
        List<Empleado> listado;
        Dni dni2;
        String archivo;

        do {
            System.out.println("1.Crear empleado fijo");
            System.out.println("2.Crear empleado eventual");
            System.out.println("3.Consultar empleado");
            System.out.println("4.Eliminar empleado");
            System.out.println("5.Listar empleados (DNI)");
            System.out.println("6.Listar empleados (SUELDO)");
            System.out.println("7.Listar empleados (NOMBRE)");
            System.out.println("8.Consultar total salarios");
            System.out.println("9.Guardar empleados");
            System.out.println("10.Cargar empleados");
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
                    try {
                        System.out.println("1.Crear empleado fijo");
                        System.out.println("Introduzca dni:");
                        dni = teclado.nextLine();
                        dni2 = Dni.valueOf(dni);
                        System.out.println("Introduzca nombre:");
                        nombre = teclado.nextLine();
                        System.out.println("Introduzca salario:");
                        salario = teclado.nextFloat();
                        if (sn.incluirEmpleado(new EmpleadoFijo(dni2, nombre, salario))) {
                            System.out.println("Empleado incluido en el sistema:");
                        } else {
                            System.out.println("No se ha podido incluir al empleado en el sistema:");
                        }

                    } catch (DniException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                    System.out.println("2.Crear empleado eventual");
                    System.out.println("Introduzca dni:");
                    dni = teclado.nextLine();
                    dni2 = Dni.valueOf(dni);
                    System.out.println("Introduzca nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Introduzca salarioHora:");
                    salarioHora = teclado.nextFloat();
                    System.out.println("Introduzca número de horas:");
                    horas = teclado.nextInt();
                    if (sn.incluirEmpleado(new EmpleadoEventual(dni2, nombre, salarioHora, horas))) {
                        System.out.println("Empleado incluido en el sistema.");
                    } else {
                        System.out.println("No se ha podido incluir al empleado en el sistema.");
                    }
                    System.out.println("-------------------------------------");
                } catch (DniException ex) {
                    System.out.println(ex.getMessage());
                }
                break;

                case 3:
                     try {
                    System.out.println("3.Consultar empleado");
                    System.out.println("Introduzca dni para consultar empleado.");
                    dni = teclado.nextLine();
                    dni2 = Dni.valueOf(dni);
                    if (sn.getEmpleado(dni2) != null) {
                        System.out.println(sn.getEmpleado(dni2));
                    } else {
                        System.out.println("No se ha encontrado un empleado con este dni.");
                    }
                    System.out.println("-------------------------------------");
                } catch (DniException ex) {
                    System.out.println(ex.getMessage());
                }
                break;

                case 4:
                    try {
                    System.out.println("4.Eliminar empleado");
                    System.out.println("Introduzca dni del empleado.");
                    Empleado desempleado;
                    dni = teclado.nextLine();
                    dni2 = Dni.valueOf(dni);
                    desempleado = sn.getEmpleado(dni2);
                    System.out.println(desempleado);
                    if (desempleado != null) {
                        System.out.println("¿Seguro que quiere eliminar este empleado?");
                        String salida = teclado.nextLine();
                        if (salida.equalsIgnoreCase("si")) {
                            sn.eliminarEmpleado(desempleado);
                            System.out.println("Empleado eliminado.");
                        } else {
                            System.out.println("No se ha eliminado este empleado.");
                        }
                    } else {
                        System.out.println("No se ha encontrado un empleado con este dni.");
                    }
                    System.out.println("-------------------------------------");
                } catch (DniException ex) {
                    System.out.println(ex.getMessage());
                }
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

                case 9:
                    System.out.println("9.Guardar empleados");
                    System.out.println("Para guardar empleados introduzca el nombre del archivo de destino:");
                    archivo = teclado.nextLine();
                    EmpleadoDao ed;
                    int posicion = archivo.lastIndexOf(".") + 1;
                    String extension = archivo.substring(posicion);
                    switch (extension) {
                        case "csv":
                            ed = new EmpleadoDaoCsv(extension);
                            break;
                        /*case "obj":
                            ed = new EmpleadoDaoObj(extension);
                            break;
                        case "xml":
                            ed = new EmpleadoDaoXml(extension);
                            break;
                        case "json":
                            ed = new EmpleadoDaoJson(extension);
                            break;*/
                    }
                    sn.setEmpleadoDao(new EmpleadoDaoCsv(archivo));
                    try {
                        /*EmpleadoDaoCsv empleadoDao = new EmpleadoDaoCsv(archivo);*/
                        sn.guardarEmpleados();
                    } catch (DaoException ex) {
                        System.out.println(ex/*.getMessage()*/);
                    }
                    break;

                case 10:
                    System.out.println("10.Cargar empleados");
                    System.out.println("Para cargar empleados introduzca el nombre del archivo origen:");
                    archivo = teclado.nextLine();
                    try {
                        sn.setEmpleadoDao(new EmpleadoDaoCsv(archivo));
                        sn.cargarEmpleados();
                    } catch (DaoException ex) {
                        System.out.println(ex/*.getMessage()*/);
                    }
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
