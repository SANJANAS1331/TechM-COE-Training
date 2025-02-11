public class OutputErrorStream {
    public static void main(String[] args) {
        int outputCount;
        outputCount = 5;
        int errCount = 2;
        float outputDelay = 6.7864498f;
        outputDelay = 56789675.6f;

        System.out.print("The value of outputCount is "+outputCount);
        System.out.print("The value of errCount is "+errCount+"\n");

        System.out.println("The first variable name declared is outputCount");
        System.out.println("The second variable name declared is outputCount");
        System.out.println("The third variable name declared is outputCount");

        System.err.println("This is the first error message.");
        System.err.println("this is the second error message.");
    }
}