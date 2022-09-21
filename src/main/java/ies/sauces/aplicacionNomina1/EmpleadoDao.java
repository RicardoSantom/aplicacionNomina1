package ies.sauces.aplicacionNomina1;

import java.util.List;

/**
 *
 * @author Ricardo Santiago Tomé
 */
public interface EmpleadoDao {
    
    List<Empleado> listar() throws DaoException;
    int insertar(List<Empleado> listado)throws DaoException;
    
}
