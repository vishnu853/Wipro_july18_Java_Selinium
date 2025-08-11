package LabSession_July_23;

public class Strings
{
	public static void main(String[] args)
	{
		
		
		String str1="Core Java";
		String str2="Selenium";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.contains("v"));
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1,3));
		
		System.out.println(str1.replace("o", "g"));
		
		System.out.println(str1.replaceAll(str1, "Java"));
		
		System.out.println(str1.isEmpty());
		
		System.out.println(str1.endsWith("a"));
		
		String str3= String.join("_","course","python");
		System.out.println(str3);
		
		System.out.println(str2.compareTo(str3));
		
	}
}
