package com.sgm.task.While_Loop;

public class Reverse_Number {
	public static void main(String[] args) {
		int No = 1906, Rem = 0, Rev = 0;
		System.out.println("Given Number -> " + No);
		
		while( No > 0 ) {
			Rem = No % 10;
			Rev = Rev * 10 + Rem;
			No = No / 10;
		}
		
		System.out.println("Reverse Number -> " + Rev);
	}
}
