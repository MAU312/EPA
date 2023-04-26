package GUI;

import Clase.Cliente;
import Clase.LeerSucursales;
import Clase.Producto;
import Clase.Sucursal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoDelCliente extends javax.swing.JFrame implements LeerSucursales{
    
    static ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
    
    public PedidoDelCliente() {
        initComponents();
        LeerSucursales();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEdadCliente = new javax.swing.JLabel();
        txfIDCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPedidosClientes = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        txfNombreCliente = new javax.swing.JTextField();
        lblTelCliente = new javax.swing.JLabel();
        txfTelCliente = new javax.swing.JTextField();
        lblDireccionCliente = new javax.swing.JLabel();
        txfDireccionCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfNombreProducto = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txfCantidadProd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxSucursal = new javax.swing.JComboBox<>();
        bttEnviar = new javax.swing.JButton();

        lblEdadCliente.setText("ID cliente:");

        txfIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIDClienteActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 231, 15));

        lblPedidosClientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPedidosClientes.setForeground(new java.awt.Color(0, 0, 255));
        lblPedidosClientes.setText("Pedidos De Clientes");

        lblInicio.setForeground(new java.awt.Color(0, 0, 255));
        lblInicio.setText("inicio");
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblPedidosClientes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInicio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblPedidosClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInicio)
                .addGap(4, 4, 4))
        );

        lblNombreCliente.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreCliente.setText("Nombre Del cliente");

        txfNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreClienteActionPerformed(evt);
            }
        });

        lblTelCliente.setForeground(new java.awt.Color(153, 153, 153));
        lblTelCliente.setText("Telefono");

        txfTelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTelClienteActionPerformed(evt);
            }
        });

        lblDireccionCliente.setForeground(new java.awt.Color(153, 153, 153));
        lblDireccionCliente.setText("Direccion:");

        txfDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDireccionClienteActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Nombre Del Producto:");

        txfNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreProductoActionPerformed(evt);
            }
        });

        lblCantidad.setForeground(new java.awt.Color(153, 153, 153));
        lblCantidad.setText("Cantidad");

        txfCantidadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCantidadProdActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Sucursal");

        bttEnviar.setBackground(new java.awt.Color(0, 0, 255));
        bttEnviar.setForeground(new java.awt.Color(240, 240, 240));
        bttEnviar.setText("Enviar");
        bttEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNombreCliente)
                        .addComponent(txfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelCliente)
                        .addComponent(txfTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDireccionCliente)
                        .addComponent(txfDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(txfCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttEnviar)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccionCliente)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(bttEnviar)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
        EnviarPedidoCliente();
        
    }//GEN-LAST:event_bttEnviarActionPerformed

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        VentaPrincipal vent = new VentaPrincipal();
        this.setVisible(false);
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblInicioMouseClicked
   
    public void RegistroClientes(){
        try {
            //CREAMOS LA CONEXION CON LA BD
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            //DEFINIR EL COMANDO CON PARAMETROS
            String comando_Insert = "INSERT INTO CLIENTES (nombre, telefono, direccion) VALUES(?,?,?)";
            PreparedStatement nuevoStatamentPreparado = 
                    nuevaConexion.prepareStatement(comando_Insert);
            //DEFINIR LOS PARAMETROS
            nuevoStatamentPreparado.setString(1, txfNombreCliente.getText());
            nuevoStatamentPreparado.setString(2, txfTelCliente.getText());
            nuevoStatamentPreparado.setString(3, txfDireccionCliente.getText());
            //EJECUTAMOS EL COMANDO
            
            nuevoStatamentPreparado.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error"
                    + " al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
    public void EnviarPedidoCliente(){
         try {
            //CREAMOS LA CONEXION CON LA BD
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            //DEFINIR EL COMANDO CON PARAMETROS
            String comando_Insert = "INSERT INTO PEDIDOSPORCLIENTES (NombreProducto, NombreCliente, CantidadProducto, sucursal) VALUES(?,?,?,?)";
            PreparedStatement nuevoStatamentPreparado = 
                    nuevaConexion.prepareStatement(comando_Insert);
            //DEFINIR LOS PARAMETROS
            nuevoStatamentPreparado.setString(1, txfNombreProducto.getText());
            nuevoStatamentPreparado.setString(2, txfNombreProducto.getText());
            nuevoStatamentPreparado.setString(3, txfCantidadProd.getText());
            nuevoStatamentPreparado.setString(4, (String) cbxSucursal.getSelectedItem());
            //EJECUTAMOS EL COMANDO
            ventas();
            nuevoStatamentPreparado.executeUpdate();
            JOptionPane.showMessageDialog(this, "Se ha creado el registro exitosamente");   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error"
                    + " al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
    
    public void ventas(){
        Producto p = new Producto();
        String sucu = (String)cbxSucursal.getSelectedItem();
        try {
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/basedatos", "root", "Steve123.");//DEFINIR EL COMANDO CON PARAMETROS
            String comando_select = "SELECT SUCURSAL, NUMEROVENTAS  FROM VENTA WHERE Sucursal = ?";
            PreparedStatement nuevoStatamentPreparado = nuevaConexion.prepareStatement(comando_select); //DEFINIR LOS PARAMETROS
            nuevoStatamentPreparado.setString(1, sucu); //EJECUTAMOS EL COMANDO Y ALMACENAMOS EL RESULTADO
            ResultSet resultadoBusqueda = nuevoStatamentPreparado.executeQuery(); //EN ESTE CASO SOLO QUEREMOS QUE NOS MUESTRE EL PRIMER RESULTADO
            if (resultadoBusqueda.next()) {
                editarVenta(resultadoBusqueda.getInt("NumeroVentas"), sucu);
            }else {
                insertarVenta();
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error"
                    + " al conectarse a la base de datos. Error " + ex.getMessage());
        }
   
    }
    
    
    public void insertarVenta(){
        try {
            //CREAMOS LA CONEXION CON LA BD
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            //DEFINIR EL COMANDO CON PARAMETROS
            String comando_Insert = "INSERT INTO VENTA (Sucursal, NumeroVentas) VALUES(?,?)";
            PreparedStatement nuevoStatamentPreparado = 
                    nuevaConexion.prepareStatement(comando_Insert);
            //DEFINIR LOS PARAMETROS
            nuevoStatamentPreparado.setString(1, (String)cbxSucursal.getSelectedItem());
            nuevoStatamentPreparado.setInt(2, 1);
            //EJECUTAMOS EL COMANDO
            nuevoStatamentPreparado.executeUpdate();  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error"
                    + " al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
    
    public void editarVenta(int num, String sucu){
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            String comando_select = "UPDATE VENTA SET NUMEROVENTAS = ? WHERE Sucursal = ?" ;
            PreparedStatement nuevoStatamentPreparado = nuevaConexion.prepareStatement(comando_select);
            nuevoStatamentPreparado.setInt(1, num+1);
            nuevoStatamentPreparado.setString(2, sucu);
            nuevoStatamentPreparado.executeUpdate();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error al conectarse a la base de datos. Error " + ex.getMessage());
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
    public void LeerSucursales() {
        try {
            Connection nuevaConexion = DriverManager.getConnection("jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            String comandoSelect = "SELECT * FROM SUCURSALES";
            PreparedStatement nuevoStatementPreparado = nuevaConexion.prepareStatement(comandoSelect);
            ResultSet resultadoBusqueda = nuevoStatementPreparado.executeQuery();
            while (resultadoBusqueda.next()) {
                cbxSucursal.addItem(resultadoBusqueda.getString("nombre"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ha ocurrido un error al conectarse a la base de datos. Error " + ex.getMessage());
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
    private javax.swing.JComboBox<String> cbxSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEdadCliente;
    private javax.swing.JLabel lblInicio;
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
