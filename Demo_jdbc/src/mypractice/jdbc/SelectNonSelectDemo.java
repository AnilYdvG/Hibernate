package mypractice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectNonSelectDemo 
{
	public static void main(String[] args) throws Exception 
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String pwd = "root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pwd);
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Query");
		String sqlQuery = sc.next();
		boolean b = st.execute(sqlQuery);
		if(b)
		{
			ResultSet rs = st.getResultSet();
			while(rs.next())
				System.out.println("Id: "+rs.getInt(1)+"\n Name: "+rs.getString(2)+"\n Salary: "+rs.getDouble(3)+"\n Dept: "+rs.getString(4));
		}
		else
		{
			int rowcount = st.getUpdateCount();
			System.out.println(rowcount);
		}
		sc.close();
		con.close();
		
	}

}
