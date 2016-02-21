package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class Dataprovider4Testng {
	@DataProvider(name ="DP")
	public static Iterator<Object[]> DP_test()
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
		
	}

}
