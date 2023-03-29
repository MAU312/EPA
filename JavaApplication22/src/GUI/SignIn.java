/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Clase.ListaUsuarios;
import Clase.Usuario;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class SignIn extends javax.swing.JFrame {

    private LogIn logIn;
    static ArrayList<Usuario> UsuariosCreados = new ArrayList<Usuario>();
    
    public SignIn() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        txfNombreUsuario = new javax.swing.JTextField();
        txfCorreoUsuario = new javax.swing.JTextField();
        lblCorreoUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        lblContraseñaUsuario = new javax.swing.JLabel();
        txfContraseñaUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNombreUsuario1 = new javax.swing.JLabel();
        txfNombreUsuario1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombreUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreUsuario.setText("Nombre");

        txfNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreUsuarioActionPerformed(evt);
            }
        });

        txfCorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCorreoUsuarioActionPerformed(evt);
            }
        });

        lblCorreoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblCorreoUsuario.setText("Correo electronico");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Crear nueva cuenta de cliente");

        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Usuario");

        txfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsuarioActionPerformed(evt);
            }
        });

        lblContraseñaUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblContraseñaUsuario.setText("Contraseña");

        txfContraseñaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfContraseñaUsuarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(" Crear Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Informacion de inicio de sesión ");

        lblNombreUsuario1.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreUsuario1.setText("Apellido");

        txfNombreUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreUsuario1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Informacion Personal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(lblNombreUsuario)
                    .addComponent(txfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUsuario1)
                    .addComponent(txfNombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoUsuario)
                    .addComponent(jLabel3)
                    .addComponent(txfCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario)
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseñaUsuario)
                    .addComponent(txfContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(lblNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(lblCorreoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContraseñaUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreUsuarioActionPerformed

    private void txfCorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCorreoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCorreoUsuarioActionPerformed

    private void txfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfUsuarioActionPerformed

    private void txfContraseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfContraseñaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfContraseñaUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txfNombreUsuario.getText().isBlank()|| txfCorreoUsuario.getText().isBlank()
                |txfUsuario.getText().isBlank() || txfContraseñaUsuario.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Porfavor Complete todos los campos.");
        }else{
            Usuario u = new Usuario(txfNombreUsuario.getText(),txfUsuario.getText(),txfContraseñaUsuario.getText(),txfCorreoUsuario.getText());
            UsuariosCreados.add(u);
            Collections.sort(UsuariosCreados);
            ListaUsuarios nLista = new ListaUsuarios(UsuariosCreados);
            try {
                
                FileOutputStream miArchio = new FileOutputStream("UsuariosCreados");
                ObjectOutputStream output = new ObjectOutputStream(miArchio);
                output.writeObject(nLista);
                output.close();
                miArchio.close();

            } catch (Exception ex) {
                System.out.println("Exception: " + ex.getMessage());
            }
            JOptionPane.showMessageDialog(null,"Se ha agregado el usuario con exito.");
            this.logIn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfNombreUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseñaUsuario;
    private javax.swing.JLabel lblCorreoUsuario;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNombreUsuario1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txfContraseñaUsuario;
    private javax.swing.JTextField txfCorreoUsuario;
    private javax.swing.JTextField txfNombreUsuario;
    private javax.swing.JTextField txfNombreUsuario1;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
