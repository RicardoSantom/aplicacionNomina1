/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sauces.aplicacionNomina1.vista;

import es.sauces.aplicacionNomina1.modelo.Empleado;
import es.sauces.aplicacionNomina1.modelo.EmpleadoEventual;
import es.sauces.aplicacionNomina1.modelo.EmpleadoFijo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class EmpleadoTableModel extends AbstractTableModel {

    private List<Empleado> listado;
    private String[] columnas;

    public EmpleadoTableModel() {
        this.listado = new ArrayList<>();
        this.columnas = new String[]{"DNI", "NOMBRE", "SALARIO", "HORAS", "INGRESOS"};
    }

    /*public List<Empleado> getListado() {
        return listado;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }*/

    public void setListado(List<Empleado> listado) {
        this.listado = listado;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listado.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object o = null;
        Empleado e = listado.get(rowIndex);
        switch (columnIndex) {
            case 0:
                o = e.getDni();
                break;
            case 1:
                o = e.getNombre();
                break;
            case 2:
                if (e instanceof EmpleadoFijo) {
                    o = ((EmpleadoFijo) e).getSalario();
                } else {
                    o = ((EmpleadoEventual) e).getSalarioHora();
                }
                break;
            case 3:
                if (e instanceof EmpleadoEventual) {
                    o = ((EmpleadoEventual) e).getHoras();
                } else {
                    o = 0;
                }
                break;
            case 4:
                o = e.ingresos();
                break;

        }

        return o;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?> clase = null;
        switch (columnIndex) {
            case 0:
                clase = String.class;
                break;
            case 1:
                clase = String.class;
                break;
            case 2:
                clase = Float.class;
                break;
            case 3:
                clase = Integer.class;
                break;
            case 4:
                clase = Float.class;
                break;
        }
        return clase;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

}
