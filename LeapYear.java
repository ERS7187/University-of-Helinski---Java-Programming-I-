// Author: Eric Sensebaugh
// Program 24 that takes a users defined year as input and tells the user if the defined year is a leap year or not using a series of conditional statments
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int userYear = Integer.valueOf(scan.nextLine());
        
        if (userYear % 400 == 0 ){
            System.out.println("The year is a leap year");
        } else if (userYear % 100 == 0 ){
            System.out.println("The year is not a leap year");    
        } else if (userYear % 4 == 0){
            System.out.println("The year is a leap year");
        } else{
            System.out.println("The year is not a leap year");
        }        
        
    }
}