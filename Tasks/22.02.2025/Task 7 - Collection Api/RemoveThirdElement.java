import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green"); 
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original ArrayList: " + colors);

        if (colors.size() >= 3) {
            colors.remove(2); 
            System.out.println("Updated ArrayList after removing the third element: " + colors);
        } else {
            System.out.println("The ArrayList has fewer than three elements, so removal is not possible.");
        }
    }
}
