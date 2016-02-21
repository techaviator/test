package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bytagname {
	FirefoxDriver driver;
	public void launchbrowser(String URL)
	{
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	public void getlinktext()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		/*for(WebElement element : links)
		{
			System.out.println(element.getText());
		}*/
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
	}
	
	public void tear_down()
	{
		driver.close();
	}
	
	
	public void common_method(String URL)
	{
		launchbrowser(URL);
		 getlinktext();
		 tear_down();
		
	}

}
