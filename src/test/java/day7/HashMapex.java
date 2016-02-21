package day7;

import java.util.HashMap;

public class HashMapex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "USA");
		map.put(102, "Russia");
		map.put(null, "GB");
		map.put(null, "MP");
		map.put(102, "USSR");
		map.put(103, null);
		System.out.println(map);
		
		System.out.println(map.get(101));
		
		for(Integer key :map.keySet())
		{
			System.out.println(map.get(key));
		}
	}

}
