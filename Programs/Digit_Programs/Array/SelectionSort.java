import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, min, temp, j, index = 0;
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

        for(int i = 0; i < size; i++) {
            min = arr[i];
            for(j = i; j < size; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            if(min < arr[i]) {
                temp = arr[i];
                arr[i] = min;
                arr[index] = temp;
            }
        }

        System.out.println("Sorted Array : ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
    }
}
