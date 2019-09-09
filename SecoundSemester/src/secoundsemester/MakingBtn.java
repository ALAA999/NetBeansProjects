
import javax.swing.JButton;
import javax.swing.JFrame;


public class MakingBtn {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Enter");
        button.setBounds(130, 80, 130, 80);
        frame.add(button);
        frame.setSize(500, 600);
        frame.setLocation(200, 110);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
  
}
