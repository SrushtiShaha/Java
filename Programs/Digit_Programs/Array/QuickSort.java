import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, max = 0, index = 0, temp;
        try {
            System.out.print("Enter size of array : ");
            size = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Invalid input. \nEnter only number.");
            return;
        }

        int[] arr = new int[size];
        try {
            for(int i = 0; i < size; i++) {
                System.out.print("Enter element number " + (i+1) + " : ");
                arr[i] = sc.nextInt();
            }
        } catch(InputMismatchException e) {
            System.out.println("Invalid input. \nEnter only number.");
            return;
        }
    }
}
