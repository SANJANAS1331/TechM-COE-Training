import java.util.LinkedList;

public class InsertElementAtFront {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Original LinkedList: " + list);

        list.addFirst("Apple");

        System.out.println("Updated LinkedList after insertion: " + list);
    }
}
