
public class ProjectGUI extends javax.swing.JFrame {

    Relation relation;
    JcomboboxModel model;
    RST rst = new RST();
    Function function = new Function();

    public ProjectGUI() {
        setLayout(null);
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        relation = new Relation(0, 0, new boolean[100][100]);
    }

    public void addDomain() {
        if (T1.getText().isEmpty()) {
            int f = relation.getFo1();
            int number1 = Integer.parseInt(T2.getText());
            int number2 = Integer.parseInt(T3.getText());
            for (int i = number1; i <= number2; i++) {
                jComboBox1.insertItemAt("" + i, f);
                ++f;
            }
            relation.setDomain(number1, number2);
        } else {

            int f = relation.getFo1();
            String number = T1.getText();
            String[] numbers = number.split(" ");
            int num[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                num[i] = Integer.parseInt(numbers[i]);
                jComboBox1.insertItemAt(numbers[i], f);
                ++f;
            }
            relation.setDomain(num);
        }
        jTextArea1.setText(relation.printm());
    }

    public void addCodomain() {
        if (T1.getText().isEmpty()) {
            int f = relation.getFo2();
            int number1 = Integer.parseInt(T2.getText());
            int number2 = Integer.parseInt(T3.getText());
            for (int i = number1; i <= number2; i++) {
                jComboBox2.insertItemAt("" + i, f);
                ++f;
            }
            relation.setcoDomain(number1, number2);
        } else {
            int f = relation.getFo2();
            String number = T1.getText();
            String[] numbers = number.split(" ");
            int num[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                num[i] = Integer.parseInt(numbers[i]);
                jComboBox2.insertItemAt(numbers[i], f);
                ++f;
            }
            relation.setcoDomain(num);
        }
        jTextArea1.setText(relation.printm());
    }

    public void addElement() {
        String num1 = (String) jComboBox1.getSelectedItem();
        String num2 = (String) jComboBox2.getSelectedItem();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        relation.addElement(number1, number2);
        jTextArea1.setText(relation.printm());
    }

    public void addDomainRST() {
        int f = rst.fo1;
        if (T4.getText().isEmpty()) {
            int number1 = Integer.parseInt(T5.getText());
            int number2 = Integer.parseInt(T6.getText());
            rst.setDomain(number1, number2);
            for (int i = number1; i <= number2; i++) {
                jComboBox3.insertItemAt("" + i, f);
                ++f;
            }
        } else {
            String number = T4.getText();
            String[] numbers = number.split(" ");
            int num[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                num[i] = Integer.parseInt(numbers[i]);
                jComboBox3.insertItemAt(numbers[i], f);
                ++f;
            }
            rst.setDomain(num);
        }
        jTextArea2.setText(rst.printm());
        checkRST();
    }

    public void addCodomainRST() {
        int f = rst.fo2;
        if (T4.getText().isEmpty()) {
            int number1 = Integer.parseInt(T5.getText());
            int number2 = Integer.parseInt(T6.getText());
            rst.setcoDomain(number1, number2);
            for (int i = number1; i <= number2; i++) {
                jComboBox4.insertItemAt("" + i, f);
                ++f;
            }
        } else {
            String number = T4.getText();
            String[] numbers = number.split(" ");
            int num[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                num[i] = Integer.parseInt(numbers[i]);
                jComboBox4.insertItemAt(numbers[i], f);
                ++f;
            }
            rst.setcoDomain(num);
        }
        jTextArea2.setText(rst.printm());
        checkRST();
    }

    public void addElementRST() {
        String num1 = (String) jComboBox3.getSelectedItem();
        String num2 = (String) jComboBox4.getSelectedItem();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        rst.addElement(number1, number2);
        jTextArea2.setText(rst.printm());
        checkRST();
    }

    public void addDomainFunction() {
        if (T7.getText().isEmpty()) {
            int f = function.getFo1();
            int number1 = Integer.parseInt(T8.getText());
            int number2 = Integer.parseInt(T9.getText());
            function.setDomain(number1, number2);
            for (int i = number1; i <= number2; i++) {
                jComboBox5.insertItemAt("" + i, f);
                ++f;
            }
        } else {
            int f = function.fo1;
            String number = T7.getText();
            String[] numbers = number.split(" ");
            int num[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                num[i] = Integer.parseInt(numbers[i]);
                jComboBox5.insertItemAt(numbers[i], f);
                ++f;
            }
            function.setDomain(num);
        }
        jTextArea3.setText(function.printm());
    }

    public void addCodomainFunction() {
        if (T7.getText().isEmpty()) {
            int f = function.getFo2();
            int number1 = Integer.parseInt(T8.getText());
            int number2 = Integer.parseInt(T9.getText());
            function.setcoDomain(number1, number2);
            for (int i = number1; i <= number2; i++) {
                jComboBox6.insertItemAt("" + i, f);
                ++f;
            }
        } else {
            int f = function.fo2;
            String number = T7.getText();
            String[] numbers = number.split(" ");
            int num[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                num[i] = Integer.parseInt(numbers[i]);
                jComboBox6.insertItemAt(numbers[i], f);
                ++f;
            }
            function.setcoDomain(num);
        }
        jTextArea3.setText(function.printm());
    }

