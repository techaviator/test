package day7;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchEngine {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String searchstring=null;
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\SearchEngine.xlsx";
		ExcelReader xl = new ExcelReader(path);
		int xlRowCount = xl.getXLRowCount("Sheet1");
		for(int i = 1;i<=xlRowCount;i++)
		{
			searchstring= xl.getXLData("Sheet1", i, 0);
			WebDriver  driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://google.com");
			driver.findElement(By.id("lst-ib")).sendKeys(searchstring);
			driver.findElement(By.name("btnG")).click();
			String hits = driver.findElement(By.id("resultStats")).getText();
			//System.out.println(hits);
		/*	String[] split = hits.split(" ");
			System.out.println(split.length);
			System.out.println(split[1]);*/
			String actual = hits.split(" ")[1];
			//System.out.println(actual);
			xl.setXLCellValue("Sheet1", i, 1, actual);
			
			driver.close();
			
		}xl.writeToXL(path);
		System.out.println("Completed");
		
	}

}
