class Student {
    void study() {
        System.out.println("Student is studying.");
    }
}

class Graduate extends Student {
    void specialize() {
        System.out.println("Graduate is specializing in a subject.");
    }
}

class Researcher extends Graduate {
    void research() {
        System.out.println("Researcher is conducting experiments.");
    }
}

public class MultilevelInheritance1 {
    public static void main(String[] args) {
        Researcher r = new Researcher();
        r.study();      // From Student
        r.specialize(); // From Graduate
        r.research();   // Own method
    }
}
