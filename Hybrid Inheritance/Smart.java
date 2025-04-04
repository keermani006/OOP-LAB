interface Connectivity {
    void connectToInternet();
}

class SmartDevice {
    void powerOn() {
        System.out.println("Smart Device is powered on.");
    }
}

class Smartphone extends SmartDevice implements Connectivity {
    public void connectToInternet() {
        System.out.println("Smartphone is connected to the internet.");
    }
}

class SmartWatch extends SmartDevice implements Connectivity {
    public void connectToInternet() {
        System.out.println("Smartwatch is connected to the internet.");
    }
}

public class HybridInheritance2 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.powerOn();
        phone.connectToInternet();

        SmartWatch watch = new SmartWatch();
        watch.powerOn();
        watch.connectToInternet();
    }
}
