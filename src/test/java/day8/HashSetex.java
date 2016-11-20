package day8;

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
		arr.add("apple");
		arr.add("orange");
		arr.add("grape");
		arr.add("Grape");
		arr.add(null);
		arr.add(null);
		arr.add("pinapple");
		
				
		System.out.println(arr);
		
		//System.out.println(arr.get(3));
		System.out.println(arr.size());
		//arr.add(3, "banana");
		System.out.println(arr.size());
		
		/*for(int i=0 ;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}*/
		/*for(String x : arr)
		{
			System.out.println(x);
		}*/
		
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//System.out.println(itr.next());
		}
		

	}

}
