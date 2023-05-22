/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author josej
 */
public class ModeloEmpleados extends AbstractTableModel{
    
    private ArrayList<Object[]> datos;
String nombreCol[] = {"ID","Nombre","Apellido paterno","Apellido materno","Puesto","Correo"};

    public ModeloEmpleados (ArrayList d){
     datos = d;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreCol.length;
    }

    @Override
    public Object getValueAt(int r, int c) {
        return datos.get(r)[c];
    }
    
    public String getColumName(int i){
     return nombreCol[i];
    }
    
}
