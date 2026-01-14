import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is palindrome or not :");
        int no = 0, pal = 0;
        try {
            no = sc.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input.");
        }
        int temp = no, dig = 0;
        while(temp > 0) {
            dig = temp % 10;
            pal = (pal*10) + dig;
            temp = temp / 10;
        }
        if(no == pal) {
            System.out.println("Entered number " + no + " is palindrome.");
        }
        else {
            System.out.println("Entered number " + no + " is not palindrome.");
        }
        sc.close();
    }
}
