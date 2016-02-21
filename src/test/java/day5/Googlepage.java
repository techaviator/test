package day5;



import org.openqa.selenium.By;


public class Googlepage extends baseclass {
	
	
	public void getdata()
	{
		driver.findElement(By.xpath(".//input[@id='lst-ib']")).sendKeys("selenium");
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		String text = driver.findElement(By.xpath(".//*[@id='resultStats']")).getText();
		String[] arr = text.split(" ");
		System.out.println(arr[1]);
	}
	
	

}
