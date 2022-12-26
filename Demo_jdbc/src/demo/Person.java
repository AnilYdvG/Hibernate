package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
	
			Statement s = c.createStatement();
			s.execute("Insert into person values(7,'Wonderwoman','Avengers3')");
			s.execute("Insert into person values(4,'Tom','Avengers2')");
			s.execute("Insert into person values(5,'Jerry','Avengers2')");
			s.execute("Insert into person values(6,'Mowgli','Avengers2')");
			
//			s.execute("Insert into person values(4,'Loki','Avengers2')");

//			s.execute("update person set name='Ironman' where id=1");		//not a good practice--->dont update from here
//								create new class to update data and the same code with updated values
			c.close();
			System.out.println("Value inserted");
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
