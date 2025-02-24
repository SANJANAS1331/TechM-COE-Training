package org.example;

public class EvenOddNumbers {
    public static void main(String[] args) throws Exception{
        EvenThread e= new EvenThread();
        OddThread o = new OddThread();
        e.start();
        e.join();
        o.start();
    }
}

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
