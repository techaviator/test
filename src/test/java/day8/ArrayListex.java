package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayListex {

	public static void main(String[] args) {
		//ArrayList<String> arr = new ArrayList<String>();
		List<String> arr = new ArrayList<String>();
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
