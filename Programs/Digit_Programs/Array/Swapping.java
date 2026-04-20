import java.util.InputMismatchException;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1, no2;
        try {
            System.out.print("Enter 1st number : ");
            no1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            no2 = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.println("After swapping : \nValue of 1st number : " + no1 + "\nValue of 2nd number : " + no2);
    }
}
