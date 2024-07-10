package baiTapCodePtit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hello_file {
    public static void main(String[] args) {
        String fileName = "Hello.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
