/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloProveedor;
import Vista.Nuevo_Cliente;
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
public class ControladorCliente implements ActionListener {

    Nuevo_Cliente nuevo = new Nuevo_Cliente();
    Principal prin = new Principal();
    ModeloCliente cli = new ModeloCliente();

    public ControladorCliente() {
        nuevo.getBtnGuardar().addActionListener(this);
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e){
                ControladorPrincipal contPrin = new ControladorPrincipal();
                contPrin.iniciar(2);
            }
        });
    }
    public void cliente(){
        nuevo.setLocationRelativeTo(null);//Centra la vista
        nuevo.setVisible(true);
        nuevo.getJcTipo().addItem("seleccione...");
        Map<String,Integer>datos=cli.llenarCombo("tipodoc");
        for(String tipo:datos.keySet()){
            nuevo.getJcTipo().addItem(tipo);
        }
        nuevo.getCsexo().addItem("Selecione...");
        Map<String,Integer>dato= cli.llenarCombo("sexo");
        for(String sexo:dato.keySet()){
            nuevo.getCsexo().addItem(sexo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nuevo.getBtnGuardar())) {
            if (nuevo.getTxtDoc().getText().isEmpty() || nuevo.getTxtNombre().getText().isEmpty() || nuevo.getTxtCorreo().getText().isEmpty()
                    ||nuevo.getCsexo().getSelectedItem().equals("Seleccione...")|| nuevo.getTxtDireccion().getText().isEmpty() || nuevo.getTxtTelefono().getText().isEmpty()
                    || nuevo.getJdFecha().getDate() == null || nuevo.getJcTipo().getSelectedItem().equals("Seleccione...")) {
                JOptionPane.showMessageDialog(null, "Debe completar los campos requeridos...");
            } else {
                //Combobox
                String valorSexo = nuevo.getCsexo().getSelectedItem().toString();//
                int sexo = cli.llenarCombo("sexo").get(valorSexo);

                //Seleccion de fecha, Cambiando al formato de fecha que entiende sql
                java.util.Date fec = nuevo.getJdFecha().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                cli.setCed(Integer.parseInt(nuevo.getTxtDoc().getText()));
                cli.setNom(nuevo.getTxtNombre().getText());
                cli.setFe(fecha);
                cli.setTel(nuevo.getTxtTelefono().getText());
                cli.setCor(nuevo.getTxtCorreo().getText());
                cli.setDir(nuevo.getTxtDireccion().getText());
                cli.setSex(sexo);

                cli.insertarCliente();
                cli.limpiar(nuevo.getJpCliente().getComponents());
            }

        }
    }

}
