
import java.util.*;

class f4 {

    public static void main(String[] args) {
        int d;
        for (d = 3; d <= 100; ++d) {
            for (int i = 2; i < d; ++i) {
                if (d % i == 0) {
                    d = 2;
                } else {
                    d = 1;
                }
            }
        }
        if (d == 1) {
            System.out.println("awale");
        } else {
            System.out.println("not awale");
        }
    }
}
