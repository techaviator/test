package day7;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> arr = new TreeSet<String>();
		arr.add("Orange");
		arr.add("Apple");
		arr.add("orange");
		//arr.add(null);
		arr.add("Orange");
		System.out.println(arr);
		//System.out.println(arr.get(0));
		
		/*for(String c:arr)
		{
			System.out.println(c);
		}*/
		
		Iterator<String> iterator = arr.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
