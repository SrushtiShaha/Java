import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        System.out.print("Enter 1st string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        for(char ch1 : str1.toCharArray()) {
            for(char ch2 : str2.toCharArray()) {
                if(str1.indexOf(Character.toLowerCase(ch1)) == str2.indexOf(Character.toLowerCase(ch2))) {
                    cnt++;
                    break;
                }
                continue;
            }
        }
        if(cnt == str1.length()) {
            System.out.println("Given string is Anagram");
        }
        else {
            System.out.println("Given strinf is Not Anagram");
        }
    }
}
