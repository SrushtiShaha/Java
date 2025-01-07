package Collection.Map.PojoClass;

import java.util.Comparator;

public class SortBySalary01 implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
//		int i = (int) (o1.getEmpSalary() - o2.getEmpSalary());
//		return -i;
		int i = (int) (o2.getEmpSalary() - o1.getEmpSalary());
		return i;
	}

}
