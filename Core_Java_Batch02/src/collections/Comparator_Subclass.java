package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Comparator_Subclass implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.name.compareTo(e2.name);// Ascending Order
		
		
	}
		
	;
	public static void main(String[] args)
	{
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(102, "Ravi"));
		employees.add(new Employee(101, "Ashok"));
		employees.add(new Employee(105, "Zaheer"));
		employees.add(new Employee(103, "Bharath"));
		employees.add(new Employee(104, "Charan"));
		
		Collections.sort(employees, new Comparator_Subclass());
		
		for(Employee e: employees)
		{
			System.out.println(e);
			
		}
	}
}
