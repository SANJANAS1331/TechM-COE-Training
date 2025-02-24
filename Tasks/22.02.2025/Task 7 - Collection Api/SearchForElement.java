import java.util.ArrayList;
import java.util.Scanner;

public class SearchForElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("ArrayList: " + colors);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        String searchElement = scanner.nextLine();

        if (colors.contains(searchElement)) {
            System.out.println("Element '" + searchElement + "' found at index: " + colors.indexOf(searchElement));
        } else {
            System.out.println("Element '" + searchElement + "' not found in the ArrayList.");
        }

        scanner.close();
    }
}
