package wrapperclasses;

public class Auto_Unboxing 
{
	public static void main(String[] args)
	{
		// Auto-Unboxing
		
				Integer a1=new Integer(3);
				int i1=a1.intValue();
				 int j=a1;
				 System.out.println(i1);
				 System.out.println(j);
				 
				 char c1='a';
				 Character c2=new Character(c1);
				 char c3=c2;
				 System.out.println(c3);
				 
				 // Float
				 float f1=6.9f;
				 Float f2=new Float(f1);
				 float f3=f2;
				System.out.println(f3);
				
				//Double
				
				double d1=9.008;
				Double d2=new Double(d1);
				double d3=d2;
				System.out.println(d3);
				
						 
	}
}
