interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Light is ON.");
    }

    public void turnOff() {
        System.out.println("Smart Light is OFF.");
    }
}

class SmartAC implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart AC is ON.");
    }

    public void turnOff() {
        System.out.println("Smart AC is OFF.");
    }
}

public class InterfaceExample2 {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        light.turnOn();
        light.turnOff();

        SmartDevice ac = new SmartAC();
        ac.turnOn();
        ac.turnOff();
    }
}
