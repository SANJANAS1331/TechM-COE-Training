class mythread extends Thread{
    public void run(){
        System.out.println("running");
    }
}
public class mythread1{
    public static void main(String[] args){
        mythread mt=new mythread();
        mt.start();
        System.out.println("runnable");
    }

}