package LabSession_july_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Company_DB04 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/companydb", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectQuery="Delete from employees where eid=103";
		//String selectQuery1="Delete from employees where edept='Sales'";
		
		st.execute(selectQuery);
		System.out.println("Data Deleted Successfully");
		
		st.close();
		con.close();
	}
}
