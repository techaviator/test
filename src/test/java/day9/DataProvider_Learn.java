package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProvider_Learn {
	
	@DataProvider(name = "DP")
	public static Object[][] getdata()
	{
		System.out.println("Start DP");
		Object[][] obj = new Object[2][2];
		obj[0][0] = "http://google.com";
		obj[0][1] = "sachin";
		obj[1][0] = "http://google.com";
		obj[1][1]="sehwag";
		return obj;
	}
	
	@DataProvider(name = "DP1")
	public static Iterator<Object[]> getData1()
	{
		List<Object[]> ls = new ArrayList<Object[]>();
		Object[] obj = new Object[2];
		obj[0] = "http://google.com";
		obj[1] = "sachin";
		ls.add(obj);
		obj = new Object[2];
		obj[0] = "http://google.com";
		obj[1] = "sehwag";
		ls.add(obj);
		return ls.iterator();
	}

}
