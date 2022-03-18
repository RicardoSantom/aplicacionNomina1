package es.sauces.aplicacionNomina1;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw1
 */
public interface EmpleadoDao {
    
    List<Empleado> listar() throws DaoException;
    int insertar(List<Empleado> listado)throws DaoException;
    
}
