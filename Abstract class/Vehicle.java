abstract class Vehicle {
    abstract void startEngine();
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }
}

public class AbstractClassExample1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle bike = new Motorcycle();
        bike.startEngine();
        bike.stopEngine();
    }
}
