import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetSample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        setSample(hs);
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        setSample(ls);
        TreeSet<Float> ts = new TreeSet<>();
        setSample(ts);
    }

    public static void setSample(HashSet<Integer> hs) {
        System.out.println("----------HashSet----------");
        hs.add(5);
        hs.add(14);
        hs.add(88);
        hs.add(70);
        hs.add(4);
        hs.add(63);
        hs.add(20);
        hs.add(2);
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
        hs.remove(4);
        System.out.println("HashSet after removing element : " + hs);
        System.out.print("Elements divisible by 7: ");
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 7 == 0) {
                System.out.print(element + " ");
            }
        }
    }

    public static void setSample(LinkedHashSet<String> ls) {
        System.out.println("\n----------LinkedHashSet----------");
        ls.add("link");
        ls.add("hash");
        ls.add("set");
        ls.add("iterator");
        ls.add("treeset");
        ls.add("hashset");
        ls.add("list");
        ls.add("java");
        System.out.println("LinkedHashSet Size: " + ls.size());
        System.out.println("Elements in LinkedHashSet: " + ls);
        ls.remove("link");
        System.out.println("LinkedHashSet after removing element: " + ls);
        System.out.print("Elements with size more than 5: ");
        Iterator<String> iterator = ls.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() > 5) {
                System.out.print(element + " ");
            }
        }
    }

    public static void setSample(TreeSet<Float> ts) {
        System.out.println("\n----------TreeSet----------");
        ts.add(56.47f);
        ts.add(4.67f);
        ts.add(82.09f);
        ts.add(1.56f);
        ts.add(5.34f);
        ts.add(17.5f);
        ts.add(25.94f);
        ts.add(7.27f);
        System.out.println("TreeSet Size: " + ts.size());
        System.out.println("Elements in TreeSet: " + ts);
        ts.remove(1.56f);
        System.out.println("TreeSet after removing element: " + ts);
        System.out.print("Elements greater than 20: ");
        Iterator<Float> iterator = ts.iterator();
        while (iterator.hasNext()) {
            Float element = iterator.next();
            if (element > 20) {
                System.out.print(element + " ");
            }
        }
    }
}