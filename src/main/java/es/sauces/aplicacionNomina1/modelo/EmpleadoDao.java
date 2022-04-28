package es.sauces.aplicacionNomina1.modelo;

import java.util.List;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public interface EmpleadoDao {
    
    List<Empleado> listar() throws DaoException;
    int insertar(List<Empleado> listado)throws DaoException;
    
}
