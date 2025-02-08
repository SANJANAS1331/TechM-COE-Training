class Polymorphism {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Ford", "Mustang", 2021),
                new ElectricCar("Tesla", "Model S", 2023, 450),
                new Car("Toyota", "Corolla", 2022),
                new ElectricCar("Nissan", "Leaf", 2024, 300)
        };

        for (Car car : cars) {
            car.startEngine();
        }
    }
}