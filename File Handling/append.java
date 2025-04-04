import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt", true);
            writer.append("\nAppending new text.");
            writer.close();
            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            System.out.println("Error appending to the file.");
        }
    }
}
