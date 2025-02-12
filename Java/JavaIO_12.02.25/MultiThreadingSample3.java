public class MultiThreadingSample3 {
    public static void main(String[] args) {
        ThreadThree t31 = new ThreadThree();
        t31.start();
        ThreadThree t32 = new ThreadThree();
        t32.start();
        ThreadThree t33 = new ThreadThree();
        t33.start();
    }
}

class ThreadThree extends Thread {
    public void run() {
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
        System.out.println("From ThreadThree!");
    }
}