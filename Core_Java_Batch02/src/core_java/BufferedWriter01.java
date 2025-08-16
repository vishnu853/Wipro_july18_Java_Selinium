package core_java;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter01 
{
	
public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("D:/abc1.txt"); 
			BufferedWriter bw = new BufferedWriter(fw))
		{
			
			String str = "This is simple char stream b2 example";
			
			bw.write(str);
			
			bw.flush();
			
			System.out.println("Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
//	public static void main(String[] args) throws Exception
//	{
//		FileWriter fw=new FileWriter("D:/abc1.txt");
//		BufferedWriter bw=new BufferedWriter(fw);
//		
//		bw.write(97);
//		bw.write(98);
//		bw.write(99);
//		bw.write(100);
//		
//		bw.newLine();
//		
//		char x[]= {'v','a','r','d','h','a','n'};
//		bw.write(x);
//		
//		bw.newLine();
//		
//		bw.write("Andhra Pradesh");
//		
//		fw.flush();
//		fw.close();
//		
//		System.out.println("Hi....Done");
//		
//	}

}
