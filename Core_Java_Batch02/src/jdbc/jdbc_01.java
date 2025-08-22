package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_01 
{
	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Wipro_db", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectquery="select * from persons;";
		
		ResultSet rs=st.executeQuery(selectquery);
		
		while(rs.next())
		{
			System.out.print(rs.getString("PersonId"));
			System.out.println(rs.getString("Firstname"));
		}
	}
}
