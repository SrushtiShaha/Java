import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number : ");
        int no = 0;
        try {
            no = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }
        System.err.println("Factorial of " + no + " is : " + Fact(no));
    }

    public static int Fact(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }

        return num*Fact(num-1);
    }
}
