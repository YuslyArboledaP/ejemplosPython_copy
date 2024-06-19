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
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

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

    public void proveedor() {
        /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/

        prin.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
        nuevo.setLocationRelativeTo(null);//Centra la vista
        nuevo.setVisible(true);

        //Lleno el combobox de sexo
        nuevo.getJcsexoPro().addItem("Seleccione...");
        Map<String, Integer> dato = pro.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getJcsexoPro().addItem(sexo);
        }
        nuevo.getJcTipo().addItem("Seleccione...");
        Map<String, Integer> datot = pro.llenarCombo("tipodoc");
        for (String tipo_d : datot.keySet()) {
            nuevo.getJcTipo().addItem(tipo_d);
        }
        nuevo.getJcPersona().addItem("Seleccione...");
        Map<String, Integer> datop = pro.llenarCombo("tipoper");
        for (String pers : datop.keySet()) {
            nuevo.getJcPersona().addItem(pers);
        }
    }

    void actualizarProveedor(int doc) {
        pro.buscarProveedor(doc);
        nuevo.getTxtDocPro().setEnabled(false);
        nuevo.getJcTipo().setEnabled(false);
        nuevo.getTxtDocPro().setText(pro.getDoc());
        nuevo.getTxtCorreo().setText(pro.getCor());
        nuevo.getTxtNombre().setText(pro.getNom());
        nuevo.getTxtDireccion().setText(pro.getDir());
        nuevo.getTxtTelefono().setText(pro.getTel());
        nuevo.getJdFecha().setDate(pro.getFec());
        //Llenar el sexo
        Map<String, Integer> dato = pro.llenarCombo("sexo");
        for (String sexo : dato.keySet()) {
            nuevo.getJcsexoPro().addItem(sexo);
        }
//        //Obtener el valor guardado en la base de datos
        String valorSexo = pro.obtenerSeleccion(dato, pro.getSex());
        nuevo.getJcsexoPro().setSelectedItem(valorSexo);

        Map<String, Integer> datoT = pro.llenarCombo("tipodoc");
        for (String tipo : datoT.keySet()) {
            nuevo.getJcTipo().addItem(tipo);
        }
        String valorTipo = pro.obtenerSeleccion(datoT, pro.getTipo_doc());
        nuevo.getJcTipo().setSelectedItem(valorTipo);
        
        Map<String, Integer> datoP = pro.llenarCombo("tipoper");
        for (String tipo : datoP.keySet()) {
            nuevo.getJcPersona().addItem(tipo);
        }
        String valorPerso = pro.obtenerSeleccion(datoP, pro.getPer());
        nuevo.getJcPersona().setSelectedItem(valorPerso);

        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Proveedor",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Verdana", 1, 18), new java.awt.Color(153, 0, 153));
        nuevo.getJpproveedor().setBorder(borde);
        prin.setVisible(false);
        nuevo.setLocationRelativeTo(null);
        nuevo.getBtnGuardar().setText("Actualizar");
        nuevo.setVisible(true);
    }

    void eliminarProveedor(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al Proveedor? \n" + doc,
                "Eliminar Proveedor", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            pro.setId(doc);
            pro.eliminarProveedor();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(nuevo.getBtnGuardar())) {
            if (nuevo.getTxtDocPro().getText().isEmpty() || nuevo.getTxtNombre().getText().isEmpty() || nuevo.getTxtCorreo().getText().isEmpty()
                    || nuevo.getTxtDireccion().getText().isEmpty() || nuevo.getTxtTelefono().getText().isEmpty()
                    || nuevo.getJcsexoPro().getSelectedItem().equals("Seleccione...") || nuevo.getJcPersona().getSelectedItem().equals("Seleccione...")
                    || nuevo.getJdFecha().getDate() == null || nuevo.getJcTipo().getSelectedItem().equals("Seleccione...")) {
                JOptionPane.showMessageDialog(null, "Debe completar los campos requeridos...");
            } else {
                //Combobox
                String valorSexo = nuevo.getJcsexoPro().getSelectedItem().toString();//
                int sexo = pro.llenarCombo("sexo").get(valorSexo);

                String valorTipo = nuevo.getJcTipo().getSelectedItem().toString();//
                int tipo = pro.llenarCombo("tipodoc").get(valorTipo);

                String valorPer = nuevo.getJcPersona().getSelectedItem().toString();//
                int pers = pro.llenarCombo("tipoper").get(valorPer);

                //Seleccion de fecha, Cambiando al formato de fecha que entiende sql
                java.util.Date fec = nuevo.getJdFecha().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                pro.setDoc(nuevo.getTxtDocPro().getText());
                pro.setNom(nuevo.getTxtNombre().getText());
                pro.setFec(fecha);
                pro.setTel(nuevo.getTxtTelefono().getText());
                pro.setCor(nuevo.getTxtCorreo().getText());
                pro.setDir(nuevo.getTxtDireccion().getText());
                pro.setSex(sexo);
                pro.setPer(pers);
                pro.setTipo_doc(tipo);
                 if (nuevo.getBtnGuardar().getText().equals("Guardar")) {
                     pro.insertarProveedor();
                     pro.limpiar(nuevo.getJpproveedor().getComponents());
                } else {
                    pro.actualizarProveedor();
                    nuevo.setVisible(false);
                    nuevo.dispose();
                }
               
            }
        }
        if(e.getSource().equals(nuevo.getBtnCancelar())){
            nuevo.dispose();
        }

    }
}
