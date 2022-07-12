package useful_classes.file.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // File writer = An abstract representation of a file writing object
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Life is hard \nTimes are tough \nStill push on \nNever enough");
            // Adds to the end of the file append
            writer.append("\n(Poem by Aryan S)");
            // Don't forget to close the file writer object when done
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
