package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinkGoogle {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());//Gives the count of link in the page
		WebElement element = links.get(2);
		System.out.println(element.getText());
		
		/*for(int i=0;i<links.size();i++)
		{
			WebElement temp = links.get(i);
			System.out.println(temp.getText());
		}
		*/
		
		for(WebElement x:links)
		{
			System.out.println(x.getText());
		}
		driver.close();
		
	}

}
