package Constructor.Paremeterised;

public class Using_This 
{
	int No1 = 23, No2 = 25;
	
	Using_This(int No1, int No2)
	{
		this.No1 = No1;
		this.No2 = No2;
		this.No1 = 1;
		this.No2 = 2;
		No1 = this.No1;
		No2 = this.No2;
		
	}
}
