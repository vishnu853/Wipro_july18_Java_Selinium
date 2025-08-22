package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Prepared_Statement03 
{
	public static void main(String[] args) throws Exception
	{
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/wipro_db", "root", "root");
		
		Statement st=con.createStatement();
		
		String selectquery="insert into persons values(?,?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(selectquery);
		
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter the PersonID : ");
		int pid=sc1.nextInt();
		
		System.out.println("Enter the FirstName : ");
		String Firstname=sc2.nextLine();
		
		System.out.println("Enter the LastName : ");
		String Lastname=sc2.nextLine();
		
		System.out.println("Enter the Address : ");
		String address=sc2.nextLine();
		
		System.out.println("Enter the City : ");
		String city=sc2.nextLine();
		
		ps.setInt(1, pid);
		ps.setString(2, Firstname);
		ps.setString(3, Lastname);
		ps.setString(4, address);
		ps.setString(5, city);
		
		int rs=ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}
}
