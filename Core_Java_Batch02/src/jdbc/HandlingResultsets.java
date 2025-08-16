package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import core_java.interface_03;

public class HandlingResultsets
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/wipro_db", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectquery="select * from persons;";
		
		ResultSet rs=st.executeQuery(selectquery);
		
		System.out.println("PersonId" +"\t"+"FirstName"+"\t"+"LastName"+"\t\t"+"City");
		
		while(rs.next())
		{
			int id=rs.getInt("PersonId");
			
			
			String Firstname=rs.getString("FirstName");
			//System.out.println(Firstname);
			
			String Lastname=rs.getString("LastName");
			//System.out.println(Lastname);
			
			String city=rs.getString("City");
			
			
			System.out.println(id +"\t\t\t"+Firstname+"\t\t"+Lastname+"      \t"+city);
			
			
//			int id1=rs.getInt(1);
//			System.out.println(id1);
//			
//			String s=rs.getString(2);
//			System.out.println(s);
			
			
			
		}
	}
}