    public void addElementFunction() {
        String num1 = (String) jComboBox5.getSelectedItem();
        String num2 = (String) jComboBox6.getSelectedItem();
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        function.addElement(number1, number2);
        jTextArea3.setText(function.printm());
        checkFunction();
    }

    public void checkRST() {
        if (rst.isReflexive()) {
            jCheckBox2.setSelected(true);
        } else {
            jCheckBox2.setSelected(false);
        }
        if (rst.isSemetric()) {
            jCheckBox3.setSelected(true);
        } else {
            jCheckBox3.setSelected(false);
        }
        if (rst.isTransitive()) {
            jCheckBox4.setSelected(true);
        } else {
            jCheckBox4.setSelected(false);
        }
        if (rst.isEquvelance()) {
            jCheckBox5.setSelected(true);
        } else {
            jCheckBox5.setSelected(false);
        }
    }

    public void checkFunction() {
        if (function.isInjective()) {
            jCheckBox7.setSelected(true);
        } else {
            jCheckBox7.setSelected(false);
        }
        if (function.isSerjective()) {
            jCheckBox8.setSelected(true);
        } else {
            jCheckBox8.setSelected(false);
        }
        if (function.isBijective()) {
            jCheckBox6.setSelected(true);
        } else {
            jCheckBox6.setSelected(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jButton8 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        T1 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton12 = new javax.swing.JButton();
        T7 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        T8 = new javax.swing.JTextField();
        T9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jScrollPane4.setViewportView(jEditorPane1);

        jScrollPane5.setViewportView(jEditorPane2);

        jButton8.setText("jButton8");

        jTextField7.setText("jTextField7");

        jButton2.setText("jButton2");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jButton1.setText("Add Domain");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(15);
        jScrollPane1.setViewportView(jTextArea1);

        jButton9.setText("Add Element");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setText("Add Codomain");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setText("From:");

        jLabel6.setText("To:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(T2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(T3)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)
                    .addComponent(jComboBox2))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Relation", jPanel2);

        jButton3.setText("Add Element");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Reflexive");
        jCheckBox2.setEnabled(false);

        jCheckBox3.setText("Symmetric");
        jCheckBox3.setEnabled(false);

        jCheckBox4.setText("Transirive");
        jCheckBox4.setEnabled(false);

        jCheckBox5.setText("Equievelance");
        jCheckBox5.setEnabled(false);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton10.setText("Add ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel3.setText("From:");

        jLabel4.setText("To:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox5)
                        .addGap(50, 50, 50))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("RST", jPanel3);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton5.setText("Add Elements");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Bijective");
        jCheckBox6.setEnabled(false);

        jCheckBox7.setText("Injective");
        jCheckBox7.setEnabled(false);

        jCheckBox8.setText("Serjective");
        jCheckBox8.setEnabled(false);

        jButton12.setText("Add Domain");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Add Codomain");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel1.setText("From:");

        jLabel2.setText("To:");

        jButton11.setText("Get Position");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton14.setText("  Get Image   ");

        jButton16.setText("Get Position");

        jButton17.setText("Get Perimage");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox6)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(T9))
                        .addGap(232, 232, 232)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Function", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        addElement();
        cleanTexts();
    }//GEN-LAST:event_jButton9ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int[] domainsAdded = new int[relation.getDomain().length];
            domainsAdded = relation.getDomain();
            boolean statment = true;
            if (T1.getText().isEmpty()) {
                int From = Integer.parseInt(T2.getText());
                int To = Integer.parseInt(T3.getText());
                for (int i = From; i <= To; ++i) {
                    for (int e = 0; e < domainsAdded.length; e++) {
                        if (i == domainsAdded[e]) {
                            statment = false;
                            System.out.println("Enter right numbers");
                            break;
                        }
                    }
                }
            } else {
                String number = T1.getText();
                String[] numbers = number.split(" ");
                int num[] = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    num[i] = Integer.parseInt(numbers[i]);
                    for (int j = 0; j < domainsAdded.length; j++) {
                        if (num[i] == domainsAdded[j]) {
                            System.out.println("Enter right numbers");
                            statment = false;
                            break;
                        }
                    }
                }
            }
            if (statment) {
                addDomain();
            }
            cleanTexts();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void cleanTexts() {
        T1.setText("");
        T2.setText("");
        T3.setText("");
        T4.setText("");
        T5.setText("");
        T6.setText("");
        T7.setText("");
        T8.setText("");
        T9.setText("");
    }
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        jTextArea1.setText(relation.printm());
        jTextArea2.setText(rst.printm());
        jTextArea3.setText(function.printm());
        checkRST();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        try {
            int[] domainsAdded = new int[rst.getDomain().length];
            domainsAdded = rst.getDomain();
            boolean statment = true;
            if (T4.getText().isEmpty()) {
                int From = Integer.parseInt(T5.getText());
                int To = Integer.parseInt(T6.getText());
                for (int i = From; i <= To; ++i) {
                    for (int e = 0; e < domainsAdded.length; e++) {
                        if (i == domainsAdded[e]) {
                            statment = false;
                            System.out.println("Enter right numbers");
                            break;
                        }
                    }
                }
            } else {
                String number = T4.getText();
                String[] numbers = number.split(" ");
                int num[] = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    num[i] = Integer.parseInt(numbers[i]);
                    for (int j = 0; j < domainsAdded.length; j++) {
                        if (num[i] == domainsAdded[j]) {
                            System.out.println("Enter right numbers");
                            statment = false;
                            break;
                        }
                    }
                }
            }
            if (statment) {
                addDomainRST();
                addCodomainRST();
            }
            cleanTexts();
        } catch (Exception e) {
            System.out.println("Error");
        }
        /*        addDomainRST();
         addCodomainRST();
         checkRST();
         cleanTexts();// TODO add your handling code here:*/
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addElementRST();
        cleanTexts();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        try {
            int[] domainsAdded = new int[function.getDomain().length];
            domainsAdded = function.getDomain();
            boolean statment = true;
            if (T7.getText().isEmpty()) {
                int From = Integer.parseInt(T8.getText());
                int To = Integer.parseInt(T9.getText());
                for (int i = From; i <= To; ++i) {
                    for (int e = 0; e < domainsAdded.length; e++) {
                        if (i == domainsAdded[e]) {
                            statment = false;
                            System.out.println("Enter right numbers");
                            break;
                        }
                    }
                }
            } else {
                String number = T7.getText();
                String[] numbers = number.split(" ");
                int num[] = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    num[i] = Integer.parseInt(numbers[i]);
                    for (int j = 0; j < domainsAdded.length; j++) {
                        if (num[i] == domainsAdded[j]) {
                            System.out.println("Enter right numbers");
                            statment = false;
                            break;
                        }
                    }
                }
            }
            if (statment) {
                addDomainFunction();
                checkFunction();
            }
            cleanTexts();
        } catch (Exception e) {
            System.out.println("Error");
        }
        /*addDomainFunction();
         checkFunction();
         cleanTexts();// TODO add your handling code here:*/
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        try {
            int[] domainsAdded = new int[function.getCodomain().length];
            domainsAdded = function.getCodomain();
            boolean statment = true;
            if (T7.getText().isEmpty()) {
                int From = Integer.parseInt(T8.getText());
                int To = Integer.parseInt(T9.getText());
                for (int i = From; i <= To; ++i) {
                    for (int e = 0; e < domainsAdded.length; e++) {
                        if (i == domainsAdded[e]) {
                            statment = false;
                            System.out.println("Enter right numbers");
                            break;
                        }
                    }
                }
            } else {
                String number = T7.getText();
                String[] numbers = number.split(" ");
                int num[] = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    num[i] = Integer.parseInt(numbers[i]);
                    for (int j = 0; j < domainsAdded.length; j++) {
                        if (num[i] == domainsAdded[j]) {
                            System.out.println("Enter right numbers");
                            statment = false;
                            break;
                        }
                    }
                }
            }
            if (statment) {
                addCodomainFunction();
                checkFunction();
            }
            cleanTexts();
        } catch (Exception e) {
            System.out.println("Error");
        }
        /*addCodomainFunction();
         checkFunction();
         cleanTexts();// TODO add your handling code here:*/
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addElementFunction();
        cleanTexts();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            int[] codomainsAdded = new int[relation.getCodomain().length];
            codomainsAdded = relation.getCodomain();
            boolean statment = true;
            if (T1.getText().isEmpty()) {
                int From = Integer.parseInt(T2.getText());
                int To = Integer.parseInt(T3.getText());
                for (int i = From; i <= To; ++i) {
                    for (int e = 0; e < codomainsAdded.length; e++) {
                        if (i == codomainsAdded[e]) {
                            statment = false;
                            System.out.println("Enter right numbers");
                            break;
                        }
                    }
                }
            } else {
                String number = T1.getText();
                String[] numbers = number.split(" ");
                int num[] = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    num[i] = Integer.parseInt(numbers[i]);
                    for (int j = 0; j < codomainsAdded.length; j++) {
                        if (num[i] == codomainsAdded[j]) {
                            System.out.println("Enter right numbers");
                            statment = false;
                            break;
                        }
                    }
                }
            }
            if (statment) {
                addCodomain();
            }
            cleanTexts();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
