import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;;
        try {
            System.out.print("Enter a year : ");
            year = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }        
        if(year % 4 == 0) {
            System.out.print("Year " + year + " is a leap year.");
        }
        else if(year % 100 == 0 && year % 400 == 0) {
            System.out.print("Year " + year + " is a leap year.");
        }
        else if(year % 100 == 0) {
            System.out.print("Year " + year + " is not a leap year.");
        }
        else {
            System.out.print("Invalid input.");
        }
    }    
}
