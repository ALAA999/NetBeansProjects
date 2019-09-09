
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class JcomboboxModel extends JFrame implements ActionListener{
    Container c;
    JComboBox box,box2;
    String countries[] = {"Palestine","British","USA"};
    String citiespalsetine[] = {"gaza","rafah","nables","khanyones"};
    String citiesbritish[] = {"london","paris","espanesh","germany"};
    String citiesusa[] = {"maxeco","washonton","newyork","texas"};
    DefaultComboBoxModel modelB = new DefaultComboBoxModel(citiesbritish);
    DefaultComboBoxModel modelP = new DefaultComboBoxModel(citiespalsetine);
    DefaultComboBoxModel modelU = new DefaultComboBoxModel(citiesusa);
    JLabel jLabel,jLabel2;
    JTextArea area;
    public JcomboboxModel(){
        c= getContentPane();
        setLayout(null);
        jLabel = new JLabel("chose country:");
        setBounds(200, 150, 400, 400);
        area = new JTextArea();
        area.setBounds(50, 80, 200, 60);
        jLabel.setBounds(25,25 ,110, 30);
        box = new JComboBox(countries);
        box.setBounds(125, 30, 140, 20);
        jLabel2 = new JLabel("chose city:");
        jLabel2.setBounds(25, 55,80, 30);
        box.setSelectedIndex(-1);
        box2 = new JComboBox();
        box2.setBounds(125, 55, 140, 20);
        c.add(jLabel);c.add(jLabel2);c.add(box);c.add(box2);c.add(area);
        setVisible(true);
        box.addActionListener(this);
        box2.addActionListener(this);
    }
    public static void main(String[] args) {
        new JcomboboxModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String country="";

        if(e.getSource() == box){
            if(box.getSelectedItem().equals("Palestine")){
                box2.setModel(modelP);
                //box2.setSelectedIndex(-1);
                country = "Palestine";
            }
            if(box.getSelectedItem().equals("British")){
                box2.setModel(modelB);
                box2.setSelectedIndex(-1);
                country =  "British";
            }
            if(box.getSelectedItem().equals("USA")){
                box2.setModel(modelU);
                box2.setSelectedIndex(-1);
                country =  "USA";
            }
                    area.setText("The country is: "+ country+"\n");

        }
        if(e.getSource() == box2){
         String city=""; 
         city = (String) box2.getSelectedItem();
         area.append("The city is: "+city);
        }
    }
}
