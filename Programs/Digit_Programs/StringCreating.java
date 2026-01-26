import java.util.*;

public class StringCreating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String A = sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String B = sc.nextLine();
        String C = B.toLowerCase();
        StringBuilder BC = new StringBuilder();
        for(char ch : A.toCharArray()) {
            if(C.indexOf(Character.toLowerCase(ch)) == -1) {
                BC.append(ch);
            }
        }
        System.out.println(BC.toString());
        sc.close();
    }
}
