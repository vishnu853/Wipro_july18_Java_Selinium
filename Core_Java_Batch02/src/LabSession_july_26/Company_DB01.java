package LabSession_july_26;

import java.sql.Connection;
import java.sql.DriverManager;	
import java.sql.Statement;

public class Company_DB01
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/companydb", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectquery="create table employees("+"eid int primary Key not null,"+ 
		"ename varchar(200) not null,"+ "edept varchar(200) not null,"+ "esal int not null)" ;
		
		st.executeUpdate(selectquery);
		System.out.println("Table is created");
		
		con.close();
	}
}
