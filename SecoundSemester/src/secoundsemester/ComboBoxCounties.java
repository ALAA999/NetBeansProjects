
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ComboBoxCounties extends JFrame{
    Container c;
    JComboBox box;
    String cities[] = {"970","972","974"};
    // String cities2[] = {"ww","qq","ee"};
    //DefaultComboBoxModel model = new DefaultComboBoxModel(cities);
    JLabel jLabel,jLabel2;
    public ComboBoxCounties(){
        c= getContentPane();
        setLayout(null);
        jLabel = new JLabel("PostCode");
        setBounds(200, 200, 400, 400);
        jLabel.setBounds(25,25 ,80, 20);
        box = new JComboBox(cities);
        box.setBounds(105, 25, 140, 20);
        jLabel2 = new JLabel("Reagen!");
        jLabel2.setBounds(120, 55,80, 30);
        //box.setModel(model);
        box.setSelectedIndex(-1);
        Font f = new Font("verdana", Font.BOLD, 14);
        jLabel2.setFont(f);
        jLabel2.setForeground(Color.red);
        c.add(jLabel);c.add(jLabel2);c.add(box);
        setVisible(true);
        setResizable(false);
        box.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(box.getSelectedItem() == "970" && !"Gaza".equals(jLabel2.getText())){
                    jLabel2.setText("Gaza");
                    System.out.println("item changed!");
                }else if(box.getSelectedItem() == "972"&& !"Rafah".equals(jLabel2.getText())){
                    jLabel2.setText("Rafah");System.out.println("item changed!");
                }else if(box.getSelectedItem() == "974"&& !"Nables".equals(jLabel2.getText())){
                    jLabel2.setText("Nables");System.out.println("item changed!");
                }
               
            }
        });
    }
    public static void main(String[] args) {
        new ComboBoxCounties();
    }
}
