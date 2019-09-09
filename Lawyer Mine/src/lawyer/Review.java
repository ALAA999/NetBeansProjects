/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import static pkgfinal.Table.tableer;

/**
 *
 * @author Desgin
 */
public class Review extends javax.swing.JFrame {

    static Review reviewer = null;

    public Review(String title, String note, String date) {
        initComponents();
        jTextArea2.setText(note);
        jLabel5.setText(title);
        jLabel3.setText(date);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        jTextArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(76, 76, 76));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Desgin\\Desktop\\Project Images\\MainScrren\\2.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("التاريخ");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("عنوان الملاحظة :");

        jLabel5.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Text");

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

        jLabel3.setFont(new java.awt.Font("Helvetica World", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("التاريخ");

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
                        .addGap(38, 38, 38)
                        .addComponent(Back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel1);

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
        reviewer.setVisible(false);
        Timer timer = new Timer(1, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            }
        });
        timer.start();
        Table.tableer.getMainScreen(Table.arraylist);

        // TODO add your handling code here:
    }//GEN-LAST:event_BackMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
new Review(null, null, null).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
public static Review getMainScreen(String title, String note, String date) {
        if (reviewer == null) {
            reviewer = new Review(title, note, date);
            reviewer.setVisible(true);
            return reviewer;

        } else {

            reviewer.setVisible(true);

        }
        return reviewer;
    }
}
