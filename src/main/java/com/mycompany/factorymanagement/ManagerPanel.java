/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.factorymanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author login
 */
public class ManagerPanel extends javax.swing.JFrame {
    
    EmployeeClass employeeData;

    /**
     * Creates new form ManagerPanel
     */
    public ManagerPanel() {
        initComponents();
    }
    
    public ManagerPanel(EmployeeClass employeeData) {
        initComponents();
        this.employeeData = employeeData;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(131, 50));

        jMenu1.setText("Profile");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Products");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Foreman");
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Stock");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Log Out ");
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Exit");
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        EmployeeTable addEmployee = new EmployeeTable(3, employeeData);
        addEmployee.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
        View viwe = new View(employeeData);
        viwe.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        AddProduct product = new AddProduct(employeeData);
        product.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        AddStock product = new AddStock(employeeData);
        product.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        int result = JOptionPane.showConfirmDialog(null, "Are You sure you want to SIGN OUT ?");
        switch (result) {
            case JOptionPane.YES_OPTION -> {
                LoginBefore login = new LoginBefore();
                login.setVisible(true);
                
                this.dispose();
                break;
            }
            case JOptionPane.NO_OPTION -> {
                break;
            }
            case JOptionPane.CANCEL_OPTION -> {
                break;
            }
            case JOptionPane.CLOSED_OPTION -> {
                break;
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MenuSelected

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
            java.util.logging.Logger.getLogger(ManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
