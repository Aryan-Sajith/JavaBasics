package logic.serialization;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    public String name;
    public transient String password;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public void sayHello() {
        System.out.println("Hello "+this.name);
    }
}
