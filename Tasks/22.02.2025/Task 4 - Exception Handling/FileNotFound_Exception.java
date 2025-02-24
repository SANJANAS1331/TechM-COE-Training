package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound_Exception {
    public static void main(String[] args) {
        try {
            readingFile("info.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void readingFile(String fileName) throws FileNotFoundException {
        File f_1 = new File(fileName);
        Scanner sc = new Scanner(f_1);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
