package Bulletin.UI;


import Bulletin.persistence.Admin.Admin;
import Bulletin.persistence.Admin.AdminService;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

// Pour changer le mot de passe Administrateur
public class ChangePassword extends javax.swing.JFrame {

private AdminService adminService = AdminService.getInstance();
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomUser = new javax.swing.JLabel();
        OldMdp = new javax.swing.JLabel();
        NewMdp = new javax.swing.JLabel();
        MdpConf = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        btnSaveChange = new javax.swing.JButton();
        MdpOld = new javax.swing.JPasswordField();
        MdpNew = new javax.swing.JPasswordField();
        ConfMdp = new javax.swing.JPasswordField();
        txtTitleSection = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NomUser.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        NomUser.setText("Utilisateur");

        OldMdp.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        OldMdp.setText("Ancien mot de passe");

        NewMdp.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        NewMdp.setText("Nouveau mot de passe");

        MdpConf.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        MdpConf.setText("Confirmer le mot de passe");

        btnSaveChange.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        btnSaveChange.setText("Changer le mot de passe");
        btnSaveChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveChangeMouseClicked(evt);
            }
        });
        btnSaveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangeActionPerformed(evt);
            }
        });

        ConfMdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConfMdpKeyPressed(evt);
            }
        });

        txtTitleSection.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        txtTitleSection.setText("Changement de mot de passe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NewMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(MdpNew, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(MdpOld)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomUser)
                                    .addComponent(OldMdp))
                                .addGap(65, 65, 65)
                                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtTitleSection)
                                .addGap(29, 29, 29)))
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MdpConf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(ConfMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnSaveChange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(txtTitleSection)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MdpOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewMdp)
                    .addComponent(MdpNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MdpConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnSaveChange, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ConfMdp, MdpNew, MdpOld, UserName});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveChangeMouseClicked
       
    }//GEN-LAST:event_btnSaveChangeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void btnSaveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangeActionPerformed
        try{
         String Newpass=String.valueOf(MdpNew.getPassword());
         String ConfPass=String.valueOf(ConfMdp.getPassword());
        String OldPass=String.valueOf(MdpOld.getPassword());
        String uName=UserName.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Entrer votre nom d'utilisateur",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Veuillez entrer votre ancien mot de passe",
                                          "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Veuillez entrer votre nouveau mot de passe",
                                          "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Veuillez confirmer votre mot de passe",
                                          "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               else if (Newpass.length()< 8) {
               
                JOptionPane.showMessageDialog(this,
                                         "Le mot de passe doit contenir au moins 8 caractères",
                                         "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this,
                                         "Mot de passe identique..Veuillez reecrire votre mot de passe","Erreur", JOptionPane.ERROR_MESSAGE);
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,
                                         "Le nouveau mot de passe ne se corresponde pas, réessayez",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Admin admin = adminService.getAdmin(uName,OldPass);
            if(admin!=null)
            {
                adminService.changeMdp(admin.getId(),Newpass);
                 JOptionPane.showMessageDialog(this,"Mot de passe modifié avec succès");
                 if(ConnexionBeanHandler.getLogin() == admin){
                 if(JOptionPane.showConfirmDialog(this,"Voulez vous vous deconnecter ?","Deconnection",
                         JOptionPane.YES_NO_OPTION)==0){
                     ConnexionBeanHandler.disconnect();
                     return;
                 }
                 ConnexionBeanHandler.setLogin(adminService.getAdminByUsername(admin.getUsername()));
                 this.dispose();
                 return;
                 }
              }
            else
            {
             JOptionPane.showMessageDialog(this,"Utilisateur ou mot de passe erroné","Erreur", JOptionPane.ERROR_MESSAGE);   
             UserName.setText("");
             MdpOld.setText("");
             MdpNew.setText("");
             ConfMdp.setText("");
             return;
            }
        }catch(HeadlessException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
    }//GEN-LAST:event_btnSaveChangeActionPerformed

    private void ConfMdpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfMdpKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try {
                String Newpass = String.valueOf(MdpNew.getPassword());
                String ConfPass = String.valueOf(ConfMdp.getPassword());
                String OldPass = String.valueOf(MdpOld.getPassword());
                String uName = UserName.getText();
                if (uName.equals("")) {

                    JOptionPane.showMessageDialog(this, "Entrer votre nom d'utilisateur",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;

                } else if (OldPass.equals("")) {

                    JOptionPane.showMessageDialog(this, "Veuillez entrer votre ancien mot de passe",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;

                } else if (Newpass.equals("")) {

                    JOptionPane.showMessageDialog(this, "Veuillez entrer votre nouveau mot de passe",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;

                } else if (ConfPass.equals("")) {

                    JOptionPane.showMessageDialog(this, "Veuillez confirmer votre mot de passe",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (Newpass.length() < 5) {

                    JOptionPane.showMessageDialog(this,
                            "Le mot de passe doit contenir au moins 5 caractères",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if ((Newpass).equals(OldPass)) {

                    JOptionPane.showMessageDialog(this,
                            "Mot de passe identique..Veuillez reecrire votre mot de passe", "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (!(Newpass).equals(ConfPass)) {

                    JOptionPane.showMessageDialog(this,
                            "Le nouveau mot de passe ne se corresponde pas, réessayez",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Admin admin = adminService.getAdmin(uName, OldPass);
                if (admin != null) {
                    adminService.changeMdp(admin.getId(), Newpass);
                    JOptionPane.showMessageDialog(this, "Mot de passe modifié avec succès");
                    if (ConnexionBeanHandler.getLogin() == admin) {
                        if (JOptionPane.showConfirmDialog(this, "Voulez vous vous deconnecter ?", "Deconnection",
                                JOptionPane.YES_NO_OPTION) == 0) {
                            ConnexionBeanHandler.disconnect();
                            return;
                        }
                        ConnexionBeanHandler.setLogin(adminService.getAdminByUsername(admin.getUsername()));
                        this.dispose();
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Utilisateur ou mot de passe erroné", "Erreur", JOptionPane.ERROR_MESSAGE);
                    UserName.setText("");
                    MdpOld.setText("");
                    MdpNew.setText("");
                    ConfMdp.setText("");
                    return;
                }
            } catch (HeadlessException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_ConfMdpKeyPressed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfMdp;
    private javax.swing.JLabel MdpConf;
    private javax.swing.JPasswordField MdpNew;
    private javax.swing.JPasswordField MdpOld;
    private javax.swing.JLabel NewMdp;
    private javax.swing.JLabel NomUser;
    private javax.swing.JLabel OldMdp;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton btnSaveChange;
    private javax.swing.JLabel txtTitleSection;
    // End of variables declaration//GEN-END:variables
}
