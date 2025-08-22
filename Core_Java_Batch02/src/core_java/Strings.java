package core_java;

public class Strings
{
	public static void main(String[] args)
	{
		String s1="HelloWorld";
		System.out.println(s1);
		
		char ch[]= {'h','e','l','l','o'};
		String s2=new String(ch);
		System.out.println(s2 );
		
		String s3=new String("Hello");
		System.out.println(s3);
		
		String str1="Mumbai";
		String str2="Delhi";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.contains("z"));
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1,3));
		
		System.out.println(str1.replace("i", "g"));
		
		System.out.println(str1.replaceAll(str1, "Pune"));
		
		System.out.println(str1.isEmpty());
		
		System.out.println(str1.endsWith("i"));
		
		String str3= String.join("_","city","Mumbai");
		System.out.println(str3);
		
		System.out.println(str2.compareTo(str3));
		
		String text= "java is a programming language";
		String[] result=text.split(" ");
		
		for(String str: result)
		{
			System.out.println(str +",");
		}
	}
}
