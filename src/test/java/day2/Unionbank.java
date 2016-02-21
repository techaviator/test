package day2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Unionbank {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String expected = "2224.44";
		
		WebDriver driver = null;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the browsertype");
		String browsertype = in.next();
		if(browsertype.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browsertype.equals("ie"))
		{
		System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\Jan_2016_batch\\January_2016_batch\\src\\test\\resources\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		}
		
		else if(browsertype.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspace_2016\\Jan_2016_batch\\January_2016_batch\\src\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		}
		driver.manage().window().maximize();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		WebElement amount = driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr td input#loanamount"));
		amount.clear();
		amount.sendKeys("100000");
		
		WebElement interest = driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr#Tr1 td input#rate"));
		interest.clear();
		interest.sendKeys("12");
		
		WebElement months = driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr#Tr2 td input#pmonths"));
		months.clear();
		months.sendKeys("60");
		
		WebElement Calculate = driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#Table1 tbody tr td input#Button1"));
		Calculate.click();
		
		WebElement emi = driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tbldata tbody tr td input#EMI"));
		String actual = emi.getAttribute("value");
		System.out.println("Actual: "+ actual);
		System.out.println("expected: "+ expected);
		
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

}
