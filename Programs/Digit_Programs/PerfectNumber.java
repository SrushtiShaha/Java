import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, per = 0;
        try {
            System.out.print("Enter a number : ");
            no = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }
        for(int i = 1; i < no; i++) {
            if(no % i == 0) {
                per = per + i;
            }
        }
        if(no == per) {
            System.out.println("Given number " + no + " is perfect number.");
        }
        else {
            System.out.println("Given number " + no + " is not perfect number.");
        }
    }
}
