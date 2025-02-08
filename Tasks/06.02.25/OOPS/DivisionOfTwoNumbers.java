import java.util.Scanner;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        int quotient = 0;
        int remainder = dividend;

        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient = addOne(quotient);
        }

        if (isNegative) {
            quotient = negate(quotient);
        }

        remainder = dividend;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }

    private static int addOne(int num) {
        return num + 1;
    }

    private static int negate(int num) {
        int neg = 0;
        while (num > 0) {
            num -= 1;
            neg -= 1;
        }
        while (num < 0) {
            num += 1;
            neg += 1;
        }
        return neg;
    }
}
