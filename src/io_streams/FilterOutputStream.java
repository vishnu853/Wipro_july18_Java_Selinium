package io_streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FilterOutputStream 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=null;
		java.io.FilterOutputStream filterout=null;
		
		fos=new FileOutputStream("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");
		
		filterout=new BufferedOutputStream(fos);
		
		String text="Hi how are you";
		
		filterout.write(text.getBytes());
		
		filterout.close();
		fos.close();
	}
}
