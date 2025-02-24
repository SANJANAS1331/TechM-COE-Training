package org.example;

import java.util.Objects;

public class EqualsDeepEquals {
    public static void main(String[] args) {
        Integer n1 = 5, n2 = 7, n3 = 5;
        System.out.println("equals() and deepEquals() on Integers:" );
        System.out.println("n1.equals(n2): " + n1.equals(n2));
        System.out.println("Objects.deepEquals(n1, n3): " + Objects.deepEquals(n1, n3));

        String[] array1 = {"abc", "xyz", "lmn"};
        String[] array2 = {"abc", "xyz", "lmn", "def"};
        String[] array3 = array2;

        System.out.println("\nequals() on Strings:");
        System.out.println("arr1.equals(arr2): " + array1.equals(array2));
        System.out.println("arr2.equals(arr3): " + array2.equals(array3));

        System.out.println("\ndeepEquals() on string:");
        System.out.println("Objects.deepEquals(arr1, arr2): " + Objects.deepEquals(array1, array2));
        System.out.println("Objects.deepEquals(arr2, arr3): " + Objects.deepEquals(array2, array3));
    }
}
