import java.io.File;
import java.util.Scanner;

public class ListSpecificFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = scanner.nextLine();
        System.out.print("Enter file extension (e.g., .txt, .java): ");
        String extension = scanner.nextLine();
        scanner.close();

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(extension));

            if (files != null && files.length > 0) {
                System.out.println("Files with extension '" + extension + "' in " + dirPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files with extension '" + extension + "' found.");
            }
        } else {
            System.out.println("Invalid directory path!");
        }
    }
}
