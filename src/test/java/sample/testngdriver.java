package sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

public class testngdriver {
	@DataProvider(name = "DP_name")
	public static  Iterator<Object[]> DP()
	{
		/*Object[][] obj = new Object[2][2];
		obj[0][0]="selenium";
		obj[0][1]=1;
		obj[1][0]="QTP";
		obj[1][1]=2;
		return obj;*/
		
		Object[] obj = new Object[2];
		List<Object[]> ls = new ArrayList<Object[]>();
		obj[0] = "Selenium";
		obj[1] = "QTP";
		
		ls.add(obj);
		return ls.iterator();
	}

}
