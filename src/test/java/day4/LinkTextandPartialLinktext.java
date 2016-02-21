package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextandPartialLinktext {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		//LinkText
		//driver.findElement(By.linkText("Gmail")).click();
		
		
		//Partial link text
		driver.findElement(By.partialLinkText("mail")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
