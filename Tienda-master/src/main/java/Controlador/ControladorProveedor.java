/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloProveedor;
import Vista.Nuevo_Proveedor;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ControladorProveedor implements ActionListener {

    Nuevo_Proveedor nuevo = new Nuevo_Proveedor();
    Principal prin = new Principal();
    ModeloProveedor pro = new ModeloProveedor();

    public ControladorProveedor() {
        nuevo.getBtnGuardar().addActionListener(this);
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierrar el programa para que permita abrir o volver a la ventana principal
        nuevo.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciar(3);
            }
        });
    }

    public void control() {
        /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/

        prin.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
        nuevo.setLocationRelativeTo(null);//Centra la vista
        nuevo.setVisible(true);

        //Lleno el combobox de sexo
        nuevo.getJcsexoPro().addItem("Seleccione...");
        Map<String, Integer> dato = pro.llenarCombo();
        for (String sexo : dato.keySet()) {
            nuevo.getJcsexoPro().addItem(sexo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(nuevo.getBtnGuardar())) {
            if (nuevo.getTxtDocPro().getText().isEmpty() || nuevo.getTxtNombre().getText().isEmpty() || nuevo.getTxtCorreo().getText().isEmpty()
                    || nuevo.getTxtDireccion().getText().isEmpty() || nuevo.getTxtTelefono().getText().isEmpty()
                    || nuevo.getJcsexoPro().getSelectedItem().equals("Seleccione...") || nuevo.getJcPersona().getSelectedItem().equals("Seleccione...")
                    || nuevo.getJdFecha().getDate() == null ||nuevo.getJcTipo().getSelectedItem().equals("Seleccione...")) {
                JOptionPane.showMessageDialog(null, "Debe completar los campos requeridos...");
            } else {
                //Combobox
                String valorSexo = nuevo.getJcsexoPro().getSelectedItem().toString();//
                int sexo = pro.llenarCombo().get(valorSexo);
                
                //Seleccion de fecha, Cambiando al formato de fecha que entiende sql
                java.util.Date fec = nuevo.getJdFecha().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                pro.setDoc(Integer.parseInt(nuevo.getTxtDocPro().getText()));
                pro.setNom(nuevo.getTxtNombre().getText());
                pro.setFec(fecha);
                pro.setTel(nuevo.getTxtTelefono().getText());
                pro.setCor(nuevo.getTxtCorreo().getText());
                pro.setDir(nuevo.getTxtDireccion().getText());
                pro.setSex(sexo);
                pro.setNit(nuevo.getJcTipo().getSelectedItem().toString());
                pro.setPer(Integer.parseInt(nuevo.getJcPersona().getSelectedItem().toString()));
               

                pro.insertarProveedor();
                pro.limpiar(nuevo.getJpproveedor().getComponents());
            }

        }

    }

}
