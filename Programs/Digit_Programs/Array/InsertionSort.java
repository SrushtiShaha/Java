import java.util.InputMismatchException;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, temp;
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

                if(i == 0) {
                    continue;
                }
                
                int j = i;
                while(arr[j] < arr[j-1] && j > 0) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                    if(j == 0) {
                        break;
                    }
                }
            }
        } catch(InputMismatchException e) {
            System.out.println("Invalid input. \nEnter only number.");
            return;
        }

        System.out.println("Sorted Array : ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
    }
}