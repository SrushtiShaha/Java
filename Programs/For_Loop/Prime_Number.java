package com.sgm.task.For_Loop;

public class Prime_Number {
	public static void main(String[] args) {
		int No = 0, i = 0;
		
		System.out.println("Prime Numbers -> ");
		
		for( No = 2; No <= 100; No++ ) {
			for( i = 2; i < No; i++ ) {
				if( No % i == 0 ) {
					break;
				}
			}
			if( No == i ) {
				System.out.println("\t" + No);
			}
		}
	}
}
