//Author: Eric Sensebaugh
//Exericise 10 Program that converts a user defined number of days and then converts it to the number of seconds. Program is meant to practice math within java
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int daysToSeconds = 86400 * days;
        System.out.println(daysToSeconds);
    }
}
