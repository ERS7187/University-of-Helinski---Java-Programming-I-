// Author: Eric Sensebaugh
// Exercise 5 program the uses both concatentation and scanner function to gather user input. The users input is stored in a string variable where we can then access it, and use it in our print statement on line 11
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
      
    

    }

}