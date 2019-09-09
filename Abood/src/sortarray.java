
import java.util.Scanner;

public class sortarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number" + (i + 1));
            array[i] = s.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    System.out.println("swap");
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }
}
