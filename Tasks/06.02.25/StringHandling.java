import java.util.Scanner;

class StringProcessor {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countOccurrences(String text, String sub) {
        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a substring to count occurrences: ");
        String subString = scanner.nextLine();

        String reversed = reverseString(inputString);
        int occurrences = countOccurrences(inputString, subString);
        String capitalized = splitAndCapitalize(inputString);

        System.out.println("\nReversed String: " + reversed);
        System.out.println("Occurrences of '" + subString + "': " + occurrences);
        System.out.println("Capitalized Words: " + capitalized);

        scanner.close();
    }
}
