package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetPerson 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			
			Statement s3 = cn.createStatement();
			
			ResultSet rs = s3.executeQuery("Select *,id from person");
//			ResultSet rs1 = s3.executeQuery("select id from person");
			
			while(rs.next())
			{
				System.out.println("Id: "+rs.getInt(1)+"\t Name: "+rs.getString(2)+"\t Address: "+rs.getString(3));
				System.out.println("-----");
				
				System.out.println("Id: "+rs.getInt(4));
				System.out.println("_______________________________________________________");
				
			}
			
//			while(rs1.next())
//				System.out.println("Id: "+rs1.getInt(1));
			
			
			cn.close();
			
		} 
		
		catch (ClassNotFoundException | SQLException e) 
		{
		
			e.printStackTrace();
		}
	}
}
