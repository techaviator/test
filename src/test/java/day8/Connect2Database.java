package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect2Database {
	public void getdbdata() throws Exception
	{
		
		//Establishing connection
		Class.forName("sun.jdbc.odbc.JdbcOdbcConnection");
		Connection conn = DriverManager.getConnection("Jdbc:Odbc:MY_DB");
		if (conn!=null)
		{
			System.out.println("success");
		}
		
		//Creating the SQL statement
		
		Statement stmt = conn.createStatement(); 
		String updatequery = "update Selenium.dbo.employee set name = 'Rogertoose' where ID = 2";
		stmt.executeUpdate(updatequery);
		String query = "select * from Selenium.dbo.employee where ID =2";
		ResultSet eq = stmt.executeQuery(query);
		
		while(eq.next())
		{
			
			System.out.print(eq.getString("ID"));
			System.out.print("             ");
			System.out.print(eq.getString("Name"));
			System.out.print("             ");
			System.out.print(eq.getString("Location"));
			System.out.println();
		}
		
	}
	
	

}
