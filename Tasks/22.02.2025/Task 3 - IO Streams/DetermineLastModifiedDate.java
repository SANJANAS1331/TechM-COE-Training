import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DetermineLastModifiedDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        scanner.close();

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long lastModified = file.lastModified();
            Date date = new Date(lastModified);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println("Last modified date: " + dateFormat.format(date));
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }
}
