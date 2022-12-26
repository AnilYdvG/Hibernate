package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Person 
{
	public static void main(String[] args) 
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
	
			Statement s = c.createStatement();
			s.execute("update person set Address='Disney' where id=4");
			s.execute("update person set Address='Disney' where id=5");
			
			c.close();
			System.out.println("Data updated");
				
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
	}

}
