import java.util.Scanner;

public class PrimeNumberFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 0, i = 0, j = 0, cnt = 0;
        System.out.print("Enter a number to print first N prime numbers : ");
        try {
            no = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. \nEnter only number.");
        }
        for(j = 2; cnt < no; j++) {
            for(i = 2; i < j; i++) {
                if(j % i == 0) {
                    break;
                }
                continue;
            }
            if(i == j) {
                System.out.println(j);
                cnt++;
            }
        }
    }
}
