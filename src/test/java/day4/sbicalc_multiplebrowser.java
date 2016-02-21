package day4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sbicalc_multiplebrowser {

	WebDriver driver =null;
	String expected = "2224.44";
	String browsertype = null;
	Scanner in  = new Scanner(System.in);
	
	/*public sbicalc_multiplebrowser()
	{
		System.out.println("This is default constructor");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
	}*/
	
	public void launchbrowser()
	{
		System.out.println("Enter a browsertype");
		browsertype = in.next();
		
		if(browsertype.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		else if(browsertype.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\Jan_2016_batch\\January_2016_batch\\src\\test\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browsertype.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/JavaWorkspace_2016/Jan_2016_batch/January_2016_batch/src/test/resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		
	}
	
	public void getElement()
	{
		driver.findElement(By.xpath("//input[@class='textbox'][@name='uTime']/../../p[1]/input")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@class='textbox'][@name='uTime']")).sendKeys("60");
		driver.findElement(By.xpath("//input[@name='uRate']")).sendKeys("12");
		//driver.findElement(By.xpath("//input[@type='Button'][@value='Calculate']")).click();
		driver.findElement(By.xpath("//table[@class ='commontable']/tbody/tr[3]/td/p[1]/input[1]")).click();
	}
	
	public void validate()
	{
		String actual = driver.findElement(By.xpath("//input[contains(@name,'Em')]")).getAttribute("value");
		
		
		System.out.println(actual);
		System.out.println(expected);
		if(expected.equals(actual))
		{
			System.out.println("The test case has passed");
		}
		else
		{
			System.out.println("The test case has failed");
		}
		
	}
	
	public void tear_down()
	{
		driver.close();
	}
	/*public static void main(String[] args) {
		String expected = "2224.44";
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		
		driver.findElement(By.xpath("//input[@class='textbox'][@name='uTime']/../../p[1]/input")).sendKeys("100000");
		driver.findElement(By.xpath("//input[@class='textbox'][@name='uTime']")).sendKeys("60");
		driver.findElement(By.xpath("//input[@name='uRate']")).sendKeys("12");
		//driver.findElement(By.xpath("//input[@type='Button'][@value='Calculate']")).click();
		driver.findElement(By.xpath("//table[@class ='commontable']/tbody/tr[3]/td/p[1]/input[1]")).click();
		String actual = driver.findElement(By.xpath("//input[contains(@name,'Em')]")).getAttribute("value");
		//String actual = driver.findElement(By.xpath("//input[starts-with(@name,'uEm')]")).getAttribute("value");
		//String actual = driver.findElement(By.xpath("//input[@name='uEmi']")).getAttribute("value");
		//validation
		
		System.out.println(actual);
		System.out.println(expected);
		if(expected.equals(actual))
		{
			System.out.println("The test case has passed");
		}
		else
		{
			System.out.println("The test case has failed");
		}
		
		driver.close();

	}
*/
}
