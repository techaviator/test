package day8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnTestNG1 {

	
	@Test (priority = 2, dependsOnMethods = "login" )
	public void sendEmail()
	{
		System.out.println("Send Email");
	}
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login");
		Assert.fail();
	}
	
	@Test (priority = 3 , dependsOnMethods = "login")
	public void Logout()
	{
		System.out.println("Logout");
	}
}
