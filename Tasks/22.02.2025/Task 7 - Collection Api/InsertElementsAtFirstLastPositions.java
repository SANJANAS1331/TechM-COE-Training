import java.util.LinkedList;

public class InsertElementsAtFirstLastPositions {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Original LinkedList: " + list);

        list.addFirst("Apple");

        list.addLast("Grapes");

        System.out.println("Updated LinkedList after insertions: " + list);
    }
}
