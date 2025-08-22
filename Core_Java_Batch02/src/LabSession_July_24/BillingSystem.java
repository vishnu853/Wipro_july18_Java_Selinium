package LabSession_July_24;

abstract class Bill
{
	abstract void generatebill();
}

class ElectricityBill extends Bill
{
	private int units;
	
	public  ElectricityBill(int units)
	{
		this.units=units;
	}

	void generatebill() 
	{
		int rateperunit=5;
		int total =units * rateperunit;
		System.out.println("ElectricBill: "+ total);
	}
}
class WaterBill extends Bill
{
	private int liters;
	
	 WaterBill(int liters)
	{
		this.liters=liters;
	}
	
	
	void generatebill() 
	{
		int rateperliter=20;
		int total2 =liters * rateperliter;
		System.out.println("WaterBill: "+ total2);
	}

	

}
public class BillingSystem
{
	public static void main(String[] args)
	{
		ElectricityBill  obj=new ElectricityBill(7);
		obj.generatebill();
		
		WaterBill obj1=new WaterBill(9);
		obj1.generatebill();
	}
}

