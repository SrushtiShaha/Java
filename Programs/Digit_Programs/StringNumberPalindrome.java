import java.util.*;

public class StringNumberPalindrome {
    public static void main(String[] args) {
        for(;;) {
            System.out.println("Choice : ");
            System.err.println("1. Palindrome Number.");
            System.err.println("2. Palindrome String.");
            System.err.println("3. Exit.");
            System.err.println("Enter a choice : ");        
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    NumPal();
                    break;

                case 2:
                    StringPal();
                    break;

                case 3:
                    sc.close();
                    System.err.println("Exiting.....");
                    return;

                default:
                    System.err.println("Invalid input.");
            }
        }
    }

    public static void NumPal() {
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
        // sc.close();
    }

    public static void StringPal() {
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
        // sc.close();
    }
}