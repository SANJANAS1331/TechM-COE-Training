import java.util.LinkedList;

public class FirstLastOccurrenceOfSpecifiedElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Papaya");
        list.add("Cherry");
        list.add("Papaya");
        list.add("Banana");
        list.add("Papaya");
  	list.add("Mango");
        System.out.println("LinkedList: " + list);

        String searchElement = "Papaya";
        int firstIndex = list.indexOf(searchElement);
        int lastIndex = list.lastIndexOf(searchElement);

        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchElement + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchElement + "' is at index: " + lastIndex);
        } else {
            System.out.println("'" + searchElement + "' is not found in the LinkedList.");
        }
    }
}
