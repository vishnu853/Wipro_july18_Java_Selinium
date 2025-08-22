package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Comparator_Subclass02 implements Comparator<Employee02>
{
	public int compare(Employee02 e1,Employee02 e2)
	{
		return e2.name.compareTo(e1.name);// Descending Order
		
	}
		
	;
	public static void main(String[] args)
	{
		List<Employee02> employees=new ArrayList<Employee02>();
		
		employees.add(new Employee02(102, "Ravi"));
		employees.add(new Employee02(101, "Ashok"));
		employees.add(new Employee02(105, "Zaheer"));
		employees.add(new Employee02(103, "Bharath"));
		employees.add(new Employee02(104, "Charan"));
		
		Collections.sort(employees, new Comparator_Subclass02());
		
		for(Employee02 e: employees)
		{
			System.out.println(e);
			
		}
	}
}
