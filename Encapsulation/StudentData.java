class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 18);
        System.out.println("Name: " + s1.getName() + ", Age: " + s1.getAge());

        s1.setAge(20);
        System.out.println("Updated Age: " + s1.getAge());
    }
}
