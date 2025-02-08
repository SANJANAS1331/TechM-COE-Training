public class PrimitiveVsReference {
    public static void main(String[] args) {
        int number = 5;
        int[] array = {2, 4, 6, 8, 10};

        System.out.println("Before method call:");
        System.out.println("number: " + number);
        System.out.print("array: ");
        printArray(array);

        modifyValues(number, array);

        System.out.println("\nAfter method call:");
        System.out.println("number: " + number);
        System.out.print("array: ");
        printArray(array);
    }

    public static void modifyValues(int num, int[] arr) {
        num += 5;
        arr[0] = 99;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
