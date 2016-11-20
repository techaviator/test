package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Bing implements SearchEngine {
	WebDriver driver=null;
	@Override
	public void initializeBrowser(String browser) {
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
			driver.get("http://www.bing.com/");
		
	}

	@Override
	public void searchString(String searchtext) {
		
		driver.findElement(By.id("sb_form_q")).sendKeys(searchtext);
		driver.findElement(By.name("go")).click();
		
	}

	@Override
	public void displayResult() {
		System.out.println(driver.findElement(By.cssSelector(".sb_count")).getText());
		
	}

	@Override
	public void tearDown() {
		driver.quit();
		
	}

}
