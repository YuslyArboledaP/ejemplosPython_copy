/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloCliente;
import Vista.Nuevo_Cliente;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class ControladorCliente implements ActionListener {

    Nuevo_Cliente nuevo = new Nuevo_Cliente();
    Principal prin = new Principal();
    ModeloCliente cli = new ModeloCliente();

    public ControladorCliente() {
        nuevo.getBtnGuardar().addActionListener(this);
        nuevo.getBtnCancelar().addActionListener(this);
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal contPrin = new ControladorPrincipal();
                contPrin.iniciar(2);
            }
        });
    }

    public void cliente() {
        nuevo.setLocationRelativeTo(null);//Centra la vista
        nuevo.setVisible(true);
        nuevo.getJcTipo().addItem("Seleccione...");
        Map<String, Integer> datos = cli.llenarCombo("tipodoc");
        for (String tipo : datos.keySet()) {
            nuevo.getJcTipo().addItem(tipo);
        }
        nuevo.getCsexo().addItem("Selecione...");
        Map<String, Integer> dato = cli.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getCsexo().addItem(sexo);
        }
    }

    void actualizarCliente(int doc) {
        cli.buscarCliente(doc);
        nuevo.getTxtDoc().setEnabled(false);
        nuevo.getJcTipo().setEnabled(false);
        nuevo.getTxtDoc().setText(String.valueOf(doc));
        nuevo.getTxtCorreo().setText(cli.getCor());
        nuevo.getTxtNombre().setText(cli.getNom());
        nuevo.getTxtDireccion().setText(cli.getDir());
        nuevo.getTxtTelefono().setText(cli.getTel());
        nuevo.getJdFecha().setDate(cli.getFe());
        //Llenar el sexo
        Map<String, Integer> dato = cli.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getCsexo().addItem(sexo);
        }
//        //Obtener el valor guardado en la base de datos
        String valorSexo = cli.obtenerSeleccion(dato, cli.getSex());
        nuevo.getCsexo().setSelectedItem(valorSexo);

        Map<String, Integer> datoT = cli.llenarCombo("tipodoc");
        for (String tipo : datoT.keySet()) {
            nuevo.getJcTipo().addItem(tipo);
        }
        String valorTipo = cli.obtenerSeleccion(datoT, cli.getTip());
        nuevo.getJcTipo().setSelectedItem(valorTipo);

        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Cliente",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Verdana", 1, 18), new java.awt.Color(153, 0, 153));
        nuevo.getJpCliente().setBorder(borde);
        prin.setVisible(false);
        nuevo.setLocationRelativeTo(null);
        nuevo.getBtnGuardar().setText("Actualizar");
        nuevo.setVisible(true);
    }

    void eliminarCliente(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al Cliente? \n" + doc,
                "Eliminar Cliente", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            cli.setCed(doc);
            cli.eliminarCliente();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nuevo.getBtnGuardar())) {
            if (nuevo.getTxtDoc().getText().isEmpty() || nuevo.getTxtNombre().getText().isEmpty() || nuevo.getTxtCorreo().getText().isEmpty()
                    || nuevo.getCsexo().getSelectedItem().equals("Seleccione...") || nuevo.getTxtDireccion().getText().isEmpty() || nuevo.getTxtTelefono().getText().isEmpty()
                    || nuevo.getJdFecha().getDate() == null || nuevo.getJcTipo().getSelectedItem().equals("Seleccione...")) {
                JOptionPane.showMessageDialog(null, "Debe completar los campos requeridos...");
            } else {
                //Combobox
                String valorSexo = nuevo.getCsexo().getSelectedItem().toString();//
                int sexo = cli.llenarCombo("sexo").get(valorSexo);
                String valorTipo = nuevo.getJcTipo().getSelectedItem().toString();//
                int tipo = cli.llenarCombo("tipodoc").get(valorTipo);

                //Seleccion de fecha, Cambiando al formato de fecha que entiende sql
                java.util.Date fec = nuevo.getJdFecha().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);
                
                cli.setTip(tipo);
                cli.setCed(Integer.parseInt(nuevo.getTxtDoc().getText()));
                cli.setNom(nuevo.getTxtNombre().getText());
                cli.setFe(fecha);
                cli.setTel(nuevo.getTxtTelefono().getText());
                cli.setCor(nuevo.getTxtCorreo().getText());
                cli.setDir(nuevo.getTxtDireccion().getText());
                cli.setSex(sexo);

                if (nuevo.getBtnGuardar().getText().equals("Guardar")) {
                    cli.insertarCliente();
                    cli.limpiar(nuevo.getJpCliente().getComponents());
                } else {
                    cli.actualizarCliente();
                    nuevo.setVisible(false);
                    nuevo.dispose();
                }
            }
        }
        if (e.getSource().equals(nuevo.getBtnCancelar())) {
            nuevo.dispose();
        }
    }


}
