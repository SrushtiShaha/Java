import java.util.Scanner;

public class PrimeNumberUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 0, i = 0, j = 0;
        System.out.print("Enter a number up to which you want prime or not : ");
        try {
            no = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. \nEnter only number.");
        }
        System.out.println("Prime numbers up to " + no + " are : ");
        for(j = 2; j <= no; j++) {
            for(i = 2; i < j; i++) {
                if(j % i == 0) {
                    break;
                }
                continue;
            }
            if(i == j) {
                System.out.println(j);
            }
        }
    }
}
