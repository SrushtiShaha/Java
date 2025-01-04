package Collection.Map.PojoClass;

import java.util.Comparator;

public class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int i = o1.getEmpId() - o2.getEmpId();
		return i;
	}

}
