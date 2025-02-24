import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original ArrayList: " + colors);

        colors.add(0, "Red");

        System.out.println("ArrayList after insertion: " + colors);
    }
}
