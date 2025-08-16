package multi_threading;

public class UseSyncClass 
{
	public static void main(String[] args)throws Exception
	{
		Thread_Sync cnt=new Thread_Sync();
		
		Thread t1=new Thread(()->
		{
			for (int i=0; i<1000;i++)
			{
				cnt.inc();
			}
		});
		
		Thread t2=new Thread(()->
		{
			for (int i=0; i<1000;i++)
			{
				cnt.inc();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count: "+ cnt.get());
	}
}
