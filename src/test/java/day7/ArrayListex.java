package day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		//ArrayList<String> arr = new ArrayList<String>();
		arr.add("Orange");
		arr.add("apple");
		arr.add("Orange");
		arr.add(null);
		arr.add("Orange");
		arr.add(1, "grape");
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
