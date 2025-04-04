class Device {
    void powerOn() {
        System.out.println("Device is powered on.");
    }
}

class Computer extends Device {
    void runSoftware() {
        System.out.println("Computer is running software.");
    }
}

class Laptop extends Computer {
    void fold() {
        System.out.println("Laptop can be folded.");
    }
}

public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.powerOn();   // From Device
        myLaptop.runSoftware(); // From Computer
        myLaptop.fold();       // Own method
    }
}
