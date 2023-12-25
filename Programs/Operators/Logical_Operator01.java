public class Logical_Operator01
{
	public static void main(String args[])
	{
		int No1 = 23, No2 = 346;
		boolean Ans;

		System.out.println("\n No1 = " + No1 + " And No2 = " + No2);

		System.out.println("\n******************************Logical &******************************");
		
		Ans = No1 < No2 && No2 != No1;

		System.out.println("\n No1 < No2 And No2 != No1 Is -> " + Ans);

		System.out.println("\n******************************Logical &******************************");

		Ans = No1 < No2 && No2 <= No1;

		System.out.println("\n No1 < No2 And No2 <= No1 Is -> " + Ans);

		System.out.println("\n******************************Logical &******************************");

		Ans = No1 == No2 && No2 > No1;

		System.out.println("\n No1 == No2 And No2 > No1 Is -> " + Ans);

		System.out.println("\n******************************Logical &******************************");

		Ans = No1 >= No2 && No2 <= No1;

		System.out.println("\n No1 >= No2 And No2 <= No1 Is -> " + Ans);

		System.out.println("\n*********************************************************************");

		System.out.println("\n******************************Logical |******************************");
		
		Ans = No1 < No2 || No2 != No1;

		System.out.println("\n No1 < No2 Or No2 != No1 Is -> " + Ans);

		System.out.println("\n******************************Logical |******************************");

		Ans = No1 < No2 || No2 <= No1;

		System.out.println("\n No1 < No2 And No2 <= No1 Is -> " + Ans);

		System.out.println("\n******************************Logical |******************************");

		Ans = No1 == No2 || No2 > No1;

		System.out.println("\n No1 == No2 Or No2 > No1 Is -> " + Ans);

		System.out.println("\n******************************Logical |******************************");

		Ans = No1 >= No2 || No2 <= No1;

		System.out.println("\n No1 >= No2 Or No2 != No1 Is -> " + Ans);

		System.out.println("\n*********************************************************************");

	}
}