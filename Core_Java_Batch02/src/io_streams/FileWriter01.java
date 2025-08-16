package io_streams;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriter01 
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fw=new FileWriter("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");
		
		fw.write("I am on the file writer");
		
		fw.close();
		
		FileReader fr= new FileReader("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");
		
		int i;
		
		while((i=fr.read()) !=-1)
		{
			System.out.print((char) i);
		}
		fr.close();
	}
}
