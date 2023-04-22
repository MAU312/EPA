package GUI;

import Clase.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PedidoDelCliente extends javax.swing.JFrame {

    public PedidoDelCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEdadCliente = new javax.swing.JLabel();
        txfIDCliente = new javax.swing.JTextField();
        lblPedidosClientes = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        txfNombreCliente = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txfCantidadProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfNombreProducto = new javax.swing.JTextField();
        lblDireccionCliente = new javax.swing.JLabel();
        txfDireccionCliente = new javax.swing.JTextField();
        lblTelCliente = new javax.swing.JLabel();
        txfTelCliente = new javax.swing.JTextField();
        bttEnviar = new javax.swing.JButton();

        lblEdadCliente.setText("ID cliente:");

        txfIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIDClienteActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPedidosClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPedidosClientes.setText("Pedidos De Clientes");

        lblNombreCliente.setText("Nombre Del cliente");

        txfNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreClienteActionPerformed(evt);
            }
        });

        lblCantidad.setText("Cantidad");

        txfCantidadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCantidadProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Del Producto:");

        txfNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreProductoActionPerformed(evt);
            }
        });

        lblDireccionCliente.setText("Direccion:");

        txfDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDireccionClienteActionPerformed(evt);
            }
        });

        lblTelCliente.setText("Telefono");

        txfTelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTelClienteActionPerformed(evt);
            }
        });

        bttEnviar.setText("Enviar");
        bttEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPedidosClientes)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttEnviar)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantidad)
                                    .addComponent(txfCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreCliente)
                                    .addComponent(txfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccionCliente)
                                    .addComponent(txfDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelCliente))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblPedidosClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lblNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDireccionCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(bttEnviar)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClienteActionPerformed

    private void txfCantidadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCantidadProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCantidadProdActionPerformed

    private void txfNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreProductoActionPerformed

    private void txfIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIDClienteActionPerformed

    private void txfDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDireccionClienteActionPerformed

    private void txfTelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTelClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelClienteActionPerformed

    private void bttEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEnviarActionPerformed
        RegistroClientes();
        
    }//GEN-LAST:event_bttEnviarActionPerformed
    public void RegistroClientes(){
         try {
            //CREAMOS LA CONEXION CON LA BD
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            //DEFINIR EL COMANDO CON PARAMETROS
            String comando_Insert = "INSERT INTO CLIENTES (nombre, direccion, telefono) VALUES(?,?,?)";
            PreparedStatement nuevoStatamentPreparado = 
                    nuevaConexion.prepareStatement(comando_Insert);
            //DEFINIR LOS PARAMETROS
            if(!EsVacia()){
                nuevoStatamentPreparado.setString(1, txfNombreCliente.getText());
                nuevoStatamentPreparado.setString(2, txfDireccionCliente.getText());
                nuevoStatamentPreparado.setString(3, txfTelCliente.getText());
            }
            //EJECUTAMOS EL COMANDO
            nuevoStatamentPreparado.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha creado el "
                    + "registro exitosamente");   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error"
                    + " al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
    public void EnviarPedidoCliente(Producto sProducto){
        try {
            //CREAMOS LA CONEXION CON LA BD
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            //DEFINIR EL COMANDO CON PARAMETROS
            String comando_Insert = "INSERT INTO PEDIDOSPORCLIENTES (NombreProducto, CantidadProducto) VALUES(?,?)";
            PreparedStatement nuevoStatamentPreparado = 
                    nuevaConexion.prepareStatement(comando_Insert);
            //DEFINIR LOS PARAMETROS
            if(!EsVacia()){
                nuevoStatamentPreparado.setString(1, txfNombreProducto.getText());
                nuevoStatamentPreparado.setString(2, txfCantidadProd.getText());
            }
            //EJECUTAMOS EL COMANDO
            nuevoStatamentPreparado.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha creado el "
                    + "registro exitosamente");   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error"
                    + " al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
    
    public boolean EsVacia(){
        if(txfCantidadProd.getText().isEmpty()&&txfNombreProducto.getText().isEmpty()&&txfNombreCliente.getText().isEmpty()&&
                txfIDCliente.getText().isEmpty()&&txfTelCliente.getText().isEmpty()&&txfDireccionCliente.getText().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
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
            java.util.logging.Logger.getLogger(PedidoDelCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoDelCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoDelCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoDelCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoDelCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEnviar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEdadCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblPedidosClientes;
    private javax.swing.JLabel lblTelCliente;
    private javax.swing.JTextField txfCantidadProd;
    private javax.swing.JTextField txfDireccionCliente;
    private javax.swing.JTextField txfIDCliente;
    private javax.swing.JTextField txfNombreCliente;
    private javax.swing.JTextField txfNombreProducto;
    private javax.swing.JTextField txfTelCliente;
    // End of variables declaration//GEN-END:variables
}
