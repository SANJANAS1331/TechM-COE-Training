package org.example;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] input = {22,33,44,55,66,77};
            System.out.println("Accessing element at index 7: " + input[7]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program continues after exception handling.");
    }
}