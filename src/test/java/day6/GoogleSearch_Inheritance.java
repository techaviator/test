package day6;



import org.openqa.selenium.By;


public class GoogleSearch_Inheritance extends SearchEngine_Inheritance {
	

	
	public void searchString(String searchtext) {
		driver.findElement(By.id("lst-ib")).sendKeys(searchtext);
		driver.findElement(By.name("btnG")).click();
		
		
	}

	
	public void displayResult() {
		System.out.println(driver.findElement(By.id("resultStats")).getText());
		
	}

	
	

}
