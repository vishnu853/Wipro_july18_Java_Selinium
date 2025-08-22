package multi_threading;

public class Cook_Reastaurent
{
	public static void main(String[] args)
	{
		Thread t1 = new Cooking_Task("Pasta");
		Thread t2 = new Cooking_Task("Dosa");
		Thread t3 = new Cooking_Task("Salad");
		Thread t4 = new Cooking_Task("Dessert");
		Thread t5 = new Cooking_Task("Rice");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	} 
}
 
 