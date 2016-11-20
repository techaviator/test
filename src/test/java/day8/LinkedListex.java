package day8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//LinkedList<String> arr = new LinkedList<String>();
List<String> arr = new LinkedList<String>();
		
		arr.add("apple");
		arr.add("orange");
		arr.add("grape");
		arr.add(null);
		arr.add(null);
		arr.add("pinapple");
		
				
		System.out.println(arr);
		
		System.out.println(arr.get(3));
		System.out.println(arr.size());
		arr.add(3, "banana");
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
