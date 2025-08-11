package LabSession_Aug_02;

class HelloWorld extends Thread 
{
	public void run() 
	{
        System.out.println("Hello, World!");
    }

    public static void main(String[] args)
    {
    	HelloWorld thread = new HelloWorld();
    	thread.start();
    	}
}