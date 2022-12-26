package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletPersonData 
{
	public static void main(String[] args) 
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			
			Statement st = cn.createStatement();
			
			st.execute("Delete from person where id = 4");
//			st.execute("Delete from person where id = 6");
			
			cn.close();
			System.out.println("Data deleted successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
