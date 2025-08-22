package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_interface02 implements Comparable<Comparable_interface02>
{
	int eid;
	String name;
	
	
	Comparable_interface02(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
		
	}
	
	public String toString()
	{
		return eid +"_" +name;
	}
	
	@Override
	public int compareTo(Comparable_interface02 o) 
	{
		return this.name.compareTo(o.name);
	}
	
	
	public static void main(String[] args) 
	{
		List<Comparable_interface02> students=new ArrayList<Comparable_interface02>();
		
		students.add(new Comparable_interface02(102,"Ravi"));
		students.add(new Comparable_interface02(103,"Amit"));
		students.add(new Comparable_interface02(101,"Jara"));
		students.add(new Comparable_interface02(104,"Vishnu"));
		students.add(new Comparable_interface02(105,"Narsihma"));
		students.add(new Comparable_interface02(106,"Dhanush"));
		
		Collections.sort(students);
		
		for(Comparable_interface02 s: students)
		{
			System.out.println(s);
		}
		
	}

	
}
