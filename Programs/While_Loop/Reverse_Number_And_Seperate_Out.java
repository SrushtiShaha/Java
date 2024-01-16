package com.sgm.task.While_Loop;

public class Reverse_Number_And_Seperate_Out {
	public static void main(String[] args) {
		int No = 1906, Rem = 0, Rev1 = 0, Rev2 = 0, Temp = 0;
		System.out.println("Given Number -> " + No);
		System.out.println("Reverse Number -> ");
		while( No > 0 ) {
			Rem = No % 10;
			System.out.println("\t" + Rem);
			Rev1 = Rev1 * 10 + Rem;
			No = No / 10;
		}
		Temp = Rev1;
		System.out.println("Reverse Number -> ");
		
		while( Temp > 0 ) {
			Rem = Temp % 10;
			System.out.println("\t" + Rem);
			Rev2 = Rev2 * 10 + Rem;
			Temp = Temp / 10;
		}
		System.out.println("Reverse Number One -> " + Rev1);
		System.out.println("Reverse Number Two -> " + Rev2);
	}
}
