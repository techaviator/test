package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Unionbank {

	
	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("D:\\xxx.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			System.out.println("Inside try block");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				
				System.out.println(e.getMessage());
			}
		
		finally{
			System.out.println("Close db connection");
		}
		System.out.println("outside block");
	}

}
