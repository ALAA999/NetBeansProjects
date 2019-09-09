/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import static pkgfinal.NewJFrame.MainScreen;

public class NewJFrame1 extends javax.swing.JFrame {

    static ArrayList<custmer> arrayList = new ArrayList<custmer>();
    static ArrayList<custmer> list = new ArrayList<>();
    static NewJFrame1 Search;

    private NewJFrame1() {
        this.setResizable(false);

        initComponents();
        arrayList.clear();
        list.clear();
        this.setLocationRelativeTo(null);
        AddRowToTabl();

        ImageIcon img = new ImageIcon(getClass().getResource("2.png"));
        this.setIconImage(img.getImage());
        // Search_Contract.setVisible(false);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Name.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                Id.setText("");
                Date.setText("");
                Buyer.setText("");
                Clean_Table_Rows();
                Search_by_Name();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                Clean_Table_Rows();
                Search_by_Name();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });

        Id.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                Name.setText("");
                Date.setText("");
                Buyer.setText("");
                Clean_Table_Rows();
                Search_by_ID();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                Clean_Table_Rows();
                Search_by_Name();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });
        Buyer.getDocument().addDocumentListener(new DocumentListener() { // the text field of the id

            @Override
            public void insertUpdate(DocumentEvent de) {
                Name.setText("");
                Date.setText("");
                Id.setText("");

                Clean_Table_Rows();
                Search_by_NameBuyer();

            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                Clean_Table_Rows();
                Search_by_ID();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });// the text field of the id
        GAZA.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                JTable table = (JTable) me.getSource();
                Point point = me.getPoint();
                int row_selected = table.rowAtPoint(point);
                if (me.getClickCount() == 2) {
                    File file = new File("C:/Contracts/" + list.get(row_selected).getId() + "/" + list.get(row_selected).getContract_type());
                    String note = "";
                    String paths[] = new String[file.list().length];
                    for (int i = 0; i < file.list().length; i++) {
                        paths[i] = "C:/Contracts/" + list.get(row_selected).getId() + "/" + list.get(row_selected).getContract_type() + "/" + file.list()[i];
                        note = list.get(i).getNote();

                    }

                    Search.setVisible(false);
                    ViewImages.getMainScreen(paths, note);

                    //new ViewImages(images).setVisible(true);
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }

            private void openViewer(String[] paths) {

            }
        });
        Date.getDocument().addDocumentListener(new DocumentListener() { // the text field of the date

            @Override
            public void insertUpdate(DocumentEvent de) {
                Name.setText("");
                Buyer.setText("");
                Id.setText("");

                Clean_Table_Rows();
                Search_by_Date();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {

                Clean_Table_Rows();
                Search_by_Date();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GAZA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Buyer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();

        jTable1.setFont(new java.awt.Font("Helvetica World", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "رقم الهوية ", "الإسم", "التاريخ", "نوع العقد"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lawyer Islam Al Zaeem");

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/BACK.png"))); // NOI18N
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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        GAZA.setFont(new java.awt.Font("Helvetica World", 0, 14)); // NOI18N
        GAZA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المشتري", "نوع العقد", "التاريخ", "البائع ", "رقم الهوية"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(GAZA);
        if (GAZA.getColumnModel().getColumnCount() > 0) {
            GAZA.getColumnModel().getColumn(0).setResizable(false);
            GAZA.getColumnModel().getColumn(1).setResizable(false);
            GAZA.getColumnModel().getColumn(2).setResizable(false);
            GAZA.getColumnModel().getColumn(3).setResizable(false);
            GAZA.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Enter ID");

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

        jLabel4.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Enter Seller");

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

        jLabel5.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Enter Buyer");

        Buyer.setBackground(new java.awt.Color(76, 76, 76));
        Buyer.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        Buyer.setForeground(new java.awt.Color(255, 255, 255));
        Buyer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Buyer.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Buyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Date");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Buyer)
                            .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Id)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(Buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        Buyer.setText("");
        Date.setText("");

        Search.setVisible(false);
        NewJFrame.getMainScreen();        // TODO add your handling code here:
    }//GEN-LAST:event_BackMousePressed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void BuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Search = new NewJFrame1();
                Search.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JTextField Buyer;
    private javax.swing.JTextField Date;
    private javax.swing.JTable GAZA;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 
    public void Search_by_Name() {
        try {
            String Name = this.Name.getText();
            if (Name.isEmpty()) {
                Clean_Table_Rows();
            } else {
                list.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getName().contains(Name)) {
                        SetTableModel(arrayList.get(i));
                        list.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    public void Search_by_NameBuyer() {
        try {
            String Name = this.Buyer.getText();
            if (Name.isEmpty()) {
                Clean_Table_Rows();
            } else {
                list.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getBuierName().contains(Name)) {
                        SetTableModel(arrayList.get(i));
                        list.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    public void Search_by_ID() {
        try {
            String id = Id.getText();
            if (id.isEmpty()) {
                Clean_Table_Rows();
            } else {
                list.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getId().contains(id)) {
                        SetTableModel(arrayList.get(i));
                        list.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    public void Search_by_Date() {
        try {
            String date = Date.getText();
            if (date.isEmpty()) {
                Clean_Table_Rows();
            } else {
                list.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getDate().contains(date)) {
                        SetTableModel(arrayList.get(i));
                        list.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    public void Clean_Table_Rows() {
        DefaultTableModel model = (DefaultTableModel) GAZA.getModel();
        model.setRowCount(0);
    }

    public void SetTableModel(custmer c) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) GAZA.getModel();
        defaultTableModel.addRow(new String[]{c.getBuierName(), c.getContract_type(), c.getDate(), c.getName(), c.getId(),});
        GAZA.setModel(defaultTableModel);
    }

    public void AddRowToTabl() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Sample2.mdb", "", "");

            con.setAutoCommit(false);
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            s.execute("select * from Table3");
            ResultSet rs = s.getResultSet();
            rs.last();
            rs.first();

            for (int i = 0; i < rs.getRow(); i++) {
                String name = rs.getString("Seller");
                String id = rs.getString("ID");
                String date = rs.getString("Date");
                String contract = rs.getString("Contract");
                String buyer = rs.getString("Buyer");
                String Note = rs.getString("Note");
                arrayList.add(new custmer(id, name, date, contract, buyer, Note));
                rs.next();
            }

            con.close();
            s.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static NewJFrame1 getMainScreen() {
        if (Search == null) {
            Search = new NewJFrame1();
            Search.setVisible(true);
            return Search;
            //  return Search = new NewJFrame1();

        } else {

            Search.setVisible(true);

        }
        return Search;
    }

}
