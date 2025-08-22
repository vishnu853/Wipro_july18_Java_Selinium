package io_streams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStream01 
{
	public static void main(String[] args) throws Exception
	{
		byte[] array= {1,2,3,4,5};
		
		ByteArrayInputStream bais=new ByteArrayInputStream(array);
		
		for(int i=0;i<array.length;i++)
		{
			int data= bais.read();
			
			System.out.println(data);
		}
		
		bais.close();
	}
}
