import java.util.ArrayList;
import java.util.Iterator;

public class IterateThroughElementsInAL {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Iterating using for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating using for loop with index:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
