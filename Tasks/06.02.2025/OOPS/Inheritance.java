public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model S", 2023);
        System.out.println("Car Make: " + myCar.getMake());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());

        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model S", 2023, 450);
        System.out.println("Battery Range: " + myElectricCar.getBatteryRange() + " km");
        myCar.startEngine();
        myElectricCar.chargeBattery();

    }
}