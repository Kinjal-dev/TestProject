package testCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import hrm.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginApplicationWithPageObject {
	
	@Managed
	WebDriver driver;
	
	@Steps
	HomePage home;
	
	@Test
	public void loginAsAdmin()
	{
   
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 home.verifyTitle();
		 home.enterCredentials();
		 home.verifyDashboard();
}
}