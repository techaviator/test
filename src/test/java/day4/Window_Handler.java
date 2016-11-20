package day4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handler {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.rediff.com/");
		System.out.println(driver.getTitle());
		String main = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		for(String x :set)
		{
			if(!x.equals(main))
					{
						driver.switchTo().window(x);
						break;
					}
		}
		System.out.println("The popup window has the title");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(main);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
