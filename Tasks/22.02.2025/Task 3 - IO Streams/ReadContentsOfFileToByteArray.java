import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadContentsOfFileToByteArray {
    public static void main(String[] args) {
        String filePath = "file2.txt";

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or is not a valid file.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] fileBytes = new byte[(int) file.length()];
            fis.read(fileBytes);
            System.out.println("File content in bytes: " + Arrays.toString(fileBytes));

            String fileContent = new String(fileBytes);
            System.out.println("File content as String:\n" + fileContent);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
