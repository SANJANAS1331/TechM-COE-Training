package org.example;
import java.util.Arrays;
import java.util.List;

public class SumOfEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 8, 10, 12, 15, 3, 6, 9);
        int sumOfEven = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        int sumOfOdd = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
    }
}