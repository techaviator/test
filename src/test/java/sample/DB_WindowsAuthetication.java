package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class DB_WindowsAuthetication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Connection conn = null;
         String url = "jdbc:sqlserver://localhost;databasename=Selenium;integratedSecurity=true";
         String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
         String userName = ""; 
         String password = "";
         Statement stmt;
         try
         {

         Class.forName(driver);//.newInstance();
         conn = DriverManager.getConnection(url,userName,password);
         if(conn!=null)
         {
        	 
        	 System.out.println("success");
         }
         
         else
         {
        	 System.out.println("fail");
         }
        	 
         String query = "select * from dbo.employee";
         stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        
        while(resultSet.next())
        {
        	System.out.print(resultSet.getString("ID")+"\t");
        	
        	System.out.print(resultSet.getString("Name")+"\t\t\t");
        	System.out.print(resultSet.getString("Location"));
        	System.out.println();
        }
        	
         conn.close();
        System.out.println("");
         } catch (Exception e) {
         e.printStackTrace();
         }

	}

}
