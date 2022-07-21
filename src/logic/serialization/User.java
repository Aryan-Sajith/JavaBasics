package logic.serialization;

import java.io.Serializable;

public class User implements Serializable {
    public String name, password;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public void sayHello() {
        System.out.println("Hello "+this.name);
    }
}
