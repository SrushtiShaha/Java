public class Unary_Operator
{
	public static void main(String args[])
	{
		int a = 23, b = 0;
		
		System.out.println("*****************Post Increment*****************");
	
		b = a++;

		System.out.println(a); // 24
		System.out.println(b); // 23
		System.out.println(b++); // 23
		System.out.println(b); //24

		System.out.println("*****************Pre Increment*****************");

		a = 23;
		b = 0;

		b = ++a;

		System.out.println(a); // 24
		System.out.println(b); // 24
		System.out.println(++b); //25
		System.out.println(b); // 25

		System.out.println("*****************Post Decrement*****************");

		a = 23;
		b = 0;

		b = a--;

		System.out.println(a); // 22
		System.out.println(b); // 23
		System.out.println(b--); // 23
		System.out.println(b); // 22

		System.out.println("*****************Pre Decrement*****************");

		a = 23;
		b = 0;

		b = --a;

		System.out.println(a); // 22
		System.out.println(b); // 22
		System.out.println(--b); // 21
		System.out.println(b); // 21
	}
}