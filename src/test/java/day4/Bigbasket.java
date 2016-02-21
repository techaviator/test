package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bigbasket {
	FirefoxDriver driver = null;
	
	public void launchbrowser(String URL)
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	public void getfirstsearchdata() throws InterruptedException
	{
		driver.findElement(By.id("skip_explore")).click();
		driver.findElement(By.id("id_q")).sendKeys("orange");
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[id='uiv2-autosearch-list'] li:nth-child(1) a")));
		driver.findElement(By.cssSelector("ul[id='uiv2-autosearch-list'] li:nth-child(1) a")).click();
	}
	
	public void tear_down()
	{
		driver.close();
	}

}
