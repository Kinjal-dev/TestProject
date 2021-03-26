package testCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import hrm.pages.DashboardPage;
import hrm.pages.HomePage;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("DataDriven/login.csv")
public class LoginDDTest {
		
		private String username;

		public void setUsername(String username) {
			this.username = username;
		}

		private String password;

		public void setPassword(String password) {
			this.password = password;
		}

		
	
	   @Managed
		WebDriver driver;
		
		@Steps
		HomePage home;
		
		@Steps
		DashboardPage Dash;
		
		@Test
		@Title("Verify if the user can login successfully with valid credentials via csv")
		public void loginAsAdminviacsv()
		{
	         
			 home.navigateToURL();
			 driver.manage().window().maximize();
			 home.verifyTitle();
			// home.verifyinvalidLogin();
			 home.enterCredentialsviacsv(username, password);
			 Dash.verifyLogin();
			 Dash.clickOnLeavelist();

}
}