public class Encapsulation {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model S", 2023);
        System.out.println("Car Make: " + myCar.getMake());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());
        myCar.startEngine();

    }
}