package LabSession_july_31;

public class one
{
	public void print(int num) {
		if(num <=100) {
			System.out.print(num+" ");
			 print(num+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one one = new one();
		
		one.print(1);
	
		

	}

}
