package core_java;



public class StringBufferEx
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("hello");
		
		System.out.println(sb);
		
		sb.append("World");
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.isEmpty());
		
		System.out.println(sb.insert(1, "v"));
		
		System.out.println(sb.deleteCharAt(1));
		
		System.out.println(sb.substring(2));
		
		System.out.println(sb.replace(0, 10, "hello program"));
		
		System.out.println(sb.charAt(4));
		
		System.out.println(sb.indexOf("p"));
		
		System.out.println(sb.length());
		
		System.out.println(sb.repeat(sb, 3));
		
	}
}
