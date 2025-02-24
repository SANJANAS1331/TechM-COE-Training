import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLLInReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");

        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.println("Iterating the LinkedList in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
