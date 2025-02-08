package utility;

import java.util.Scanner;

class NumberUtils {
    public static int getLength(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
}

public class Utility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int length = NumberUtils.getLength(num);

        System.out.println("Length of the integer: " + length);

        scanner.close();
    }
}
