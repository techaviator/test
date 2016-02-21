package day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//HashSet<String> arr = new HashSet<String>();
		Set<String> arr = new HashSet<String>();
		arr.add("Orange");
		arr.add("apple");
		arr.add("Orange");
		arr.add(null);
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
