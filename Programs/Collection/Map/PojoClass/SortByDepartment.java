package Collection.Map.PojoClass;

import java.util.Comparator;

public class SortByDepartment implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int i = o1.getEmpName().compareTo(o2.getEmpName());
		return i;
	}

}
