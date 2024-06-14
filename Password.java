//Author: Eric Sensebaugh
// Exercise 23 program that prompts the user for a password. If the password is "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints "Off with you!" using conditionals statements
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String userPassword = scan.nextLine();
        String acceptedPassword = "Caput Draconis";
        
        if(acceptedPassword.equals(userPassword)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
        
    }
}