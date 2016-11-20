package day8;

import java.util.HashMap;

public class HashMapex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "India");
		map.put(101, "Pakistan");
		map.put(102, null);
		map.put(103, null);
		map.put(null, "USA");
		map.put(null, "United State");
		
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
		System.out.println(map.get(null));
		for(Integer x : map.keySet())
		{
			System.out.println(x);
		}
		
		/*for(Integer key : map.keySet())
		{
			if(!map1.containsValue(map.get(key)))
			{
				System.out.println(key+" : "+ map.get(key) +"  |  " + map1.get(key) );
			}
		}*/
		
	}

}
