package logic.serialization.serializer;

import logic.serialization.User;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Aryan","Fun8Trolley");

        // Steps to serialize an object
        FileOutputStream fileOut = new FileOutputStream("/Users/aryansajith/IdeaProjects/JavaBasics/src/logic/serialization/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        // Viewing current SerialVersionUID
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

        System.out.println("Object info saved!");
    }
}
