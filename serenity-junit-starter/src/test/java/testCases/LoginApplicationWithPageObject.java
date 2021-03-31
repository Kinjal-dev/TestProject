package testCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import hrm.pages.DashboardPage;
import hrm.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginApplicationWithPageObject {
	
	@Managed
	WebDriver driver;
	
	@Steps
	HomePage home;
	
	@Steps
	DashboardPage Dash;
	
	@Test
	@Title("Verify if the user can login successfully with valid credentials")
	public void loginAsAdmin()
	{
         
		 home.navigateToURL();
		 driver.manage().window().maximize();
		 home.verifyTitle();
		// home.verifyinvalidLogin();
		 home.enterCredentials();
		 Dash.verifyLogin();
		 Dash.clickOnLeavelist();
}
	
	@Test
	@Title("Verify if the user can logout successfully")
	public void logoutAsAdmin()
	{
		home.navigateToURL();
		 driver.manage().window().maximize();
		 home.verifyTitle();
		// home.verifyinvalidLogin();
		 home.enterCredentials();
		 Dash.verifyLogin();
		 Dash.verifyGreetings();
		 Dash.goToTimeHeaderLink();
		 Dash.goToReportsDropdown();
		 Dash.clickOnEmployeeReportsLink();
		 //Dash.logout();
	}
}