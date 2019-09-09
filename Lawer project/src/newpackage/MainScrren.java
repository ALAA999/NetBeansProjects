
import java.awt.Desktop;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
//import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.ucanaccess.jdbc.*;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class MainScrren extends javax.swing.JFrame {

    static ArrayList<custmer> arrayList = new ArrayList();
    ArrayList<custmer> list = new ArrayList<>();
    static MainScrren mainscreen;
    JPopupMenu popup;
    int row_selected;

    public static MainScrren main_screen() {
        if (mainscreen == null) {
            mainscreen = new MainScrren();
        }
        mainscreen.setVisible(true);
        return mainscreen;
    }

    public MainScrren() {
        super("اللوحة الرئيسية");
        arrayList.clear();
        list.clear();
        try {
            initComponents();
            setLocationRelativeTo(null);
            AddRowToTabl();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainScrren.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainScrren.class.getName()).log(Level.SEVERE, null, ex);
        }
        popup = new JPopupMenu();
        JMenuItem item;
        popup.add(item = new JMenuItem("Open    ", new ImageIcon("1.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Desktop.getDesktop().open(new File("C:/Contracts/" + list.get(row_selected).getId() + "/" + list.get(row_selected).getContract_type()));
                } catch (IOException ex) {
                    Logger.getLogger(MainScrren.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        popup.add(item = new JMenuItem("Details    ", new ImageIcon("1.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String buttons_title[] = {"Open", "Cancel"};
                int result = JOptionPane.showOptionDialog(null,
                        "Contract ID is: " + list.get(row_selected).getId()
                        + "\nFirst Name is: " + list.get(row_selected).getName()
                        + "\nSecound Name is: "
                        + "\nDate is: " + list.get(row_selected).getDate()
                        + "\nContract Type is: " + list.get(row_selected).getContract_type(), "Show Specific Customer",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, buttons_title, JOptionPane.INFORMATION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    try {
                        Desktop.getDesktop().open(new File("C:/Contracts/" + list.get(row_selected).getId() + "/" + list.get(row_selected).getContract_type()));
                    } catch (IOException ex) {
                    }
                }
            }
        });
        popup.setBorder(new BevelBorder(BevelBorder.RAISED));

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                try {
                    String Name = jTextField1.getText();
                    String id = jTextField2.getText();
                    String date = jTextField4.getText();
                    list.clear();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (!Name.isEmpty() && arrayList.get(i).getName().equals(Name)) {
                            SetTableModel(arrayList.get(i));
                            list.add(arrayList.get(i));
                        } else if (!id.isEmpty() && arrayList.get(i).getId().equals(id)) {
                            SetTableModel(arrayList.get(i));
                            list.add(arrayList.get(i));
                        } else if (!date.isEmpty() && arrayList.get(i).getDate().equals(date)) {
                            SetTableModel(arrayList.get(i));
                            list.add(arrayList.get(i));
                        }
                    }
                } catch (Exception ex) {
                }
            }
        });
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        jTextField2.getDocument().addDocumentListener(new DocumentListener() { // the text field of the id

            @Override
            public void insertUpdate(DocumentEvent de) {
                jTextField4.setText("");
                jTextField1.setText("");
                Clean_Table_Rows();
                Search_by_ID();
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
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        jTextField1.getDocument().addDocumentListener(new DocumentListener() { // the text field of the name

            @Override
            public void insertUpdate(DocumentEvent de) {
                jTextField4.setText("");
                jTextField2.setText("");
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
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        jTextField4.getDocument().addDocumentListener(new DocumentListener() { // the text field of the date

            @Override
            public void insertUpdate(DocumentEvent de) {
                jTextField1.setText("");
                jTextField2.setText("");
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

        jTable1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                try {
                    JTable table = (JTable) me.getSource();
                    Point point = me.getPoint();
                    row_selected = table.rowAtPoint(point);
                    if (me.getClickCount() == 2) {
                        Desktop.getDesktop().open(new File("C:/Contracts/" + list.get(row_selected).getId() + "/" + list.get(row_selected).getContract_type()));
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "An Error Occurred");
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (me.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                    popup.show(me.getComponent(), me.getX(), me.getY()); // Mouse Released from the table will allaow you to show the popup menu
                }
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
    }

    public void Search_by_Name() {
        try {
            String Name = jTextField1.getText();
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

    public void Search_by_ID() {
        try {
            String id = jTextField2.getText();
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
            String date = jTextField4.getText();
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
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    public void SetTableModel(custmer c) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel();
        defaultTableModel.addRow(new String[]{c.getContract_type(), c.getDate(), c.getName(), c.getId()});
        jTable1.setModel(defaultTableModel);

    }

    public void AddRowToTabl() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\acer\\Documents\\NetBeansProjects\\"
                + "Sample2.mdb", "", "");
        con.setAutoCommit(false);
        Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        s.execute("select * from Table3");
        ResultSet rs = s.getResultSet();
        rs.last();
        rs.first();
        for (int i = 0; i < rs.getRow(); i++) {
            String name = rs.getString("Name");
            String id = rs.getString("ID");
            String date = rs.getString("Date");
            String contract = rs.getString("Contract");
            arrayList.add(new custmer(id, name, date, contract));
            rs.next();
        }
        con.close();
        s.close();
        rs.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(820, 627));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setText("قائمة البحث");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("رقم الهوية");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("التاريخ");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("الاسم");

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "نوع العقد", "التاريخ", "الاسم", "رقم الهوية"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
        }

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setText("بحث");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setText("إضافة");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(32, 32, 32)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(365, 365, 365)
                                        .addComponent(jLabel1)))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        Adding.Adding_Screen();
    }

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
            java.util.logging.Logger.getLogger(Adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainscreen = new MainScrren();
                mainscreen.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}
