
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class Mains extends JFrame implements ActionListener {

    JMenuBar bar = new JMenuBar();

    int index = 0;
///////Objects 
    static JTextArea area = new JTextArea();
    HeapArray heap = new HeapArray();
    HeapTree tree = new HeapTree();
///////Menus
    JMenu file = new JMenu("File"), view = new JMenu("View"), exit = new JMenu("Exit"), heapTree = new JMenu("HeapTree");
///////////Menus Item
    JMenuItem make = new JMenuItem("Make");
    JMenuItem delete = new JMenuItem("Delete");
    JMenuItem refresh = new JMenuItem("Refresh");
    JMenuItem heapArray = new JMenuItem("HeapArray");
    JMenuItem usingStack = new JMenuItem("usingStack");
    JMenuItem usingQueue = new JMenuItem("usingQueue");
    JMenuItem inOrder = new JMenuItem("InOrder");
    JMenuItem preOrder = new JMenuItem("PreOrder");
    JMenuItem postOrder = new JMenuItem("PostOrder");
    JMenuItem end = new JMenuItem("Exit");

/////////////////// Buttons && Labels && TextFiled && ComboBoxs
    JButton add = new JButton("Add"), insert = new JButton("Insert");
    JLabel firstName = new JLabel("FirstName"), lastName = new JLabel("LastName"), id = new JLabel("ID NO."), status = new JLabel("Status"), salary = new JLabel("Salary");
    JComboBox salaryBox = new JComboBox(), statusBox = new JComboBox();
    JTextField firstNameField = new JTextField(), lastNameField = new JTextField(), idField = new JTextField();
////////////////////

    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable();

    JPanel panel1 = new JPanel(), panel2 = new JPanel();
    Container con;

    ////////////////////Constrcture
    Mains() {

        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        con = getContentPane();
        con.add(panel1);
        con.add(panel2);
//////////////////////////Panels
        panel1.setBounds(0, 0, 500, 500);
        panel2.setBounds(500, 0, 200, 500);
        panel1.setLayout(null);
        //panel2.setBackground(Color.blue);
        setVisible(true);
//////////////////////	Panels

//////////////////////Menus
        setJMenuBar(bar);
        bar.add(file);
        bar.add(view);
        bar.add(exit);
        file.add(make);
        file.add(delete);
        file.add(refresh);
        exit.add(end);
        view.add(heapArray);
        view.add(heapTree);
        heapTree.add(usingStack);
        heapTree.add(usingQueue);
        heapTree.add(inOrder);
        heapTree.add(postOrder);
        heapTree.add(preOrder);
////////////////////Buttons && Labels && TextFields && ComboBox 

        panel1.add(area);
        panel2.add(firstName);
        panel2.add(firstNameField);
        panel2.add(lastName);
        panel2.add(lastNameField);
        panel2.add(id);
        panel2.add(idField);
        panel2.add(status);
        panel2.add(statusBox);
        panel2.add(salary);
        panel2.add(salaryBox);
        panel2.setLayout(null);
        panel2.add(add);
        panel2.add(insert);
        firstName.setBounds(530, 30, 70, 30);
        firstNameField.setBounds(600, 30, 70, 30);
        lastName.setBounds(530, 100, 70, 30);
        lastNameField.setBounds(600, 100, 70, 30);
        id.setBounds(530, 170, 70, 30);
        idField.setBounds(600, 170, 70, 30);
        status.setBounds(530, 240, 70, 30);
        statusBox.setBounds(600, 240, 70, 30);
        salary.setBounds(530, 310, 70, 30);
        salaryBox.setBounds(600, 310, 70, 30);
        add.setBounds(510, 380, 70, 30);
        insert.setBounds(600, 380, 70, 30);
///////////Area
        area.setBackground(null);
        area.setSize(500, 500);
        area.setFont(new Font("kanana", Font.BOLD, 13));
        area.setEditable(false);
/// ComboBox Item
        statusBox.insertItemAt("Married", 0);
        statusBox.insertItemAt("Single", 1);
        salaryBox.insertItemAt("1000", 0);
        salaryBox.insertItemAt("1200", 0);
        salaryBox.insertItemAt("1400", 0);
        salaryBox.insertItemAt("1600", 0);
        salaryBox.insertItemAt("1800", 0);
        salaryBox.insertItemAt("2000", 0);
        salaryBox.setSelectedIndex(-1);
        statusBox.setSelectedIndex(-1);
///////Enabled
        make.setEnabled(false);
        refresh.setEnabled(false);
        heapArray.setEnabled(false);
        heapTree.setEnabled(false);
        delete.setEnabled(false);
        refresh.setEnabled(false);
        

        area.append("\n    FirstName\tlastName\tId\tStatus\tSalary");
/// Action Listener
        add.addActionListener(this);
        insert.addActionListener(this);
        make.addActionListener(this);
        refresh.addActionListener(this);
        inOrder.addActionListener(this);
        preOrder.addActionListener(this);
        postOrder.addActionListener(this);
        usingStack.addActionListener(this);
        usingQueue.addActionListener(this);
        heapArray.addActionListener(this);
        end.addActionListener(this);
    }

    public static void main(String[] args) {
        new Mains();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==end){
            System.exit(0);      
        }
        if (e.getSource() == heapArray) {
            area.setText("\n    FirstName\tlastName\tId\tStatus\tSalary");
            heap.heapArray(index);
        }
        if (e.getSource() == usingStack) {
            area.setText("\n    FirstName\tlastName\tId\tStatus\tSalary");
            tree.usingStack(tree.root);

        }
        if (e.getSource() == usingQueue) {
            area.setText("\n    FirstName\tlastName\tId\tStatus\tSalary");
            tree.usingQueue(tree.root);
        }

        if (e.getSource() == inOrder) {
            area.setText("\n    FirstName\tlastName\tId\tStatus\tSalary");

            tree.inOrderTraversing(tree.root);

        }
        if (e.getSource() == preOrder) {
            area.setText("\n    FirstName\tlastName\tId\tStatus\tSalary");

            tree.preOrederTraversing(tree.root);

        }
        if (e.getSource() == postOrder) {
            area.setText("\n    FirstName\tlastName\tId\tStatus\tSalary");

            tree.postOrderTraversing(tree.root);

        }

        if (e.getSource() == make) {
            heap.newTrickle(index);
            view.setEnabled(true);
            delete.setEnabled(true);
            refresh.setEnabled(true);
            heapArray.setEnabled(true);
            for (int i = 1; i <= index; i++) {
                System.out.print(heap.list[i].toString());
            }
        }

///////refresh
        if (e.getSource() == refresh) {
            tree.root = tree.cnvrt(heap.list, 1, index);
            heapTree.setEnabled(true);

        }

//////Add
        if (e.getSource() == add) {
            try {
                if (!firstNameField.equals("") && !lastNameField.equals("") && !idField.equals("") && (statusBox.getSelectedIndex() != -1) && (salaryBox.getSelectedIndex() != -1)) {
                    int idInt = Integer.parseInt(idField.getText());
                    String salaryDouble = (String) salaryBox.getSelectedItem();

                    for (int i = 1; i <= index; i++) {
                        if (heap.list[i].empid == idInt) {
                            JOptionPane.showMessageDialog(null, "This ID is Used");
                            idField.setText("");
                            return;
                        }
                    }

                    if (idInt >= 1000) {
                        idField.setText("");
                        JOptionPane.showMessageDialog(null, "Enter ID Less Than 1000");
                        return;
                    }
                    heap.list[index + 1] = new Employees(Integer.parseInt(idField.getText()), firstNameField.getText(), lastNameField.getText(), (String) statusBox.getSelectedItem(), Integer.parseInt(salaryDouble));

                    index++;
                    firstNameField.setText("");
                    lastNameField.setText("");
                    idField.setText("");
                    statusBox.setSelectedIndex(-1);
                    salaryBox.setSelectedIndex(-1);

                    make.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Fill All Field");
                }
            } catch (Exception exception) {
                idField.setText("");
                JOptionPane.showMessageDialog(null, "Plese Enter Number In ID No..");

            }

        }
/////delete

        if (e.getSource() == delete) {
            heap.serve();
            for (int i = 1; i <= index; i++) {
                System.out.print(heap.list[i].toString());
            }
        }

        //////Insert
        if (e.getSource() == insert) {

            if (!firstNameField.equals("") && !lastNameField.equals("") && !idField.equals("") && (statusBox.getSelectedIndex() != -1) && (salaryBox.getSelectedIndex() != -1)) {
                int idInt = Integer.parseInt(idField.getText());
                String salaryDouble = (String) salaryBox.getSelectedItem();

                heap.insert(new Employees(Integer.parseInt(idField.getText()), firstNameField.getText(), lastNameField.getText(), (String) statusBox.getSelectedItem(), Integer.parseInt(salaryDouble)));

                firstNameField.setText("");
                lastNameField.setText("");
                idField.setText("");
                statusBox.setSelectedIndex(-1);
                salaryBox.setSelectedIndex(-1);

                make.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Fill All Field");
            }

        }
        
    }

}
