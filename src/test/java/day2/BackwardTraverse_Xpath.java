package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackwardTraverse_Xpath {

	public static void main(String[] args) {

		//open browser
		FirefoxDriver driver = new FirefoxDriver();
		//launch URL
		driver.get("https://www.sbi.co.in/portal/web/home/emi-calculator");
		//maximize
		driver.manage().window().maximize();
		//Find and Enter the loanamount
		//option1
		//driver.findElement(By.cssSelector("input[name = 'uamount']")).sendKeys("100000");
		//option 2
		driver.findElement(By.cssSelector("input[name = 'uamount'][class = 'textbox']")).sendKeys("100000");
		
		//Find and Enter the interest
		driver.findElement(By.cssSelector("input[name = 'uTime']")).sendKeys("12");
		//Find and Enter the tenure
		driver.findElement(By.cssSelector("input[name = 'uRate']")).sendKeys("60");
	//******************************************************************************************	
		//***using backward traverse -----XPATH---
		//Find and Enter the Calculate			
		driver.findElement(By.xpath("//table[@class = 'commontable']/tbody/tr[3]/td/p/input[@value = 'Reset']/../input")).click();
		
	//************************************************************************************	
		//Find and Enter the EMI		
		String emi = driver.findElement(By.cssSelector("input[name *= 'Em']")).getAttribute("value");
		//Display the emi
		System.out.println(emi);
		//Close the browser
		driver.close();

	}

}
