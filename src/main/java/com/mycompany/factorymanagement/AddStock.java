/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.factorymanagement;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author login
 */
public class AddStock extends javax.swing.JFrame {

    StockClass productData;
    boolean isUpdate = false,deleted=false;
    double d;
//EmployeeClass data
    EmployeeClass employeeData = new EmployeeClass();
    String simpleDate,select;
    ConnectionClass con = ConnectionClass.getInstance();
    ArrayList<String> pro = new ArrayList<>();
    double quantity;

    /**
     * Creates new form AddStock
     */
    public AddStock() {
        initComponents();
    }

    public AddStock(EmployeeClass employeeData) {

        initComponents();
        Date d = new Date();
        SimpleDateFormat frrmatter = new SimpleDateFormat("dd/MM/yyyy");
        simpleDate = frrmatter.format(d);
        date.setText(simpleDate);
        q1.setVisible(false);
        this.employeeData = employeeData;

        String s = "SELECT name FROM products";
        try {
            pro.clear();
            PreparedStatement p = con.connection.prepareStatement(s);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                if (pro.contains(rs.getString("name"))) {

                } else {
                    pro.add(rs.getString("name"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        product.removeAllItems();
        product.addItem("SELECT A PRODUCT NAME ");
        for (int i = 0; i < pro.size(); i++) {
            product.addItem(pro.get(i));
        }

    }

    public AddStock(StockClass productData, EmployeeClass employeeData) {
        initComponents();
        q1.setVisible(false);
        isUpdate = true;
        add.setText("Update Product");
        view.setText("Delete Product");
        this.productData = productData;
        this.employeeData = employeeData;
        String s = "SELECT name FROM products";
        try {
            PreparedStatement p = con.connection.prepareStatement(s);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                if (pro.contains(rs.getString("name"))) {

                } else {
                    pro.add(rs.getString("name"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        product.removeAllItems();
        product.addItem("SELECT A PRODUCT NAME ");
        for (int i = 0; i < pro.size(); i++) {
            product.addItem(pro.get(i));
        }

        product.setSelectedItem(productData.getName());
        date.setText(productData.getDate());
        q.setText(String.valueOf(productData.getStock()));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        product = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        q = new javax.swing.JTextField();
        q1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Stock ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Select Product :");

        date.setText("Date");

        jLabel3.setText("Enter Quantity:");

        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });
        q.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qKeyTyped(evt);
            }
        });

        q1.setText("Error");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        view.setText("View Stock ");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jButton1.setText("Go to Home ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(view))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(product, 0, 273, Short.MAX_VALUE)
                                .addComponent(q)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(product, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(q, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view)
                    .addComponent(jButton1))
                .addGap(0, 99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qActionPerformed

    private void qKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qKeyTyped
        q1.setVisible(false);
        char ch = evt.getKeyChar();
        if ((Character.isDigit(ch) || ch == KeyEvent.VK_BACK_SPACE) || ch == '.') {
        } else {
            q1.setVisible(true);
            q1.setText("Invalid Character " + ch);
            evt.consume();

        }         // TODO add your handling code here:

    }//GEN-LAST:event_qKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (employeeData.getRole()) {
            case 2 ->                 {
                    ManagerPanel manager = new ManagerPanel(employeeData);
                    manager.setVisible(true);
                    this.dispose();
                }
            case 1 ->                 {
                    AdminPanel manager = new AdminPanel(employeeData);
                    manager.setVisible(true);
                    this.dispose();
                }
            case 3 ->                 {
                    ForemanPanel manager = new ForemanPanel(employeeData);
                    manager.setVisible(true);
                    this.dispose();
                } // TODO add your handling code here:
            default -> {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (q1.getText().equals("")) {
            char[] ch = q1.getText().toCharArray();
            JOptionPane.showMessageDialog(this, "Please enter quantity ");

        } else if (isUpdate) {
            DecimalFormat df = new DecimalFormat("$#,##0.00");
            String str = "UPDATE stock SET name=?,stock=? WHERE ID=?";
            try {
                PreparedStatement ps = con.connection.prepareStatement(str);
                select= String.valueOf(product.getSelectedItem());
                ps.setString(1,select);
                try {
//                    d=Double.parseDouble(q.getText().trim()) - (productData.getStock());
                    quantity= (Double.parseDouble(q.getText().trim()));
                    ps.setDouble(2, (Double.parseDouble(q.getText().trim())));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please enter a Double ");
                    return;
                }
//                ps.setDouble(2, (Double.parseDouble(q1.getText().trim())));
                ps.setInt(3, productData.getId());
                ps.execute();
                JOptionPane.showMessageDialog(null, "updated sucessfully");

            } catch (SQLException ex) {
                Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            String sql = "INSERT INTO stock (name, date, stock) VALUES(?,?,?)";

            PreparedStatement ps;
            try {
                ps = con.connection.prepareStatement(sql);
                select= String.valueOf(product.getSelectedItem());
                ps.setString(1, String.valueOf(product.getSelectedItem()));
                ps.setString(2, simpleDate);
                try {
                    quantity=Double.parseDouble(q.getText().trim());
                    ps.setDouble(3, (quantity));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please enter a Double ");
                    return;
                }
                ps.execute();
                JOptionPane.showMessageDialog(null, "added sucessfully");

            } catch (SQLException ex) {
                Logger.getLogger(AddStock.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        up();
        StockTable employee = new StockTable(employeeData);
                    employee.setVisible(true);
                    this.dispose();
     
       

    }//GEN-LAST:event_addActionPerformed

     public void up(){
        String sql = "SELECT * FROM products";
        try {
            PreparedStatement ps = con.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id =(rs.getInt("ID"));   
                if (select.equals(rs.getString("name"))) {
                    String sql2 = "UPDATE  products SET stock=? WHERE ID =?";

                    PreparedStatement ps2 = con.connection.prepareStatement(sql2);
                    if(!isUpdate){
                    ps2.setDouble(1, (quantity) + rs.getDouble("stock"));}
                    else if(deleted){
                        ps2.setDouble(1,rs.getDouble("stock")-quantity); 
                    }
                    else{
                        double value=rs.getDouble("stock")-productData.getStock() ;
                        System.out.println(value);
                        System.out.println(quantity);
                     ps2.setDouble(1,value+quantity);   
                    }
                    ps2.setInt(2, id);
                    ps2.execute();
                    
// TODO add your handling c
                }
            }

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        if (isUpdate) {
            try {
                select=productData.getName();
                String sql = "DELETE FROM stock WHERE id=?";
                PreparedStatement preparedStatement2 = con.connection.prepareStatement(sql);
                preparedStatement2.setInt(1, productData.getId());
                preparedStatement2.execute();
                JOptionPane.showMessageDialog(null, "deleted sucessfully");
                deleted=true;
                quantity=productData.getStock();
                up();
//                String sql2 = "UPDATE  products SET stock=? WHERE ID =?";
//
//                    PreparedStatement ps2 = con.connection.prepareStatement(sql2);
////                    if(!isUpdate){
//                    ps2.setDouble(1,);//}
//                   
//                    ps2.setInt(2, productData.getId());
//                    ps2.execute();
                StockTable employee = new StockTable(employeeData);

                employee.setVisible(true);
                this.dispose();
                // TODO add your handling code here:
            } catch (SQLException ex) {
                Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
//            StockTable employee = new StockTable(employeeData);
//
//            employee.setVisible(true);
//            this.dispose();
        }

        StockTable employee = new StockTable(employeeData);
        employee.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_viewActionPerformed

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
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JTextField q;
    private javax.swing.JLabel q1;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
