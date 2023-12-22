package Bulletin.UI;


public class BarreMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public BarreMenu() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        txtBienvenue = new javax.swing.JLabel();
        txtPresentation = new javax.swing.JLabel();
        typeLog = new javax.swing.JLabel();
        guidePanel = new javax.swing.JPanel();
        txtNav = new javax.swing.JLabel();
        txtNavPers = new javax.swing.JLabel();
        txtNavOpt = new javax.swing.JLabel();
        txtNavAdmin = new javax.swing.JLabel();
        txtNavAbt = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuPersonne = new javax.swing.JMenu();
        MIdentification = new javax.swing.JMenuItem();
        ListePersonne = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        Settings = new javax.swing.JMenuItem();
        menuAdmin = new javax.swing.JMenu();
        AdmIden = new javax.swing.JMenuItem();
        MdpChange = new javax.swing.JMenuItem();
        Info_Connex = new javax.swing.JMenuItem();
        menuAide = new javax.swing.JMenu();
        MAbout = new javax.swing.JMenuItem();
        MContact = new javax.swing.JMenuItem();

        jMenu6.setText("jMenu6");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu12.setText("jMenu12");

        jMenuItem16.setText("jMenuItem16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        txtBienvenue.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        txtBienvenue.setText("Bienvenue");

        txtPresentation.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtPresentation.setText("Casier Judiciaire N°3");

        typeLog.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        typeLog.setText("Logiciel OpenSource");

        guidePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide d'utilisation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 16))); // NOI18N

        txtNav.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtNav.setText("-> Pour la navigation vers les autres pages, vous devez utiliser la barre de menu en dessus.");

        txtNavPers.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtNavPers.setText("-> Menu Personne: Pour la manipulation des données des personnes présents ou à ajouter dans la liste");

        txtNavOpt.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtNavOpt.setText("-> Menu Options: Pour les paramètres ou pour vous déconnecter de cette session");

        txtNavAdmin.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtNavAdmin.setText("-> Menu Admin: Pour changer ou ajouter de nouveau utilisateur, supprimer votre compte ou mettre à jour des données");

        txtNavAbt.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtNavAbt.setText("-> Menu  Aide: Pour les informations des développeurs ou les contacter.");

        javax.swing.GroupLayout guidePanelLayout = new javax.swing.GroupLayout(guidePanel);
        guidePanel.setLayout(guidePanelLayout);
        guidePanelLayout.setHorizontalGroup(
            guidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(guidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guidePanelLayout.createSequentialGroup()
                        .addComponent(txtNav)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(guidePanelLayout.createSequentialGroup()
                        .addGroup(guidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNavPers)
                            .addComponent(txtNavOpt)
                            .addComponent(txtNavAdmin)
                            .addComponent(txtNavAbt))
                        .addGap(0, 62, Short.MAX_VALUE))))
        );
        guidePanelLayout.setVerticalGroup(
            guidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNavPers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNavOpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNavAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNavAbt)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        menuPersonne.setText("Personne");

        MIdentification.setText("Identification");
        MIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIdentificationActionPerformed(evt);
            }
        });
        menuPersonne.add(MIdentification);

        ListePersonne.setText("Liste");
        ListePersonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListePersonneActionPerformed(evt);
            }
        });
        menuPersonne.add(ListePersonne);

        MenuBar.add(menuPersonne);

        menuOptions.setText("Options");

        Settings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Settings.setText("Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        menuOptions.add(Settings);

        MenuBar.add(menuOptions);

        menuAdmin.setText("Admin");

        AdmIden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        AdmIden.setText("Identification");
        AdmIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmIdenActionPerformed(evt);
            }
        });
        menuAdmin.add(AdmIden);

        MdpChange.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MdpChange.setText("Changer de mot de passe");
        MdpChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MdpChangeActionPerformed(evt);
            }
        });
        menuAdmin.add(MdpChange);

        Info_Connex.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Info_Connex.setText("Détails de connexion");
        Info_Connex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info_ConnexActionPerformed(evt);
            }
        });
        menuAdmin.add(Info_Connex);

        MenuBar.add(menuAdmin);

        menuAide.setText("Aide");
        menuAide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAideActionPerformed(evt);
            }
        });

        MAbout.setText("A propos");
        MAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAboutActionPerformed(evt);
            }
        });
        menuAide.add(MAbout);

        MContact.setText("Contact");
        MContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MContactActionPerformed(evt);
            }
        });
        menuAide.add(MContact);

        MenuBar.add(menuAide);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBienvenue)
                        .addGap(492, 492, 492))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPresentation)
                        .addGap(460, 460, 460))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(typeLog)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(guidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(txtBienvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPresentation)
                .addGap(40, 40, 40)
                .addComponent(guidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(typeLog)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdmIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmIdenActionPerformed
    AdIdentification frm = new AdIdentification();
    frm.setVisible(true); 
    }//GEN-LAST:event_AdmIdenActionPerformed

    private void MdpChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MdpChangeActionPerformed
    ChangePassword frm = new ChangePassword();
    frm.setVisible(true); 
    }//GEN-LAST:event_MdpChangeActionPerformed

    private void Info_ConnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info_ConnexActionPerformed
    InfoConnexion frm = new InfoConnexion();
    frm.setVisible(true); 
    }//GEN-LAST:event_Info_ConnexActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
     Settings frm= new Settings();
     frm.setVisible(true);
    }//GEN-LAST:event_SettingsActionPerformed

    private void menuAideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAideActionPerformed

    }//GEN-LAST:event_menuAideActionPerformed

    // Pour ouvrir AboutUs
    private void MAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAboutActionPerformed
     AboutUs frm= new AboutUs();
     frm.setVisible(true);
    }//GEN-LAST:event_MAboutActionPerformed

    private void MIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIdentificationActionPerformed
    // Ajout d'un nouveau personne dans la liste
    AjoutPersonne frm= new AjoutPersonne();
    frm.setVisible(true);
    }//GEN-LAST:event_MIdentificationActionPerformed

    private void ListePersonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListePersonneActionPerformed
    // Voir la liste des personnes dans la liste
    ListePersonne frm = Bulletin.UI.ListePersonne.getInstance();
    frm.setVisible(true);
    }//GEN-LAST:event_ListePersonneActionPerformed

    
    // Pour ouvrir la page Contact
    private void MContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MContactActionPerformed
     Contact frm = new Contact();
     frm.setVisible(true);
    }//GEN-LAST:event_MContactActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(evt.getClickCount()==1){
            System.out.println("Clicked");
        }
        if(evt.getClickCount()==2){
            System.out.println("Double click");
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BarreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarreMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdmIden;
    private javax.swing.JMenuItem Info_Connex;
    private javax.swing.JMenuItem ListePersonne;
    private javax.swing.JMenuItem MAbout;
    private javax.swing.JMenuItem MContact;
    private javax.swing.JMenuItem MIdentification;
    private javax.swing.JMenuItem MdpChange;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JPanel guidePanel;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuAide;
    private javax.swing.JMenu menuOptions;
    private javax.swing.JMenu menuPersonne;
    private javax.swing.JLabel txtBienvenue;
    private javax.swing.JLabel txtNav;
    private javax.swing.JLabel txtNavAbt;
    private javax.swing.JLabel txtNavAdmin;
    private javax.swing.JLabel txtNavOpt;
    private javax.swing.JLabel txtNavPers;
    private javax.swing.JLabel txtPresentation;
    private javax.swing.JLabel typeLog;
    // End of variables declaration//GEN-END:variables
}
