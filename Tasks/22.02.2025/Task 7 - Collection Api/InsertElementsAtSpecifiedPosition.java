import java.util.LinkedList;

public class InsertElementsAtSpecifiedPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original LinkedList: " + list);

        list.add(1, "Mango");

        list.add(3, "Orange");

        System.out.println("Updated LinkedList after insertion: " + list);
    }
}
