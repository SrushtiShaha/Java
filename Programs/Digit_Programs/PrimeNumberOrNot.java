import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 0, i = 0;
        System.out.print("Enter a number to test it is prime or not : ");
        try {
            no = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. \nEnter only number.");
        }
        for(i = 2; i < no; i++) {
            if(no % i == 0) {
                break;
            }
            continue;
        }
        if(i == no) {
            System.out.println("Entered number " + no + " is prime number.");
        }
        else {
            System.out.println("Entered number " + no + " is not a prime number.");
        }
    }
}
