package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SearchEngine_Inheritance {
	
	WebDriver driver = null;
	public void initializeBrowser(String browser, String URL) {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspace_2016/September_2016/October2016\\src/test/resources/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\September_2016\\October2016\\src\\test\\resources\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else if(browser.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(URL);
		
	}
	public void tearDown() {
		driver.quit();
		
	}

}
