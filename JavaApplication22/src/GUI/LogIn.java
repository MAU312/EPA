/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Clase.ListaUsuarios;
import Clase.Usuario;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


import javax.swing.JOptionPane;


public class LogIn extends javax.swing.JFrame {
    
    private VentaPrincipal vPrincipal;
    
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(cuadro,"src/Imagenes/FidEpakk.png");
    }

    public VentaPrincipal getvPrincipal() {
        return vPrincipal;
    }

    public void setvPrincipal(VentaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
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
        jPanel2 = new javax.swing.JPanel();
        cuadro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        txfContraseña = new javax.swing.JTextField();
        bttIngresar = new javax.swing.JButton();
        bttRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cuadro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("FidEpa Login");

        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Usuario");

        lblContraseña.setForeground(new java.awt.Color(153, 153, 153));
        lblContraseña.setText("Contraseña");

        txfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsuarioActionPerformed(evt);
            }
        });

        bttIngresar.setBackground(new java.awt.Color(0, 0, 255));
        bttIngresar.setForeground(new java.awt.Color(255, 255, 255));
        bttIngresar.setText("Ingresar");
        bttIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttIngresarActionPerformed(evt);
            }
        });

        bttRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        bttRegistrarse.setForeground(new java.awt.Color(0, 0, 255));
        bttRegistrarse.setText("Crear cuenta");
        bttRegistrarse.setActionCommand("Create Account");
        bttRegistrarse.setBorder(null);
        bttRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(lblUsuario)
                                .addComponent(lblContraseña)
                                .addComponent(bttIngresar)
                                .addComponent(txfContraseña))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(bttRegistrarse)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttRegistrarse)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(bttIngresar)
                .addGap(0, 197, Short.MAX_VALUE))
            .addComponent(cuadro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfUsuarioActionPerformed

    private void bttIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttIngresarActionPerformed
        if(txfContraseña.getText().isBlank() || txfUsuario.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Debe completar los campos.");
        }else{
            try{
            FileInputStream miArchio2 = new FileInputStream("UsuariosCreados");
            ObjectInputStream input = new ObjectInputStream(miArchio2);
            ListaUsuarios uLeido= (ListaUsuarios) input.readObject();
            
            for (int i = 0; i < uLeido.getListaDeUsuarios().size(); i++) {
                if((uLeido.getListaDeUsuarios().get(i).getUsuario().equals(txfUsuario)) &&(uLeido.getListaDeUsuarios().get(i).getPasswordU().equals(txfContraseña)) ){
                    this.vPrincipal.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos.");
                    i++;
                }
            }
            input.close();
            miArchio2.close();
            
            }catch(Exception ex){
                System.out.println("Exception: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_bttIngresarActionPerformed

    private void bttRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRegistrarseActionPerformed
        SignIn si = new SignIn();
        si.setLogIn(this);
        this.setVisible(false);
        si.setVisible(true);
    }//GEN-LAST:event_bttRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    private void SetImageLabel(JLabel labelName, String root){
       ImageIcon image= new ImageIcon(root);
       Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_DEFAULT));
       labelName.setIcon(icon);
       this.repaint();
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttIngresar;
    private javax.swing.JButton bttRegistrarse;
    private javax.swing.JLabel cuadro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txfContraseña;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables

   
}
