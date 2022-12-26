package scannr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Vehicle 
{
	public static void main(String[] args) 
	{
		int n=1;
		Scanner sc = new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_jdbc","root","root");
			
			
			while(n==1)
			{
				System.out.println("Enter Id");
				int id = sc.nextInt();

				System.out.println("Brand");
				String Brand = sc.next();
				
				System.out.println("ModelNo.");
				String Model = sc.next();
				
				System.out.println("Color");
				String Color= sc.next();
				
				PreparedStatement ps1 = cn.prepareStatement("Insert into bus values(?,?,?,?)");
				ps1.setInt(1, id);
				ps1.setString(4, Color);
				ps1.setString(2, Brand);
				ps1.setString(3, Model);
				
				ps1.execute();
				
				System.out.println("Press 1 for adding another BUS \nPress any other value to exit");
				n=sc.nextInt();
			}
			cn.close();
		}
		catch (ClassNotFoundException | SQLException e) 
		{			
			e.printStackTrace();
		}		
	}
}