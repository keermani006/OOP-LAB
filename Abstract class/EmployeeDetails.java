abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    abstract void work();
    
    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " is developing software.");
    }
}

class Designer extends Employee {
    Designer(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " is designing UI/UX.");
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        Employee dev = new Developer("Alice");
        dev.showDetails();
        dev.work();

        Employee des = new Designer("Bob");
        des.showDetails();
        des.work();
    }
}
