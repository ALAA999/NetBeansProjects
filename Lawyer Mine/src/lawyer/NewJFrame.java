/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static pkgfinal.NewJFrame1.Search;

public class NewJFrame extends javax.swing.JFrame {

    static NewJFrame MainScreen;

     ArrayList<Meeting> list = new ArrayList<>();
    static ArrayList<Meeting> list3 = new ArrayList<>();

    private NewJFrame() {

        try{
        initComponents();

        this.setResizable(false);
        this.setSize(950, 750);
        AddRowToTabl();

        this.setLocationRelativeTo(this);
        ImageIcon img = new ImageIcon(getClass().getResource("2.png"));
        this.setIconImage(img.getImage());
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        New_Contract = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Search_Contract = new javax.swing.JLabel();
        Table_Of_Meeting = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lawyer Islam Al Zaeem");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        New_Contract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Mouse.png"))); // NOI18N
        New_Contract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                New_ContractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                New_ContractMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                New_ContractMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/2.png"))); // NOI18N

        Search_Contract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Mouse2.png"))); // NOI18N
        Search_Contract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_ContractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_ContractMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Search_ContractMousePressed(evt);
            }
        });

        Table_Of_Meeting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Mouse3.png"))); // NOI18N
        Table_Of_Meeting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Table_Of_MeetingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Table_Of_MeetingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Table_Of_MeetingMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Mouse4.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/Mouse5.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
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
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Search_Contract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(New_Contract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Table_Of_Meeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(New_Contract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Search_Contract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Table_Of_Meeting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        jPanel2.setBackground(new java.awt.Color(105, 181, 45));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/8.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 700, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void New_ContractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_ContractMouseEntered

        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("MouseMoved.png"));
        icon.getImage().flush();
        New_Contract.setIcon(icon);
            
        } catch (Exception e) {
        
                                    JOptionPane.showMessageDialog(null, e.getMessage());
}

    }//GEN-LAST:event_New_ContractMouseEntered

    private void New_ContractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_ContractMouseExited
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("Mouse.png"));
        icon.getImage().flush();
        New_Contract.setIcon(icon);
            
        } catch (Exception e) {
                                  JOptionPane.showMessageDialog(null, e.getMessage());

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_New_ContractMouseExited

    private void Search_ContractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_ContractMouseEntered
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("MouseMoved2.png"));
        icon.getImage().flush();
        Search_Contract.setIcon(icon);
            
        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
}
//0595682030
// TODO add your handling code here:
    }//GEN-LAST:event_Search_ContractMouseEntered

    private void Search_ContractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_ContractMouseExited
       
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("Mouse2.png"));
        icon.getImage().flush();
        Search_Contract.setIcon(icon);        // TODO add your handling code here:
            
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());

        }
    // TODO add your handling code here:
    }//GEN-LAST:event_Search_ContractMouseExited

    private void Table_Of_MeetingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_Of_MeetingMouseEntered
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("MouseMoved3.png"));
        icon.getImage().flush();
        Table_Of_Meeting.setIcon(icon);
            
        } catch (Exception e) {
        
                    JOptionPane.showMessageDialog(null, e.getMessage());
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_Of_MeetingMouseEntered

    private void Table_Of_MeetingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_Of_MeetingMouseExited
      
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("Mouse3.png"));
        icon.getImage().flush();
        Table_Of_Meeting.setIcon(icon);
            
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_Of_MeetingMouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("MouseMoved4.png"));
        icon.getImage().flush();
        jLabel5.setIcon(icon);
            
        } catch (Exception e) {
        
              JOptionPane.showMessageDialog(null, e.getMessage());
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource("Mouse4.png"));
        icon.getImage().flush();
        jLabel5.setIcon(icon);
       
        } catch (Exception e) {
        
           JOptionPane.showMessageDialog(null, e.getMessage());
     }
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        try {
            
        ImageIcon icon = new ImageIcon(getClass().getResource("MouseMoved5.png"));
        icon.getImage().flush();
        jLabel6.setIcon(icon);
        } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void New_ContractMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_ContractMousePressed
        try {
        MainScreen.setVisible(false);
        ADDer.getMainScreen();
    
        } catch (Exception e) {
        
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_New_ContractMousePressed

    private void Search_ContractMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_ContractMousePressed
        
        try {
            
        MainScreen.setVisible(false);
        NewJFrame1.getMainScreen(); 
        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_Search_ContractMousePressed

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        try {
            
        ImageIcon icon = new ImageIcon(getClass().getResource("Mouse5.png"));
        icon.getImage().flush();
        jLabel6.setIcon(icon);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void Table_Of_MeetingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_Of_MeetingMousePressed
        try {
            
        MainScreen.setVisible(false);
        Table.getMainScreen(list);

        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_Table_Of_MeetingMousePressed

    public static void main(String args[]) {
        try{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainScreen = new NewJFrame();
                MainScreen.setVisible(true);
 new Note_Of_Today(list3).setVisible(true); 
              
            }
        });
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel New_Contract;
    private javax.swing.JLabel Search_Contract;
    private javax.swing.JLabel Table_Of_Meeting;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public static NewJFrame getMainScreen() {
 try{
        if (MainScreen == null) {
            MainScreen = new NewJFrame();
            MainScreen.setVisible(true);
            return MainScreen;

        } else {

            MainScreen.setVisible(true);

        }
        return MainScreen;
 }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());
 }
 return null;
    }   
    

    public void AddRowToTabl() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            System.out.print(getClass().getResource("Sample2.mdb"));
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://Sample2.mdb", "", "");
            con.setAutoCommit(false);
            Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            s.execute("select * from Notes");
            ResultSet rs = s.getResultSet();
            rs.last();
            rs.first();
            for (int i = 0; i < rs.getRow(); i++) {
                String script = rs.getString(1);
                String[] arr = rs.getString(2).split("-");
                String title = rs.getString(3);
                System.out.print(title);
                list.add(new Meeting(arr[2], arr[1], arr[0], script, title));
                for (String arr1 : arr) {
                    System.out.println(arr1);
                }
                rs.next();
            }
            con.close();
            s.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    list3=list;
    }
    
}
