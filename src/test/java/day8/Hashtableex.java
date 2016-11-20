package day8;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashtableex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<Integer,String> map = new Hashtable<Integer,String>();
		map.put(101, "India");
		map.put(101, "Pakistan");
		//map.put(102, null);
		//map.put(103, null);
		//map.put(null, "USA");
		//map.put(null, "United State");
		
		map.put(104, "UK");
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(101, "India");
		map1.put(101, "Paki");
		map1.put(102, null);
		map1.put(103, null);
		map1.put(null, "USA");
		map1.put(null, "United State");
		
		map1.put(104, "UK");
		System.out.println(map);
		System.out.println(map.get(104));
		for(Integer x : map.keySet())
		{
			System.out.println(x);
		}

	}

}
