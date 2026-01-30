import java.util.InputMismatchException;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "", rev = "", ch = "";
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a string to check it is palindrome or not : ");
        try {
            str = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
        for(int i = 0; i < str.length(); i++) {
            ch = Character.toString(str.charAt(i));
            rev = ch.concat(rev);
        }
        boolean flag = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == rev.charAt(i)) {
                flag = true;
            }
            else {
                flag = false;
            }
        }
        if(flag == true) {
            System.out.println("Entered string " + str + " is palindrome.");
        }
        else {
            System.out.println("Entered string " + str + " is not palindrome.");
        }
        sc.close();
    }
}
