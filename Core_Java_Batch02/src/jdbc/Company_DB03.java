package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Company_DB03
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/companydb", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectquery1="select * from employees ";
		
//		String selectquery2="select * from employees where eid=101 ";
//		String selectquery3="select * from employees where edept='IT' ";
		
		ResultSet rs=st.executeQuery(selectquery1);
		
		while(rs.next())
		{
			System.out.println("ID: "+rs.getInt("eid"));
			System.out.println("name: "+rs.getString("ename"));
			System.out.println("department: "+rs.getString("edept"));
			System.out.println("salary: "+rs.getInt("esal"));
			
			System.out.println("----------------------------------");
		}
		st.close();
		con.close();
		
		
	}
}
