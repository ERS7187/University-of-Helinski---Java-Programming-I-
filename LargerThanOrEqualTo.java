// Author: Eric Sensebaugh
// Exercise 20 program that takes the input of two numbers, uses conditional statements to determine larger of the numbers and prints the larger number. 
//If the two numbers are equal then the program will also tell you that
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scan.nextLine());
        
        if(firstNumber > secondNumber){
            System.out.println("Greater number is : " + firstNumber);
        } else if (secondNumber > firstNumber){
            System.out.println("Greater number is : " + secondNumber);
        } else{
            System.out.println("The numbers are equal!");
        }

    }
}
