package core_java;


interface Inf1
{
	private void display()
	{
		
	}
	
	void show();
	
	default void cat()
	{
		display();
	}
	
	static void human()
	{
		
	}
}


interface funInf1
{
	void great();
	
	default void human()
	{
		
	}
	
	static void dog()
	{
		
	}
}

class Engine
{
	
}

class Car extends Engine
{
	
}

class Friend
{
	public static Friend getObj()
	{
		
		return new Friend();
	}
}

class YourSelf
{
	Friend obj = Friend.getObj();
}




public class FunctionalInterface 
{
	public static void main(String[] args) 
	{
		
	}
}
