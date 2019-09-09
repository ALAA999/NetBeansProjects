/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FileDialog;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.ucanaccess.jdbc.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static pkgfinal.NewJFrame.MainScreen;
import static pkgfinal.NewJFrame1.Search;

/**
 *
 * @author Design
 */
public class ADDer extends javax.swing.JFrame {

    static ADDer addtion;
    /**
     * Creates new form ADDer
     */
    File file[] = new File[0];

    private ADDer() {

        initComponents();
        this.setResizable(false);
        Note.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        this.setSize(950, 750);
        this.setLocationRelativeTo(null);

        ImageIcon img = new ImageIcon(getClass().getResource("2.png"));
        this.setIconImage(img.getImage());

        Note.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                int num = Integer.parseInt(number.getText());

                number.setText((num - 1) + "");
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                int num = Integer.parseInt(number.getText());

                number.setText((num + 1) + "");

            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });
        New_Contract.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    if (!((Name.getText().equals("")) || Date.getText().equals("") || (Id.getText().equals("")) || (Contract_Type.getText().equals("")) || file.length == 0)) {
                        String name1 = Name.getText();
                        String id1 = Id.getText();
                        String date1 = Date.getText();
                        String type1 = Contract_Type.getText();
                        String buyer1 = buyer.getText();
                        String real = "^([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})";
                        Pattern p = Pattern.compile(real);
                        Matcher m = p.matcher(Date.getText());
                        if (m.find()) {
                            custmer cu1 = new custmer(id1, name1, date1, type1, buyer1, Note.getText());
                            NewJFrame1.list.add(cu1);
                            JOptionPane.showMessageDialog(null, "Well Done!");

                            CreateFolder(cu1);
                            Name.setText("");
                            Id.setText("");
                            buyer.setText("");
                            Contract_Type.setText("");
                            Date.setText("");
                            Note.setText("");

                            file = null;
                        } else {
                            JOptionPane.showMessageDialog(null, "Write a Valied Date");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "All Fileds Requierd with Image");

                    }
                } catch (Exception c) {
                    JOptionPane.showMessageDialog(null, c.getMessage());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Contract_Type = new javax.swing.JTextField();
        New_Contract = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        buyer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Note = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        number = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lawyer Islam Al Zaeem");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desgin\\Desktop\\Project Images\\2.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Id.setBackground(new java.awt.Color(76, 76, 76));
        Id.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Id.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        Name.setBackground(new java.awt.Color(76, 76, 76));
        Name.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Contract_Type.setBackground(new java.awt.Color(76, 76, 76));
        Contract_Type.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        Contract_Type.setForeground(new java.awt.Color(255, 255, 255));
        Contract_Type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contract_Type.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Contract_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contract_TypeActionPerformed(evt);
            }
        });

        New_Contract.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desgin\\Desktop\\Project Images\\MainScrren\\Mouse.png")); // NOI18N
        New_Contract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                New_ContractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                New_ContractMouseExited(evt);
            }
        });

        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desgin\\Desktop\\Project Images\\MainScrren\\BACK.png")); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackMousePressed(evt);
            }
        });

        buyer.setBackground(new java.awt.Color(76, 76, 76));
        buyer.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        buyer.setForeground(new java.awt.Color(255, 255, 255));
        buyer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buyer.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Enter ID");

        jLabel4.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Enter Seller");

        jLabel5.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Buyer");

        Date.setBackground(new java.awt.Color(76, 76, 76));
        Date.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Date.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Type");

        jLabel8.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buyer)
                            .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Id)
                            .addComponent(Contract_Type)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(721, 721, 721))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(New_Contract))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contract_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(New_Contract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 750));

        jPanel2.setBackground(new java.awt.Color(105, 181, 45));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desgin\\Desktop\\Project Images\\MainScrren\\Untitled-3.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        Note.setBackground(new java.awt.Color(51, 51, 51));
        Note.setColumns(20);
        Note.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        Note.setForeground(new java.awt.Color(255, 255, 255));
        Note.setRows(5);
        Note.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setViewportView(Note);

        jLabel9.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("عدد الأحرف المتبقية :");

        number.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        number.setForeground(new java.awt.Color(51, 51, 51));
        number.setText("255");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(number)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(173, 173, 173))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(number))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(76, 76, 76))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 690, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void Contract_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contract_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contract_TypeActionPerformed


    private void New_ContractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_ContractMouseEntered

        ImageIcon icon = new ImageIcon(getClass().getResource("MouseMoved.png"));
        icon.getImage().flush();
        New_Contract.setIcon(icon);
    }//GEN-LAST:event_New_ContractMouseEntered

    private void New_ContractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_ContractMouseExited
        ImageIcon icon = new ImageIcon(getClass().getResource("Mouse.png"));
        icon.getImage().flush();
        New_Contract.setIcon(icon);
        // TODO add your handling code here:
    }//GEN-LAST:event_New_ContractMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            FileDialog f = new FileDialog(this);
            f.setMultipleMode(true);
            f.setVisible(true);
            file = f.getFiles();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Please Enter Just Photos !! ");

        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered

        ImageIcon icon = new ImageIcon(getClass().getResource("BACKMOVED.png"));
        icon.getImage().flush();
        Back.setIcon(icon);
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited

        ImageIcon icon = new ImageIcon(getClass().getResource("BACK.png"));
        icon.getImage().flush();
        Back.setIcon(icon);
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseExited

    private void BackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMousePressed
        Name.setText("");
        Id.setText("");
        buyer.setText("");
        Contract_Type.setText("");
        Date.setText("");
        Note.setText("");

        addtion.setVisible(false);
        NewJFrame.getMainScreen();        // TODO add your handling code here:
    }//GEN-LAST:event_BackMousePressed

    private void buyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyerActionPerformed

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
            java.util.logging.Logger.getLogger(ADDer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                addtion = new ADDer();
                addtion.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JTextField Contract_Type;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel New_Contract;
    private javax.swing.JTextArea Note;
    private javax.swing.JTextField buyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel number;
    // End of variables declaration//GEN-END:variables

    public void AddRowToTabl(custmer c) {

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Sample2.mdb", "", "");

            con.setAutoCommit(false);
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            s.execute("select * from Table3");
            ResultSet rs = s.getResultSet();
            rs.moveToInsertRow();
            rs.updateString("ID", c.getId());
            rs.updateString("Seller", c.getName());
            rs.updateString("Buyer", c.getBuierName());
            rs.updateString("Date", c.getDate());
            rs.updateString("Contract", c.getContract_type());
            rs.updateString("Note", c.getNote());
            rs.insertRow();
            rs.moveToCurrentRow();
            con.commit();
            con.close();
            s.close();
            rs.close();
        } catch (Exception ex) {
            Logger.getLogger(ADDer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void CreateFolder(custmer c) {
        String path;
        File Path_Test = new File("C:/Contracts/" + c.getId());
        if (Path_Test.exists()) {
            String[] fileFound = Path_Test.list();
            path = "C:/Contracts/" + c.getId() + "/" + c.getContract_type() + (fileFound.length + 1);
            c.setContract_type(c.getContract_type() + (fileFound.length + 1));
        } else {
            path = "C:/Contracts/" + c.getId() + "/" + c.getContract_type() + 1;
            c.setContract_type(c.getContract_type() + 1);
        }
        createFolder(path, c);
    }

    public void createFolder(String path, custmer cu1) {
        File Folder = new File(path);
        Folder.mkdirs();
        copy_Images(path);
        AddRowToTabl(cu1);
    }

    public void copy_Images(String path) {
        byte[] buffer = new byte[1000];
        try {
            for (int i = 0; i < file.length; i++) {
                FileInputStream fis = new FileInputStream(file[i].getPath());
                BufferedInputStream bis = new BufferedInputStream(fis);

                FileOutputStream fos = new FileOutputStream(path + "/" + file[i].getName());
                BufferedOutputStream bos = new BufferedOutputStream(fos);

                int numBytes;
                while ((numBytes = bis.read(buffer)) != -1) {
                    bos.write(buffer);
                }
                bis.close();
                bos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ADDer getMainScreen() {
        if (addtion == null) {
            addtion = new ADDer();
            addtion.setVisible(true);
            return addtion;

        } else {

            addtion.setVisible(true);

        }
        return addtion;
    }

}
