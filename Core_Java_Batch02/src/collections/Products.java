package collections;

public class Products 
{
	String Pname;
	int Price;

	Products(String Pname,int Price)
	{
		this.Pname=Pname;
		this.Price= Price;
	}
	public String toString() 
	{
		 return Pname +" : "+Price;
	 }
}
