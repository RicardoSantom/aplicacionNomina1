package ies.sauces.aplicacionNomina1;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
/**
 *
 * @author Ricardo Santiago Tomé
 */
public class EmpleadoDaoJson implements EmpleadoDao {

    private Path path;

    public EmpleadoDaoJson(String path) {
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
     * @return
     * @throws DaoException
     */
    @Override
    public List<Empleado> listar() throws DaoException {
        Type tipo = new TypeToken<List<Empleado>>() {
        }.getType();
        RuntimeTypeAdapterFactory<Empleado> empleadoAdapter
                = RuntimeTypeAdapterFactory.of(Empleado.class, "type");
        empleadoAdapter.registerSubtype(EmpleadoFijo.class, "Fijo");
        empleadoAdapter.registerSubtype(EmpleadoEventual.class, "Eventual");
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        builder.registerTypeAdapterFactory(empleadoAdapter);
        Gson gson = builder.create();
        List<Empleado> listadoEmpleados;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            listadoEmpleados = gson.fromJson(br, tipo);
        } catch (IOException ex) {
            throw new DaoException(ex.getMessage());
        }
        return listadoEmpleados;
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        java.lang.reflect.Type tipo = new com.google.gson.reflect.TypeToken<List<Empleado>>() {
        }.getType();
        RuntimeTypeAdapterFactory<Empleado> empleadoAdapter = RuntimeTypeAdapterFactory.of(Empleado.class, "type");
        empleadoAdapter.registerSubtype(EmpleadoFijo.class, "Fijo");
        empleadoAdapter.registerSubtype(EmpleadoEventual.class, "Eventual");
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        builder.registerTypeAdapterFactory(empleadoAdapter);
        Gson gson = builder.create();

        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            gson.toJson(listado, tipo, bw);
        } catch (IOException ex) {
            throw new DaoException(ex.getMessage());
        }
        return listado.size();

    }

}
