package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	
	
		WebDriver driver = null;
		@BeforeMethod
		public void IntializeBrowser()
		{
			System.out.println("Before Method");
			System.out.println("Initialize browser");
			 driver = new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterMethod
		public void tearDown()
		{
			System.out.println("After Method");
			System.out.println("  browser tear down");
			driver.close();
		}	
		
		@Test(dataProvider = "DP1",dataProviderClass=day9.DataProvider_Learn.class)
		public void googlesearch( String url,String searchtext)
		{//lst-ib
			System.out.println("Google Search");
			//WebDriver driver = new FirefoxDriver();
			driver.get(url);
			driver.findElement(By.id("lst-ib")).sendKeys(searchtext);
			driver.findElement(By.name("btnG")).click();
			//driver.close();
		}
		
	/*	@DataProvider(name = "DP")
		public Object[][] getdata()
		{
			System.out.println("Start DP");
			Object[][] obj = new Object[2][2];
			obj[0][0] = "http://google.com";
			obj[0][1] = "sachin";
			obj[1][0] = "http://google.com";
			obj[1][1]="sehwag";
			return obj;
		}*/
	}


