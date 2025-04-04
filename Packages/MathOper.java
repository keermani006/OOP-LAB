package mathoperations;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}

import mathoperations.Addition;

public class UserPackageExample1 {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println("Sum: " + obj.add(5, 10));
    }
}
