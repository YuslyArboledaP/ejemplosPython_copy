/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexion;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author HP
 */
public class ModeloVenta {

    private int fac, usu, prov, prod, can;
    private float valor, imp;
    private String tipo, comp;
    private Date Fec;

    public float getImp() {
        return imp;
    }

    public void setImp(float imp) {
        this.imp = imp;
    }

    public Date getFec() {
        return Fec;
    }

    public void setFec(Date Fec) {
        this.Fec = Fec;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public int getFac() {
        return fac;
    }

    public int getProd() {
        return prod;
    }

    public void setProd(int prod) {
        this.prod = prod;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setFac(int fac) {
        this.fac = fac;
    }

    public int getUsu() {
        return usu;
    }

    public void setUsu(int usu) {
        this.usu = usu;
    }

    public int getProv() {
        return prov;
    }

    public void setProv(int prov) {
        this.prov = prov;
    }

    public ModeloVenta() {
    }

    public void insertarFactura() {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();//Instanciamos la conexion

        String sql = "call factura_compra_ins(?, ?)";//Consulta a realizar a la base de datos
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, getProv());
            ps.setInt(2, getUsu());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Almacenado");
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void limpiar(Component[] panel) {
        for (Object control : panel) {
            if (control instanceof JTextField jTextField) {
                jTextField.setText("");
            }
            if (control instanceof JLabel label) {
                label.setText("");
            }
        }
    }

    public void mostrarTablaFactura(JTable tabla, String valor, boolean usuario) {
        Conexion conect = new Conexion();
        Connection cn = conect.iniciarConexion();

        //Personalizar Encabezado
        JTableHeader encabezado = tabla.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tabla.setTableHeader(encabezado);

        tabla.setDefaultRenderer(Object.class, new GestionCeldas());

        JButton ver = new JButton();
        JButton agregar = new JButton();
        JButton imprimir = new JButton();
        JButton editar = new JButton();

        ver.setToolTipText("Ver Detalle Factura");
        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png")));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png")));
        agregar.setToolTipText("Agregar Detalle Factura");
        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png")));
        imprimir.setToolTipText("Imprimir");
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
        editar.setToolTipText("Editar");

        Object[] titulo = {"Factura", "Proveedor", "Usuario", "Fecha", "Tipo de Pago ", "Numero de Comprobante", "Total Pago"};

        int total = titulo.length;//Para gardar el tamaño del cector titulo original
        titulo = Arrays.copyOf(titulo, titulo.length + 3);
        titulo[titulo.length - 3] = "";
        titulo[titulo.length - 2] = "";
        titulo[titulo.length - 1] = "";

        DefaultTableModel tablaFactura = new DefaultTableModel(null, titulo) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String sqlFactura = valor.isEmpty() ? "SELECT * FROM mostrar_factura_compra" : "call factura_compra('" + valor + "')";
        try {
            String[] dato = new String[titulo.length];
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqlFactura);
            while (rs.next()) {
                for (int i = 0; i < total; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                Object[] fila = {dato[0], dato[1], dato[2], dato[5], dato[3], dato[4], dato[6]};
                if (usuario == false) {
                    fila = Arrays.copyOf(fila, fila.length + 3);
                    fila[fila.length - 3] = ver;
                    fila[fila.length - 2] = agregar;
                    fila[fila.length - 1] = imprimir;
                } else {
                    fila = Arrays.copyOf(fila, fila.length + 4);
                    fila[fila.length - 4] = ver;
                    fila[fila.length - 3] = agregar;
                    fila[fila.length - 2] = imprimir;
                    fila[fila.length - 1] = editar;
                }

                tablaFactura.addRow(fila);
            }
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tabla.setModel(tablaFactura);
        //Darle tamaño a cada columna
        int numColumnas = tabla.getColumnCount();
        int[] tamanos = {60, 150, 200, 120, 140, 150, 130, 10, 8, 10};

        for (int i = 0; i < numColumnas; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(tamanos[i]);
        }
        conect.cerrarConexion();
    }

    public boolean seleciono(JTable tabla) {
        int c = tabla.getColumnCount() - 1;

        for (int i = 0; i < tabla.getRowCount(); i++) {
            Boolean selec = (Boolean) tabla.getValueAt(i, c);
            
            if (selec != null && selec) {
                return true;
            }

        }
        return false;
    }

    public void agregarDatos(JTable tablaProd, JTable tablaDeta) {
        //Personalizar Encabezado
        JTableHeader encabezado = tablaDeta.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tablaDeta.setTableHeader(encabezado);
        tablaDeta.setDefaultRenderer(Object.class, new GestionCeldas());
        
        JTextField cantidad= new JTextField();

        Object[] titulo = {"Código", "Producto", "Descripción", "Cantidad", "Valor"};

        DefaultTableModel tabla_addProducto = new DefaultTableModel(null, titulo) {
            public boolean isCellEditable(int row, int column) {
                return column == 3 || column == 4;
            }
        };
        if (seleciono(tablaProd)) {
            for (int i = 0; i < tablaProd.getRowCount(); i++) {
                Boolean selec = (Boolean) tablaProd.getValueAt(i, tablaProd.getColumnCount()-1);
                if (selec != null && selec) {
                    Object dato[] = new Object[titulo.length];
                    dato[0] = tablaProd.getValueAt(i, 0);
                    dato[1] = tablaProd.getValueAt(i, 2);
                    dato[2] = tablaProd.getValueAt(i, 3);
                    Object fila[] = {dato[0], dato[1], dato[2]};
                    tabla_addProducto.addRow(fila);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un producto");
        }
        tablaDeta.setModel(tabla_addProducto);
        
         int[] tamanos = {50, 100, 280, 80, 80};
        int numColumnas = tablaDeta.getColumnCount();
        for (int i = 0; i < numColumnas; i++) {
            TableColumn columna = tablaDeta.getColumnModel().getColumn(i);
            columna.setPreferredWidth(tamanos[i]);
        }

    }
    

}
