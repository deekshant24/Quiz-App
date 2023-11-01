/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapplication;

import java.text.SimpleDateFormat;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author 91708
 */
public class studentDetails extends javax.swing.JFrame {

    /**
     * Creates new form studentDetails
     */
    public studentDetails() {
        initComponents();
        jTextArea1.setEditable(false);
        SimpleDateFormat dFormate = new SimpleDateFormat("dd-MM-yy");
        Date date = new Date();
        jLabel3.setText(dFormate.format(date));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapplication/index student.png"))); // NOI18N
        jLabel1.setText("Fill up the form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Date :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 23, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapplication/Back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 118, 48));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapplication/Close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 79, 1372, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Roll No :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 101, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 146, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Father Name :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 194, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setText("Mother Name :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 248, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Gender :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 293, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Contact No :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 344, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setText("Email :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 395, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setText("10th Marks :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 456, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setText("12th Marks :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 507, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setText("Grduation :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 558, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setText("Address :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 606, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 98, 379, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 143, 379, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 194, 379, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 245, 379, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 341, 379, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 392, 379, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 153, 153));
        jTextField8.setText("university name");
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 380, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 153, 153));
        jTextField9.setText("university name");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 504, 380, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(153, 153, 153));
        jTextField10.setText("university name");
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 555, 380, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 606, 874, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 290, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setText("Enter Percentage");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 453, 190, -1));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(153, 153, 153));
        jTextField12.setText("Enter passout year");
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 453, 200, -1));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(153, 153, 153));
        jTextField13.setText("Enter Percentage");
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 504, 190, -1));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(153, 153, 153));
        jTextField14.setText("Enter passout year");
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 504, 200, -1));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(153, 153, 153));
        jTextField15.setText("Enter Percentage");
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 555, 190, -1));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(153, 153, 153));
        jTextField16.setText("Enter passout year");
        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField16FocusLost(evt);
            }
        });
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 555, 200, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapplication/save.png"))); // NOI18N
        jButton3.setText("Save & Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 682, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Best Of Luck For Your Exam");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 245, -1, 64));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapplication/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you want to close","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
        System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String rollNo= jTextField1.getText();
        String name= jTextField2.getText();
        String fatherName= jTextField3.getText();
        String motherName= jTextField4.getText();
        String gender= (String)jComboBox1.getSelectedItem();
        String contactNo= jTextField6.getText();
        String email= jTextField7.getText();
        String tenthUniversityName= jTextField8.getText();
        String tenthPercentage= jTextField5.getText();
        String tenthPassoutYear= jTextField12.getText();
        String twelveUniversityName= jTextField9.getText();
        String twelvePercentage= jTextField13.getText();
        String twelvePassoutYear= jTextField14.getText();
        String graduationUniversityName= jTextField10.getText();
        String graduationPercentage= jTextField15.getText();
        String graduationPassoutYear= jTextField16.getText();
        String address= jTextField11.getText();
        String marks= "0";
        try{
        Connection con = ConnectionProvider.getCon();
        PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,rollNo);
        ps.setString(2,name);
        ps.setString(3,fatherName);
        ps.setString(4,motherName);
        ps.setString(5,gender);
        ps.setString(6,contactNo);
        ps.setString(7,email);
        ps.setString(8,tenthUniversityName);
        ps.setString(9,tenthPercentage);
        ps.setString(10,tenthPassoutYear);
        ps.setString(11,twelveUniversityName);
        ps.setString(12,twelvePercentage);
        ps.setString(13,twelvePassoutYear);
        ps.setString(14,graduationUniversityName);
        ps.setString(15,graduationPercentage);
        ps.setString(16,graduationPassoutYear);
        ps.setString(17,address);
        ps.setString(18,marks);
        ps.executeUpdate();
        setVisible(false);
        new instructionStudent(rollNo).setVisible(true);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        // TODO add your handling code here:
        if(jTextField8.getText().equals("university name")){
        jTextField8.setText("");
        jTextField8.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        // TODO add your handling code here:
         if(jTextField9.getText().equals("university name")){
        jTextField9.setText("");
        jTextField9.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        // TODO add your handling code here:
         if(jTextField10.getText().equals("university name")){
        jTextField10.setText("");
        jTextField10.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
         if(jTextField5.getText().equals("Enter Percentage")){
        jTextField5.setText("");
        jTextField5.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        // TODO add your handling code here:
         if(jTextField13.getText().equals("Enter Percentage")){
        jTextField13.setText("");
        jTextField13.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        // TODO add your handling code here:
         if(jTextField15.getText().equals("Enter Percentage")){
        jTextField15.setText("");
        jTextField15.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        // TODO add your handling code here:
        if(jTextField12.getText().equals("Enter passout year")){
        jTextField12.setText("");
        jTextField12.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField12FocusGained

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        // TODO add your handling code here:
        if(jTextField14.getText().equals("Enter passout year")){
        jTextField14.setText("");
        jTextField14.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        // TODO add your handling code here:
        if(jTextField16.getText().equals("Enter passout year")){
        jTextField16.setText("");
        jTextField16.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField16FocusGained

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        // TODO add your handling code here:
        if(jTextField8.getText().equals("")){
        jTextField8.setText("university name");
        jTextField8.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        // TODO add your handling code here:
        if(jTextField9.getText().equals("")){
        jTextField9.setText("university name");
        jTextField9.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        // TODO add your handling code here:
        if(jTextField10.getText().equals("")){
        jTextField10.setText("university name");
        jTextField10.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField10FocusLost

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        if(jTextField5.getText().equals("")){
        jTextField5.setText("Enter Percentage");
        jTextField5.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
        // TODO add your handling code here:
        if(jTextField13.getText().equals("")){
        jTextField13.setText("Enter Percentage");
        jTextField13.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField13FocusLost

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        // TODO add your handling code here:
        if(jTextField15.getText().equals("")){
        jTextField15.setText("Enter Percentage");
        jTextField15.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField15FocusLost

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
        // TODO add your handling code here:
        if(jTextField12.getText().equals("")){
        jTextField12.setText("Enter passout year");
        jTextField12.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        // TODO add your handling code here:
        if(jTextField14.getText().equals("")){
        jTextField14.setText("Enter passout year");
        jTextField14.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField14FocusLost

    private void jTextField16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusLost
        // TODO add your handling code here:
        if(jTextField16.getText().equals("")){
        jTextField16.setText("Enter passout year");
        jTextField16.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField16FocusLost

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
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}