import java.io.*;

public class CSVReader {
    public static void main(String[] args) {
        String FILENAME = "fibonacci.csv";
        try (FileWriter file = new FileWriter(FILENAME);
             BufferedWriter writer = new BufferedWriter(file)) {
            long first = 0;
            long second = 1;
            for(int i = 0; i < 60; i++) {
                writer.write(Long.toString(first));
                writer.newLine();
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println("Fibonacci sequence written to file.");
        }
        catch(IOException e) {
            System.out.println("Error while writing in the file " + FILENAME);
        }
    }
}