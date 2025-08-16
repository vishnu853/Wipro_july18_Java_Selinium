package LabSession_July_25;



public class Encapsulation_02
{
	private double celsius;
	
	public double getCelsius()
	{
		return celsius;
	}


	public void setCelsius(double celsius) 
	{
		if( celsius >=-273.15)
		{
			this.celsius = celsius;
		}
		else
		{
			System.out.println("Temp cannot go below -273.15 degress");
		}
	}
		
	
	public void toFarhenit()
	{
		double farhenit= (celsius *9/5)+32;
		System.out.println("Farhenhit: "+farhenit);
		
	}
	
	public void toKelvin()
	{
		double kelvin= celsius+273.15;
		System.out.println("Kelvin: "+kelvin);
	}
	
	public static void main(String[] args) 
	{
		Encapsulation_02 obj=new Encapsulation_02();
		
		obj.setCelsius(27);
		System.out.println("Celsius:"+obj.getCelsius());
		
		obj.toFarhenit();
		obj.toKelvin();
		
		
	}
	
	
}
