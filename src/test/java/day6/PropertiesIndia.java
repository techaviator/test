package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PropertiesIndia {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.propertiesindia.com/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@src = 'search/about.php']"));
		List<WebElement> frames = driver.findElements(By.xpath("//iframe[@src = 'search/about.php']"));
		System.out.println(frames.size());
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='bar_category'][@value='S']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("News")).click();
	}

}
