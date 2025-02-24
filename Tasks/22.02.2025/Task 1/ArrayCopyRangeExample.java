package org.example;

import java.util.Arrays;

public class ArrayCopyRangeExample {

    public static int[] ArrayCopyRange(int[] array, int start, int end) {
        return Arrays.copyOfRange(array, start, end);
    }

    public static void main(String[] args) {
        int[] ogArray = {0,1,1,2,3,5,8,13,21,34};

        int[] cpyArray = ArrayCopyRange(ogArray, 1, 7);

        System.out.println("Original Array: " + Arrays.toString(ogArray));
        System.out.println("Copied Range Array: " + Arrays.toString(cpyArray));
    }
}
