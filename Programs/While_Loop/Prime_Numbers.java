package com.sgm.task.While_Loop;

public class Prime_Numbers {
	public static void main(String[] args) {
		int No = 2, i = 1;
		
		System.out.println("Prime Numbers -> ");
		
		while( No <= 100 ) {
			while( i < No ) {
				if( No % i == 0 ) {
					break;
				}
				i++;
			}
			if( No == i ) {
				System.out.println("\t" + No);
			}
			No++;
		}
	}
}
