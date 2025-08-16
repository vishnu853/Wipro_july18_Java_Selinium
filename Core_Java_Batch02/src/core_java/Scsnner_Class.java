package core_java;

import java.util.Scanner;

public class Scsnner_Class 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		
		System.out.println("Sum is: "+(a+b));
		
		sc.close();
		
		
	}
}
