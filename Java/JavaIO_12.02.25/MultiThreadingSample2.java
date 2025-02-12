public class MultiThreadingSample2 {
    public static void main(String[] args) {
        ThreadTwo t2 = new ThreadTwo();
        t2.start();
        t2.start();
    }
}
class ThreadTwo extends Thread {
    public void run() {
        System.out.println("From ThreadTwo!");
        System.out.println("From ThreadTwo!");
        System.out.println(10/0);
    }
}
