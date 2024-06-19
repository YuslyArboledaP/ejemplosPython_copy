package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloProducto;
import Modelo.ModeloProveedor;
import Modelo.ModeloUsuario;
import Vista.Principal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorPrincipal implements ActionListener, ChangeListener, DocumentListener {

    Principal prin = new Principal();//Instancia(Llama) la ventana principal
//    Nuevo_Usuario nuevo = new Nuevo_Usuario();//Instanca (Llama) la ventana(vista) Nuevo usuario
    ControladorUsuario contUsua = new ControladorUsuario();
    ControladorCliente contCli = new ControladorCliente();
    ControladorProveedor contProv = new ControladorProveedor();
    ControladorProducto contProd = new ControladorProducto();

    ModeloUsuario modUsu = new ModeloUsuario();//Instancia el modelo de 
    ModeloProveedor modProv = new ModeloProveedor();
    ModeloCliente modCli = new ModeloCliente();
    ModeloProducto modProd = new ModeloProducto();

    public ControladorPrincipal() {
        prin.getBtnNuevo().addActionListener(this);//Agrega el boton nuevo para que se escuche cuando se de clic
        prin.getBtnNueCli().addActionListener(this);
        prin.getBtnNuevoProv().addActionListener(this);
        prin.getBtnImagen().addActionListener(this);
        prin.getBtnGuardarPro().addActionListener(this);

        prin.getJtPrincipal().addChangeListener(this);

        prin.getTxtBuscar().getDocument().addDocumentListener(this);
        prin.getTxtBuscarCli().getDocument().addDocumentListener(this);
        prin.getTxtBuscarProv().getDocument().addDocumentListener(this);

    }

    public void iniciar(int valor) {
        prin.setLocationRelativeTo(null);//Centra la ventana
        prin.setTitle("Principal");//Le da titulo a la ventana
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        prin.getJtPrincipal().setSelectedIndex(valor);
        prin.setVisible(true);//Hace visible la ventana
        gestionProducto();

    }

//    public Border titulo(String tit) {
//        Border borde = BorderFactory.createTitledBorder(null, tit,
//                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION,
//                new java.awt.Font("Verdana", 1, 12), new java.awt.Color(153, 0, 153));
//        return borde;
//    }

    public void gestionProducto() {
        modProd.mostrarTablaProducto(prin.getTbProducto(), "", "producto");
        prin.getTxtBuscarProd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prin.getTxtBuscarProd().setText("");
                prin.getTxtBuscarProd().setForeground(Color.BLACK);
            }
        });
        prin.getTbProducto().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                

                int fila = prin.getTbProducto().rowAtPoint(e.getPoint());
                int columna = prin.getTbProducto().columnAtPoint(e.getPoint());
                modProd.setId(Integer.parseInt(prin.getTbProducto().getValueAt(fila, 0).toString()));

                if (columna == 6) {
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
//                    //Obligamos que la interfaz se reinicie
                    prin.getJpNuevoProducto().revalidate();
                    prin.getJpNuevoProducto().repaint();

                }
                if (columna == 7) {
                    contUsua.eliminarUsuario(modUsu.getDoc());
                    modUsu.mostrarTablaUsuario(prin.getTbUsuario(), "", "usuario");
                }

            }

        });
    }

    public void gestionUsuario() {

        modUsu.mostrarTablaUsuario(prin.getTbUsuario(), "", "usuario");

        prin.getTxtBuscar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prin.getTxtBuscar().setText("");
                prin.getTxtBuscar().setForeground(Color.BLACK);
            }

        });

        prin.getTbUsuario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getTbUsuario().rowAtPoint(e.getPoint());
                int columna = prin.getTbUsuario().columnAtPoint(e.getPoint());
                modUsu.setDoc(Integer.parseInt(prin.getTbUsuario().getValueAt(fila, 1).toString()));

                if (columna == 9) {
                    prin.setVisible(false);
                    contUsua.actualizarUsuario(modUsu.getDoc());
                }
                if (columna == 10) {
                    contUsua.eliminarUsuario(modUsu.getDoc());
                    modUsu.mostrarTablaUsuario(prin.getTbUsuario(), "", "usuario");
                }
            }
        });
    }

    public void gestionCliente() {
        modCli.mostrarTablaCliente(prin.getTbCliente(), "", "cliente");
        prin.getTxtBuscarCli().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                prin.getTxtBuscarCli().setText("");
                prin.getTxtBuscarCli().setForeground(Color.black);
            }
        });
        prin.getTbCliente().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getTbCliente().rowAtPoint(e.getPoint());
                int columna = prin.getTbCliente().columnAtPoint(e.getPoint());
                modCli.setCed(Integer.parseInt(prin.getTbCliente().getValueAt(fila, 1).toString()));
                if (columna == 8) {

                }
            }
        });
    }

    public void gestionProveedor() {
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), "", "proveedor");
    }

    @Override
    public void actionPerformed(ActionEvent e) { //Valida los eventos
        if (e.getSource().equals(prin.getBtnNuevo())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial

            prin.setVisible(false);
            contUsua.control();
        }
        if (e.getSource().equals(prin.getBtnNueCli())) {
            prin.setVisible(false);
            contCli.cliente();

        }
        if (e.getSource().equals(prin.getBtnNuevoProv())) {

        }
        if (e.getSource().equals(prin.getBtnImagen())) {
            modProd.buscarImagen();
            File file = new File(modProd.getRuta());
            String archivo = file.getName();
            prin.getTxtImaPro().setText(archivo);
        }
        if (e.getSource().equals(prin.getBtnGuardarPro())) {

            modProd.setNom(prin.getTxtNomProd().getText());
            modProd.setDes(prin.getTxaDescPro().getText());
            modProd.setImagen(modProd.obtnerImagen(modProd.getRuta()));

            if (prin.getBtnGuardarPro().getText().equals("Guardar")) {
                modProd.insertarProducto();
                iniciar(0);
            } else {
                System.out.println("La ruta del producto " + modProd.getRuta());
            }

            modProd.limpiar(prin.getJpNuevoProducto().getComponents());

        }

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int seleccion = prin.getJtPrincipal().getSelectedIndex();

        if (seleccion == 0) {
            gestionProducto();

        }
        if (seleccion == 1) {
            gestionUsuario();
        }
        if (seleccion == 2) {
            gestionCliente();
        }
        if (seleccion == 3) {
            gestionProveedor();
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        modUsu.mostrarTablaUsuario(prin.getTbUsuario(), prin.getTxtBuscar().getText(), "usuario");
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), prin.getTxtBuscarProv().getText(), "proveedor");
        modCli.mostrarTablaCliente(prin.getTbCliente(), prin.getTxtBuscarCli().getText(), "cliente");
        modProd.mostrarTablaProducto(prin.getTbProducto(), prin.getTxtBuscarProd().getText(), "producto");

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        modUsu.mostrarTablaUsuario(prin.getTbUsuario(), prin.getTxtBuscar().getText(), "usuario");
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), prin.getTxtBuscarProv().getText(), "proveedor");
        modCli.mostrarTablaCliente(prin.getTbCliente(), prin.getTxtBuscarCli().getText(), "cliente");
        modProd.mostrarTablaProducto(prin.getTbProducto(), prin.getTxtBuscarProd().getText(), "producto");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        modUsu.mostrarTablaUsuario(prin.getTbUsuario(), prin.getTxtBuscar().getText(), "usuario");
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), prin.getTxtBuscarProv().getText(), "proveedor");
        modCli.mostrarTablaCliente(prin.getTbCliente(), prin.getTxtBuscarCli().getText(), "cliente");
        modProd.mostrarTablaProducto(prin.getTbProducto(), prin.getTxtBuscarProd().getText(), "producto");
    }

}
