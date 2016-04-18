package guru.springframework.java_network.quickstart;

import static java.lang.System.*;
import java.util.Scanner;

public class Interface {

    public User user;
    public Menu menu;
    public static boolean loop = true;

    public static void main(String[] args) {
        Interface inter=new Interface();
        Menu menu=new Menu();
        inter.openingStatement();
        inter.initialOptions();
    }

    public void openingStatement() {
        out.print("You are standing in a social network\n");
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
        user = new User(name);
        out.print("Welcome " + user.name +"\n");
        optionLoop();
    }

    private void optionLoop(){
        while(loop == true) {
            menu.showOptions();
            makeChoice();
        }
    }

    private void makeChoice() {
        String choice = get_input();
        if (choice.equals("POST")) {
            postMessage();
        }
        if (choice.equals("VIEW")) {
            viewMessages();
        }
        if (choice.equals("LEAVE")) {
            quit();
        }
    }

    private void postMessage(){
        out.print("Please leave a message\n");
        String message = get_input();
        user.post(message);
    }

    private void viewMessages(){
       user.viewMessages();
    }


    private void quit(){
        out.print("You flee the social network and return to real life.");
        loop = false;
    }


    private String get_input(){
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        return answer;
    }

}
