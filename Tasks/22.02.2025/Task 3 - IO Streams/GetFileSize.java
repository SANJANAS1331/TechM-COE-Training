import java.io.File;

public class GetFileSize {
    public static void main(String[] args) {
        String filePath = "file1.txt"; 

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            System.out.println("File: " + file.getName());
            System.out.println("Size in Bytes: " + fileSizeInBytes);
            System.out.println("Size in KB: " + String.format("%.2f", fileSizeInKB));
            System.out.println("Size in MB: " + String.format("%.2f", fileSizeInMB));
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }
}
