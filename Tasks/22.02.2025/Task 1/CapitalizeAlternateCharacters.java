package org.example;

import java.util.Scanner;

public class CapitalizeAlternateCharacters {
    public static String capitalizeAlternate(String input) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i % 2 == 0) {
                res.append(Character.toUpperCase(ch));
            } else {
                res.append(Character.toLowerCase(ch));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String in = sc.nextLine();

        String out = capitalizeAlternate(in);
        System.out.println("Capitalizing Alternate Characters in the given String: " + out);

        sc.close();
    }
}
