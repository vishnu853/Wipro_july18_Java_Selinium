package core_java;

public class StudentInfo
{
	public String studentName="vishnu";
	int StudentId = 267;
	public String StudentBranch="CSE";
	
	public void fetchstudentdetails()
	{
		String clgName="Pulla Reddy";
		
		System.out.println( studentName);
		System.out.println(StudentId);
		System.out.println(StudentBranch);
		System.out.println(clgName);
	}
	
	public static void main(String[] args) 
	{
		StudentInfo obj1= new StudentInfo();
		obj1.fetchstudentdetails();
	}
}
