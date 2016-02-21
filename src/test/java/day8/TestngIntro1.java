package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngIntro1 {
	
/*	@Test(priority =1)
	public void login()
	{
		System.out.println("Login into my system");
		
	}*/
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login into my system");
		
	}
	
	//@Test
	public void SendEmail()
	{
		System.out.println("send email");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from my system");
	}
	
	@Test(dataProvider = "DP", dataProviderClass=day8.Dataprovider4Testng.class)
	public void checkmail(Object x, Object y)
	{
		System.out.println(x +"   "+y);
		System.out.println("check email");
	}
	/*
	@DataProvider(name ="DP")
	public Object[][] DP_test()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0]= "USA";
		obj[1][0]= 1;
		obj[2][0]= "UK";
		obj[0][1]= "XYA";
		obj[1][1]= 2;
		obj[2][1]= "Urguay";
		return obj;
		
	}*/
	
	/*@DataProvider(name ="DP")
	public Iterator<Object[]> DP_test()
	{
		List<Object[]> ls = new ArrayList<Object[]>();
		for(int i=0;i<=2;i++)
		{		
		Object[] obj = new Object[2];
		obj[0]= "USA";
		obj[1]= 1;
		ls.add(obj);
		}
		
	
		return ls.iterator();
		
	}*/

}
