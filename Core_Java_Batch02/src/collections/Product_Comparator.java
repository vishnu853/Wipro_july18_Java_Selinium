package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product_Comparator implements Comparator<Products>
{
	 
	@Override
	public int compare(Products o1, Products o2)
	{
		
	    return o1.Pname.compareTo(o2.Pname);  // sorting by name 
//		return o1.Price - o2.Price;  //sorting by price
    }


 
	public static void main(String[] args) 
	{
		List<Products> students = new ArrayList<Products>();
		students.add(new Products("Fruit",1000));
		students.add(new Products("Tea",2000));
		students.add(new Products("KetchUp",300));
		
		Collections.sort(students,new Product_Comparator());
		
		for(Products s: students)
		{
			System.out.println(s);
		}
	}
}