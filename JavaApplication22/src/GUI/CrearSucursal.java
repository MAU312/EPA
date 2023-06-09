package GUI;
import Clase.Sucursal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class CrearSucursal extends javax.swing.JFrame {
    
    
    public CrearSucursal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        lblNombreSucursal = new javax.swing.JLabel();
        lblCodigoSucursal = new javax.swing.JLabel();
        lblDireccionSucursal = new javax.swing.JLabel();
        txfNombreSucursal = new javax.swing.JTextField();
        txfDireccionSucursal = new javax.swing.JTextField();
        txfCodigoSucursal = new javax.swing.JTextField();
        bttAnadirSucursal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblAnadirSucursal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombreSucursal.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreSucursal.setText("Nombre");

        lblCodigoSucursal.setForeground(new java.awt.Color(153, 153, 153));
        lblCodigoSucursal.setText("Codigo");

        lblDireccionSucursal.setForeground(new java.awt.Color(153, 153, 153));
        lblDireccionSucursal.setText("Direccion");

        txfNombreSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreSucursalActionPerformed(evt);
            }
        });

        txfDireccionSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDireccionSucursalActionPerformed(evt);
            }
        });

        txfCodigoSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCodigoSucursalActionPerformed(evt);
            }
        });

        bttAnadirSucursal.setBackground(new java.awt.Color(0, 0, 255));
        bttAnadirSucursal.setForeground(new java.awt.Color(255, 255, 255));
        bttAnadirSucursal.setText("Añadir");
        bttAnadirSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAnadirSucursalActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 231, 15));

        lblAnadirSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAnadirSucursal.setForeground(new java.awt.Color(0, 0, 255));
        lblAnadirSucursal.setText("Añadir Sucursal");

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Inicio");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnadirSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(136, 136, 136))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnadirSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDireccionSucursal)
                            .addComponent(lblNombreSucursal)
                            .addComponent(lblCodigoSucursal)
                            .addComponent(txfNombreSucursal)
                            .addComponent(txfCodigoSucursal)
                            .addComponent(txfDireccionSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bttAnadirSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCodigoSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfCodigoSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDireccionSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfDireccionSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bttAnadirSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreSucursalActionPerformed

    private void txfDireccionSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDireccionSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDireccionSucursalActionPerformed

    private void txfCodigoSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCodigoSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCodigoSucursalActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void bttAnadirSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAnadirSucursalActionPerformed
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            String name = txfNombreSucursal.getText();
            Sucursal sucu = new Sucursal(txfNombreSucursal.getText(), txfDireccionSucursal.getText(), txfCodigoSucursal.getText(),0);
            String sql = "CREATE TABLE "+ name +" ("
                    + "codigo int NOT NULL,"
                    + "nombre VARCHAR(50) NOT NULL,"
                    + "tipo VARCHAR(50) NOT NULL,"
                    + "cantidad int NOT NULL,"
                    + "precio DOUBLE NOT NULL,"
                    + "PRIMARY KEY (codigo)"
                    +");";
            PreparedStatement nuevo2StatamentPreparado = nuevaConexion.prepareStatement(sql);
            nuevo2StatamentPreparado.execute();
            anadirTablaSucursales(sucu);
            JOptionPane.showMessageDialog(this, "Se ha creado la sucursal exitosamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }//GEN-LAST:event_bttAnadirSucursalActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        VentaPrincipal vent= new VentaPrincipal();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    
    public void anadirTablaSucursales(Sucursal s){
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            String comando_Insert = "INSERT INTO SUCURSALES VALUES(?,?,?)";
            PreparedStatement nuevoStatamentPreparado = nuevaConexion.prepareStatement(comando_Insert);
            nuevoStatamentPreparado.setString(1, s.getCodigoSuc());
            nuevoStatamentPreparado.setString(2, s.getNombreSuc());
            nuevoStatamentPreparado.setString(3, s.getUbicacionSuc());
            nuevoStatamentPreparado.executeUpdate();
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
            java.util.logging.Logger.getLogger(CrearSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAnadirSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblAnadirSucursal;
    private javax.swing.JLabel lblCodigoSucursal;
    private javax.swing.JLabel lblDireccionSucursal;
    private javax.swing.JLabel lblNombreSucursal;
    private javax.swing.JTextField txfCodigoSucursal;
    private javax.swing.JTextField txfDireccionSucursal;
    private javax.swing.JTextField txfNombreSucursal;
    // End of variables declaration//GEN-END:variables
}
