/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ui;

/**
 *
 * @author ChalewT
 */
public class JSimsMain extends javax.swing.JFrame {

    /**
     * Creates new form JSimsMain
     */
    public JSimsMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        mnuOrganization = new javax.swing.JMenu();
        mnuiNewCollege = new javax.swing.JMenuItem();
        mnuiNewDepartment = new javax.swing.JMenuItem();
        mnuiViewColleges = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JSims - Student Information Management System");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        mnuOrganization.setMnemonic('O');
        mnuOrganization.setText("Institution");
        mnuOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrganizationActionPerformed(evt);
            }
        });

        mnuiNewCollege.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuiNewCollege.setText("New College");
        mnuiNewCollege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiNewCollegeActionPerformed(evt);
            }
        });
        mnuOrganization.add(mnuiNewCollege);

        mnuiNewDepartment.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuiNewDepartment.setText("New Department");
        mnuiNewDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiNewDepartmentActionPerformed(evt);
            }
        });
        mnuOrganization.add(mnuiNewDepartment);

        mnuiViewColleges.setText("View Colleges");
        mnuiViewColleges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiViewCollegesActionPerformed(evt);
            }
        });
        mnuOrganization.add(mnuiViewColleges);

        jMenuItem1.setText("NewFildOfStudy");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuOrganization.add(jMenuItem1);

        menuBar.add(mnuOrganization);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mnuiNewCollegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiNewCollegeActionPerformed
        NewCollege college = new NewCollege(this, true);
        college.setLocationRelativeTo(this);
        college.setVisible(true);
    }//GEN-LAST:event_mnuiNewCollegeActionPerformed

    private void mnuiNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiNewDepartmentActionPerformed
        // TODO add your handling code here:
        NewDepartment dept = new NewDepartment(this, true);
        dept.setLocationRelativeTo(this);
        dept.setVisible(true);
    }//GEN-LAST:event_mnuiNewDepartmentActionPerformed

    private void mnuiViewCollegesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiViewCollegesActionPerformed
        ViewCollege faculty = new ViewCollege();
        desktopPane.add(faculty);
        faculty.setVisible(true);
        faculty.toFront();
    }//GEN-LAST:event_mnuiViewCollegesActionPerformed

    private void mnuOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrganizationActionPerformed
        // TODO add your handling code here:
        NewFildOfStudy NewFild= new NewFildOfStudy(this,true);
        NewFild.setVisible(true);
        NewFild.setLocationRelativeTo(this);
    }//GEN-LAST:event_mnuOrganizationActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        NewFildOfStudy NewFild= new NewFildOfStudy(this,true);
        NewFild.setVisible(true);
        NewFild.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(JSimsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSimsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSimsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSimsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSimsMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuOrganization;
    private javax.swing.JMenuItem mnuiNewCollege;
    private javax.swing.JMenuItem mnuiNewDepartment;
    private javax.swing.JMenuItem mnuiViewColleges;
    // End of variables declaration//GEN-END:variables

}
