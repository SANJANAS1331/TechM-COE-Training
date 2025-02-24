import java.util.LinkedList;

public class InsertElementAtSpecifiedPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Original LinkedList: " + list);

        int position = 2; 
        String newElement = "Grapes";

        list.add(position, newElement);

        System.out.println("Updated LinkedList after insertion: " + list);
    }
}
