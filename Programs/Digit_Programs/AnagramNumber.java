import java.util.InputMismatchException;
import java.util.Scanner;

public class AnagramNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1, no2, cnt = 0, i, j, temp;
        try {
            System.out.print("Enter 1st number : ");
            no1 = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            no2 = sc.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. \nEnter only number.");
            return;
        }
        if(Integer.toString(no1).length() != Integer.toString(no2).length()) {
            System.out.println("Not Anagram");
            return;
        }
        while(no1 > 0){
            i = no1 % 10;
            temp = no2;
            while(temp > 0) {
                j = temp % 10;
                while(i == j) {
                    cnt++;
                    break;
                }
                temp /= 10;
            }
            no1 /= 10;
        }
        if(Integer.toString(no2).length() == cnt) {
            System.out.println("Given number is Anagram");
        }
        else {
            System.out.println("Given number is Not Anagram");
        }
    }
}
