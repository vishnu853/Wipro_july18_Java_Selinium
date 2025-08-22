package io_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FilterInputStream
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=null;
		
		java.io.FilterInputStream filterInput=null;
		
		fis=new FileInputStream("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");
		
		filterInput=new BufferedInputStream(fis);
		
		 int data;
		 
		 while((data=filterInput.read()) !=-1)
		 {
			 System.out.print((char) data);
		 }
		 fis.close();
	}
}
