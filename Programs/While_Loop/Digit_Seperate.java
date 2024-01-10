package com.sgm.task.While_Loop;

public class Digit_Seperate {
	public static void main(String[] args) {
		int No = 1906, Rev = 0;
		
		System.out.println("Given Number -> " + No);
		System.out.println("Seperated Number -> ");
		
		while( No > 0 ) {
			Rev = No % 10;
			System.out.println("\t" + Rev);
			No = No / 10;
		}
	}
}
