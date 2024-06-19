/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloProducto;
import Vista.Principal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class ControladorProducto {

    ModeloProducto modProd = new ModeloProducto();
    Principal prin = new Principal();

    public ControladorProducto() {
    }

    void actualizarProducto(int id) {
//        modPro.buscarProducto(id);
//        System.out.println(modPro.getRuta());
//       
//        prin.getTxtNomProd().setText(modPro.getNom());
//        prin.getTxaDescPro().setText(modPro.getDes());
//        File file = new File(modPro.getRuta());
//        String archivo = file.getName();
//        prin.getTxtImaPro().setText(archivo);

//        
        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Producto",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Verdana", 1, 18), new java.awt.Color(153, 0, 153));
        prin.getJpNuevoProducto().setBorder(borde);
        prin.getBtnGuardarPro().setText("Actualizar");

    }

    void buscarProducto(int id) {
        JButton cancelar = new JButton("Cancelar");
        modProd.buscarProducto(modProd.getId());

        prin.getTxtNomProd().setText(modProd.getNom());
        prin.getTxaDescPro().setText(modProd.getDes());
        File file = new File(modProd.getRuta());
        String archivo = file.getName();
        prin.getTxtImaPro().setText(archivo);
//                    prin.getJpNuevoProducto().setBorder(titulo("Actualizar Producto"));
        prin.getJpNuevoProducto().add(cancelar);
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png")));
        cancelar.setBounds(1186, 50, 110, 23);

        prin.getBtnGuardarPro().setText("Actualizar");

        cancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modProd.limpiar(prin.getJpNuevoProducto().getComponents());
//                            prin.getJpNuevoProducto().setBorder(titulo("Nuevo Producto"));                            
                cancelar.setVisible(false);
            }
        });
        //Obligamos que la interfaz se reinicie
        prin.getJpNuevoProducto().revalidate();
        prin.getJpNuevoProducto().repaint();
    }

}
