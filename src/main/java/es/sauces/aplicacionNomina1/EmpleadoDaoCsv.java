package es.sauces.aplicacionNomina1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoDaoCsv implements EmpleadoDao {

    private Path path;
    Dni dniCopia;
    

    @Override
    public List<Empleado> listar() throws DaoException {
        List<Empleado> listado=new ArrayList<>();
        String linea;
        String tokens[];
        Empleado empleado;
        String dni,nombre;
        float salario,salarioHora;
        int horas;
        try(BufferedReader entrada= Files.newBufferedReader(path)){
            linea=entrada.readLine();
            while(linea!=null){
                tokens=linea.split(",");
                if(tokens[0].equalsIgnoreCase("EmpleadoFijo")){
                    /*dni=tokens[1];*/
                    dniCopia= Dni.valueOf(tokens[1]);
                    nombre=tokens[2];
                    salario=Float.parseFloat(tokens[3]);
                    empleado=new EmpleadoFijo(dniCopia, nombre, salario);
                }else{
                     dniCopia=Dni.valueOf(tokens[1]);
                    nombre=tokens[2];
                    salarioHora=Float.parseFloat(tokens[3]);
                    horas=Integer.parseInt(tokens[4]);
                    empleado=new EmpleadoEventual(dniCopia, nombre, salarioHora, horas);
                }
                listado.add(empleado);
                linea=entrada.readLine();
            }
            
        }catch (IOException ex) {
           throw new DaoException(ex.getMessage());
        }catch(DniException de){
            throw new DaoException(de.getMessage());
        }catch(Exception ex){
            throw new DaoException("Formato incorrecto");
        }
        
        return listado;

    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        try (BufferedWriter salida = Files.newBufferedWriter(path)) {
            for(Empleado e : listado){
                salida.write(e.getClass().getSimpleName()+","+e.toString());
                salida.newLine();
            }
        } catch (IOException ex) {
            throw new DaoException(ex.getMessage());
        }catch(Exception ex){
            throw new DaoException("Formato incorrecto");
        }
        return listado.size();
    }

    public EmpleadoDaoCsv(String path) {
        this.path= Paths.get(path);
    }
}
