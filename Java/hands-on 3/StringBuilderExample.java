package org.exampl;

class StringBuilderExample extends Thread {
    private StringBuilder sb;

    public StringBuilderExample(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        sb.append(Thread.currentThread().getName());
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + sb);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilderExample t1 = new StringBuilderExample(sb);
        StringBuilderExample t2 = new StringBuilderExample(sb);
        StringBuilderExample t3 = new StringBuilderExample(sb);

        t1.start();
        t2.start();
        t3.start();
    }
}