import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Purple");

        System.out.println("Original ArrayList: " + list);

        Collections.shuffle(list);

        System.out.println("Shuffled ArrayList: " + list);
    }
}
