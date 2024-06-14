//Author: Eric Sensebaugh
// Exercise 11 program that asks the user for two numbers. Prints the two numbers that the user input, sums the numbers and prints the sum.
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int FirstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int SecondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (FirstNumber + SecondNumber));

    }
}