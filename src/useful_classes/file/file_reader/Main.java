package useful_classes.file.file_reader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // File Reader = A class to represent the idea of a file reading object.
        // Reads the file as a stream of characters.
        // read() returns the int value which represents the character
        // if read() == -1, then there is no more data to be read
        try {
            try (FileReader reader = new FileReader("poem.txt")) {
                int data = reader.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = reader.read();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
