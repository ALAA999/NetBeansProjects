
/************************************/
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
/*************************************/

/***************************/
/*  Name :Baraa Mukayed    */
/*  ID : 20165107          */
/***************************/

 class GuiInterFace extends javax.swing.JFrame {
    ///////////// MY Variable //////////////
    String TakeText ;
    String[] columns = new String[]{"ID", "First Name", "Last Name", "Marital Status", "Salary", "Total Salary"};
    HeapArray heap = new HeapArray();
    DefaultTableModel model = new DefaultTableModel();
    HeapTree MyTree ; HeapTreeNode t ;
    ///////////// MY Variable //////////////
    Object[][] rows ;
    public GuiInterFace() {
        initComponents();
        tsalary.setVisible(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        this.PanelInsert.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MyTabel = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        PanelInsert = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EmpNum = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        bsalary = new javax.swing.JTextField();
        mary = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tsalary = new javax.swing.JTextField();
        CountAry = new javax.swing.JTextField();
        SizeNow = new javax.swing.JTextField();
        Size2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        make = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        insert = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        refresh = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        heaparray = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        usingstack = new javax.swing.JMenuItem();
        usingqu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        inorder = new javax.swing.JMenuItem();
        preorder = new javax.swing.JMenuItem();
        postorder = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Structure");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel3.setText("Data Structure Project");

        MyTabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        MyTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FirstName", "LastName", "State", "BasicSalary", "TotalSalary"
            }
        ));
        jScrollPane2.setViewportView(MyTabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102)));
        PanelInsert.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jLabel4.setText("EmpNum :");

        jLabel5.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jLabel5.setText("FirstName :");

        jLabel6.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jLabel6.setText("LastName :");

        jLabel7.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jLabel7.setText("MaritalStatus :");

        jLabel8.setFont(new java.awt.Font("Vrinda", 0, 18)); // NOI18N
        jLabel8.setText("BasicSalary :");

        EmpNum.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        EmpNum.setMaximumSize(new java.awt.Dimension(1000, 1000));
        EmpNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNumActionPerformed(evt);
            }
        });
        EmpNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmpNumKeyReleased(evt);
            }
        });

        fname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });

        lname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });

        bsalary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bsalaryKeyReleased(evt);
            }
        });

        mary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mary.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Married", "Single" }));
        mary.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maryItemStateChanged(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Myriad Pro Light", 0, 16)); // NOI18N
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Myriad Pro Light", 0, 16)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tsalary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tsalary.setEnabled(false);

        javax.swing.GroupLayout PanelInsertLayout = new javax.swing.GroupLayout(PanelInsert);
        PanelInsert.setLayout(PanelInsertLayout);
        PanelInsertLayout.setHorizontalGroup(
            PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertLayout.createSequentialGroup()
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(EmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInsertLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addComponent(fname))
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addComponent(bsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(28, 28, 28)
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addComponent(mary, 0, 240, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lname)))
                .addGap(24, 24, 24)
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        PanelInsertLayout.setVerticalGroup(
            PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInsertLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(EmpNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(PanelInsertLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        CountAry.setEditable(false);
        CountAry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CountAry.setForeground(new java.awt.Color(0, 153, 51));
        CountAry.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CountAry.setText("0");

        SizeNow.setEditable(false);
        SizeNow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SizeNow.setForeground(new java.awt.Color(0, 153, 51));
        SizeNow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SizeNow.setText("1000");

        Size2.setEditable(false);
        Size2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Size2.setForeground(new java.awt.Color(255, 0, 0));
        Size2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Size2.setText("1000");

        jMenu1.setText("Heap");

        make.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        make.setText("Make");
        make.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makeMouseClicked(evt);
            }
        });
        make.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeActionPerformed(evt);
            }
        });
        jMenu1.add(make);
        jMenu1.add(jSeparator1);

        insert.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        insert.setText("Insert");
        insert.setEnabled(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jMenu1.add(insert);

        delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        delete.setText("Delete");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jMenu1.add(delete);

        refresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        refresh.setText("Refresh");
        refresh.setEnabled(false);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jMenu1.add(refresh);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        heaparray.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        heaparray.setText("Heap Arry");
        heaparray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heaparrayActionPerformed(evt);
            }
        });
        jMenu2.add(heaparray);
        jMenu2.add(jSeparator2);

        jMenu4.setText("Heap Tree");
        jMenu4.setEnabled(false);

        usingstack.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        usingstack.setText("Using Stack");
        usingstack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usingstackActionPerformed(evt);
            }
        });
        jMenu4.add(usingstack);

        usingqu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        usingqu.setText("Using Queue");
        usingqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usingquActionPerformed(evt);
            }
        });
        jMenu4.add(usingqu);
        jMenu4.add(jSeparator3);

        jMenu5.setText("BinaryTree");

        inorder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        inorder.setText("InOrder");
        inorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inorderActionPerformed(evt);
            }
        });
        jMenu5.add(inorder);

        preorder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        preorder.setText("PreOrder");
        preorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preorderActionPerformed(evt);
            }
        });
        jMenu5.add(preorder);

        postorder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        postorder.setText("PostOrder");
        postorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postorderActionPerformed(evt);
            }
        });
        jMenu5.add(postorder);

        jMenu4.add(jMenu5);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Exit");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(PanelInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Size2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CountAry, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SizeNow, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(409, 409, 409))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CountAry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SizeNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Size2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makeMouseClicked

    }//GEN-LAST:event_makeMouseClicked

    private void makeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeActionPerformed
        this.PanelInsert.setVisible(true);
        this.insert.setEnabled(true);
        this.delete.setEnabled(true);
        this.refresh.setEnabled(true);
        this.make.setEnabled(false);
        heap.newTrickle(Integer.parseInt(CountAry.getText()));
        
    }//GEN-LAST:event_makeActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        PanelInsert.setVisible(true);
        this.jPanel1.setVisible(true);
    }//GEN-LAST:event_insertActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Employee temper = heap.serve() ;
        active_heap();
        if(temper != null){
            JOptionPane.showMessageDialog(this, "Delete Done","Info",1);
        }else{
            JOptionPane.showMessageDialog(this, "Not Elements In Heap","Info",1);
        }
        this.CountAry.setText(Integer.valueOf((this.CountAry.getText()))-1+"");
        this.SizeNow.setText(Integer.valueOf((this.SizeNow.getText()))+1+"");
    }//GEN-LAST:event_deleteActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        try{
            if(this.heap.Count_Heap==1){
                JOptionPane.showMessageDialog(this, "  The Heap Array Is Empty");
                return;
            }
            t = null ; MyTree = null ;
            MyTree = new HeapTree(this.heap.Count_Heap);
            for(int i=1; i<this.heap.Count_Heap;++i){
                t =  MyTree.LevelWiseInsert(t, this.heap.item[i]);
            }
            this.jMenu4.setEnabled(true);
            JOptionPane.showMessageDialog(this, "  Heap Tree Created");
        }catch(Exception soma){
            return;
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void heaparrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heaparrayActionPerformed
        PanelInsert.setVisible(false);
        model.setDataVector(heap.Travrse(), columns);
        MyTabel.setModel(model);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_heaparrayActionPerformed

    private void usingstackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usingstackActionPerformed
        rows = this.MyTree.PreOrderTraversalStack(t);
        this.PanelInsert.setVisible(false);
        model.setDataVector(rows, columns);
        MyTabel.setModel(model);
        jPanel1.setVisible(true);
        MyTree.cleaData();
    }//GEN-LAST:event_usingstackActionPerformed

    private void usingquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usingquActionPerformed
        rows = this.MyTree.levelOrderTraversalQueue(t);
        this.PanelInsert.setVisible(false);
        model.setDataVector(rows, columns);
        MyTabel.setModel(model);
        jPanel1.setVisible(true);
        MyTree.cleaData();
    }//GEN-LAST:event_usingquActionPerformed

    private void inorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inorderActionPerformed

        rows = this.MyTree.InOrderTraversal(t);
        this.PanelInsert.setVisible(false);
        model.setDataVector(rows, columns);
        MyTabel.setModel(model);
        jPanel1.setVisible(true);
        MyTree.cleaData();
    }//GEN-LAST:event_inorderActionPerformed

    private void preorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preorderActionPerformed
        rows = this.MyTree.PreOrderTraversal(t);
        this.PanelInsert.setVisible(false);
        model.setDataVector(rows, columns);
        MyTabel.setModel(model);
        jPanel1.setVisible(true);
        MyTree.cleaData();
    }//GEN-LAST:event_preorderActionPerformed

    private void postorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postorderActionPerformed

        rows = this.MyTree.PostOrderTraversal(t);
        this.PanelInsert.setVisible(false);
        model.setDataVector(rows, columns);
        MyTabel.setModel(model);
        jPanel1.setVisible(true);
        MyTree.cleaData();
    }//GEN-LAST:event_postorderActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void EmpNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNumActionPerformed

    private void EmpNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpNumKeyReleased
        try{
            TakeText = EmpNum.getText();
            for(int i=0;i<TakeText.length();++i){
                if(Character.isLetter(TakeText.charAt(i))){
                    JOptionPane.showMessageDialog(this, "هذا الحقل فقط يقبل أرقام ..");
                    this.EmpNum.setText(null);
                }
            }
            if(Double.valueOf(this.EmpNum.getText())>1000){
                JOptionPane.showMessageDialog(this, "خطأ أعلى رقم ممكن إدخاله هوا ألف");
                this.EmpNum.setText(null);
            }

        }catch(Exception mes){
            return;
        }
    }//GEN-LAST:event_EmpNumKeyReleased

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased

        try{
            TakeText = fname.getText();
            for(int i=0; i<TakeText.length();++i){
                if(!Character.isLetter(TakeText.charAt(i))){
                    JOptionPane.showMessageDialog(this, "هذا الحل يقبل فقط حروف لا غير ");
                    this.fname.setText(null);
                }
            }
        }catch(Exception Mes){
            return;
        }
    }//GEN-LAST:event_fnameKeyReleased

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased
        try{
            TakeText = lname.getText();
            for(int i=0; i<TakeText.length();++i){
                if(!Character.isLetter(TakeText.charAt(i))){
                    JOptionPane.showMessageDialog(this, "هذا الحل يقبل فقط حروف لا غير ");
                    this.lname.setText(null);
                }
            }
        }catch(Exception Mes){
            return;
        }
    }//GEN-LAST:event_lnameKeyReleased

    private void bsalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bsalaryKeyReleased
        try{
            TakeText = bsalary.getText();
            for(int i=0;i<TakeText.length();++i){
                if(!Character.isDigit(TakeText.charAt(i))){
                    JOptionPane.showMessageDialog(this, "هذا الحقل يقبل فقط أرقام");
                    bsalary.setText(null);
                    tsalary.setText(null);
                    break;
                }
            }
            if(Double.valueOf(bsalary.getText())>0){
                if(this.mary.getSelectedIndex()==0){
                    this.tsalary.setText(Double.valueOf(bsalary.getText()) * 1.5 + "");
                }else{
                    this.tsalary.setText(Double.valueOf(bsalary.getText()) * 1.1 + "");
                }
            }else{
                JOptionPane.showMessageDialog(this, "إدخال خاطئ إدخل الراتب");
                this.bsalary.setText(null);
                this.tsalary.setText(null);
            }
        }catch(Exception mes){
            return;
        }
    }//GEN-LAST:event_bsalaryKeyReleased

    private void maryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maryItemStateChanged
        try{
            TakeText = bsalary.getText();
            for(int i=0;i<TakeText.length();++i){
                if(!Character.isDigit(TakeText.charAt(i))){
                    JOptionPane.showMessageDialog(this, "هذا الحقل يقبل فقط أرقام");
                    bsalary.setText(null);
                    tsalary.setText(null);
                    break;
                }
            }
            if(Double.valueOf(bsalary.getText())>0){
                if(this.mary.getSelectedIndex()==0){
                    this.tsalary.setText(Double.valueOf(bsalary.getText()) * 1.5 + "");
                }else{
                    this.tsalary.setText(Double.valueOf(bsalary.getText()) * 1.1 + "");
                }
            }else{
                JOptionPane.showMessageDialog(this, "إدخال خاطئ إدخل الراتب");
                this.bsalary.setText(null);
                this.tsalary.setText(null);
            }
        }catch(Exception mes){
            return;
        }
    }//GEN-LAST:event_maryItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(EmpNum.getText().equals("") || fname.getText().equals("") || lname.getText().equals("") || tsalary.getText().equals("")){
            JOptionPane.showMessageDialog(this, "أحد الحقول فارغة");
            return;
        }
        if(IsExist(Integer.valueOf(EmpNum.getText()))){
            JOptionPane.showMessageDialog(this, "هذا المفتاح مكرر مسبقـا خطـأ");
            return;
        }
        Employee emp = new Employee();
        emp.setNum(Integer.valueOf(EmpNum.getText()));
        emp.setFirstName(fname.getText());
        emp.setLastName(lname.getText());
        emp.setMaritalStatus(this.mary.getSelectedItem().toString());
        emp.setTotalSalary(Float.valueOf(tsalary.getText()));
        emp.setSalary(Float.valueOf(tsalary.getText()));
        if(!heap.Insert(emp)){
            JOptionPane.showMessageDialog(this, "المصفوفة ممتلئة","معلومات",1);
        }
        this.CountAry.setText(Integer.valueOf((this.CountAry.getText()))+1+"");
        this.SizeNow.setText(Integer.valueOf((this.SizeNow.getText()))-1+"");
        active_heap();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ClearText();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed
    public void active_heap(){
        model.setDataVector(heap.Travrse(), columns);
        MyTabel.setModel(model);
        jPanel1.setVisible(true);
    }
    public void ClearText(){
        this.EmpNum.setText(null);
        this.fname.setText(null);
        this.lname.setText(null);
        this.mary.setSelectedIndex(0);
        this.bsalary.setText(null);
        this.tsalary.setText(null);
    }
    public boolean IsExist(int id){
        for(int i=1; i<heap.Count_Heap;++i){
            if(id == heap.item[i].getNum())
                return true;
        }
        return false ;
    }
    
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
            java.util.logging.Logger.getLogger(GuiInterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiInterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiInterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiInterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiInterFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CountAry;
    private javax.swing.JTextField EmpNum;
    private javax.swing.JTable MyTabel;
    private javax.swing.JPanel PanelInsert;
    private javax.swing.JTextField Size2;
    private javax.swing.JTextField SizeNow;
    private javax.swing.JTextField bsalary;
    private javax.swing.JMenuItem delete;
    private javax.swing.JTextField fname;
    private javax.swing.JMenuItem heaparray;
    private javax.swing.JMenuItem inorder;
    private javax.swing.JMenuItem insert;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField lname;
    private javax.swing.JMenuItem make;
    private javax.swing.JComboBox mary;
    private javax.swing.JMenuItem postorder;
    private javax.swing.JMenuItem preorder;
    private javax.swing.JMenuItem refresh;
    private javax.swing.JTextField tsalary;
    private javax.swing.JMenuItem usingqu;
    private javax.swing.JMenuItem usingstack;
    // End of variables declaration//GEN-END:variables
}
