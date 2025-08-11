package LabSession_July_24;

class payment
{
	public void pay()
	{
		System.out.println(" Payment is done by: ");
		
	}
}

class CreditCard extends payment
{
	public void CC()
	{
		System.out.println(" Credit Card");
	}
}

class UPI extends payment
{
	public void upi()
	{
		System.out.println(" UPI ");
	}
}

class Netbanking extends payment
{
	public void netbank()
	{
		System.out.println(" NetBanking");
	}
}


public class MethodOverloading01
{
	public static void main(String[] args) 
	{
		payment obj=new payment();
		obj.pay();
		
		CreditCard obj1=new CreditCard();
		obj1.pay();
		obj1.CC();
		
		UPI obj2=new UPI();
		obj2.pay();
		obj2.upi();
		
		Netbanking obj3=new Netbanking();
		obj3.pay();
		obj3.netbank();
		
	}
}
