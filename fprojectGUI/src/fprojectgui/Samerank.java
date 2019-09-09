
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Samerank implements Playingstratagy {

    Timer time;

    @Override
    public void play(int i) {
        if (mycardframe.rank == mycardframe.rank2||(mycardframe.color.equals("joker")&&mycardframe.color2.equals("joker"))) {
            mycardframe.a.get(mycardframe.num).setSelected(true);
            mycardframe.a.get(i).setSelected(true);
            int score = Integer.parseInt(mycardframe.Scoore.getText());
            score = score + 50;
            mycardframe.Scoore.setText("" + score);
            time = new Timer(400, (ActionEvent ae) -> {
                mycardframe.b1.setEnabled(false);
                mycardframe.b2.setEnabled(false);
                mycardframe.b1 = null;
                mycardframe.b2 = null;
            });
            time.setRepeats(false);
            time.start();
        } else {
            int score = Integer.parseInt(mycardframe.Scoore.getText());
            score = score - 5;
            mycardframe.Scoore.setText("" + score);
            time = new Timer(400, (ActionEvent ae) -> {
                mycardframe.b1.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
                mycardframe.b2.setIcon(new ImageIcon(getClass().getResource("b1fv.png")));
                mycardframe.b1 = null;
                mycardframe.b2 = null;
            });
            time.setRepeats(false);
            time.start();
        }
    }
}
