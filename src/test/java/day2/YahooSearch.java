package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearch {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://search.yahoo.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[class = 'sbq']")).sendKeys("Rajnikath");
		driver.findElement(By.cssSelector("#yschsp")).sendKeys("Rajnikath");
		driver.findElement(By.cssSelector("button.sbb")).click();
		Thread.sleep(5000);
		String result = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		//String result = driver.findElement(By.xpath("//span[text()='1,200,000 results']")).getText();
		System.out.println("The result is "+result);
		driver.close();
	}

}
