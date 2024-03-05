package Digit_Program;

public class Digit_Count {
	public static void main(String[] args) {
		int No = 3619256, Temp = No, Cnt = 0;
		
		while( Temp > 0 ) {
			Temp = Temp / 10;
			Cnt++;
		}
		
		System.out.println("Digits In Given Number " + No + " Is => " + Cnt);
	}
}
