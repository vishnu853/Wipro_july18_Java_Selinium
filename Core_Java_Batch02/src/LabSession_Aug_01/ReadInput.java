package LabSession_Aug_01;

import java.util.Scanner;

public class ReadInput 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name= sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.println("Hello "+ name+" what is your "+ age);
		
	}
}
