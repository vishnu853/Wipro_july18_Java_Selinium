package multi_threading;

public class Cooking_Task extends Thread
{
	private String task;
	
	Cooking_Task(String task)
	{
		this.task=task;
	}
	
	public void run()
	{
		System.out.println(task+" is prepared by"+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
	}
}
