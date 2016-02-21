package day7;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "USA");
		map.put(102, "Russia");
		/*map.put(null, "GB");
		map.put(null, "MP");*/
		map.put(102, "USSR");
		map.put(103, null);
		System.out.println(map);
		
		System.out.println(map.get(101));
		
		for(Integer key :map.keySet())
		{
			System.out.println("THe key is " +key+" and the value is " +map.get(key));
		}

	}

}
