package org.example;

class StringBufferExample extends Thread {
    private StringBuffer sb;

    public StringBufferExample(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        sb.append(Thread.currentThread().getName());
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + sb);
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        StringBufferExample t1 = new StringBufferExample(sb);
        StringBufferExample t2 = new StringBufferExample(sb);
        StringBufferExample t3 = new StringBufferExample(sb);

        t1.start();
        t2.start();
        t3.start();
    }
}