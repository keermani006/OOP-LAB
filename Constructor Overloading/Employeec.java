class Employee {
    String name;
    int id;

    // Constructor 1
    Employee() {
        name = "Unknown";
        id = 0;
    }

    // Constructor 2
    Employee(String n) {
        name = n;
        id = 0;
    }

    // Constructor 3
    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("John");
        Employee e3 = new Employee("Alice", 102);

        e1.display();
        e2.display();
        e3.display();
    }
}
