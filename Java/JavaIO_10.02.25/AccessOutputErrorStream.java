public class AccessOutputErrorStream {
    public static void main(String[] args) {
        callSOP();
        callSOPLN();
        AccessOutputErrorStream stream = new AccessOutputErrorStream();
        stream.callSEPLN();
    }
    public static void callSOP() {
        System.out.print("The value of outputCount is 5.");
        System.out.print("The value of errCount is 2\n");
    }
    public static void callSOPLN() {
        System.out.println("The first variable name declared is outputCount");
        System.out.println("The second variable name declared is outputCount");
        System.out.println("The third variable name declared is outputCount");
    }
    public void callSEPLN(){
        System.err.println("This is the first error message.");
        System.err.println("this is the second error message.");
    }
}