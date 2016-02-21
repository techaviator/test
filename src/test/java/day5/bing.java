package day5;



import org.openqa.selenium.By;


public class bing extends baseclass{
	
	
	public void getdata()
	{
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		driver.findElement(By.id("sb_form_go")).click();
		String text = driver.findElement(By.className("sb_count")).getText();
		String[] arr = text.split(" ");
		System.out.println(arr[0]);
	}
	
}
