import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class BuiltInPackageExample1 {
    public static void main(String[] args) throws Exception {
        // Using java.util.ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // Using java.io.BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String userName = br.readLine();

        // Using java.time.LocalDate
        LocalDate today = LocalDate.now();

        System.out.println("Hello, " + userName + "!");
        System.out.println("Today's Date: " + today);
        System.out.println("Names List: " + names);
    }
}
