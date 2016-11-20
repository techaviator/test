package day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Carwale {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.carwale.com/");
		
		driver.findElement(By.id("closeLocIcon")).click();
		driver.findElement(By.xpath("//li[text()= 'Used cars']")).click();
		driver.findElement(By.id("budgetBtn")).click();
		driver.findElement(By.id("maxInput")).click();
		//List<WebElement> li = driver.findElement(By.id("maxPriceList")).findElements(By.tagName("li"));
		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='maxPriceList']/li"));
		for(WebElement x: li)
		{
			System.out.println(x.getText());
		}
		
		driver.close();
		
		
	}

}
