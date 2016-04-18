package guru.springframework.java_network.quickstart;

import java.util.*;
import static java.lang.System.*;

public class User {

    public String name;
    public ArrayList messages = new ArrayList();

    public User(String name) {
        this.name = name;
    }

    public void post(String message){
        this.messages.add(message);
    }

    public void viewMessages(){
         for (int i = 0; i < messages.size(); i++) {
            out.print(messages.get(i) + "\n");
        }
    }


}
