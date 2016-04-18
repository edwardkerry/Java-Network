package guru.springframework.java_network.quickstart;

import static java.lang.System.*;
import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        Interface inter=new Interface();
        inter.openingStatement();
        inter.initialOptions();
    }

    public String openingStatement() {
        String welcome="You are standing in a social network\n";
        out.print(welcome);
        return welcome;
    }

    private void initialOptions() {
        out.print("To the NORTH you may LOG-IN\n");
        out.print("To the SOUTH you may EXIT\n");
        String ans = get_input();
        if (ans.equals("NORTH")) {
            log_in();
        }
        if (ans.equals("SOUTH")) {
            quit();
        }
        else { initialOptions(); }
    }

     private void log_in(){
         out.print("You come across a security checkpoint. Are you a NEW or EXISTING user?\n");
         String ans = get_input();
         if (ans.equals("NEW")) {
             register();
         }
         if (ans.equals("EXISTING")) {
             log_in();
         }
    }

    private void register(){
        out.print("What is your name?\n");
        String name = get_input();
        User user = new User(name);
        out.print("Welcome " + user.name);
        mainOptions();
    }

    private void mainOptions(){
        out.print("Please leave a message\n");
    }

    private void quit(){
        out.print("You flee the social network and return to real life.");
    }


    private String get_input(){
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        return answer;
    }
    
}
