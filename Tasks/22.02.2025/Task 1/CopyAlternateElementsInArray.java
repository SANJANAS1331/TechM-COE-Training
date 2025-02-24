package org.example;

import java.util.Arrays;

public class CopyAlternateElementsInArray {
    public static void main(String[] args) {
        int[] originalArray = {25,50,75,100,125,150};

        int newSize = (originalArray.length + 1) / 2;

        int[] alternateElementsArray = new int[newSize];

        int index = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            alternateElementsArray[index++] = originalArray[i];
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Alternate Elements in Array: " + Arrays.toString(alternateElementsArray));
    }
}
