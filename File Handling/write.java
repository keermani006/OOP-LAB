import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is a sample file!");
            writer.close();
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file.");
        }
    }
}
