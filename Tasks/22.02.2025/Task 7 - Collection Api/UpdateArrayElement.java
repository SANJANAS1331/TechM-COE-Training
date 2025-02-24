import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArrayElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original ArrayList: " + colors);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to update: ");
        String oldElement = scanner.nextLine();

        if (colors.contains(oldElement)) {
            System.out.print("Enter the new element: ");
            String newElement = scanner.nextLine();
            
            int index = colors.indexOf(oldElement);
            colors.set(index, newElement);

            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Element not found in the list!");
        }

        scanner.close();
    }
}
