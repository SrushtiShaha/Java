public class Logical_Operator02
{
	public static void main(String args[])
	{
		boolean a = true, b = false, c;

		System.out.println("\n a = " + a + " And b = " + b);

		System.out.println("\n******************************Logical &******************************");

		c = a && a;

		System.out.println("\n a && a Is -> " + c);

		System.out.println("\n******************************Logical &******************************");

		c = a && b;

		System.out.println("\n a && b Is -> " + c);

		System.out.println("\n******************************Logical &******************************");
 
		c = b && a;

		System.out.println("\n b && a Is -> " + c);

		System.out.println("\n******************************Logical &******************************");

		c = b && b;

		System.out.println("\n b && b Is -> " + c);

		System.out.println("\n*********************************************************************");

		System.out.println("\n******************************Logical |******************************");
		
		c = a || a;

		System.out.println("\n a || a Is -> " + c);

		System.out.println("\n******************************Logical |******************************");

		c = a || b;

		System.out.println("\n a || b Is -> " + c);

		System.out.println("\n******************************Logical |******************************");

		c = b || a;

		System.out.println("\n b || a Is -> " + c);

		System.out.println("\n******************************Logical |******************************");

		c = b || b;

		System.out.println("\n b || b Is -> " + c);

		System.out.println("\n*********************************************************************");

	}
}