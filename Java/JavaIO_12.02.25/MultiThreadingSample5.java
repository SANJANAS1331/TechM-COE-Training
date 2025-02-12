public class MultiThreadingSample5 {
    public static void main(String[] args) {
        ThreadRunnableTwo tr21 = new ThreadRunnableTwo();
        new Thread(tr21).start();
        ThreadRunnableTwo tr22 = new ThreadRunnableTwo();
        new Thread(tr22).start();
    }
}

class ThreadRunnableTwo implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnableTwo!");
        System.out.println("From ThreadRunnableTwo!");
        System.out.println("From ThreadRunnableTwo!");
    }
}
