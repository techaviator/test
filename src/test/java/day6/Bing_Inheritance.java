package day6;



import org.openqa.selenium.By;


public class Bing_Inheritance extends SearchEngine_Inheritance {
	

	
	public void searchString(String searchtext) {
		
		driver.findElement(By.id("sb_form_q")).sendKeys(searchtext);
		driver.findElement(By.name("go")).click();
		
	}

	
	public void displayResult() {
		System.out.println(driver.findElement(By.cssSelector(".sb_count")).getText());
		
	}

	
	

}
