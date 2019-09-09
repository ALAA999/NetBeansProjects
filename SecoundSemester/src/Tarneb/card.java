import javax.swing.ImageIcon;

public class card  {

    int rank;
    ImageIcon icon;
    String cardType;
    int value;

    public card( int rank,ImageIcon icon,boolean Selected,String cardType,int value) {
        this.rank = rank;
        this.icon = icon;
        this.cardType = cardType;
        this.value = value;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
     public String getCardType() {
        return cardType;
    }
     
    public ImageIcon geticon() {
        return icon;
    }
    public void seticon(ImageIcon button) {
        this.icon = icon;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    public int getRank() {
        return rank;
    }
}
