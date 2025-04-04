class Machine {
    void start() {
        System.out.println("Machine is starting...");
    }
}

class Printer extends Machine {
    void printDocument() {
        System.out.println("Printer is printing a document.");
    }
}

public class SingleInheritance2 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.start();         // Inherited method
        p.printDocument(); // Own method
    }
}
