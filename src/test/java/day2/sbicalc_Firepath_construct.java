package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sbicalc_Firepath_construct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expected = "2224.44";
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		
		driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[1]/input")).sendKeys("100000");
		driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[2]/input")).sendKeys("60");
		driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[3]/input")).sendKeys("12");
		driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[3]/td/p/input[1]")).click();
		
		String actual = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[2]/p[1]/input")).getAttribute("value");
		//validation
		
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
