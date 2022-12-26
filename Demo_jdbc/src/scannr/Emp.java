package scannr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Emp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			int n=1;
	
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			while(n==1)
			{
				System.out.println("Enter ID");
				int id = sc.nextInt();
				
				System.out.println("Name");
				String Name = sc.next();
				
				System.out.println("Salary");
				double Sal = sc.nextDouble();
				
				System.out.println("Dept");
				String Dept = sc.next();
			
				PreparedStatement ps = cn.prepareStatement("Insert into emp1 values(?,?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, Name);
				ps.setDouble(3, Sal);
				ps.setString(4, Dept);
				
				ps.execute();
				System.out.println("One entry saved");
				System.out.println("Press 1 to enter another one entry \nPress any other number to exit");
				n=sc.nextInt();
			}
			cn.close();
			
			
			System.out.println("All Data added Successfully");
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
					e.printStackTrace();
		}
	}
}
