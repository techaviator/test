package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sbicalc_manulxpath_Contruct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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

}
