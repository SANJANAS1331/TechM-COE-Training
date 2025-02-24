import java.io.File;
import java.util.Scanner;

public class ListFilesAndDirectories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String dirPath = scanner.nextLine();
        scanner.close();

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] fileList = directory.list();
            if (fileList != null && fileList.length > 0) {
                System.out.println("Files and directories in " + dirPath + ":");
                for (String fileName : fileList) {
                    System.out.println(fileName);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path!");
        }
    }
}
