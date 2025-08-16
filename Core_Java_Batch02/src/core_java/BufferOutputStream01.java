package core_java;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputStream01 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("D:/abc1.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		String sentence="Java With Selinum";
		
		byte x[]=sentence.getBytes();
		
		bos.write(x);
		
		bos.flush();
		bos.close();
		
		System.out.println("Done");
	}
}
