/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author HP
 */
public class GestionEncabezado implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, 
            Object value, boolean isSelected, boolean hasFocus, 
            int row, int column) {
        JComponent encabezado = null;
        encabezado = new JLabel((String)value);
        
        ((JLabel)encabezado).setHorizontalAlignment(SwingConstants.CENTER);//centrar los titulos de los encabezados
        Object  cellValue = value;
        encabezado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153,0,153)));
        encabezado.setForeground(new java.awt.Color(153,0,153));
        encabezado.setFont(new java.awt.Font("Verdana",1,12));
        return encabezado;
    }
    
}
