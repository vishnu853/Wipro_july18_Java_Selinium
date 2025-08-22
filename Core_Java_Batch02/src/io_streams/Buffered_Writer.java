package io_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered_Writer
{
	public static void main(String[] args) throws Exception
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt"));
		
		bw.write("I am buffered writer");
		
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt"));
		
		String Line;
		
		while((Line=br.readLine())!=null)
		{
			System.out.println(Line);
		}
		br.close();
	}
}
