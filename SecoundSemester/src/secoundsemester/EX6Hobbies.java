
import java.awt.Button;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EX6Hobbies extends JFrame{
    Container c;
    JLabel label;
    JTextArea area;
    JButton button;
    JTextField field;
    JCheckBox box1,box2,box3;
    ButtonGroup bg;
    JRadioButton jrb1,jrb2;

    public EX6Hobbies(){
        c = getContentPane();
        setLayout(null);
        setBounds(300, 300, 400, 400);
        label = new JLabel("Lenght:");
        label.setBounds(150, 30, 60, 30);
        field = new JTextField();
        field.setBounds(200, 30, 80, 30);
        jrb1 = new JRadioButton("Male");
        jrb2 = new JRadioButton("Female");
        bg = new ButtonGroup();
        jrb1.setBounds(100, 80, 80, 20);
        jrb2.setBounds(200, 80, 80, 20);
        bg.add(jrb1);bg.add(jrb2);
        jrb1.setSelected(true);
        box1 = new JCheckBox("FootBall");
        box1.setBounds(80, 120, 80, 20);
        box2 = new JCheckBox("Tennis");
        box2.setBounds(180, 120, 80, 20);
        box3 = new JCheckBox("Sleeping");
        area = new JTextArea("");
        area.setBounds(10, 280, 390, 200);
        box3.setBounds(280, 120, 80, 20);
        c.add(jrb1);
        c.add(jrb2);
        button = new JButton("Get Info");
        area.setEditable(false);
        button.setBounds(120, 190, 100, 50);
        c.add(label);c.add(field);c.add(area);
        c.add(jrb1);c.add(jrb2);c.add(button);c.add(box1);c.add(box2);c.add(box3);
        setVisible(true);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String gender;
                String hobbies = "";
                if(jrb1.isSelected()){
                    gender = "Male";
                }else{
                    gender = "Female";
                }
                if(box1.isSelected()){
                    hobbies = hobbies + "FootBall\t";
                }
                if(box2.isSelected()){
                    hobbies = hobbies + "Tennis \t";
                }
                if(box3.isSelected()){
                    hobbies = hobbies + "Sleeping \t";
                }
                if(hobbies.length() == 0){
                    hobbies = "Nothing";
                }
                area.setText("The lenght is: "+field.getText()+" \n"+
                        "The gender is: "+gender+" \n"+
                        "The Hobbies is: "+hobbies);
            }
        });
    }
    public static void main(String[] args) {
        new EX6Hobbies();
    }
}
