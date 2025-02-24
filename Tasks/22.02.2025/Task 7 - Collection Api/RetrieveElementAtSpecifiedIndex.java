import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElementAtSpecifiedIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("ArrayList: " + colors);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to retrieve element: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < colors.size()) {
            System.out.println("Element at index " + index + ": " + colors.get(index));
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (colors.size() - 1));
        }

        scanner.close();
    }
}
