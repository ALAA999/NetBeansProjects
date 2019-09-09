import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cards extends JButton {

    String color;
    int rank;
    ImageIcon icon;
    boolean Selected;
    String cardType;


    public Cards(String color, int rank,ImageIcon icon,boolean Selected,String cardType) {
        this.color = color;
        this.rank = rank;
        this.icon = icon;
        this.Selected = Selected;
        this.cardType = cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    
     public String getCardType() {
        return cardType;
    }
     
    public boolean IsSelected() {
        return Selected;
    }

    public void setSelected(boolean Selected) {
        this.Selected = Selected;
    }
    public ImageIcon geticon() {
        return icon;
    }
    public void seticon(ImageIcon button) {
        this.icon = icon;
    }
   
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getColor() {
        return color;
    }

    public int getRank() {
        return rank;
    }
}
