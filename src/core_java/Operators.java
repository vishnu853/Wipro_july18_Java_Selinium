package core_java;

public class Operators 
{
	public static void main(String[] args)
	{
		// Unary Operator
		int i=12;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		// Arthemetic Operator
		
		int a1=25;
		int a2=5;
		int a7=0;
		
		int a3=a1+a2;
		System.out.println(a3);
		int a4=a1-a2;
		System.out.println(a4);
		int a5=a1*a2;
		System.out.println(a5);
		int a6=a1/a2;
		System.out.println(a6);
		a7=a1%a2;
		System.out.println("a7  "+ a7);
		
		// Shit Operators
		
		// left shit
		System.out.println(10<<3); //10 * 2^3
		//right shift
		System.out.println(10>>2); //10 / 2^2
		
		// Relational operator
		
		int b1=5;
		int b2=6;
		System.out.println(b1>b2);
		System.out.println(b1<b2);
		System.out.println(b1>=b2);
		System.out.println(b1<=b2);
		System.out.println(b1==b2);
		
		// Bitwise Operator
		 
		//Bitwise And Operator (present in both operands)
		int c1=8;
		int c2=2;
		int c3=c1 & c2;
		System.out.println(c3);
		//Bitwise Or Operator  (present in atleat one operands)
		int d1=5;
		int d2=3;
		int d3=d1 | d2;
		System.out.println(d3);
		
		//Bitwise Xor Operator  (present in atleat one operands)
		int e1=5;
		int e2=3;
		int e3=e1 ^ e2;
		System.out.println(e3);
		
		// Logical Operators
		
		// &&----> Returns true both operand is true or else false
		int f1=10, f2=20;
		if(f1 < f2 &&f2 >15 )
		{
			System.out.println("Both Conditions are true");
		}
		
		// ||---> returns true atleast one opearnd is true
		int age=25;
		if(age<18 || age>21)
		{
			System.out.println("Condition is true");
		}
		
		// ! Not---> reverse the logical state of operand
		boolean isRaining=false;
		if(!isRaining )
		{
			System.out.println("You can go out");
		}
		
		// Assisgnment Operator
		
		int g1=10;
		int g2=20;
		
		g1+=4;
		System.out.println(g1);
		g2-=6;
		System.out.println(g2);
		
		//Ternary operator---> Short hand for if-else
		//condition ? expression_if_true: expression_if_false;
		
		int h1=10, h2=20;
		int max=(h1<h2)?h1:h2;
		System.out.println(max);
		
	}
	
	
}
