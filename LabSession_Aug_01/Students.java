package LabSession_Aug_01;

import java.io.FileReader;

public class Students 
{
	public static void main(String[] args) {
        String fileName = "C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/";

        try
        {
        	
        	FileReader fr = new FileReader(fileName);
            int i;
            System.out.println("Contents of file:");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);  
            }
            fr.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
