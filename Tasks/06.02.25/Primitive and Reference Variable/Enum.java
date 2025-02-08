import java.util.Scanner;

enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Enum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String inputDay = scanner.next().toUpperCase();

        try {
            DaysOfWeek day = DaysOfWeek.valueOf(inputDay);

            if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
                System.out.println("Holiday!");
            } else {
                System.out.println("Not Holiday.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day.");
        }

        scanner.close();
    }
}
