package core_java;

public class StringBuilderEx 
{
	public static void main(String[] args)
	{
		StringBuilder sb= new StringBuilder("Java");
		
		System.out.println(sb);
		
		sb.append("Selinum");
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.isEmpty());
		
		System.out.println(sb.insert(1, "v"));
		
		System.out.println(sb.deleteCharAt(1));
		
		System.out.println(sb.substring(2));
		
		System.out.println(sb.replace(0, 10, "hello Java"));
		
		System.out.println(sb.charAt(4));
		
		System.out.println(sb.indexOf("p"));
		
		System.out.println(sb.length());
		
		System.out.println(sb.repeat(sb, 2));
		
		
	}
}
