/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author HP
 */
public class GestionCeldas extends DefaultTableCellRenderer {


    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        c.setForeground(new java.awt.Color(0, 0, 0));
        c.setFont(new java.awt.Font("Verdana", 0, 12));
        c.setBackground(table.getBackground()); 
        
        if(value instanceof Number){
            Number nmr= (Number) value;
            setHorizontalAlignment(JLabel.CENTER);
            setText(value.toString());
        }
        if (value instanceof JButton) {
            table.setRowHeight(25);
            JButton btn = (JButton) value;
            btn.setBorderPainted(false);
            return btn;
        }
        if( value instanceof JLabel){
            JLabel lbl = (JLabel)value;
            lbl.setFont(new java.awt.Font("Verdana",1,12));
            lbl.setForeground(new java.awt.Color(0,0,1));
            table.setRowHeight(40);
            table.getColumnModel().getColumn(column).setPreferredWidth(50);
            return lbl;
        }
        if( value instanceof JTextField){
            JTextField txt = (JTextField)value;
            return txt;
        }
        

        return c;
    }

}
