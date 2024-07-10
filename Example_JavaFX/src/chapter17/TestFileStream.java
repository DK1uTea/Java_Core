package chapter17;

import java.io.*;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (
            // Create an output stream to the file "temp.dat"
            FileOutputStream output = new FileOutputStream("temp.dat");
        ) {
            // Output values to the file
            for (int i = 1; i <= 10; i++) {
                output.write(i); // Write integer values from 1 to 10 to the file
            }
        }

        try (
            // Create an input stream for the file "temp.dat"
            FileInputStream input = new FileInputStream("temp.dat");
        ) {
            // Read values from the file
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " "); // Print the values read from the file
            }
        }
    }
}

