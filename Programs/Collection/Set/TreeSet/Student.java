package Collection.Set.TreeSet;

import java.util.Comparator;

public class Student implements Comparable<Student> //Comparator//<Student>
{
	private int ID;
	private String Name;
	private String Branch;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Branch=" + Branch + "]";
	}
	public Student(int iD, String name, String branch) {
		super();
		ID = iD;
		Name = name;
		Branch = branch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int i = this.getName().compareTo(o.getName());
		return i;
	}
	
}
