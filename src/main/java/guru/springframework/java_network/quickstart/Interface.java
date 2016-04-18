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

    private static void initialOptions() {
        out.print("To the NORTH you may LOG-IN\n");
        out.print("To the SOUTH you may EXIT\n");
        Scanner input = new Scanner(System.in);
        String choice = input.next();
        if (choice.equals("NORTH")) {
            Interface.log_in();
        } else if (choice.equals("SOUTH")) {
            Interface.quit();
        }
        else { Interface.initialOptions(); }
    }

     private static void log_in(){
         out.print("You come across a security checkpoint. Are you a NEW or EXISTING user?\n");;
         Scanner input = new Scanner(System.in);
         String choice = input.next();
         if (choice.equals("NEW")) {
             User.new();
         } else if (choice.equals("EXISTING")) {
             User.log_in();
         }
         else { Interface.log_in(); }
    }

    private static void quit(){
        String leave = "exit";
        out.print(leave);;
    }



}
