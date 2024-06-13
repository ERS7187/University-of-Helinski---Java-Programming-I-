// Author: Eric Sensebaugh
// Exerise 3 getting user input using scanner function. The program takes user input and then prints their message back to the terminal.
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        String message = scanner.nextLine();
        
        System.out.println(message);

    }
}