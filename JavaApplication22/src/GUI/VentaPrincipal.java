package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentaPrincipal extends javax.swing.JFrame {
    private LogIn logIn;
    
    
    public VentaPrincipal() {
        initComponents();
        LeerSucursales();
        mostarTablaInventario();
    }
    
    public LogIn getLogIn() {
        return logIn;
    }
    
    public void setLogIn(LogIn logIn) {
        this.logIn = logIn;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttSolicitarProd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxSucursal = new javax.swing.JComboBox<>();
        bttCambiarSucu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        bttIngresarProd = new javax.swing.JButton();
        bttTransferirProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAlerta = new javax.swing.JTextArea();
        bttIngresarProd1 = new javax.swing.JButton();
        bttIngresarProd2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCambiarSucursal = new javax.swing.JMenu();
        lll = new javax.swing.JMenuItem();
        MenuPedidos = new javax.swing.JMenu();
        MenuClientes = new javax.swing.JMenuItem();
        MenuProveedores = new javax.swing.JMenuItem();

        bttSolicitarProd.setBackground(new java.awt.Color(0, 0, 255));
        bttSolicitarProd.setForeground(new java.awt.Color(240, 240, 240));
        bttSolicitarProd.setText("Solicitar Producto");
        bttSolicitarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSolicitarProdActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 231, 15));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("FidEpa");

        bttCambiarSucu.setText("Cambiar Sucursal");
        bttCambiarSucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCambiarSucuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttCambiarSucu)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttCambiarSucu))
                .addContainerGap())
        );

        TablaInventario.setForeground(new java.awt.Color(240, 240, 240));
        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Nombre", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaInventario.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaInventario);

        bttIngresarProd.setBackground(new java.awt.Color(0, 0, 255));
        bttIngresarProd.setForeground(new java.awt.Color(240, 240, 240));
        bttIngresarProd.setText("Ingresar Producto");
        bttIngresarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttIngresarProdActionPerformed(evt);
            }
        });

        bttTransferirProd.setBackground(new java.awt.Color(0, 0, 255));
        bttTransferirProd.setForeground(new java.awt.Color(240, 240, 240));
        bttTransferirProd.setText("Transferir Producto");
        bttTransferirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTransferirProdActionPerformed(evt);
            }
        });

        txaAlerta.setColumns(20);
        txaAlerta.setRows(5);
        jScrollPane1.setViewportView(txaAlerta);

        bttIngresarProd1.setBackground(new java.awt.Color(0, 0, 255));
        bttIngresarProd1.setForeground(new java.awt.Color(240, 240, 240));
        bttIngresarProd1.setText("Modificar Producto");
        bttIngresarProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttIngresarProd1ActionPerformed(evt);
            }
        });

        bttIngresarProd2.setBackground(new java.awt.Color(0, 0, 255));
        bttIngresarProd2.setForeground(new java.awt.Color(240, 240, 240));
        bttIngresarProd2.setText("Retirar Producto");
        bttIngresarProd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttIngresarProd2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttIngresarProd, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(bttIngresarProd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttIngresarProd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttTransferirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttIngresarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttIngresarProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttIngresarProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttTransferirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        menuCambiarSucursal.setText("Sucursal");

        lll.setText("Añadir Sucursal");
        lll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lllActionPerformed(evt);
            }
        });
        menuCambiarSucursal.add(lll);

        jMenuBar1.add(menuCambiarSucursal);

        MenuPedidos.setText("Pedidos");

        MenuClientes.setText("Por Clientes");
        MenuPedidos.add(MenuClientes);

        MenuProveedores.setText("Hacia Proveedores");
        MenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProveedoresActionPerformed(evt);
            }
        });
        MenuPedidos.add(MenuProveedores);

        jMenuBar1.add(MenuPedidos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttTransferirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTransferirProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttTransferirProdActionPerformed

    private void bttSolicitarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSolicitarProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttSolicitarProdActionPerformed

    private void lllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lllActionPerformed
        CrearSucursal si = new  CrearSucursal ();
        this.setVisible(false);
        si.setVisible(true);              
    }//GEN-LAST:event_lllActionPerformed

    private void bttIngresarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIngresarProdActionPerformed
      IngresarProducto si = new  IngresarProducto ();
        this.setVisible(false);
        si.setVisible(true);
    }//GEN-LAST:event_bttIngresarProdActionPerformed

    private void bttIngresarProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIngresarProd1ActionPerformed
        ModificacionProducto mod=new ModificacionProducto();
        this.setVisible(false);
        mod.setVisible(true);
    }//GEN-LAST:event_bttIngresarProd1ActionPerformed

    private void bttIngresarProd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIngresarProd2ActionPerformed
        RetirarProductos eli=new RetirarProductos();
        this.setVisible(false);
        eli.setVisible(true);
    }//GEN-LAST:event_bttIngresarProd2ActionPerformed

    private void MenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProveedoresActionPerformed
        Proveedor pr = new Proveedor();
        PedidoHaciaProveedor ph = new PedidoHaciaProveedor();
        this.setVisible(false);
        pr.setVisible(true);
        ph.setVisible(true);
    }//GEN-LAST:event_MenuProveedoresActionPerformed

    private void bttCambiarSucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCambiarSucuActionPerformed
        limpiartabla();
        mostarTablaInventario();
    }//GEN-LAST:event_bttCambiarSucuActionPerformed
    public void limpiartabla(){
        DefaultTableModel modelo = (DefaultTableModel) TablaInventario.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    public void LeerSucursales(){
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            String comandoSelect = "SELECT * FROM SUCURSALES";
            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(comandoSelect);
            ResultSet resultadoBusqueda = nuevoStatementPreparado.executeQuery();
            while(resultadoBusqueda.next()){
                cbxSucursal.addItem(resultadoBusqueda.getString("nombre"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
    
    public void mostarTablaInventario(){
        String nomSucr = (String) cbxSucursal.getSelectedItem();
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            String comandoSelect = "SELECT * FROM "+ nomSucr;
            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(comandoSelect);
            ResultSet resultadoBusqueda = nuevoStatementPreparado.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) TablaInventario.getModel();
            while(resultadoBusqueda.next()){
                modelo.addRow(new Object[]{resultadoBusqueda.getInt("codigo"),
                resultadoBusqueda.getString("nombre"),
                resultadoBusqueda.getString("tipo"),
                resultadoBusqueda.getString("cantidad"),
                resultadoBusqueda.getString("precio"),});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuClientes;
    private javax.swing.JMenu MenuPedidos;
    private javax.swing.JMenuItem MenuProveedores;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JButton bttCambiarSucu;
    private javax.swing.JButton bttIngresarProd;
    private javax.swing.JButton bttIngresarProd1;
    private javax.swing.JButton bttIngresarProd2;
    private javax.swing.JButton bttSolicitarProd;
    private javax.swing.JButton bttTransferirProd;
    private javax.swing.JComboBox<String> cbxSucursal;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem lll;
    private javax.swing.JMenu menuCambiarSucursal;
    private javax.swing.JTextArea txaAlerta;
    // End of variables declaration//GEN-END:variables
}
