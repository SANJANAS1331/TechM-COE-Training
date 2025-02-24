import java.util.ArrayList;
import java.util.Collections;

public class CopyOneArrayListIntoAnother {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Elderberry");

        System.out.println("Original ArrayList: " + originalList);

        ArrayList<String> copiedList = new ArrayList<>(originalList.size());

        for (int i = 0; i < originalList.size(); i++) {
            copiedList.add(null);
        }

        Collections.copy(copiedList, originalList);

        System.out.println("Copied ArrayList: " + copiedList);
    }
}
