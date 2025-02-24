import java.util.LinkedList;

public class InsertElementAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original LinkedList: " + list);

        list.addLast("Mango");

        System.out.println("Updated LinkedList after insertion: " + list);
    }
}
