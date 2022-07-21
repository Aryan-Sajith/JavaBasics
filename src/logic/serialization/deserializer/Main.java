package logic.serialization.deserializer;

import logic.serialization.User;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user;

        // Object deserialization
        FileInputStream fileIn = new FileInputStream("/Users/aryansajith/IdeaProjects/JavaBasics/src/logic/serialization/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        // Testing properties of deserialized object
        System.out.println("Name: "+user.name);
        System.out.println("Password: "+user.password);
        user.sayHello();
    }
}
