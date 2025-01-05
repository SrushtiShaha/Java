package Collection.Map.PojoClass;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
