class Person {
    void greet() {
        System.out.println("Hello! I am a person.");
    }
}

class Student extends Person {
    // Overriding greet()
    void greet() {
        System.out.println("Hello! I am a student studying hard.");
    }
}

public class MethodOverridingUnique1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.greet(); // Calls parent class method

        Student s = new Student();
        s.greet(); // Calls overridden method in Student
    }
}
