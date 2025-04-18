import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original ArrayList: " + colors);

        Collections.sort(colors);
        System.out.println("Sorted ArrayList (Ascending): " + colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Sorted ArrayList (Descending): " + colors);
    }
}
