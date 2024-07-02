package application;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) {
        String path = "README.md";

        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {
            String line = buffer.readLine();

            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
