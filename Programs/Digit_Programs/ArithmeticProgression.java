import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fno, ser, diff;
        try {
            System.out.print("Enter 1st number : ");
            fno = sc.nextInt();
            System.out.print("Enter common difference : ");
            diff = sc.nextInt();
            System.out.print("Enter number of terms : ");
            ser = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }
        for(int i = 1;  i <= ser; i++) {
            System.out.print(fno + " ");
            fno = fno + diff;
        }
    }
}
