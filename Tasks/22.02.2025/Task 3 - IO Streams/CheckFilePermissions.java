import java.io.File;
import java.util.Scanner;

public class CheckFilePermissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();
        scanner.close();

        File file = new File(path);

        if (file.exists()) {
            System.out.println("The specified path exists.");

            if (file.canRead()) {
                System.out.println("The file/directory has read permission.");
            } else {
                System.out.println("The file/directory does NOT have read permission.");
            }

            if (file.canWrite()) {
                System.out.println("The file/directory has write permission.");
            } else {
                System.out.println("The file/directory does NOT have write permission.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
    }
}
