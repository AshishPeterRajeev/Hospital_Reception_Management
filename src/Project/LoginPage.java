/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

import Connect.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CodeHub
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        pass_err.setVisible(false);
        
    }
    
    public void qSnippet(String uname,String pass){
        try{
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("update user_auth set flag=1 where username=? and password=?");
            st.setString(1, uname);
            st.setString(2, pass);
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameJL = new javax.swing.JLabel();
        passwordJL = new javax.swing.JLabel();
        usernameJT = new javax.swing.JTextField();
        loginJB = new javax.swing.JButton();
        closeJB = new javax.swing.JButton();
        passwordJT = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pass_err = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign-In Page");
        setBackground(new java.awt.Color(153, 204, 255));
        setUndecorated(true);

        usernameJL.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        usernameJL.setText("Username");

        passwordJL.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        passwordJL.setText("Password");

        loginJB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        loginJB.setForeground(new java.awt.Color(0, 153, 153));
        loginJB.setText("Login");
        loginJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJBActionPerformed(evt);
            }
        });

        closeJB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        closeJB.setForeground(new java.awt.Color(255, 51, 51));
        closeJB.setText("Close");
        closeJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Sign In");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Register New User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pass_err.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass_err.setForeground(new java.awt.Color(255, 51, 51));
        pass_err.setText("Password Incorrect!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameJL)
                            .addComponent(passwordJL))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameJT)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginJB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeJB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordJT, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(pass_err, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJL)
                    .addComponent(usernameJT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJL)
                    .addComponent(passwordJT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_err, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(closeJB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginJB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJBActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Do you want to exit?","Select",JOptionPane.YES_NO_OPTION);
        if(option==0)
            System.exit(0);
    }//GEN-LAST:event_closeJBActionPerformed

    private void loginJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJBActionPerformed
        // TODO add your handling code here:
        String username=usernameJT.getText();
        String password=passwordJT.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            PreparedStatement st = con.prepareStatement("select username,password from user_auth");
            ResultSet rs = st.executeQuery();
            String userdb="";
            String passdb="";
            int flag=0;
            while(rs.next()){
                userdb=rs.getString("username");
                passdb=rs.getString("password");
                if(userdb.equals(username)){
                    flag=1;
                    if(password.equals(passdb)){
                        qSnippet(username,password);
                        setVisible(false);
                        new HomePage().setVisible(true);
                    }
                    else{
                        pass_err.setVisible(true);
                        break;
                    }
                }
            
            }
            
            if(flag==0)
                JOptionPane.showMessageDialog(this, "User Not Found");
            }
        catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*if(username.equals("admin") && password.equals("password")){
        setVisible(false);
        new HomePage().setVisible(true);
        }
        else
        JOptionPane.showMessageDialog(null, "Incorrect Username or Password");*/
        
        /*if(username.equals("admin") && password.equals("password")){
            setVisible(false);
            new HomePage().setVisible(true);
        }
        else
        JOptionPane.showMessageDialog(null, "Incorrect Username or Password");*/
    }//GEN-LAST:event_loginJBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new userRegistrationPage().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginJB;
    private javax.swing.JLabel pass_err;
    private javax.swing.JLabel passwordJL;
    private javax.swing.JPasswordField passwordJT;
    private javax.swing.JLabel usernameJL;
    private javax.swing.JTextField usernameJT;
    // End of variables declaration//GEN-END:variables
}
