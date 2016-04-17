package guru.springframework.java_network.quickstart;


import static java.lang.System.*;

public class Interface {

    public static void main(String[] args) {
        Interface inter=new Interface();
        inter.openingStatement();
    }

    public String openingStatement() {
        String welcome="Hello, World\n";
        out.print("Hello, World\n");
        return welcome;
    }
}
