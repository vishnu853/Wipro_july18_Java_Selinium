package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Prepared_Statement
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/wipro_db", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectquery="select * from persons where FirstName=?";
		
//		PreparedStatement ps=con.prepareStatement(selectquery);
//		
//		ps.setString(1,"vishnu");
//		
//		ResultSet rs=ps.executeQuery();
//		
//		
//		
//		while(rs.next())
//		{
//			
//			System.out.println(rs.getString("FirstName"));
//			System.out.print(rs.getString("LastName"));
//		}
		
		String query1="select * from Persons where FirstName='Vishnu' and PersonId='101'";
		String query2="select * from Persons where FirstName=? and PersonId=?";
		
		PreparedStatement ps1=con.prepareStatement(query2);
		
		ps1.setString(1, "Vijay");
		ps1.setInt(2, 102);
		
		ResultSet rs=ps1.executeQuery();
		
		while(rs.next())
		{
			
				System.out.println(rs.getString("Address"));
				System.out.println(rs.getString("LastName"));
				System.out.println(rs.getString("City"));
		}
		
		
		
	}
}
