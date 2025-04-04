abstract class Animal {
    abstract void makeSound();
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class AbstractClassExample3 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}
