package io_streams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization01 
{
	public static void main(String[] args) throws Exception
	{
		ObjectInputStream in= new ObjectInputStream(new FileInputStream("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt"));
		
		Student_Serialization s=(Student_Serialization)in.readObject();
		
		System.out.println(s.id+" "+s.name);
		
		in.close();
	}
}
