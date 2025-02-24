package org.example;
import java.util.Arrays;

public class ArrayComparison {
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args) {
        Integer[] array1 = {21, 22, 23, 24, 25};
        Integer[] array2 = {21, 22, 23, 24, 25};
        System.out.println("Two arrays equal: " + areArraysEqual(array1, array2));
    }
}