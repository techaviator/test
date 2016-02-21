package day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calcxml {

	public static void main(String[] args) throws InterruptedException {
		String expected = "$2,224.44";
//	Open the browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("http://www.calcxml.com/calculators/mortgage-calculator?skn=#top");
		//Identify Amount text box and enter value
		WebElement amount = driver.findElement(By.cssSelector("input[id='loanAmount']"));
		amount.clear();
		amount.sendKeys("100000");
		//Identify Interest text box and enter value
		WebElement interest = driver.findElement(By.cssSelector("input[name='interestRate']"));
		interest.clear();
		interest.sendKeys("12");
		//Identify months text box and enter value
		WebElement months = driver.findElement(By.cssSelector("input[id = 'termMonths'][name='termMonths']"));
		months.clear();
		months.sendKeys("60");
		//Identify Subit button and click action
		WebElement submit = driver.findElement(By.cssSelector("button[class='pure-button pure-button-primary']"));
		submit.click();
		Thread.sleep(5000);
		//Get result from the browser
		WebElement resultset = driver.findElement(By.cssSelector("p[class= 'resultText']"));
		String result = resultset.getText();
		System.out.println(result);
		String[] result_array = result.split(" ");
		System.out.println(result_array[5]);
		System.out.println(expected);
		//VAlidate
		if(expected.equals(result_array[5]))
		{
			System.out.println("The testcase has passed");
		}
		else
		{
			System.out.println("The testcase has failed, the actual is "+ result_array[5]);
		}
		//Close the browser
		driver.close();
		
		
	}
}
