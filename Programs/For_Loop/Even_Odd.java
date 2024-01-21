package com.sgm.task.For_Loop;

public class Even_Odd {
	public static void main(String[] args) {
		int i = 0;
		
		System.out.println("\nOdd \tEven");
		
		for(i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			else {
				System.out.print(i + "\t");
			}
		}
	}
}
