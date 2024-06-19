package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloFactura;
import Modelo.ModeloProducto;
import Modelo.ModeloProveedor;
import Modelo.ModeloUsuario;
import Vista.Principal;
import Vista.Ver_Detalle;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorPrincipal implements ActionListener, ChangeListener, DocumentListener {

    Principal prin = new Principal();//Instancia(Llama) la ventana principal
    Ver_Detalle ver = new Ver_Detalle();
//    Nuevo_Usuario nuevo = new Nuevo_Usuario();//Instanca (Llama) la ventana(vista) Nuevo usuario
    ControladorUsuario contUsua = new ControladorUsuario();
    ControladorCliente contCli = new ControladorCliente();
    ControladorProveedor contProv = new ControladorProveedor();
    ControladorFactura contFac = new ControladorFactura();
    
     ModeloProducto modProd = new ModeloProducto();   
    
    ModeloFactura modFact = new ModeloFactura();

    public ControladorPrincipal() {
        prin.getBtnNuevo().addActionListener(this);//Agrega el boton nuevo para que se escuche cuando se de clic
        prin.getBtnNueCli().addActionListener(this);
        prin.getBtnNuevoProv().addActionListener(this);
        prin.getBtnImagen().addActionListener(this);
        prin.getBtnGuardarPro().addActionListener(this);
        prin.getBtnFactUsu().addActionListener(this);
        prin.getBtnFactProv().addActionListener(this);
        prin.getBtnGuardarFactura().addActionListener(this);
        prin.getFac_Limpiar().addActionListener(this);
        ver.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                iniciar(4);
            }

        });

        prin.getJtPrincipal().addChangeListener(this);

        prin.getTxtBuscar().getDocument().addDocumentListener(this);
        prin.getTxtBuscarCli().getDocument().addDocumentListener(this);
        prin.getTxtBuscarProv().getDocument().addDocumentListener(this);
        prin.getTxtBuscarCompra().getDocument().addDocumentListener(this);

    }

    public void iniciar(int valor) {
        prin.setLocationRelativeTo(null);//Centra la ventana
        prin.setTitle("Principal");//Le da titulo a la ventana
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        prin.getJtPrincipal().setSelectedIndex(valor);
        prin.setVisible(true);//Hace visible la ventana
        gestionProducto();

    }

    public boolean validarCorreo(String correo) {
        String valor = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+.[A-Z|a-z]{2,}$";
        Pattern validar = Pattern.compile(valor);
        Matcher cor = validar.matcher(correo);
        return cor.matches();
    }

    public Border titulo(String tit) {
        Border borde = BorderFactory.createTitledBorder(null, tit,
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Verdana", 1, 12), new java.awt.Color(153, 0, 153));
        return borde;
    }

    void CompraVenta(int pest, String usu, String pro, String nomU, String nomP) {

        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
        prin.getJtPrincipal().setSelectedIndex(pest);
        if (pest == 4) {
            prin.getTxtFact_Usu().setText(usu);
            prin.getLblFac_Usu().setText(nomU);
            prin.getTxtFact_prov().setText(pro);
            prin.getLblFacProv().setText(nomP);
        }
        if (pest == 5) {
            prin.getTxtVenUsu().setText(usu);
        }
        prin.setVisible(true);

    }

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
                JButton cancelar = new JButton("Cancelar");

                int fila = prin.getTbProducto().rowAtPoint(e.getPoint());
                int columna = prin.getTbProducto().columnAtPoint(e.getPoint());
                modProd.setId(Integer.parseInt(prin.getTbProducto().getValueAt(fila, 0).toString()));

                if (columna == 6) {
                    modProd.buscarProducto(modProd.getId());
                    prin.getTxtNomProd().setText(modProd.getNom());
                    prin.getTxaDescPro().setText(modProd.getDes());
                    if(modProd.getRuta()!=null){
                        File file = new File(modProd.getRuta());
                        String archivo = file.getName();
                        prin.getTxtImaPro().setText(archivo);
                    }
                    prin.getJpNuevoProducto().setBorder(titulo("Actualizar Producto"));
                    prin.getJpNuevoProducto().add(cancelar);

                    cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/destellos.png")));

                    cancelar.setBounds(1200, 50, 110, 23);
                    prin.getBtnGuardarPro().setText("Actualizar");

                    cancelar.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            modProd.limpiar(prin.getJpNuevoProducto().getComponents());
                            prin.getJpNuevoProducto().setBorder(titulo("Nuevo Producto"));
                            cancelar.setVisible(false);
                        }
                    });
                    //Obligamos que la interfaz se reinicie
                    prin.getJpNuevoProducto().revalidate();
                    prin.getJpNuevoProducto().repaint();

                }
                if (columna == 7) {
                    modProd.setNom(prin.getTbProducto().getValueAt(fila, 2).toString());
                    Icon eliminar = new ImageIcon(getClass().getResource("/img/eliminar(2).png"));
                    int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto? \n" + modProd.getNom(), "Eliminar Producto", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE, (Icon) eliminar);
                    if (resp == JOptionPane.YES_OPTION) {
                        modProd.eliminarProducto();
                    }
                    modProd.mostrarTablaProducto(prin.getTbProducto(), "", "producto");
                }

            }

        });
    }

    public void gestionUsuario() {
        ModeloUsuario modUsu = new ModeloUsuario();//Instancia el modelo de 

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
        ModeloCliente modCli = new ModeloCliente();
        modCli.mostrarTablaCliente(prin.getTbCliente(), "", "cliente");
        prin.getTxtBuscarCli().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prin.getTxtBuscarCli().setText("");
                prin.getTxtBuscarCli().setForeground(Color.black);
            }
        });
        prin.getTbCliente().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getTbCliente().rowAtPoint(e.getPoint());
                int columna = prin.getTbCliente().columnAtPoint(e.getPoint());
                modCli.setCed(Integer.parseInt(prin.getTbCliente().getValueAt(fila, 1).toString()));
                if (columna == 8) {
                    prin.setVisible(false);
                    contCli.actualizarCliente(modCli.getCed());
                }
                if (columna == 9) {
                    contCli.eliminarCliente(modCli.getCed());
                    modCli.mostrarTablaCliente(prin.getTbCliente(), "", "cliente");
                }
            }
        });
    }

    public void gestionProveedor() {
        ModeloProveedor modProv = new ModeloProveedor();
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), "", "proveedor");
        prin.getTxtBuscarProv().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prin.getTxtBuscarProv().setText("");
                prin.getTxtBuscarProv().setForeground(Color.black);
            }
        });
        prin.getTbProveedor().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getTbProveedor().rowAtPoint(e.getPoint());
                int columna = prin.getTbProveedor().columnAtPoint(e.getPoint());
                modProv.setId(Integer.parseInt(prin.getTbProveedor().getValueAt(fila, 0).toString()));
                if (columna == 10) {
                    prin.setVisible(false);
                    contProv.actualizarProveedor(modProv.getId());
                }
                if (columna == 11) {
                    contProv.eliminarProveedor(modProv.getId());
                    modProd.mostrarTablaProducto(prin.getTbProveedor(), "", "proveedor");
                }
            }
        });

    }

    public void gestionFactura() {
        modFact.mostrarTablaFactura(prin.getTbFactura(), "",false);
        prin.getTbFactura().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getTbFactura().rowAtPoint(e.getPoint());
                int col = prin.getTbFactura().columnAtPoint(e.getPoint());
                modFact.setFac(Integer.parseInt(prin.getTbFactura().getValueAt(fila, 0).toString()));
                if (col == 8) {
                    prin.setVisible(false);
                    contFac.detalle_factura(modFact.getFac());
                }
                if (col == 7) {
                    prin.setVisible(false);
                    contFac.ver_Factura(modFact.getFac());
                }
            }
        });
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
            prin.setVisible(false);
            contProv.proveedor();
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
                modProd.limpiar(prin.getJpNuevoProducto().getComponents());
                modProd.mostrarTablaProducto(prin.getTbProducto(), "", "producto");
            } else {
                modProd.actualizarProducto();
                modProd.limpiar(prin.getJpNuevoProducto().getComponents());
                prin.getJpNuevoProducto().setBorder(titulo("Nuevo Producto"));

                modProd.mostrarTablaProducto(prin.getTbProducto(), "", "producto");
            }
        }
        if (e.getSource().equals(prin.getBtnFactUsu())) {
            prin.setVisible(false);
            contFac.buscar("Usuario", prin.getTxtFact_Usu().getText(), prin.getTxtFact_prov().getText(),
                    prin.getLblFac_Usu().getText(), prin.getLblFacProv().getText());
        }
        if (e.getSource().equals(prin.getBtnFactProv())) {
            prin.setVisible(false);
            contFac.buscar("Proveedor", prin.getTxtFact_Usu().getText(), prin.getTxtFact_prov().getText(),
                    prin.getLblFac_Usu().getText(), prin.getLblFacProv().getText());
        }
        if (e.getSource().equals(prin.getBtnGuardarFactura())) {
            modFact.setUsu(Integer.parseInt(prin.getTxtFact_Usu().getText()));
            modFact.setProv(Integer.parseInt(prin.getTxtFact_prov().getText()));
            if (prin.getBtnGuardarFactura().getText().equals("Guardar")) {
                modFact.insertarFactura();
                modProd.limpiar(prin.getJpFactura().getComponents());
                modFact.mostrarTablaFactura(prin.getTbFactura(), "",false);
            }

        }
        if (e.getSource().equals(prin.getFac_Limpiar())) {
            prin.getTxtFact_Usu().setText("");
            modFact.limpiar(prin.getJpFactura().getComponents());
        }
        if(e.getSource().equals(prin.getBtnAdmin())){
            
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
        if (seleccion == 4) {
            gestionFactura();
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        ModeloUsuario modUsu = new ModeloUsuario();//Instancia el modelo de 
        ModeloProveedor modProv = new ModeloProveedor();
        ModeloCliente modCli = new ModeloCliente();
        modUsu.mostrarTablaUsuario(prin.getTbUsuario(), prin.getTxtBuscar().getText(), "usuario");
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), prin.getTxtBuscarProv().getText(), "proveedor");
        modCli.mostrarTablaCliente(prin.getTbCliente(), prin.getTxtBuscarCli().getText(), "cliente");
        modProd.mostrarTablaProducto(prin.getTbProducto(), prin.getTxtBuscarProd().getText(), "producto");

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        ModeloUsuario modUsu = new ModeloUsuario();//Instancia el modelo de 
        ModeloProveedor modProv = new ModeloProveedor();
        ModeloCliente modCli = new ModeloCliente();
        modUsu.mostrarTablaUsuario(prin.getTbUsuario(), prin.getTxtBuscar().getText(), "usuario");
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), prin.getTxtBuscarProv().getText(), "proveedor");
        modCli.mostrarTablaCliente(prin.getTbCliente(), prin.getTxtBuscarCli().getText(), "cliente");
        modProd.mostrarTablaProducto(prin.getTbProducto(), prin.getTxtBuscarProd().getText(), "producto");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        ModeloUsuario modUsu = new ModeloUsuario();//Instancia el modelo de 
        ModeloProveedor modProv = new ModeloProveedor();
        ModeloCliente modCli = new ModeloCliente();
        modUsu.mostrarTablaUsuario(prin.getTbUsuario(), prin.getTxtBuscar().getText(), "usuario");
        modProv.mostrarTablaProveedor(prin.getJtProveedor(), prin.getTxtBuscarProv().getText(), "proveedor");
        modCli.mostrarTablaCliente(prin.getTbCliente(), prin.getTxtBuscarCli().getText(), "cliente");
        modProd.mostrarTablaProducto(prin.getTbProducto(), prin.getTxtBuscarProd().getText(), "producto");
    }

}
