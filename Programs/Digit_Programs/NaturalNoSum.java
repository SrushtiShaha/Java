import java.util.InputMismatchException;
import java.util.Scanner;

public class NaturalNoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, sum = 0;
        try {
            System.out.print("Enter a number : ");
            no = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }
        for(int i = 1; i <= no; i++) {
            sum += i;
        }
        System.out.println("Sum of natural number " + no + " is " + sum);
    }
}
