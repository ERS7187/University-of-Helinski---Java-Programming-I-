//Author Eric Sensebaugh
// Exercise 17. Program that takes user input of two numbers and performs addition, subraction, division, and quotient. And displays the result.
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double)firstNumber / secondNumber));
        
    }
}