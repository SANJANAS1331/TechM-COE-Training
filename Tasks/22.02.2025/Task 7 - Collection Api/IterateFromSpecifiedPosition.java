import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class IterateFromSpecifiedPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting position (0-based index): ");
        int position = scanner.nextInt();
        scanner.close();

        if (position < 0 || position >= list.size()) {
            System.out.println("Invalid position! Please enter a valid index.");
            return;
        }

        ListIterator<String> iterator = list.listIterator(position);

        System.out.println("\nIterating from position " + position + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
