package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unionbank_CustomizedCSS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String expected = "2224.44";
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		WebElement amount = driver.findElement(By.cssSelector("#loanamount"));
		amount.clear();
		amount.sendKeys("100000");
		
		WebElement interest = driver.findElement(By.cssSelector("#rate"));
		interest.clear();
		interest.sendKeys("12");
		
		WebElement months = driver.findElement(By.cssSelector("#pmonths"));
		months.clear();
		months.sendKeys("60");
		
		WebElement Calculate = driver.findElement(By.cssSelector("#Button1"));
		Calculate.click();
		
		WebElement emi = driver.findElement(By.cssSelector("#EMI"));
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
