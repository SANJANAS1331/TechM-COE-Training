final class FinalClass {
    final int finalVariable = 200;

    final void displayMessage() {
        System.out.println("This is a final method from a final class.");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();

        System.out.println("Final Variable: " + obj.finalVariable);

        obj.displayMessage();
    }
}
