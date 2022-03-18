package es.sauces.aplicacionNomina1;


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class EmpleadoDaoObj implements EmpleadoDao{
    private Path path;

    public EmpleadoDaoObj(Path path) {
        this.path = path;
    }

   
    
    

    @Override
    public List<Empleado> listar() throws DaoException {
        List<Empleado> listado=new ArrayList<>();
        try(InputStream is=Files.newInputStream(path);ObjectInputStream entrada=new ObjectInputStream(is);){
            
            while(is.available()>0){
                
            }
        
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return listado;
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        try(ObjectOutputStream salida=new ObjectOutputStream(Files.newOutputStream(path))){
           for (Empleado e : listado){
               salida.writeObject(e);
           }
        }catch(IOException ex){
            throw new DaoException(ex.getMessage());
        }
        return listado.size();
    }
    
}
