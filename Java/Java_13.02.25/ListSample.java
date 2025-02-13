import java.util.*;

public class ListSample {
    public static void main(String[] args) throws Exception {
        ArrayListInList a = new ArrayListInList();
        LinkedListInList l = new LinkedListInList();
        VectorInList v = new VectorInList();
        StackInList s = new StackInList();
        a.start();
        a.join();
        l.start();
        l.join();
        v.start();
        v.join();
        s.start();
        s.join();
    }
}

class ArrayListInList extends Thread {
    public void run() {
        System.out.println("----------Array List----------");
    List<Integer> list1 = new ArrayList<>();
    System.out.println("Is list1 empty? "+list1.isEmpty());
    list1.add(35);
    list1.add(23);
    list1.add(67);
    list1.add(82);
    list1.add(56);
    list1.add(49);
    list1.add(49);
    list1.add(49);
    System.out.println("Is list1 empty? "+list1.isEmpty());
    System.out.println("The given list is:"+list1);
    System.out.println("Number of elements in the list: "+list1.size());
    list1.add(12);
    System.out.println("After adding one element:");
    System.out.println("The given list is :"+list1);
    System.out.println("The number of elements in the list: "+list1.size());
    System.out.println("Is 566 available in the list:"+list1.contains(566));
    System.out.println("The given list before removing elements is :"+list1);
    list1.remove(2);
    list1.remove(3);
    System.out.println("After removing elements:");
    System.out.println("The given list is :"+list1);
    System.out.println("The number of elements in the list: "+list1.size());
    }
}

class LinkedListInList extends Thread {
    public void run() {
        System.out.println("----------Linked List----------");
        List<Integer> list1 = new LinkedList<>();
        System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? "+list1.isEmpty());
        System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+list1.size());
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);
        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}

class VectorInList extends Thread {
    public void run() {
        System.out.println("----------Vector----------");
        List<Integer> list1 = new Vector<>();
        System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? "+list1.isEmpty());
        System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+list1.size());
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);
        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}

class StackInList extends Thread {
    public void run() {
        System.out.println("----------Stack----------");
        List<Integer> list1 = new Stack<>();
        System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? "+list1.isEmpty());
        System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+list1.size());
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);
        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}