/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexion;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author HP
 */
public class ModeloProducto {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nom, des, ruta;
    private byte imagen[];

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public void buscarImagen() {
        JFileChooser archivos = new JFileChooser();
        String rutacarpeta = getClass().getClassLoader().getResource("producto").getPath();
        File carpeta = new File(rutacarpeta);
        archivos.setCurrentDirectory(carpeta);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "JPG,PNG & GIF", "jpg", "png", "gif");
        archivos.setFileFilter(filtro);
        if (archivos.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            setRuta(archivos.getSelectedFile().getAbsolutePath());
        }
        System.out.println(getRuta());
    }

    public byte[] obtnerImagen(String ruta) {
        try {
            File archivo = new File(ruta);
            byte[] foto = new byte[(int) archivo.length()];
            InputStream img = new FileInputStream(archivo);
            img.read(foto);

            return foto;
        } catch (Exception e) {
            return null;
        }
    }

    public void insertarProducto() {
        Conexion con = new Conexion();
        Connection cn = con.iniciarConexion();

        String insProducto = "call producto_ins(?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(insProducto);
            ps.setString(1, getNom());
            ps.setString(2, getDes());
            ps.setBytes(3, getImagen());
            ps.setString(4, getRuta());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro Guardado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void limpiar(Component[] panel) {
        for (Object control : panel) {
            if (control instanceof JTextField jTextField) {
                jTextField.setText("");
            }
            if (control instanceof JScrollPane jScrollPane) {
                Component[] text = jScrollPane.getViewport().getComponents();
                for (Object controltText : text) {
                    if (controltText instanceof JTextArea jTextArea) {
                        jTextArea.setText("");
                    }
                }
            }
        }
    }

    public void mostrarTablaProducto(JTable tabla, String valor, String nomPesta) {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();

        //Personalizar Encabezado
        JTableHeader encabezado = tabla.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tabla.setTableHeader(encabezado);

        tabla.setDefaultRenderer(Object.class, new GestionCeldas());

        JButton editar = new JButton();
        JButton eliminar = new JButton();

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar (3).png")));

        String[] titulo = nomPesta.equals("producto") ? new String[]{"Código", "Imagen", "Producto",
            "Descripción", "Existencia", "Precio"} : new String[]{"Código", "Imagen",
            "Producto", "Descripción", "Cantidad", "Valor"};

        int total = titulo.length;//Para gardar el tamaño del cector titulo original
        if (nomPesta.equals("producto")) {

            titulo = Arrays.copyOf(titulo, titulo.length + 2);
            titulo[titulo.length - 2] = "";
            titulo[titulo.length - 1] = "";

        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "";
        }

        DefaultTableModel tablaProducto = new DefaultTableModel(null, titulo) {

            public boolean isCellEditable(int row, int column) {
                if (!nomPesta.equals("producto")) {
                    if (column == 4 || column == 5 || column == 6) {
                        return true;
                    }
                }
                return false;
            }
        };

        String sqlProducto = valor.isEmpty() ? "select * from mostrar_producto" : "call producto_cons('" + valor + "')";

        try {
            String datos[] = new String[total];
            Object dato[] = new Object[total];

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqlProducto);

            while (rs.next()) {
                dato[0] = rs.getString(1);
                try {
                    byte[] imag = rs.getBytes(2);
                    BufferedImage bfImag = null;
                    InputStream inStr = new ByteArrayInputStream(imag);
                    bfImag = ImageIO.read(inStr);
                    ImageIcon imagen = new ImageIcon(bfImag.getScaledInstance(50, 50, 0));
                    dato[1] = new JLabel(imagen);
                } catch (Exception e) {
                    dato[1] = new JLabel("No Imagenes");
                }

                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getInt(5);
                dato[5] = rs.getInt(6);
                Object[] fila;

                if (nomPesta.equals("producto")) {
                    fila = new Object[]{dato[0], dato[1], dato[2], dato[3], dato[4], dato[5]};
                    fila = Arrays.copyOf(fila, fila.length + 2);
                    fila[fila.length - 2] = editar;
                    fila[fila.length - 1] = eliminar;
                } else {
                    fila = new Object[]{dato[0], dato[1], dato[2], dato[3], 0, 0};
                    fila = Arrays.copyOf(fila, fila.length + 3);
                    fila[fila.length - 1] = false;
                }
                tablaProducto.addRow(fila);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tabla.setModel(tablaProducto);
        int numColumnas = tabla.getColumnCount();

//        Renderizar la columna para que aparezca el checkbox
        if (!nomPesta.equals("producto")) {
            int col = numColumnas - 1;
            TableColumn tc = tabla.getColumnModel().getColumn(col);
            tc.setCellEditor(tabla.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(tabla.getDefaultRenderer(Boolean.class));
        }
        //Darle tamaño a cada columna
        int[] tamanos = {50, 300, 250, 300, 100, 100};

        if (nomPesta.equals("producto")) {
            tamanos = Arrays.copyOf(tamanos, tamanos.length + 2);
            tamanos[tamanos.length - 2] = 15;
            tamanos[tamanos.length - 1] = 15;
        } else {
            tamanos = Arrays.copyOf(tamanos, tamanos.length + 1);
            tamanos[tamanos.length - 1] = 15;
        }
        for (int i = 0; i < numColumnas; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(tamanos[i]);
        }
        conect.cerrarConexion();
    }

    public void buscarProducto(int id) {
        Conexion cone = new Conexion();
        Connection cn = cone.iniciarConexion();
        String sql = "call producto_bus(" + id + ")";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                setId(id);
                setNom(rs.getString(2));
                setDes(rs.getString(3));
                setRuta(rs.getString(4));
                setImagen(rs.getBytes(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarProducto() {
        Conexion con = new Conexion();
        Connection cn = con.iniciarConexion();

        String actProducto = "call producto_act(?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(actProducto);
            ps.setInt(1, getId());
            ps.setString(2, getNom());
            ps.setString(3, getDes());
            ps.setBytes(4, getImagen());
            ps.setString(5, getRuta());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro Almacenado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarProducto() {
        Conexion con = new Conexion();
        Connection cn = con.iniciarConexion();

        String eliProducto = "Call producto_eli(?)";
        try {
            PreparedStatement ps = cn.prepareStatement(eliProducto);
            ps.setInt(1, getId());
            ps.executeUpdate();
            Icon eliminar = new ImageIcon(getClass().getResource("/img/eliminar(2).png"));
            JOptionPane.showMessageDialog(null, "Registro Eliminado", "Eliminar Producto", JOptionPane.PLAIN_MESSAGE, (Icon) eliminar);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
