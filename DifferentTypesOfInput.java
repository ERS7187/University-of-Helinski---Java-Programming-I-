//Author: Eric Sensebaugh
// Exercise 9 Program that takes user input using scanner function. The program prompts the user for a string, integer, double, and a boolean value.
// These inputted values are then converted from strings to their respoctive data type using the valueOf function
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String userString = scanner.nextLine();
        System.out.println("Give an integer:");
        int userInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double userDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean userBool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + userString);
        System.out.println("You gave the integer " + userInt);
        System.out.println("You gave the double " + userDouble);
        System.out.println("You gave the boolean " + userBool);

    }
}