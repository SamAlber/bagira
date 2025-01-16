import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running Java program...");
        try {
            // Write to output.txt
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Pipeline execution completed successfully.\n");
            writer.write("Timestamp: " + System.currentTimeMillis() + "\n");
            writer.close();
            System.out.println("output.txt has been updated.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to output.txt: " + e.getMessage());
        }
    }
}
