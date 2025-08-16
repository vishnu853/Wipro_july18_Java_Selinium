package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import core_java.interface_03;

public class Company_DB02
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/companydb", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectquery="insert into employees values(101,'Alice','HR',50000),(102,'Bob','IT',10000),"
				+ "(103,'Charlie','Sales',20000)";
		
		int count=st.executeUpdate(selectquery);
		
		System.out.println(count+" no. of rows affected");
		
		con.close();
		st.close();
		
	}
}
