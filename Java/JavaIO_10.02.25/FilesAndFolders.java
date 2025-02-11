import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesAndFolders {

    public static void main(String[] args) {
        FilesAndFolders fs = new FilesAndFolders();

        Scanner sc = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("Option 1: Create 3 files in C: drive");
        System.out.println("Option 2: Create 3 files in a folder");
        System.out.println("Option 3: Create 4 files in another folder");

        int option = sc.nextInt();

        switch (option) {
            case 1:
                fs.create3FilesInCDrive();
                break;
            case 2:
                fs.create3FilesInAFolder();
                break;
            case 3:
                fs.create4FilesInAnotherFolder();
                break;
            default:
                System.out.println("Invalid option. Please select a valid option.");
        }

        sc.close();
    }

    static void create3FilesInCDrive() {
        String[] Files = {"1stFile.txt", "2ndFile.txt", "3rdFile.txt"};

        for (String files : Files) {
            File f = new File("C:\\" + files);
            try {
                if (f.createNewFile()) {
                    System.out.println("Created a file " + f.getName());
                } else {
                    System.out.println("File already exists: " + f.getName());
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file " + files);
                e.printStackTrace();
            }
        }
    }

    static void create3FilesInAFolder() {
        String destinationFolderPath = "C:\\3FilesFolder";
        File destinationFolder = new File(destinationFolderPath);

        if (!destinationFolder.exists()) {
            if (destinationFolder.mkdir()) {
                System.out.println("Created a folder " + destinationFolderPath);
            } else {
                System.out.println("Failed to create folder: " + destinationFolderPath);
                return;
            }
        }

        String[] Files = {"1stFileIn3FilesFolder.txt", "2ndFileIn3FilesFolder.txt", "3rdFileIn3FilesFolder.txt"};
        for (String files : Files) {
            File f = new File(destinationFolderPath + "\\" + files);
            try {
                if (f.createNewFile()) {
                    System.out.println("Created a file " + f.getName());
                } else {
                    System.out.println("File already exists: " + f.getName());
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file " + files);
                e.printStackTrace();
            }
        }
    }

    static void create4FilesInAnotherFolder() {
        String destinationFolderPath = "C:\\4FilesFolder";
        File destinationFolder = new File(destinationFolderPath);

        if (!destinationFolder.exists()) {
            if (destinationFolder.mkdir()) {
                System.out.println("Created a folder " + destinationFolderPath);
            } else {
                System.out.println("Failed to create folder: " + destinationFolderPath);
                return;
            }
        }

        String[] Files = {"1stFileIn4FilesFolder.txt", "2ndFileIn4FilesFolder.txt", "3rdFileIn4FilesFolder.txt", "4thFileIn4FilesFolder.txt"};
        for (String files : Files) {
            File f = new File(destinationFolderPath + "\\" + files);
            try {
                if (f.createNewFile()) {
                    System.out.println("Created a file " + f.getName());
                } else {
                    System.out.println("File already exists: " + f.getName());
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file " + files);
                e.printStackTrace();
            }
        }
    }
}