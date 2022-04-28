package es.sauces.aplicacionNomina1.modelo;


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*import java.util.logging.Level;
import java.util.logging.Logger;*/

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoDaoObj implements EmpleadoDao{
    private Path path;

    public EmpleadoDaoObj(String path) {
        this.path = Paths.get(path);
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
    /**
     * Metodo que devuelve una lista de empleados que se han añadido al sistema
     * @return Devuelve una lista de empleados que se han añadido al sistema
     * @throws DaoException 
     */
    @Override
    public List<Empleado> listar() throws DaoException {
        List<Empleado> listado=new ArrayList<>();
        try(InputStream is=Files.newInputStream(path);
            ObjectInputStream entrada=new ObjectInputStream(is)){
            while(is.available()>0){
                listado.add((Empleado)entrada.readObject());
            }
        } catch (ClassNotFoundException | IOException ex) {
            throw new DaoException(ex.getMessage());
        }
        return listado;
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        try(ObjectOutputStream salida=new ObjectOutputStream(Files.newOutputStream(path))){
           for(Empleado e:listado){
               salida.writeObject(e);
           }
        } catch (IOException ex) { 
       throw new DaoException(ex.getMessage());
       } 
        return listado.size();
    }
    
}
