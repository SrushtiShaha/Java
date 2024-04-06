package Array;

import java.util.Scanner;

public class Simply_Print_Array_Element 
{
	public static void main(String[] args) 
	{
		int Nums[] = new int[4];
		
		Scanner Obj = new Scanner(System.in);
		
		System.out.print("Enter 0th Element Of Array -> ");
		
		Nums[0] = Obj.nextInt();
		
		System.out.print("Enter 1st Element Of Array -> ");
		
		Nums[1] = Obj.nextInt();
		
		System.out.print("Enter 2nd Element Of Array -> ");
		
		Nums[2] = Obj.nextInt();
		
		System.out.print("Enter 3rd Element Of Array -> ");
		
		Nums[3] = Obj.nextInt();
		
		System.out.println("1st Number -> " + Nums[0]);
		System.out.println("2nd Number -> " + Nums[1]);
		System.out.println("3rd Number -> " + Nums[2]);
		System.out.println("4th Number -> " + Nums[3]);
	}
}
