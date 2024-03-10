package Digit_Program;

public class Armstrong_Number_02 {
	public static void main(String[] args) {
		int No = 9162, Cnt = 0, Num = No, Rem = 0, Temp = 0;
		while( No > 0 ) {
			 No = No / 10;
			 Cnt++;
		}
		No = Num;
		while( No > 0 ) {
			Rem = No % 10;
			Rem = (int)Math.pow( Rem, Cnt );
			Temp = Temp + Rem;
			No = No / 10;
		}
		if( Num == Temp ) {
			System.out.println("Given Number " + Num + " Is Armstrong.");
		}
		else {
			System.out.println("Given Number " + Num + " Is Not Armstrong.");
		}
	}
}
