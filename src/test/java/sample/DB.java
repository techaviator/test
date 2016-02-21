package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB {
	
	public void getDB() {
		List<String> ls = new ArrayList<String>();
		Connection conn=null;
		Statement statement = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcConnection");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 conn = DriverManager.getConnection("jdbc:odbc:MY_DB");
			  statement = conn.createStatement();
			  //statement.executeUpdate("Update Selenium.dbo.Employee set Name = 'Kun Agueiro' where ID = 1");
				ResultSet result = statement.executeQuery("Select * from Selenium.dbo.Employee");
				int i =0;
				while(result.next())
				{
					
					System.out.print(result.getString("ID"));
					System.out.print("                                      ");
					
					ls.add(result.getString("Name"));
					System.out.print(ls.get(i));
					System.out.print("                                      ");
					System.out.print(result.getString("Location"));
					System.out.println();
					i++;
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static void main(String[] args){
		DB obj  = new DB();
		obj.getDB();
	}

}
