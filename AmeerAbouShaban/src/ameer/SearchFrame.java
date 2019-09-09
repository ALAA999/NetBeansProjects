/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ameer;

import static ameer.MainFrame.frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alaa
 */
public class SearchFrame extends javax.swing.JFrame {

    ArrayList<Bought> arrayList = new ArrayList<>();
    ArrayList<Bought> searchList = new ArrayList<>();

    /**
     * Creates new form SearchFrame
     */
    public SearchFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        setIcons();
        fetchData();
        addFieldsListeners();
    }

    private void addFieldsListeners() {
        et_username_search.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                et_username_phone.setText("");
                et_username_type.setText("");
                et_date.setText("");
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
        et_username_phone.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                et_username_search.setText("");
                et_username_type.setText("");
                et_date.setText("");
                Clean_Table_Rows();
                Search_by_Phone();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                Clean_Table_Rows();
                Search_by_Phone();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });
        et_username_type.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                et_username_phone.setText("");
                et_username_search.setText("");
                et_date.setText("");
                Clean_Table_Rows();
                Search_by_Type();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                Clean_Table_Rows();
                Search_by_Type();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });
        et_date.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                et_username_phone.setText("");
                et_username_search.setText("");
                et_username_type.setText("");
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
        searchTable.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable table = (JTable) e.getSource();
                    Point point = e.getPoint();
                    int row_selected = table.rowAtPoint(point);
                    String nameSelected = (String) table.getValueAt(row_selected, 0);
                    ShowCustomerDetails.bought.setName(nameSelected);
                    ShowCustomerDetails.bought.setType((String) table.getValueAt(row_selected, 1));
                    ShowCustomerDetails.bought.setPhoneNumber((String) table.getValueAt(row_selected, 2));
                    ShowCustomerDetails.bought.setNumber((String) table.getValueAt(row_selected, 3));
                    ShowCustomerDetails.bought.setPrice((String) table.getValueAt(row_selected, 4));
                    ShowCustomerDetails.bought.setTotalPrice((String) table.getValueAt(row_selected, 5));
                    ShowCustomerDetails.bought.setPaid((String) table.getValueAt(row_selected, 6));
                    ShowCustomerDetails.bought.setRestOfMoney((String) table.getValueAt(row_selected, 7));
                    ShowCustomerDetails.bought.setNotes((String) table.getValueAt(row_selected, 8));
                    ShowCustomerDetails.bought.setDate((String) table.getValueAt(row_selected, 9));
                    ShowCustomerDetails.customerID = getIdFromName(nameSelected);
                    ShowCustomerDetails scd = new ShowCustomerDetails();
                    scd.setVisible(true);
                    System.out.println(getIdFromName(nameSelected));
                    dispose();
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

    private void fetchData() {
        arrayList.clear();
        searchList.clear();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Alaa\\Documents\\NetBeansProjects\\"
                    + "AmeerAbouShaban\\Ameer.mdb", "", "");

            con.setAutoCommit(false);
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            s.execute("select * from Boughts"); // select the data from the table
            ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query
            rs.first();

            for (int i = 0; i < rs.getRow(); i++) {
                String id = rs.getString("ID");
                String name = rs.getString("Name");
                String type = rs.getString("Type");
                String phone = rs.getString("Phone");
                String number = rs.getString("Number");
                String price = rs.getString("Price");
                String restOfMoney = rs.getString("RestOfMoney");
                String payingWay = rs.getString("PayingWay");
                String notes = rs.getString("Notes");
                String date = rs.getString("BoughtDate");
                Bought bought = new Bought();
                bought.setId(id);
                bought.setName(name);
                bought.setNotes(notes);
                bought.setNumber(number);
                bought.setType(type);
                bought.setPhoneNumber(phone);
                bought.setPrice(price);
                bought.setRestOfMoney(restOfMoney);
                bought.setPayingWay(payingWay);
                bought.setDate(date);
                int priceInt = Integer.parseInt(bought.getPrice());
                int numberInt = Integer.parseInt(bought.getNumber());
                int restOfMoneyInt = Integer.parseInt(bought.getRestOfMoney());
                int totalPrice = priceInt * numberInt;
                int paid = totalPrice - restOfMoneyInt;
                bought.setTotalPrice("" + totalPrice);
                bought.setPaid("" + paid);
                arrayList.add(bought);
                SetTableModel(bought);
                System.out.println(bought.toString());
                rs.next();
            }
            con.close();
            s.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }

    }

    public void SetTableModel(Bought b) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) searchTable.getModel();
        defaultTableModel.addRow(new String[]{b.getName(), b.getType(), b.getPhoneNumber(), b.getNumber(), b.getPrice(), b.getTotalPrice(), b.getPaid(), b.getRestOfMoney(), b.getNotes(), b.getDate()});
        searchTable.setModel(defaultTableModel);
    }

    public void Clean_Table_Rows() {
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
        model.setRowCount(0);
    }

    private void setIcons() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appLogo.png")));
        /*imageHeader.setIcon(new ImageIcon(getClass().getResource("logo.png")));
         ameerAd.setIcon(new ImageIcon(getClass().getResource("ameerAd.png")));*/
    }

    public void Search_by_Name() {
        try {
            String Name = this.et_username_search.getText();
            if (Name.isEmpty()) {
                Clean_Table_Rows();
                for (int i = 0; i < arrayList.size(); i++) {
                    SetTableModel(arrayList.get(i));
                }
            } else {
                searchList.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getName().contains(Name)) {
                        SetTableModel(arrayList.get(i));
                        searchList.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    public void Search_by_Phone() {
        try {
            String phone = this.et_username_phone.getText();
            if (phone.isEmpty()) {
                Clean_Table_Rows();
                for (int i = 0; i < arrayList.size(); i++) {
                    SetTableModel(arrayList.get(i));
                }
            } else {
                searchList.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getPhoneNumber().contains(phone)) {
                        SetTableModel(arrayList.get(i));
                        searchList.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    private void Search_by_Type() {
        try {
            String type = this.et_username_type.getText();
            if (type.isEmpty()) {
                Clean_Table_Rows();
                for (int i = 0; i < arrayList.size(); i++) {
                    SetTableModel(arrayList.get(i));
                }
            } else {
                searchList.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getType().contains(type)) {
                        SetTableModel(arrayList.get(i));
                        searchList.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    private void Search_by_Date() {
        try {
            String date = this.et_date.getText();
            if (date.isEmpty()) {
                Clean_Table_Rows();
                for (int i = 0; i < arrayList.size(); i++) {
                    SetTableModel(arrayList.get(i));
                }
            } else {
                searchList.clear();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getDate().contains(date)) {
                        SetTableModel(arrayList.get(i));
                        searchList.add(arrayList.get(i));
                    }
                }
            }
        } catch (Exception ex) {
        }
    }

    private String getIdFromName(String name) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                return arrayList.get(i).getId();
            }
        }
        return "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tv_username = new javax.swing.JLabel();
        et_username_search = new javax.swing.JTextField();
        tv_username1 = new javax.swing.JLabel();
        et_username_type = new javax.swing.JTextField();
        tv_username2 = new javax.swing.JLabel();
        et_username_phone = new javax.swing.JTextField();
        bt_back = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imageHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        et_date = new javax.swing.JTextField();
        tv_username3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("قائمة البحث");

        tv_username.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        tv_username.setForeground(new java.awt.Color(2, 177, 225));
        tv_username.setText(" الاسم");

        et_username_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        et_username_search.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        et_username_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 175, 255)));

        tv_username1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        tv_username1.setForeground(new java.awt.Color(2, 177, 225));
        tv_username1.setText("النوع");

        et_username_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        et_username_type.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        et_username_type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 175, 255), 1, true));

        tv_username2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        tv_username2.setForeground(new java.awt.Color(2, 177, 225));
        tv_username2.setText("الجوال");

        et_username_phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        et_username_phone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        et_username_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 175, 255), 1, true));

        bt_back.setBackground(new java.awt.Color(2, 175, 255));
        bt_back.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(255, 255, 255));
        bt_back.setText("رجوع");
        bt_back.setBorder(null);
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_exit.setBackground(new java.awt.Color(2, 175, 255));
        bt_exit.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        bt_exit.setForeground(new java.awt.Color(255, 255, 255));
        bt_exit.setText("خروج");
        bt_exit.setBorder(null);
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        imageHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ameer/search.png"))); // NOI18N

        searchTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الاسم", "النوع", "الجوال", "العدد", "السعر", "السعر الكلي", "الدفعة", "المتبقي", "ملاحظات", "التاريخ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            searchTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            searchTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            searchTable.getColumnModel().getColumn(9).setPreferredWidth(120);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(imageHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        et_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        et_date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        et_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 175, 255), 1, true));

        tv_username3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        tv_username3.setForeground(new java.awt.Color(2, 177, 225));
        tv_username3.setText("التاريخ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tv_username1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(et_username_type, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tv_username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(et_username_search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tv_username2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(et_username_phone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tv_username3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(et_date, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tv_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(et_username_search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tv_username1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(et_username_type, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tv_username2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(et_username_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tv_username3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(et_date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        dispose(); //Destroy the JFrame object
        MainFrame.getMainFrame();     // TODO add your handling code here:
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_exitActionPerformed

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
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_exit;
    private javax.swing.JTextField et_date;
    private javax.swing.JTextField et_username_phone;
    private javax.swing.JTextField et_username_search;
    private javax.swing.JTextField et_username_type;
    private javax.swing.JLabel imageHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel tv_username;
    private javax.swing.JLabel tv_username1;
    private javax.swing.JLabel tv_username2;
    private javax.swing.JLabel tv_username3;
    // End of variables declaration//GEN-END:variables
}
