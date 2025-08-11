package core_java;

interface Int_a
{
	abstract  void display();
}

interface Int_b
{
	abstract void display();
}

class C implements Int_a,Int_b
{
	public void display()
	{
		System.out.println("Display Method");
	}
}

public  class Interface_02 
{
	public static void main(String[] args) 
	{
		C obj=new C();
		obj.display();
	}
}
