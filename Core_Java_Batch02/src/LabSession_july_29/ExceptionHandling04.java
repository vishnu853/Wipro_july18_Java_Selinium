package LabSession_july_29;

public class ExceptionHandling04 
{
	 public static void main(String[] args) 
	    {   

	        try
	        {
	            System.out.println(1);
	        }
	        catch (Exception e) 
	        {
	            System.out.println(2);
	        }

	        //System.out.println(3); finally should be after try catch

	        finally
	        {
	            System.out.println(4);
	        }
	    }
}
