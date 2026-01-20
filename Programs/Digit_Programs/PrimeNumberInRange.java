import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0, end = 0, i = 0;
        System.out.print("Enter range to print prime numbers : \n");
        try {
            System.out.print("Form : ");
            start = sc.nextInt();
            System.out.print("To : ");
            end = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. \nEnter only number.");
            return;
        }
        if(end < start) {
            System.out.println("Start number must be less than end number");
            return;
        }
        while(start <= end) {
            for(i = 2; i < start; i++) {
                if(start % i == 0) {
                    break;
                }
                continue;
            }
            if(i == start) {
                System.out.println(start);
            }
            start++;
        }
    }
}
