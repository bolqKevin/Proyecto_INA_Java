/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterfaceLayer;

import java.awt.Dimension;

/**
 *
 * @author Kevin Bolaños V.
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public frmMenu() {
        initComponents();
        this.setExtendedState(frmMenu.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuMaintenance = new javax.swing.JMenu();
        mnuClients = new javax.swing.JMenuItem();
        mnuPets = new javax.swing.JMenuItem();
        mnuPurchases = new javax.swing.JMenu();
        mnuSales = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpEscritorioLayout = new javax.swing.GroupLayout(dpEscritorio);
        dpEscritorio.setLayout(dpEscritorioLayout);
        dpEscritorioLayout.setHorizontalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        dpEscritorioLayout.setVerticalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        MnuMaintenance.setText("Mantenimiento");

        mnuClients.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuClients.setText("Clientes");
        mnuClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClientsActionPerformed(evt);
            }
        });
        MnuMaintenance.add(mnuClients);

        mnuPets.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPets.setText("Mascotas");
        mnuPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPetsActionPerformed(evt);
            }
        });
        MnuMaintenance.add(mnuPets);

        jMenuBar1.add(MnuMaintenance);

        mnuPurchases.setText("Compras");
        mnuPurchases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuPurchasesMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuPurchases);

        mnuSales.setText("Ventas");
        mnuSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalesMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClientsActionPerformed
        // TODO add your handling code here:
        frmClients frm_Cli = new frmClients();
        dpEscritorio.add(frm_Cli);
        
        Dimension size = dpEscritorio.getSize();
        
        Dimension sizeInter = frm_Cli.getSize();
        
        frm_Cli.setLocation (((int)size.getWidth() - (int)sizeInter.getWidth())/2,
                            ((int)size.getHeight() - (int)sizeInter.getHeight())/2);
        frm_Cli.show();
    }//GEN-LAST:event_mnuClientsActionPerformed

    private void mnuPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPetsActionPerformed
        // TODO add your handling code here:

        frmPets frm_Pets = new frmPets();
        dpEscritorio.add(frm_Pets);
        
        Dimension size = dpEscritorio.getSize();
        
        Dimension sizeInter = frm_Pets.getSize();
        
        frm_Pets.setLocation (((int)size.getWidth() - (int)sizeInter.getWidth())/2,
                            ((int)size.getHeight() - (int)sizeInter.getHeight())/2);
        frm_Pets.show();
    }//GEN-LAST:event_mnuPetsActionPerformed

    private void mnuPurchasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuPurchasesMouseClicked
        // TODO add your handling code here:
        frmPurchases frm_Purchases = new frmPurchases();
        dpEscritorio.add(frm_Purchases);
        
        Dimension size = dpEscritorio.getSize();
        
        Dimension sizeInter = frm_Purchases.getSize();
        
        frm_Purchases.setLocation (((int)size.getWidth() - (int)sizeInter.getWidth())/2,
                            ((int)size.getHeight() - (int)sizeInter.getHeight())/2);
        frm_Purchases.show();
    }//GEN-LAST:event_mnuPurchasesMouseClicked

    private void mnuSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalesMouseClicked
        // TODO add your handling code here:
        frmSales frm_Sales = new frmSales();
        dpEscritorio.add(frm_Sales);
        
        Dimension size = dpEscritorio.getSize();
        
        Dimension sizeInter = frm_Sales.getSize();
        
        frm_Sales.setLocation (((int)size.getWidth() - (int)sizeInter.getWidth())/2,
                            ((int)size.getHeight() - (int)sizeInter.getHeight())/2);
        frm_Sales.show();
    }//GEN-LAST:event_mnuSalesMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnuMaintenance;
    private javax.swing.JDesktopPane dpEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuClients;
    private javax.swing.JMenuItem mnuPets;
    private javax.swing.JMenu mnuPurchases;
    private javax.swing.JMenu mnuSales;
    // End of variables declaration//GEN-END:variables
}
