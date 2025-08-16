package collections;

import java.util.*;

public  class Comparble_interface implements Comparable<Comparble_interface>
{
	int rollNumber;
	String name;
	
	public Comparble_interface (int rollNumber, String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	public String toString()
	{
		return rollNumber +"_" +name;
	}
	
	@Override
	public int compareTo(Comparble_interface ci) 
	{
		// TODO Auto-generated method stub
		return this.rollNumber - ci.rollNumber;
	}
	
	public static void main(String[] args) 
	{
		List<Comparble_interface> students=new ArrayList<Comparble_interface>();
		
		students.add(new Comparble_interface(102,"Ravi"));
		students.add(new Comparble_interface(103,"Amit"));
		students.add(new Comparble_interface(101,"Jara"));
		
		Collections.sort(students);
		
		for(Comparble_interface s: students)
		{
			System.out.println(s);
		}
	}

	
}
