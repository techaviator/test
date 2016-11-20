package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBI_CssSelector {

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
		//Find and Enter the Calculate
		//option1
		//driver.findElement(By.cssSelector("table[class = 'commontable'] tbody tr:nth-child(3) td p input")).click();
		//option2
		//driver.findElement(By.cssSelector("table[class = 'commontable']>tbody>tr:nth-child(3)>td>p>input")).click();
		//option 3
		//driver.findElement(By.cssSelector("table.commontable>tbody>tr:nth-child(3)>td>p>input")).click();
		//option 4
		//driver.findElement(By.cssSelector(".commontable>tbody>tr:nth-child(3)>td>p>input")).click();
		//option 5		
		driver.findElement(By.cssSelector(".commontable>tbody>tr:nth-child(3)>td>p>input[value = 'Calculate']")).click();
		//Find and Enter the EMI
		//String emi = driver.findElement(By.cssSelector("input[name = 'uEmi']")).getAttribute("value");
		//Using regular expression
			//startswith (^)
		//String emi = driver.findElement(By.cssSelector("input[name ^= 'uEm']")).getAttribute("value");
			//endswith($)
		//String emi = driver.findElement(By.cssSelector("input[name $= 'mi']")).getAttribute("value");
			//contains(*)
		String emi = driver.findElement(By.cssSelector("input[name *= 'Em']")).getAttribute("value");
		//Display the emi
		System.out.println(emi);
		//Close the browser
		driver.close();
	}

}
