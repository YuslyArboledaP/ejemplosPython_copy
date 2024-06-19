/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public JTabbedPane getJtPrincipal() {
        return jtPrincipal;
    }

    public void setJtPrincipal(JTabbedPane jtPrincipal) {
        this.jtPrincipal = jtPrincipal;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public JTable getTbUsuario() {
        return tbUsuario;
    }

    public void setTbUsuario(JTable tbUsuario) {
        this.tbUsuario = tbUsuario;
    }

    public JButton getBtnBuscarUsu() {
        return btnBuscarUsu;
    }

    public void setBtnBuscarUsu(JButton btnBuscarUsu) {
        this.btnBuscarUsu = btnBuscarUsu;
    }

    public JTextField getTxtproveedor() {
        return txtFact_prov;
    }

    public void setTxtproveedor(JTextField txtproveedor) {
        this.txtFact_prov = txtproveedor;
    }

    public JTextField getTxtusuario() {
        return txtFact_Usu;
    }

    public void setTxtusuario(JTextField txtusuario) {
        this.txtFact_Usu = txtusuario;
    }

    public JTable getJtProveedor() {
        return tbProveedor;
    }

    public void setJtProveedor(JTable jtProveedor) {
        this.tbProveedor = jtProveedor;
    }

    public JTable getTbCliente() {
        return tbCliente;
    }

    public void setTbCliente(JTable tbCliente) {
        this.tbCliente = tbCliente;
    }

    public JPanel getJpCliente() {
        return jpCliente;
    }

    public void setJpCliente(JPanel jpCliente) {
        this.jpCliente = jpCliente;
    }

    public JTable getTbProveedor() {
        return tbProveedor;
    }

    public void setTbProveedor(JTable tbProveedor) {
        this.tbProveedor = tbProveedor;
    }

    public JTextField getTxtBuscarProv() {
        return txtBuscarProv;
    }

    public void setTxtBuscarProv(JTextField txtBuscarProv) {
        this.txtBuscarProv = txtBuscarProv;
    }

    public JTextField getTxtBuscarCli() {
        return txtBuscarCli;
    }

    public void setTxtBuscarCli(JTextField txtBuscarCli) {
        this.txtBuscarCli = txtBuscarCli;
    }

    public JButton getBtnNueCli() {
        return btnNueCli;
    }

    public void setBtnNueCli(JButton btnNueCli) {
        this.btnNueCli = btnNueCli;
    }

    public JButton getBtnNuevoProv() {
        return btnNuevoProv;
    }

    public void setBtnNuevoProv(JButton btnNuevoProv) {
        this.btnNuevoProv = btnNuevoProv;
    }

    public JButton getBtnGuardarPro() {
        return btnGuardarPro;
    }

    public void setBtnGuardarPro(JButton btnGuardarPro) {
        this.btnGuardarPro = btnGuardarPro;
    }

    public JButton getBtnImagen() {
        return btnImagen;
    }

    public void setBtnImagen(JButton btnImagen) {
        this.btnImagen = btnImagen;
    }

    public JTextArea getTxaDescPro() {
        return txaDescPro;
    }

    public void setTxaDescPro(JTextArea txaDescPro) {
        this.txaDescPro = txaDescPro;
    }

    public JTextField getTxtImaPro() {
        return txtImaPro;
    }

    public void setTxtImaPro(JTextField txtImaPro) {
        this.txtImaPro = txtImaPro;
    }

    public JTextField getTxtNomProd() {
        return txtNomProd;
    }

    public void setTxtNomProd(JTextField txtNomProd) {
        this.txtNomProd = txtNomProd;
    }

    public JTable getTbProducto() {
        return tbProducto;
    }

    public void setTbProducto(JTable tbProducto) {
        this.tbProducto = tbProducto;
    }

    public JTextField getTxtBuscarProd() {
        return txtBuscarProd;
    }

    public void setTxtBuscarProd(JTextField txtBuscarProd) {
        this.txtBuscarProd = txtBuscarProd;
    }
        public JPanel getJpNuevoProducto() {
        return jpNuevoProducto;
    }

    public void setJpNuevoProducto(JPanel jpNuevoProducto) {
        this.jpNuevoProducto = jpNuevoProducto;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JButton getBtnFactProv() {
        return btnFactProv;
    }

    public void setBtnFactProv(JButton btnFactProv) {
        this.btnFactProv = btnFactProv;
    }

    public JButton getBtnFactUsu() {
        return btnFactUsu;
    }

    public void setBtnFactUsu(JButton btnFactUsu) {
        this.btnFactUsu = btnFactUsu;
    }

    public JButton getBtnGuardarFactura() {
        return btnGuardarFactura;
    }

    public void setBtnGuardarFactura(JButton btnGuardarFactura) {
        this.btnGuardarFactura = btnGuardarFactura;
    }

    public JPanel getJpFactura() {
        return jpFactura;
    }

    public void setJpFactura(JPanel jpFactura) {
        this.jpFactura = jpFactura;
    }

    public JTable getTbFactura() {
        return tbFactura;
    }

    public void setTbFactura(JTable tbFactura) {
        this.tbFactura = tbFactura;
    }

    public JTextField getTxtBuscarCompra() {
        return txtBuscarCompra;
    }

    public void setTxtBuscarCompra(JTextField txtBuscarCompra) {
        this.txtBuscarCompra = txtBuscarCompra;
    }

    public JTextField getTxtFact_Usu() {
        return txtFact_Usu;
    }

    public void setTxtFact_Usu(JTextField txtFact_Usu) {
        this.txtFact_Usu = txtFact_Usu;
    }

    public JTextField getTxtFact_prov() {
        return txtFact_prov;
    }

    public void setTxtFact_prov(JTextField txtFact_prov) {
        this.txtFact_prov = txtFact_prov;
    }

    public JTextField getTxtVenUsu() {
        return txtVenUsu;
    }

    public void setTxtVenUsu(JTextField txtVenUsu) {
        this.txtVenUsu = txtVenUsu;
    }

    public JButton getBtnVen_Usu() {
        return btnVen_Usu;
    }

    public void setBtnVen_Usu(JButton btnVen_Usu) {
        this.btnVen_Usu = btnVen_Usu;
    }

    public JLabel getLblFacProv() {
        return lblFacProv;
    }

    public void setLblFacProv(JLabel lblFacProv) {
        this.lblFacProv = lblFacProv;
    }

    public JLabel getLblFac_Usu() {
        return lblFac_Usu;
    }

    public void setLblFac_Usu(JLabel lblFac_Usu) {
        this.lblFac_Usu = lblFac_Usu;
    }

    public JButton getFac_Limpiar() {
        return Fac_Limpiar;
    }

    public void setFac_Limpiar(JButton Fac_Limpiar) {
        this.Fac_Limpiar = Fac_Limpiar;
    }

    public JComboBox<String> getVenta_tipo_p() {
        return Venta_tipo_p;
    }

    public void setVenta_tipo_p(JComboBox<String> Venta_tipo_p) {
        this.Venta_tipo_p = Venta_tipo_p;
    }

    public JButton getBtnAdmin() {
        return btnAdmin;
    }

    public void setBtnAdmin(JButton btnAdmin) {
        this.btnAdmin = btnAdmin;
    }

    public JButton getBtnGuardarVenta() {
        return btnGuardarVenta;
    }

    public void setBtnGuardarVenta(JButton btnGuardarVenta) {
        this.btnGuardarVenta = btnGuardarVenta;
    }

    public JButton getBtnVen_Cli() {
        return btnVen_Cli;
    }

    public void setBtnVen_Cli(JButton btnVen_Cli) {
        this.btnVen_Cli = btnVen_Cli;
    }

    public JTable getTbVenta() {
        return tbVenta;
    }

    public void setTbVenta(JTable tbVenta) {
        this.tbVenta = tbVenta;
    }

    public JTextField getTxtBuscarVenta() {
        return txtBuscarVenta;
    }

    public void setTxtBuscarVenta(JTextField txtBuscarVenta) {
        this.txtBuscarVenta = txtBuscarVenta;
    }

    public JTextField getTxtVen_Clie() {
        return txtVen_Clie;
    }

    public void setTxtVen_Clie(JTextField txtVen_Clie) {
        this.txtVen_Clie = txtVen_Clie;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEmpresa = new javax.swing.JPanel();
        lblTienda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtPrincipal = new javax.swing.JTabbedPane();
        jpProducto = new javax.swing.JPanel();
        jpNuevoProducto = new javax.swing.JPanel();
        lblNombreProd = new javax.swing.JLabel();
        txtNomProd = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaDescPro = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();
        lbldescripcionProd = new javax.swing.JLabel();
        txtImaPro = new javax.swing.JTextField();
        btnGuardarPro = new javax.swing.JButton();
        btnImagen = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        txtBuscarProd = new javax.swing.JTextField();
        jpUsuario = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnBuscarUsu = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        jpCliente = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtBuscarCli = new javax.swing.JTextField();
        btnNueCli = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jpProveedor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnNuevoProv = new javax.swing.JButton();
        txtBuscarProv = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbProveedor = new javax.swing.JTable();
        jpFactura = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtFact_Usu = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        txtFact_prov = new javax.swing.JTextField();
        btnFactUsu = new javax.swing.JButton();
        btnFactProv = new javax.swing.JButton();
        btnGuardarFactura = new javax.swing.JButton();
        lblFac_Usu = new javax.swing.JLabel();
        lblFacProv = new javax.swing.JLabel();
        Fac_Limpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        txtBuscarCompra = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        btnAdmin = new javax.swing.JButton();
        jpVenta = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVenUsu = new javax.swing.JTextField();
        btnVen_Usu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtVen_Clie = new javax.swing.JTextField();
        btnVen_Cli = new javax.swing.JButton();
        Venta_tipo_p = new javax.swing.JComboBox<>();
        btnGuardarVenta = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbVenta = new javax.swing.JTable();
        txtBuscarVenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIENDA COM");

        lblTienda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTienda.setForeground(new java.awt.Color(153, 0, 153));
        lblTienda.setText("  Panel Principal");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\Tienda.png")); // NOI18N

        javax.swing.GroupLayout jpEmpresaLayout = new javax.swing.GroupLayout(jpEmpresa);
        jpEmpresa.setLayout(jpEmpresaLayout);
        jpEmpresaLayout.setHorizontalGroup(
            jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTienda, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpEmpresaLayout.setVerticalGroup(
            jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpresaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtPrincipal.setForeground(new java.awt.Color(153, 0, 153));
        jtPrincipal.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jpNuevoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(153, 0, 153))); // NOI18N

        lblNombreProd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblNombreProd.setForeground(new java.awt.Color(153, 0, 153));
        lblNombreProd.setText("Nombre");

        txtNomProd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txaDescPro.setColumns(20);
        txaDescPro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txaDescPro.setRows(5);
        txaDescPro.setMargin(new java.awt.Insets(2, 5, 2, 6));
        jScrollPane6.setViewportView(txaDescPro);

        lblImagen.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(153, 0, 153));
        lblImagen.setText("Imagen");

        lbldescripcionProd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lbldescripcionProd.setForeground(new java.awt.Color(153, 0, 153));
        lbldescripcionProd.setText("Descripción");

        txtImaPro.setEditable(false);
        txtImaPro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtImaPro.setToolTipText("");

        btnGuardarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquete.png"))); // NOI18N
        btnGuardarPro.setText("Guardar");

        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagen (1).png"))); // NOI18N
        btnImagen.setBorder(null);
        btnImagen.setBorderPainted(false);

        javax.swing.GroupLayout jpNuevoProductoLayout = new javax.swing.GroupLayout(jpNuevoProducto);
        jpNuevoProducto.setLayout(jpNuevoProductoLayout);
        jpNuevoProductoLayout.setHorizontalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreProd)
                    .addComponent(lblImagen))
                .addGap(32, 32, 32)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomProd, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(txtImaPro))
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lbldescripcionProd))
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarPro)
                .addContainerGap())
        );
        jpNuevoProductoLayout.setVerticalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoProductoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProd)
                    .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldescripcionProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtImaPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnImagen))
                .addGap(26, 26, 26))
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarPro)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbProducto.setBackground(new java.awt.Color(242, 242, 242));
        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbProducto);

        txtBuscarProd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBuscarProd.setForeground(java.awt.SystemColor.controlHighlight);
        txtBuscarProd.setText("Buscar Producto");
        txtBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 920, Short.MAX_VALUE)
                        .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpProductoLayout.setVerticalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Producto", jpProducto);

        jpUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnBuscarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnBuscarUsu.setBorder(null);

        txtBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscar.setText("Buscar Usuario");

        btnNuevo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(153, 0, 153));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 792, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarUsu)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevo))
                    .addComponent(btnBuscarUsu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbUsuario.setBackground(new java.awt.Color(242, 242, 242));
        tbUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbUsuario);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Usuario", jpUsuario);

        jpCliente.setForeground(new java.awt.Color(153, 0, 153));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtBuscarCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBuscarCli.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarCli.setText("Consutar Cliente");
        txtBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCliActionPerformed(evt);
            }
        });

        btnNueCli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnNueCli.setForeground(new java.awt.Color(153, 0, 153));
        btnNueCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente (2).png"))); // NOI18N
        btnNueCli.setText("Nuevo");
        btnNueCli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNueCli, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNueCli)
                    .addComponent(txtBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbCliente.setBackground(new java.awt.Color(242, 242, 242));
        tbCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 153))); // NOI18N
        tbCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbCliente);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtPrincipal.addTab("Cliente", jpCliente);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNuevoProv.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnNuevoProv.setForeground(new java.awt.Color(153, 0, 153));
        btnNuevoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        btnNuevoProv.setText("Nuevo");
        btnNuevoProv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        txtBuscarProv.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBuscarProv.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarProv.setText("Buscar Proveedor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 694, Short.MAX_VALUE)
                .addComponent(btnNuevoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProv)
                    .addComponent(txtBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbProveedor.setBackground(new java.awt.Color(242, 242, 242));
        tbProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbProveedor);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpProveedorLayout = new javax.swing.GroupLayout(jpProveedor);
        jpProveedor.setLayout(jpProveedorLayout);
        jpProveedorLayout.setHorizontalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpProveedorLayout.setVerticalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Proveedor", jpProveedor);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Factura", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(153, 0, 153))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(153, 0, 153));
        lblUsuario.setText("Usuario");

        txtFact_Usu.setEditable(false);
        txtFact_Usu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtFact_Usu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFact_Usu.setBorder(null);
        txtFact_Usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact_UsuActionPerformed(evt);
            }
        });

        lblProveedor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(153, 0, 153));
        lblProveedor.setText("Proveedor");

        txtFact_prov.setEditable(false);
        txtFact_prov.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtFact_prov.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFact_prov.setToolTipText("");
        txtFact_prov.setBorder(null);

        btnFactUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnFactUsu.setBorderPainted(false);
        btnFactUsu.setContentAreaFilled(false);

        btnFactProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnFactProv.setBorderPainted(false);
        btnFactProv.setContentAreaFilled(false);

        btnGuardarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquete.png"))); // NOI18N
        btnGuardarFactura.setText("Guardar");

        lblFac_Usu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblFacProv.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        Fac_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(153, 0, 153));

        jSeparator2.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFactUsu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFact_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFac_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFactProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFact_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFacProv, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnGuardarFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fac_Limpiar)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFact_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacProv, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fac_Limpiar)
                        .addComponent(btnGuardarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(btnFactUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFactProv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblFac_Usu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtFact_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtBuscarCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarCompra.setText("Buscar Factura de compra");

        tbFactura.setBackground(new java.awt.Color(242, 242, 242));
        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tbFactura);

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administracion.png"))); // NOI18N
        btnAdmin.setText("Administrar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout jpFacturaLayout = new javax.swing.GroupLayout(jpFactura);
        jpFactura.setLayout(jpFacturaLayout);
        jpFacturaLayout.setHorizontalGroup(
            jpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpFacturaLayout.setVerticalGroup(
            jpFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Factura", jpFactura);

        jpVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Cliente");

        txtVenUsu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnVen_Usu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscando.png"))); // NOI18N
        btnVen_Usu.setBorderPainted(false);
        btnVen_Usu.setContentAreaFilled(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Tipo de Pago");

        txtVen_Clie.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnVen_Cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscando.png"))); // NOI18N
        btnVen_Cli.setBorderPainted(false);
        btnVen_Cli.setContentAreaFilled(false);

        Venta_tipo_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Tarjeta de Crédito", "Tarjeta Débito", "PSE" }));

        btnGuardarVenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Tienda_Com\\src\\main\\resources\\img\\disquete.png")); // NOI18N
        btnGuardarVenta.setText("Guardar");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtVenUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVen_Usu)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVen_Clie, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVen_Cli)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Venta_tipo_p, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnGuardarVenta)
                .addGap(25, 25, 25))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVen_Usu)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtVenUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtVen_Clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Venta_tipo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardarVenta))
                    .addComponent(btnVen_Cli))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbVenta.setBackground(new java.awt.Color(242, 242, 242));
        tbVenta.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tbVenta);

        txtBuscarVenta.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtBuscarVenta.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarVenta.setText("Buscar Venta");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpVentaLayout = new javax.swing.GroupLayout(jpVenta);
        jpVenta.setLayout(jpVentaLayout);
        jpVentaLayout.setHorizontalGroup(
            jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpVentaLayout.setVerticalGroup(
            jpVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jtPrincipal.addTab("Venta", jpVenta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void txtBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCliActionPerformed

    private void txtBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProdActionPerformed

    private void txtFact_UsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFact_UsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFact_UsuActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fac_Limpiar;
    private javax.swing.JComboBox<String> Venta_tipo_p;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBuscarUsu;
    private javax.swing.JButton btnFactProv;
    private javax.swing.JButton btnFactUsu;
    private javax.swing.JButton btnGuardarFactura;
    private javax.swing.JButton btnGuardarPro;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnNueCli;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoProv;
    private javax.swing.JButton btnVen_Cli;
    private javax.swing.JButton btnVen_Usu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpEmpresa;
    private javax.swing.JPanel jpFactura;
    private javax.swing.JPanel jpNuevoProducto;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JPanel jpProveedor;
    private javax.swing.JPanel jpUsuario;
    private javax.swing.JPanel jpVenta;
    private javax.swing.JTabbedPane jtPrincipal;
    private javax.swing.JLabel lblFacProv;
    private javax.swing.JLabel lblFac_Usu;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreProd;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTienda;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbldescripcionProd;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTable tbProveedor;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTable tbVenta;
    private javax.swing.JTextArea txaDescPro;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCli;
    private javax.swing.JTextField txtBuscarCompra;
    private javax.swing.JTextField txtBuscarProd;
    private javax.swing.JTextField txtBuscarProv;
    private javax.swing.JTextField txtBuscarVenta;
    private javax.swing.JTextField txtFact_Usu;
    private javax.swing.JTextField txtFact_prov;
    private javax.swing.JTextField txtImaPro;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtVenUsu;
    private javax.swing.JTextField txtVen_Clie;
    // End of variables declaration//GEN-END:variables
}
