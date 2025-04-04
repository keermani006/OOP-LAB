import java.util.Random;
import java.lang.Math;
import java.nio.file.Paths;

public class BuiltInPackageExample2 {
    public static void main(String[] args) {
        // Using java.util.Random
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        System.out.println("Random Number: " + randomNum);

        // Using java.lang.Math
        double squareRoot = Math.sqrt(randomNum);
        System.out.println("Square Root: " + squareRoot);

        // Using java.nio.file.Paths
        System.out.println("Current Path: " + Paths.get("").toAbsolutePath());
    }
}
