package LabSession_Aug_01;

import java.io.FileInputStream;


public class File_01 {

    public static void main(String[] args)throws Exception {
        
            FileInputStream input = new FileInputStream("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");

            System.out.println("Data in the file:");

            int i = input.read();
            
            while (i != -1) 
            {
                System.out.print(i);
                i = input.read();
            }

            input.close(); 
       
    }
}