package es.sauces.aplicacionNomina1;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoDaoXml implements EmpleadoDao {

    private Path path;

    public EmpleadoDaoXml(String path) {
        this.path = Paths.get(path);
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    /**
     *
     * @return @throws DaoException
     */
    @Override
    public List<Empleado> listar() throws DaoException {
        XStream xstream = new XStream(new DomDriver());
        /*XStream.setupDefaultSecurity(xstream);*/
        xstream.allowTypeHierarchy(EmpleadoFijo.class);
        xstream.allowTypeHierarchy(EmpleadoEventual.class);
        List<Empleado> listadoEmpleados;
        try (BufferedReader br = Files.newBufferedReader(path);) {
            listadoEmpleados = (List<Empleado>) xstream.fromXML(br);
        } catch (IOException ex) {
            throw new DaoException(ex.getMessage());
        }
        return listadoEmpleados;
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        XStream xstream = new XStream(new DomDriver());
        //XStream.setupDefaultSecurity(xstream);
        xstream.allowTypeHierarchy(EmpleadoFijo.class);
        xstream.allowTypeHierarchy(EmpleadoEventual.class);
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            xstream.toXML(listado, bw);
        } catch (IOException ex) {
            throw new DaoException(ex.getMessage());
        }
        return listado.size();
    }

}
