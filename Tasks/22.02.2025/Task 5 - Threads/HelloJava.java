package org.example;

public class HelloJava {
    public static void main(String[] args) {
        HelloJavaThread t1 = new HelloJavaThread();
        t1.start();
    }
}

class HelloJavaThread extends Thread {
    public void run() {
        System.out.println("Hello, Java!");
    }
}