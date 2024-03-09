package Digit_Program;

public class Armstrong_Number_01 {
	public static void main(String[] args) {
		int No = 153, Temp = No, Cnt = 0, Rem = 0, Ans = 0; 
		
		while( Temp > 0 ) {
			Temp = Temp / 10;
			Cnt++;
		}
		
		Temp = No;
		while( Temp > 0 ) {
			Rem = Temp % 10;
			int Count = Cnt;
			int Pow = 1;
			while( Count > 0 ) {
				Pow = Pow * Rem;
				Count--;
			}
			
			Ans = Ans + Pow;
			
			Temp = Temp / 10;
		}
		
		if( No == Ans ) {
			System.out.println("Given Number " + No + " Is Armstrong.");
		}
		else {
			System.out.println("Given Number " + No + " Is Not Armstrong.");
		}
	}
}
