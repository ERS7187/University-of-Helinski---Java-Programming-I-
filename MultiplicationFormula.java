//Author : Eric Sensebaugh
// Exercise 14 Program that asks a user for two numbers, multiplies the numbers and then displays the formula to the user
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        

    }
}