package org.cursor;


import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array sorted in reverse order: " + Arrays.toString(array));

        int sumPositiveNumbers = 0;
        int[] array2 = {10, 8, 25, -150, 580, -20};
        for (Integer integer : array2) {
            if (integer > 0) {
                sumPositiveNumbers += integer;
            }
        }
        System.out.println("Sum of all positive numbers in array2: " + sumPositiveNumbers);

        double avg = 0;
        int count = 0;
        int[] array3 = {150, 200, 5, 1, 8, 15, 2};
        for (Integer integer : array3) {
            avg += integer;
            count++;
        }
        avg = avg / count;
        System.out.println("Average of numbers in array3: " + avg);


        Integer[] array4 = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array4[i].equals(array4[j]))
                    array4[j] = 0;
            }
        }
        System.out.println("All duplicated values are replaced by 0: " + Arrays.toString(array4));
        System.out.println("Size of array is fixed when the array is created ");
    }
}