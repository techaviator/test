package day4;



import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UnionBank {

	public static void main(String[] args) {
		WebDriver driver = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the your browser (ie, chrome or firefox)");
		String browser = scan.nextLine();
		System.out.println("Enter the loanamount and hit enter button");		
		String expected = "2224.44";
		String loanamount = scan.nextLine();
		scan.close();
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspace_2016/September_2016/October2016\\src/test/resources/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\September_2016\\October2016\\src\\test\\resources\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else
		{
			 driver = new FirefoxDriver();
		}
		//FirefoxDriver driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspace_2016/September_2016/October2016\\src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		/*System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\September_2016\\October2016\\src\\test\\resources\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();*/
		driver.manage().window().maximize();
//		FirefoxDriver driver1 = new FirefoxDriver();
		
		//Open URL
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		//Enter the Loan amount
		driver.findElement(By.id("loanamount")).sendKeys(loanamount);
		//Enter the interest
		driver.findElement(By.id("rate")).sendKeys("12");
		//Enter the Tenure
		driver.findElement(By.name("pmonths")).sendKeys("60");
		//Click on the Calculate button
		driver.findElement(By.id("Button1")).click();
		//Get the emi
		String actual = driver.findElement(By.id("EMI")).getAttribute("value");
		System.out.println("The actual emi is "+actual);
		if(actual.equals(expected))
		{
			System.out.println("The testcase has passed "+actual);
		}
		else
		{
			System.out.println("The Test case has failed "+actual);
		}
		//Close the browser
		//driver.close();
		
		driver.quit();
	}

}
