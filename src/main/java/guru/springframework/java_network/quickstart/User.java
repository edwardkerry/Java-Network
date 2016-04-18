package guru.springframework.java_network.quickstart;

import java.util.*;

public class User {

    public String name;
    public ArrayList messages = new ArrayList();

    public User(String name) {
        this.name = name;
    }

    public void post(String message){
        this.messages.add(message);
    }

}
