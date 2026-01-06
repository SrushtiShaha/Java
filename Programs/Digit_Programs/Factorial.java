import java.util.*;

public class Factorial {
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
        int fact = 1;
        for(int i = no; i > 0; i--) {
            fact = fact * i;
        }
        System.err.println("Factorial of " + no + " is : " + fact);
    }
}
