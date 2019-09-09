
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class MAIN1 {

    static GazaHotel a1[] = new Highstars[100];
    static GazaHotel a2[] = new Midstars[100];
    static GazaHotel a3[] = new Lowstars[100];
    static CustomViewr a4 = new CustomViewr();
    static int fo1 = 1;

    public static void main(String[] args) {
        for (int i = 0; i < fo1; i++) {

            String s = JOptionPane.showInputDialog("*** Welcome to GazaHotel *** \n\n   Enter the num of your chose! \n  1. Add a Custom\n  2. Show a custom\n  3. Show All Customs\n  4. Delete a Custom");
            if (s.equals("1")) {
                String s1 = JOptionPane.showInputDialog("Enter Custom Name: ");
                String s2 = JOptionPane.showInputDialog("Enter Custom Room: ");
                String s3 = JOptionPane.showInputDialog("Enter Staying time: ");
                int e = Integer.parseInt(s3);
                String s4 = JOptionPane.showInputDialog("Enter Custom Payment: ");
                int pyment = Integer.parseInt(s4);
                if (pyment >= 500) {
                    a1[i] = new Highstars(s1, s2, s3, pyment, true, true);
                } else if (pyment >= 300 && pyment < 500) {
                    a2[i] = new Midstars(s1, s2, s3, pyment, true);
                } else if (pyment < 300) {
                    a3[i] = new Lowstars(s1, s2, s3, pyment);
                }
            }
            if (s.equals("2")) {
                String d = JOptionPane.showInputDialog("Enter the name of the custom you want to show!");
                for (int j = 0; j < fo1; j++) {

                    try {
                        if (d.equalsIgnoreCase(a1[j].getname())) {
                            a4.show(a1[j]);
                        }
                    } catch (Exception e) {

                    }
                    try {
                        if (d.equalsIgnoreCase(a2[j].getname())) {
                            a4.show(a2[j]);
                        }
                    } catch (Exception e) {

                    }
                    try {
                        if (d.equalsIgnoreCase(a3[j].getname())) {
                            a4.show(a3[j]);
                        }
                    } catch (Exception e) {

                    }
                }
            }
        
        if (s.equals("3")) {
            for (int j = 0; j < fo1; j++) {
                try {
                    a4.show(a1[j]);
                } catch (Exception e) {

                }

            }
            for (int j = 0; j < fo1; j++) {

                try {
                    a4.show(a2[j]);
                } catch (Exception e) {

                }

            }
            for (int j = 0; j < fo1; j++) {

                try {
                    a4.show(a3[j]);
                } catch (Exception e) {

                }

            }
        }
        String w = JOptionPane.showInputDialog("<yes> if you want to countine");
        if (w.equalsIgnoreCase("yes")) {
            ++fo1;
        }

    }
    String w1 = JOptionPane.showInputDialog("<yes> if you want to Main");

    if (w1.equalsIgnoreCase ( 
        "yes")) {
            main(args);
    }
}


}

class GazaHotel {

    String customName;
    String customRoom;
    String StayTime;
    String desc;
    int CustomPayment;

    GazaHotel(String customname, String customroom, String staytime, int custompayment) {
        this.customName = customname;
        this.customRoom = customroom;
        this.StayTime = staytime;
        this.CustomPayment = custompayment;

    }

    public String getname() {
        return customName;
    }

    public String getcustomroom() {
        return customRoom;
    }

    public String getstayingtime() {
        return StayTime;
    }

    public int getpayment() {
        return CustomPayment;
    }

    public String getdescription() {
        return desc;
    }

    public void getdesc(boolean ice, boolean pool) {
        if (ice && pool) {
            desc = "He has a pool and an ice";
        } else if (ice ^ pool) {
            desc = "He has only ice";
        } else {
            desc = "He dose not has a pool or ice.";
        }
    }
}

class Highstars extends GazaHotel {

    boolean ice;
    boolean pool;

    Highstars(String customname, String customroom, String staytime, int custompayment, boolean ice, boolean pool) {
        super(customname, customroom, staytime, custompayment);
        this.ice = ice;
        this.pool = pool;
        super.getdesc(ice, pool);
    }

}

class Midstars extends GazaHotel {

    boolean ice;

    Midstars(String customname, String customroom, String staytime, int custompayment, boolean ice) {
        super(customname, customroom, staytime, custompayment);
        this.ice = ice;
        super.getdesc(ice, false);
    }
}

class Lowstars extends GazaHotel {

    Lowstars(String customname, String customroom, String staytime, int custompayment) {
        super(customname, customroom, staytime, custompayment);
        super.getdesc(false, false);
    }
}

class CustomViewr {

    public void show(GazaHotel s) {
        JOptionPane.showMessageDialog(null, "Customer name is: " + s.getname() + "\nCustomer Room is: " + s.getcustomroom() + "\nCustomer Staying time is: " + s.getstayingtime() + "\nCustomer PAyment is: " + s.getpayment() + "\n" + s.getdescription());

    }
}
