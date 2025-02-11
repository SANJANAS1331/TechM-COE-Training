import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferReaderandScanner {
    public static void main(String args[]) throws IOException{
        BufferReaderClass();
        BufferReaderandScanner scn = new BufferReaderandScanner();
        scn.ScannerClass();
    }

    static void BufferReaderClass() throws IOException {
        BufferedReader BufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide an input data:");
        String inputData = BufferReader.readLine();
        System.out.println("The input data you have provided: " + inputData);
    }

    void ScannerClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide an input as a text:");
        String inputAsText = sc.nextLine();
        System.out.println("The input you entered as a text: " + inputAsText);

        System.out.println("Provide an input as an integer:");
        int inputAsInteger = sc.nextInt();
        System.out.println("The input you entered as an integer: " + inputAsInteger);

        System.out.println("Provide an input as a float:");
        float inputAsFloat = sc.nextFloat();
        System.out.println("The input you entered as a float: " + inputAsFloat);
    }
}