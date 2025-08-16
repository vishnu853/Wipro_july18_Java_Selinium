package io_streams;

import java.io.FileInputStream;

public class FileInputStream01
{
	public static void main(String[] args)  throws Exception
	{
		
		//Data read in bytes
		FileInputStream fis=new FileInputStream("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");
		
		System.out.println("Data in the file");
		System.out.println();
		
		int i=fis.read();
		
		while(i !=-1)
		{
			System.out.print((char) i);
			
			i=fis.read();
			
		}
	}
}
