
import javax.swing.JOptionPane;

class Threadforbank {

    int amount;

    synchronized void putmoney(int Amount) {
        this.amount = Amount;
    }

    synchronized void takemoney() {
        String s = JOptionPane.showInputDialog("Mr.you have " + amount + "$" + " Enter how much you want to take.");
        int s1 = Integer.parseInt(s);
        if (s1 > amount) {
            JOptionPane.showMessageDialog(null, "You hane only " + amount + "$");
        } else {
            amount = amount - s1;
        }

        JOptionPane.showMessageDialog(null, "You have " + amount + "$ \nThank you for using our Bank!");
    }
}

class MAINFORBANK {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("*** Welcome To Palestine Bank ***\n__Please Enter The Amount You Want To Keep__");
        int s1 = Integer.parseInt(s);
        Threadforbank t = new Threadforbank();
        threa1 t1 = new threa1(t, s1);
        threa2 t2 = new threa2(t);
        t1.run();
        t2.run();

    }

}

class threa1  {

    Threadforbank t;
    int s1;

    threa1(Threadforbank q, int s) {
        this.t = q;
        this.s1 = s;
    }

    public void run() {
        t.putmoney(this.s1);
    }
}

class threa2  {

    Threadforbank t;

    threa2(Threadforbank q) {
        this.t = q;
    }

    public void run() {
        t.takemoney();
    }
}
