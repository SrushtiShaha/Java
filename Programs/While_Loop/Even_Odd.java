package com.sgm.task.While_Loop;

public class Even_Odd {
	public static void main(String[] args) {
		System.out.println("\nOdd \tEven");
		int i = 1;
		while( i <= 50 ) {
			if( i % 2 == 0 ) {
				System.out.println(i);
			}
			else {
				System.out.print(i + "\t");
			}
			i++;
		}
	}
}
