package Abstraction.Abstract_Class.Program02;

public class Child_Class extends Parent_Class
{

	@Override
	public void Add() {
		// TODO Auto-generated method stub
		System.out.println("Child_Class Add Method");
		System.out.println("Addition -> 20 + 10 = " + (20+10));
	}

	@Override
	public void Sub() {
		// TODO Auto-generated method stub
		System.out.println("Child_Class Sub Method");
		System.out.println("Substraction -> 20 - 10 = " + (20-10));
	}

}
