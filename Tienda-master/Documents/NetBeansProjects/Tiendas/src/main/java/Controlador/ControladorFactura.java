/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloFactura;
import Modelo.ModeloProducto;
import Modelo.ModeloProveedor;
import Modelo.ModeloUsuario;
import Vista.Buscar;
import Vista.DetalleFactura;
import Vista.Ver_Detalle;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author HP
 */
public class ControladorFactura implements ActionListener, DocumentListener {

    Buscar bus = new Buscar();
    ModeloUsuario modUsu = new ModeloUsuario();
    ModeloProveedor modPro = new ModeloProveedor();
    ModeloFactura modFac = new ModeloFactura();
    DetalleFactura det = new DetalleFactura();
    ModeloProducto modProd = new ModeloProducto();
    Ver_Detalle ver = new Ver_Detalle();

    public ControladorFactura() {
        bus.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        det.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ver.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        det.getBtnFacPro().addActionListener(this);
        det.getBtnProducto().addActionListener(this);

        bus.getTxtBuscar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bus.getTxtBuscar().setText("");
                bus.getTxtBuscar().setForeground(Color.BLACK);
            }
        });
        bus.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal contPrin = new ControladorPrincipal();
                contPrin.iniciar(4);
            }

        });
        det.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal contPrin = new ControladorPrincipal();
                contPrin.iniciar(4);
            }

        });
        ver.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal contPrin = new ControladorPrincipal();
                contPrin.iniciar(4);
            }

        });

    }

    public void buscar(String buscar, String usua, String pro, String nomUsu, String nomPro) {

        bus.getLblbuscar().setText(buscar);
        if (buscar.equals("Usuario")) {
            modUsu.mostrarTablaUsuario(bus.getJtBuscar(), "", "factura");
        } else {
            modPro.mostrarTablaProveedor(bus.getJtBuscar(), "", "factura");
        }
        bus.setLocationRelativeTo(null);
        bus.setVisible(true);
        bus.getJtBuscar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = bus.getJtBuscar().rowAtPoint(e.getPoint());
                int columna = bus.getJtBuscar().columnAtPoint(e.getPoint());
                int docum = buscar.equals("Usuario") ? Integer.parseInt(bus.getJtBuscar().getValueAt(fila, 1).toString()) : Integer.parseInt(bus.getJtBuscar().getValueAt(fila, 0).toString());
                String nom = buscar.equals("Usuario") ? bus.getJtBuscar().getValueAt(fila, 2).toString() : bus.getJtBuscar().getValueAt(fila, 3).toString();
                int num_co = buscar.equals("Usuario") ? 9 : 10;
                if (columna == num_co) {
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas agregar al " + buscar + "?\n"
                            + docum + " " + nom, "Aceptar", JOptionPane.YES_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        ControladorPrincipal contPrin = new ControladorPrincipal();
                        if (buscar.equals("Usuario")) {
                            contPrin.CompraVenta(4, String.valueOf(docum), pro, nom, nomPro);
                        } else {
                            contPrin.CompraVenta(4, usua, String.valueOf(docum), nomUsu, nom);
                        }
                        bus.setVisible(false);
                    }
                }
            }
        });
    }

    public void detalle_factura(int fact) {
        det.getCbTipo().addItem("Seleccionar");
        Map<String, Integer> dato = modFac.llenarCombo("tipopa");
        for (String sexo : dato.keySet()) {
            det.getCbTipo().addItem(sexo);
        }
        det.getLblFactDeta().setText(String.valueOf(fact));
        det.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        det.setLocationRelativeTo(null);
        det.setVisible(true);
    }

    public void ver_Factura(int fact) {
        String dato[]= modFac.buscarFacturaDetalle(fact,ver.getJtDetalle_Fact());
        ver.getDet_Fac().setText(String.valueOf(fact));
        ver.getDet_Prov().setText(dato[1]);
        ver.getDet_Usu().setText(dato[2]);
        ver.getDet_Tipo_pago().setText(dato[3]);
        ver.getDet_Compro().setText(dato[4]);
        ver.getDet_Fec().setText(dato[5]);
        ver.getDet_Imp().setText(dato[6]);
        ver.getDet_total().setText(dato[7]);
        ver.setLocationRelativeTo(null);
        ver.setVisible(true);
    }
    private void gestionarDetalle() {
        System.out.println("gestion detalle");
        det.getJtDetalleFac().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = bus.getJtBuscar().rowAtPoint(e.getPoint());
                int columna = bus.getJtBuscar().columnAtPoint(e.getPoint());
                bus.getJtBuscar().setValueAt(" ", fila, 4);
                bus.getJtBuscar().setValueAt(" ", fila, 5);
            }

        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(det.getBtnFacPro())) {
            
            JButton agr = new JButton("Añadir");
            agr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir-a-la-cesta.png")));
            agr.setBounds(926, 20, 110, 23);
            bus.getJpPro().add(agr);

            bus.getLblbuscar().setText("Producto");
            bus.setLocationRelativeTo(null);
            bus.setVisible(true);
            
            modProd.mostrarTablaProducto(bus.getJtBuscar(), "", "factura");
            gestionarDetalle();
            agr.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modFac.agregarDatos(bus.getJtBuscar(), det.getJtDetalleFac());
                    bus.setVisible(false);
                }

            });
            
        }
        if (e.getSource().equals(det.getBtnProducto())) {
            JTable tabla = det.getJtDetalleFac();
            if (det.getTxtComprobante().getText().isEmpty() || det.getCbTipo().getSelectedItem().equals("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "No Indicó forma de pago o comprobante");
            } else {
                try {
                    for (int i = 0; i < tabla.getRowCount(); i++) {
                        modFac.setFac(Integer.parseInt(det.getLblFactDeta().getText()));
                        modFac.setProd(Integer.parseInt(tabla.getValueAt(i, 0).toString()));
                        modFac.setCan(Integer.parseInt(tabla.getValueAt(i, 3).toString()));
                        modFac.setValor(Float.parseFloat(tabla.getValueAt(i, 4).toString()));
                        modFac.setTipo(det.getCbTipo().getSelectedItem().toString());
                        modFac.setComp(det.getTxtComprobante().getText());
                        modFac.insertDetalleFactura();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    det.dispose();
                    JOptionPane.showMessageDialog(null, "Registro Almacenado");
                }
            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e
    ) {
        modUsu.mostrarTablaUsuario(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
        modPro.mostrarTablaProveedor(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
        modProd.mostrarTablaProducto(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
    }

    @Override
    public void removeUpdate(DocumentEvent e
    ) {
        modUsu.mostrarTablaUsuario(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
        modPro.mostrarTablaProveedor(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
        modProd.mostrarTablaProducto(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
    }

    @Override
    public void changedUpdate(DocumentEvent e
    ) {
        modUsu.mostrarTablaUsuario(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
        modPro.mostrarTablaProveedor(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
        modProd.mostrarTablaProducto(bus.getJtBuscar(), bus.getTxtBuscar().getText(), "factura");
    }

}
