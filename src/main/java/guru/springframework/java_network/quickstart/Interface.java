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
        if (get_input().equals("NORTH")) {
            log_in();
        } else if (get_input().equals("SOUTH")) {
            quit();
        }
        else { initialOptions(); }
    }

     private void log_in(){
         out.print("You come across a security checkpoint. Are you a NEW or EXISTING user?\n");
         if (get_input().equals("NEW")) {
             register();
         } else if (get_input().equals("EXISTING")) {
             log_in();
         }
    }

    private void register(){
        out.print("What is your name?\n");
        String name = get_input();
        User user = new User(name)
        out.print("Welcome " + user.name);
    }

    private void quit(){
        String leave = "exit";
        out.print(leave);;
    }


    private String get_input(){
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        return answer;
    }


}
