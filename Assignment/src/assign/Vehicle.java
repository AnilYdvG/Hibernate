package assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Vehicle 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/var","root","root");
			
			Statement s = con.createStatement();
			
			s.execute("Insert into car values(3,'Laxus','5th series','white')");
			
			con.close();
			
			System.out.println("Car added to table");
			
		} 
		
		catch (ClassNotFoundException | SQLException e) 
		{
			
					e.printStackTrace();
		}
		
		
	}

}
