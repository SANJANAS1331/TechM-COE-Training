import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("x", 1, "x@example.com"));
        students.add(new Student("y", 2, "y@example.com"));
        students.add(new Student("z", 3, "z@example.com"));
        students.add(new Student("a", 4, "a@example.com"));

        System.out.print("Enter student email ID: ");
        String inputId = scanner.nextLine();

            boolean found = false;
            for (Student student : students) {
                if (student.getEmail().equals(inputId)) {
                    System.out.println("You have logged in successfully!");
                    student.displayInfo();
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter your new name:");
                    String updatedName = scanner1.nextLine();
                    student.setName(updatedName);
                    System.out.println("Your name has been updated to " + updatedName);
                    student.displayInfo();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No student found with email ID: " + inputId);
            }

        scanner.close();
    }
}
