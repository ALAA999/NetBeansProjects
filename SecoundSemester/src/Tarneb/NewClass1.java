/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarneb;

import java.util.Scanner;

/**
 *
 * @author Alaa
 */
public class NewClass1 {

    public static void main(String[] args) {
        int arr[] = {5, 8, 1, 0, 2};
////////////////////  5, 1, 8, 0, 2
        for (int i = 1; i < arr.length; i++) { // i = 2
            if (arr[i] < arr[i - 1]) {
                arr[i] = arr[i] + arr[i - 1];

                arr[i - 1] = arr[i] - arr[i - 1];

                arr[i] = arr[i] - arr[i - 1];

                i = 0;
            }
        }

        /*
         for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
         if (arr[i] > arr[j]) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         }
         }
         }*/
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Max {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ": is even");
            } else {
                System.out.println(i + ": is odd");
            }
        }
    }
}
