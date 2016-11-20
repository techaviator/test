package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(10000);
		driver.close();

	}

}
