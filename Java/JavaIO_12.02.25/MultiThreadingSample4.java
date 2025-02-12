public class MultiThreadingSample4 {
    public static void main(String[] args) {
        ThreadRunnableOne tr1 = new ThreadRunnableOne();
        new Thread(tr1).start();
    }
}

class ThreadRunnableOne implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnableOne!");
        System.out.println("From ThreadRunnableOne!");
    }
}
