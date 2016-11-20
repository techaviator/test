package day3;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.id("lst-ib")).sendKeys("Rajnikanth");
		driver.findElement(By.name("btnG")).click();
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#resultStats")));
		String text = driver.findElement(By.cssSelector("#resultStats")).getText();
		System.out.println("The hits is "+text);
		driver.close();
	}

}
