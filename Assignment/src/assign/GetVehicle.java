package assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetVehicle 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/var","root","root");
			
			Statement s2 = cn.createStatement();
			
			ResultSet rs = s2.executeQuery("select * from car");
			
			while(rs.next())
			{
				System.out.println("Id: "+rs.getInt(1)+"\t Brand: "+rs.getString(2)+"\t Model: "+rs.getString(3)+"\t Color: "+rs.getString(4));
				System.out.println("---------------------------------------------------------------");
			}
			cn.close();

		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
