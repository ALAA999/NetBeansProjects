/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuer;

import java.util.ArrayList;

/**
 *
 * @author Alaa
 */
public class asd {

    public static void main(String[] args) {
        /*   int n =95;
         int number = n - 1 , loop2 = 1;
         for(int i = 0; i < n; ++i){
         for(int j = 0; j < number; ++j){
         System.out.print(" ");
         }
         for(int k = 0; k < loop2; ++k)
         System.out.print("#");
         ++loop2;
         --number;
         Sysem.out.println("");
         }*/
        /* int arr[] = {1, 2, 3, 4, 5};
         int temp;
         for (int i = 1; i < arr.length; i++) {
         for (int j = i; j > 0; j--) {
         if (arr[j] > arr[j - 1]) {
         temp = arr[j];
         arr[j] = arr[j - 1];
         arr[j - 1] = temp;
         }
         }
         }
         for (int i = 0; i < arr.length; i++) {
         System.out.println("" + arr[i]);
         }
         long max = 0, min = 0;
         for (int i = 1; i < arr.length; ++i) {
         max = max + arr[i];
         }
         for (int i = 0; i < arr.length - 1; ++i) {
         min = min + arr[i];
         }
         System.out.println("" + max + " " + min);*/
        /*int nums[] = {2, 3, 4, 3, 2, 3};
         int numbers[] = new int[nums.length];
         numbers[0] = 1;
         int max = 0, posistion = 0;
         for (int i = 1; i < nums.length; i++) {
         numbers[i] = 1;
         for (int j = i - 1; j >= 0; j--) {
         if (nums[i] == nums[j]) {
         numbers[i] = numbers[i] + 1;
         }
         }
         if (max < numbers[i]) {
         max = numbers[i];
         posistion = i;
         }
         }*/
        /*int max = numbers[0], posistion = 0;
         for (int i = 1; i < numbers.length; i++) {
         if (max < numbers[i]) {
         max = numbers[i];
         posistion = i;
         }
         }
         System.out.println("" + max + " positions: " + posistion);*/
        String dates = "12:45:54PM";
        String[] date = dates.split(":");
        int houres = Integer.parseInt(date[0]);
        if (dates.contains("PM") && houres < 12) {
            houres = houres + 12;
        } else if (houres >= 12 &&!dates.contains("PM")){
            houres = houres - 12;
        }
        if (houres < 0){
            houres = houres * -1;
        }
        System.out.println("" + String.format("%02d", houres) + ":"
                + String.format("%02d", Integer.parseInt(date[1])) + ":"
                + String.format("%02d", Integer.parseInt(date[2].substring(0, date[2].length() - 2))));
    }
}
