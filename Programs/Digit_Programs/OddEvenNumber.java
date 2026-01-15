import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        try {
            System.out.print("Enter a number : ");
            no = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }

        if(no == 0) {
            System.out.println(no + " is neutral number.");
        }
        else if(no % 2 == 0 && no > 0) {
            System.out.println(no + " is even number.");
        }
        else if(no % 2 == 1 && no > 0) {
            System.out.println(no + " is odd number.");
        }
        else {
            System.out.println(no + " is negative number.");
        }
    }
}
