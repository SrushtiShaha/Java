package Encapulation.Program02;

public class Class_Student 
{
	@Override
	public String toString() {
		return "Class_Student [Name=" + Name + ", RollNo=" + RollNo + ", MobNo=" + MobNo + ", EMail=" + EMail + "]";
	}

	private String Name;
	int RollNo;
	long MobNo;
	String EMail;
	
	public void SetName( String Name )
	{
		this.Name = Name;
	}
	
	public void SetRollNo( int RollNo )
	{
		this.RollNo = RollNo;
	}
	
	public void SetMobNo( long MobNo )
	{
		this.MobNo = MobNo;
	}
	
	public void SetEMail( String EMail )
	{
		this.EMail = EMail;
	}
	
	public String GetName()
	{
		return Name;
	}
	
	public int GetRollNo()
	{
		return RollNo;
	}
	
	public long GetMobNo()
	{
		return MobNo;
	}
	
	public String GetEMail()
	{
		return EMail;
	}
}
