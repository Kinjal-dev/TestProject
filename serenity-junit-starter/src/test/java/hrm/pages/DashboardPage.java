package hrm.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class DashboardPage {

	DashboardPageImpl DPL;
	
	@Step("This step will verify navigation to dashboard page")
	public void verifyLogin()
    {
    	DPL.verifyLogin();
    }
	
	@Step("This step will click on Leave List link")
	public void clickOnLeavelist()
	{
		DPL.clickOnLeavelist();
	}
	
	@Step("This step will perform logout operation")
	public void logout()
	{
		DPL.logout();
	}
	
	@Step("This step will verify the greetings message once logged in")
	public void verifyGreetings()
	{
		DPL.verifyGreetings();
	}
	
	@Step("This step will hover over Time header link")
	public void goToTimeHeaderLink()
	{
		DPL.goToTimeHeaderLink();
	}
	
	
	@Step("This step will hover over Reports dropdown ")
	public void goToReportsDropdown()
	   {
		   DPL.goToReportsDropdown();
	   }
	   
	@Step("This step will click on Employee Reports link")
	   public void clickOnEmployeeReportsLink()
	   {
		   DPL.clickOnEmployeeReportsLink();
	   }
}
