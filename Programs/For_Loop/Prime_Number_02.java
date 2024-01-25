package com.sgm.task.For_Loop;

public class Prime_Number_02 {
	public static void main(String[] args) {
		for( int j = 1; j <= 50; j++ ) {
			int No = j, i = 1, Cnt = 0;
			
			while( i <= No ) {
				if( No % i == 0 ) {
					Cnt++;
				}
				
				i++;
			}
			
			if( Cnt == 2 ) {
				System.out.println(No);
			}
		}
	}
}
