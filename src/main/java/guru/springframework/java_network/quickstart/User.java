package guru.springframework.java_network.quickstart;

import static java.lang.System.*;

public class User {

    public String name;

    public User(String name) {
        this.name = name;
    }

    public void register(){
        out.print("User reached!" + name);
    }

    public void log_in() {
        out.print("User reached!");
    }

}
