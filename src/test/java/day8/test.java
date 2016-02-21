package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {

	/**
	 * @param args
	 */
	public static Iterator<Object[]> trial() {
		List<Object[]> ls =new ArrayList<Object[]>();
		for(int i=0;i<2;i++)
		{
		Object[] obj = new Object[2];
		
		obj[0] = 1;
		obj[1] = 2;
		ls.add(obj);
		}
		return ls.iterator();

	}
	
	public static void trial1()
	{
		Iterator<Object[]> itr = trial();
		while(itr.hasNext())
		{
			Object[] obj = itr.next();
			for(int i=0;i<obj.length;i++)
			{
				System.out.print(obj[i]);
				System.out.print("               ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		trial1();
	}

}
