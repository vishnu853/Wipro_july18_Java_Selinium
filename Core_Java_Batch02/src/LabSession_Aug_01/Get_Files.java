package LabSession_Aug_01;

import java.io.File;

public class Get_Files {
    public static void main(String[] args) 
    {
        File folder = new File("C://Users//VISHNU VARDHAN//OneDrive//Desktop//lab01.txt/");

        String[] list = folder.list();

        if (list != null) {
            System.out.println("directory names");
            for (String name : list) {
                System.out.println(name);
            }
        } else {
            System.out.println("no directory exist");
        }
    }
}