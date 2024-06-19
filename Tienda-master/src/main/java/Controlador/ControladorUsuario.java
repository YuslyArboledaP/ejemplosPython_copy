/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloUsuario;
import Vista.Nuevo_Usuario;
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
public class ControladorUsuario implements ActionListener {

    Nuevo_Usuario nuevo = new Nuevo_Usuario();
    Principal prin = new Principal();
    ModeloUsuario usu = new ModeloUsuario();
//    

    public ControladorUsuario() {
        nuevo.getBtnGuardar().addActionListener(this);
        nuevo.getBtnMostrar().addActionListener(this);
        nuevo.getBtnCancelar().addActionListener(this);
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierrar el programa para que permita abrir o volver a la ventana principal
        nuevo.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciar(1);
            }
        });
    }

    public void control() {
        /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/

        nuevo.setLocationRelativeTo(null);//Centra la vista
        nuevo.setVisible(true);

        //Lleno el combobox de sexo
        nuevo.getJcvsexo().addItem("Seleccione...");
        Map<String, Integer> dato = usu.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getJcvsexo().addItem(sexo);
        }
        //Lleno el combobox de rol
        nuevo.getCbxCargo().addItem("Seleccione...");
        Map<String, Integer> datos = usu.llenarCombo("rol");
        for (String rol : datos.keySet()) {
            nuevo.getCbxCargo().addItem(rol);
        }
        //Lleno el combobox de tipo documento
        nuevo.getJcTipo().addItem("Seleccione...");
        Map<String, Integer> datoT = usu.llenarCombo("tipodoc");
        for (String tipo : datoT.keySet()) {
            nuevo.getJcTipo().addItem(tipo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nuevo.getBtnMostrar())) {
            if (nuevo.getJpfClave().getEchoChar() == '\u2022') {
                nuevo.getJpfClave().setEchoChar((char) 0);
                nuevo.getBtnMostrar().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo-cruzado.png")));
            } else {
                nuevo.getJpfClave().setEchoChar('\u2022');
                nuevo.getBtnMostrar().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo.png")));
            }
        }

        if (e.getSource().equals(nuevo.getBtnGuardar())) {
            if (nuevo.getTxtDocumento().getText().isEmpty() || nuevo.getTxtNombre().getText().isEmpty() || nuevo.getTxtCorreo().getText().isEmpty()
                    || nuevo.getTxtDireccion().getText().isEmpty() || nuevo.getTxtLogin().getText().isEmpty() || nuevo.getTxtTelefono().getText().isEmpty()
                    || nuevo.getJcvsexo().getSelectedItem().equals("Seleccione...") || nuevo.getCbxCargo().getSelectedItem().equals("Seleccione...")
                    || nuevo.getJdFecha().getDate() == null || nuevo.getJpfClave().getPassword() == null || nuevo.getJcTipo().getSelectedItem().equals("Seleccione...")) {
                JOptionPane.showMessageDialog(null, "Debe completar los campos requeridos...");
            } else {
                //Combobox
                String valorSexo = nuevo.getJcvsexo().getSelectedItem().toString();//
                int sexo = usu.llenarCombo("sexo").get(valorSexo);
                String valorRol = nuevo.getCbxCargo().getSelectedItem().toString();//
                int rol = usu.llenarCombo("rol").get(valorRol);
                String valorTipo = nuevo.getCbxCargo().getSelectedItem().toString();//
                int tipo = usu.llenarCombo("rol").get(valorTipo);
                //Seleccion de fecha, Cambiando al formato de fecha que entiende sql
                java.util.Date fec = nuevo.getJdFecha().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                //Contraseña
                char[] contra = nuevo.getJpfClave().getPassword();
                String contrasena = String.valueOf(contra);
                usu.setTip(tipo);
                usu.setDoc(Integer.parseInt(nuevo.getTxtDocumento().getText()));
                usu.setNom(nuevo.getTxtNombre().getText());
                usu.setFec(fecha);
                usu.setTel(nuevo.getTxtTelefono().getText());
                usu.setCor(nuevo.getTxtCorreo().getText());
                usu.setDir(nuevo.getTxtDireccion().getText());
                usu.setSex(sexo);
                usu.setRol(rol);
                usu.setLo(nuevo.getTxtLogin().getText());
                usu.setCl(contrasena);

                if (nuevo.getBtnGuardar().getText().equals("Guardar")) {
                    usu.insertarUsuario();
                    usu.limpiar(nuevo.getJpusuario().getComponents());
                } else {
                    usu.actualizarUsuario();
                    nuevo.setVisible(false);
                    nuevo.dispose();
                }
            }
        }
        if(e.getSource().equals(nuevo.getBtnCancelar())){
            nuevo.dispose();
        }
    }

    void actualizarUsuario(int doc) {
        usu.buscarUsuario(doc);
        nuevo.getTxtDocumento().setEnabled(false);
        nuevo.getTxtLogin().setEnabled(false);
        nuevo.getJcTipo().setEnabled(false);
        nuevo.getTxtDocumento().setText(String.valueOf(doc));
        nuevo.getTxtCorreo().setText(usu.getCor());
        nuevo.getTxtNombre().setText(usu.getNom());
        nuevo.getTxtDireccion().setText(usu.getDir());
        nuevo.getTxtTelefono().setText(usu.getTel());
        nuevo.getTxtLogin().setText(usu.getLo());
        nuevo.getJpfClave().setText(usu.getCl());
        nuevo.getJdFecha().setDate(usu.getFec());
        //Llenar el sexo
        Map<String, Integer> dato = usu.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getJcvsexo().addItem(sexo);
        }
//        //Obtener el valor guardado en la base de datos
        String valorSexo = usu.obtenerSeleccion(dato, usu.getSex());
        nuevo.getJcvsexo().setSelectedItem(valorSexo);
//        
        //Llenar el cargo
        Map<String, Integer> datos = usu.llenarCombo("rol");
        for (String rol : datos.keySet()) {
            nuevo.getCbxCargo().addItem(rol);
        }
        String valorRol = usu.obtenerSeleccion(datos, usu.getRol());
        nuevo.getCbxCargo().setSelectedItem(valorRol);
//        
        Map<String, Integer> datoT = usu.llenarCombo("tipodoc");
        for (String tipo : datoT.keySet()) {
            nuevo.getJcTipo().addItem(tipo);
        }
        String valorTipo = usu.obtenerSeleccion(datoT, usu.getTip());
        nuevo.getJcTipo().setSelectedItem(valorTipo);
//        
        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Usuario",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Verdana", 1, 18), new java.awt.Color(153, 0, 153));
        nuevo.getJpusuario().setBorder(borde);
//        prin.setVisible(false);
        nuevo.setLocationRelativeTo(null);
        nuevo.getBtnGuardar().setText("Actualizar");
        nuevo.setVisible(true);
    }

    void eliminarUsuario(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al usuario? \n" + doc,
                "Eliminar Usuario", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            usu.setDoc(doc);
            usu.eliminarUsuario();
        }
    }

}
