package day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkedexception {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws InterruptedException 
	 */
	public static void test() {
		File f = new File("C:\\guru.xlsx");//Filenotfound
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}//IOException
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("The file doesnt exist");
		}
		//Thread.sleep(1000);//Interrupted Exception
	

	}
	
	public static void main(String[] args) {
		test();
	}

}
