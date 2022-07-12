package useful_classes.file.basics;
import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        // File = An abstract representation of a file and directory pathways to access from your program

        // Use the file path to create an instance of the file class
        File file = new File("src/useful_classes/file/basics/secret_document.rtf");

        //file.exists() checks if the file exists or not
        if(file.exists()){
            System.out.println("Your file exists! :)");
            //these methods return the file path of the file
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());

            //this method returns true if the file object truly is a file
            System.out.println(file.isFile());

            //this method deletes the file object at the specified pathway
            file.delete();
        }
        else {
            System.out.println("Your file doesn't exist! :(");
        }
    }
}
