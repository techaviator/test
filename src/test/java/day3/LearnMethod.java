package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnMethod {
	
	public void avg(){
		
		System.out.println((10+20+30)/3);
		
	}
	
	public void print()
	
	{
		avg();
	}
	
	public int add()
	{
		return (10+20+30);
	}
	
	public FirefoxDriver getbrowser()
	{
		FirefoxDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public By getsomething()
	{
		By id = By.id("jim");
		return id;
	}
	
	public String dosomething()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		return driver.findElement(By.id("temp")).getAttribute("value");
	}
	public static void main(String[] args) {
		 LearnMethod learnMethod = new LearnMethod();
		 learnMethod.print();
	}

}
