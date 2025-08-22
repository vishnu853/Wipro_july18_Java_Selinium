package LabSession_July_22;

public class IfElseLadderStatements 
{
	public static void main(String[] args)
	{
		int marks= 86;
		
		if(marks>=90)
		{
			System.out.println("you got A grade");
		}
		else if(marks>=75)
		{
			System.out.println("you got B grade");
		}
		else if(marks>=60)
		{
			System.out.println("you got C grade");
		}
		else if(marks>=40)
		{
			System.out.println("you got D grade");
		}
		
		else
		{
			System.out.println("Failed");
		}
	}
}
