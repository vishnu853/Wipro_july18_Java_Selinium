package io_streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization01
{
	public static void main(String[] args)  throws Exception
	{
		
		Student_Serialization s1=new Student_Serialization (211,"John");
		
		FileOutputStream fos=new FileOutputStream("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt");
	
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.flush();
		
		fos.close();
		oos.close();
		
		System.out.println("Object is serialized");
	}
}
