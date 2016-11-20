package day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnecttoDB {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 String url = "jdbc:sqlserver://localhost;databasename=Selenium;integratedSecurity=true";
		 String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		 String uname = "";
		 String pwd = "";
		 Class.forName(driver);
		 Connection conn = DriverManager.getConnection(url,uname,pwd);
		 Statement statement = conn.createStatement();
		 ResultSet result = statement.executeQuery("select  * from dbo.employee");
		 
		 while(result.next())
		 {
			 System.out.print(result.getString("ID")+"\t\t");
			 System.out.print(result.getString("Name")+"\t\t");
			 System.out.print(result.getString("Location")+"\t\t");
			 System.out.println();
		 }
		 int executeUpdate = statement.executeUpdate("update dbo.employee set Location = 'Bangalore' where ID = 5");
		 System.out.println("THe no. of rows updated are "+executeUpdate);
		 //result set closed once running another statement
		 result = statement.executeQuery("select  * from dbo.employee");
		 while(result.next())
		 {
			 System.out.print(result.getString("ID")+"\t\t");
			 System.out.print(result.getString("Name")+"\t\t");
			 System.out.print(result.getString("Location")+"\t\t");
			 System.out.println();
		 }
		 
	}

}
