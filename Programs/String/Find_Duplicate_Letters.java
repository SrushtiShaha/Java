package String.Assignments;

public class Find_Duplicate_Letters 
{
	public void Duplicate_Letters()
	{
		String Name = "srushti";
		int i = 0, j = 0;
		
		System.out.println("Given String -> " + Name);
		
		for( i = 0; i < (Name.length()/2); i++ )
		{
			for( j = (Name.length()-1); j >= (Name.length()/2); j-- )
			{
//				if( Name.charAt(i) == Name.charAt(j) )
//				{
//					System.out.println(Name.charAt(i) + " " + Name.charAt(j));
//					//System.out.println(Name.charAt(j));
//				}
				//System.out.println(Name.charAt(i) + " " + Name.charAt(j));
				if(Name.charAt(i) == Name.charAt(j)) {
					System.out.println("$" + Name.charAt(i) + " " + Name.charAt(j));
				}
			}
		}
		
//		System.out.println(Name.charAt(i-1) + " " + Name.charAt(j+1));
	}
	
	public static void main(String[] args) 
	{
		Find_Duplicate_Letters Obj = new Find_Duplicate_Letters();
		Obj.Duplicate_Letters();
	}
}
