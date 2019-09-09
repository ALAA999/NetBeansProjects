
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class JTablee extends JFrame{
   // Container c;
   
    public JTablee(){
    DefaultTableModel model;
    String coulms[] = {"First","Secound","Third","Fourth"};
    String row[][] = {{"1","2","3","4"}
            ,{"6","7","8","9"},
            {"11","12","13","14"}
            ,{"16","17","18","19"}
            ,{"21","22","23","24"}};
       // c = getContentPane();
        //setLayout(null);
        setBounds(100, 100, 400, 400);
        model = new DefaultTableModel(row,coulms);
        JTable table = new JTable(model);
        add(new JScrollPane(table));
        DefaultTableModel d = (DefaultTableModel) table.getModel();
       // d.addRow(new String []  {"1","2","3","4","5"});
        d.addColumn("fifth",new String []{"5","10","15","20","25"});
//        DefaultTableModel d = new DefaultTableModel(row, coulms);
//        d.addColumn("fifth",new String []{"5","10","15","20","25"});
//        table.setModel(d);
        table.setBounds(20, 70, 300, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        new JTablee();
    }
}

/*
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTablee extends JFrame
{
    public JTablee()
    {
        //headers for the table
        String[] columns = new String[] {
            "Id", "Name", "Hourly Rate", "Part Time"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "John", 40.0, false },
            {2, "Rambo", 70.0, false },
            {3, "Zorro", 60.0, true },
        };
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
                new JTablee();
    }   
}*/