package io_streams;

import java.io.FileOutputStream;


public class FileOutPutStream_01 
{
	public static void main(String[] args) throws Exception
	{
		String data="I am Attending java selinium";
		
			FileOutputStream fos=new FileOutputStream("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");

			byte[] array= data.getBytes();
			
			fos.write(array);
			
		
	}
}
