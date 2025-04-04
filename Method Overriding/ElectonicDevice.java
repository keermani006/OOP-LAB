class ElectronicDevice {
    void powerOn() {
        System.out.println("Electronic device is powered on.");
    }
}

class Laptop extends ElectronicDevice {
    // Overriding powerOn()
    void powerOn() {
        System.out.println("Laptop is booting up.");
    }
}

public class MethodOverridingUnique2 {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.powerOn(); // Calls parent class method

        Laptop myLaptop = new Laptop();
        myLaptop.powerOn(); // Calls overridden method in Laptop
    }
}
