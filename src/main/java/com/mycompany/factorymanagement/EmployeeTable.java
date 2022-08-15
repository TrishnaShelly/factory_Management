/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.factorymanagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author login
 */
public class EmployeeTable extends javax.swing.JFrame {

    int role = 0;
    ConnectionClass connectionClass = ConnectionClass.getInstance();
    ArrayList<EmployeeClass> employeeData = new ArrayList<>();
    int selectedRow;
    int desti = 1;
    EmployeeClass employeedata, managerData;

    /**
     * Creates new form EmployeeTable
     */
    public EmployeeTable() {
        initComponents();
        createTable();
    }

    public EmployeeTable(int role, EmployeeClass managerData) {
        initComponents();
        this.role = role;
        desti = managerData.getRole();
        System.out.println("desti inside employeetable" + desti);
        this.managerData = managerData;
        switch (role) {
            case 2 ->
                add.setText("Add Manager ");
            case 3 ->
                add.setText("Add ForeMan ");
            default ->
                add.setVisible(false);
        }
        createTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        add = new com.mycompany.factorymanagement.Button();
        button1 = new com.mycompany.factorymanagement.Button();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new com.mycompany.factorymanagement.TableDark();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add.setBackground(new java.awt.Color(117, 12, 117));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add Employee");
        add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(117, 12, 117));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Go To Home");
        button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        AddEmployee add = new AddEmployee(role, managerData);
        add.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (desti == 2) {
            ManagerPanel manager = new ManagerPanel(managerData);
            manager.setVisible(true);
            this.dispose();
        } else if (desti == 1) {
            AdminPanel admin = new AdminPanel(managerData);
            admin.setVisible(true);
            this.dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
try {
            // TODO add your handling code here:
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            selectedRow = table.getSelectedRow();
            String i = dtm.getValueAt(selectedRow, 0).toString();
            //            System.out.println("ID is " + i);

            EmployeeClass data = new EmployeeClass();
            data.setId(Integer.parseInt(dtm.getValueAt(selectedRow, 0).toString()));
            data.setName(dtm.getValueAt(selectedRow, 1).toString());
            data.setEmail(dtm.getValueAt(selectedRow, 2).toString());
            data.setAge(Integer.parseInt(dtm.getValueAt(selectedRow, 3).toString()));
            data.setJoiningDate(dtm.getValueAt(selectedRow, 4).toString());

            String sql = "SELECT * FROM users WHERE ID=? ";
            PreparedStatement ps = connectionClass.connection.prepareStatement(sql);
            ps.setInt(1, data.getId());
            //            ps.setInt(2, 1);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data.setRole(rs.getInt("role"));
                data.setAddress(rs.getString("Address"));
                data.setPassword(rs.getString("password"));
                data.setContactNumber(rs.getString("contactNumber"));
                //                data.setAdharNumber(rs.getString("adharNumber"));

            }
            AddEmployee employee = new AddEmployee(managerData, data, true);
            employee.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UsersTAble.class.getName()).log(Level.SEVERE, null, ex);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.factorymanagement.Button add;
    private com.mycompany.factorymanagement.Button button1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private com.mycompany.factorymanagement.TableDark table;
    // End of variables declaration//GEN-END:variables
public void createTable() {
        String statement = "SELECT * FROM users WHERE  role=?";
        try {
            PreparedStatement ps = connectionClass.connection.prepareStatement(statement);
//         System.out.println("Sucess");
            ps.setInt(1, role);

            ResultSet resultSet = ps.executeQuery();
//            System.out.println("Sucessfullt executed");

            String[] headerName = {"ID", "Name", "emailId", "Age", "Joining Date"};
            DefaultTableModel model = new DefaultTableModel(null, headerName);
            table.setModel(model);
            while (resultSet.next()) {
                EmployeeClass data = new EmployeeClass();
                data.setId(resultSet.getInt("ID"));
                data.setName(resultSet.getString("name"));
//                    data.setLastName(resultSet.getString("LastName"));
                data.setEmail(resultSet.getString("email"));
                data.setAge(resultSet.getInt("age"));
                data.setJoiningDate(resultSet.getString("joiningDate"));
//                                        data.setFullname(data.getFirstName(), data.getLastName());
//
                employeeData.add(data);
            }

            Object[] row = new Object[5];
            for (int i = 0; i < employeeData.size(); i++) {
                row[0] = employeeData.get(i).getId();
                row[1] = employeeData.get(i).getName();
                row[2] = employeeData.get(i).getEmail();
                row[3] = employeeData.get(i).getAge();
                row[4] = employeeData.get(i).getJoiningDate();
                model.addRow(row);
//                    }

            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
