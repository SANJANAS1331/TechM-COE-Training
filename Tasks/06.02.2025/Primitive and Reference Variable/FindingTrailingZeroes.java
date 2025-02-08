import java.util.Scanner;

public class FindingTrailingZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int trailingZeroes = countTrailingZeroes(num);

        System.out.println("Trailing Zeroes in " + num + "! : " + trailingZeroes);

        scanner.close();
    }

    public static int countTrailingZeroes(int n) {
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }
}
