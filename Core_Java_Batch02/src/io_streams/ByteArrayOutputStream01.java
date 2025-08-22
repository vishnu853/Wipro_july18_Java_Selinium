package io_streams;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStream01 
{
	
	public static void main(String[] args) throws Exception
	{
		String data="This is a line of text inside the string";
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		
		byte[] array= data.getBytes();
		
		baos.write(array);
		
		String streamData= baos.toString();
		
		System.out.println("Output Stream: "+streamData);
		baos.close();
	}
}
