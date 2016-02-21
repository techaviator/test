package day7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngIntro1 {
	
/*	@Test(priority =1)
	public void login()
	{
		System.out.println("Login into my system");
		
	}*/
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login into my system");
		
	}
	
	@Test
	public void SendEmail()
	{
		System.out.println("send email");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from my system");
	}
	
	@Test
	public void checkmail()
	{
		System.out.println("check email");
	}

}
