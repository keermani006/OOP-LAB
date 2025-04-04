class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer is writing code.");
    }
}

public class SingleInheritance1 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work(); // Inherited method
        dev.code(); // Own method
    }
}
