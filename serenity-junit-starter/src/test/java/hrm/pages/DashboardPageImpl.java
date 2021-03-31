package hrm.pages;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class DashboardPageImpl extends PageObject {
	
	
	
	public void verifyLogin()
    {
    	waitForTextToAppear("Dashboard");
    }
	
	
	public void verifyGreetings()
	{
		
		
		// This will capture greetings message
		String actual_greet = $(By.xpath("//a[@id='welcome']")).getText();
				
				// Store message in variable
				String expect_greet="Welcome Tom";
				
				// Verify error message
				Assert.assertEquals(actual_greet, expect_greet);
		       
		
	}
	
	public void clickOnLeavelist()
	{
		$(By.xpath("//span[@class='quickLinkText']")).click();
	}
	
	
	public void goToTimeHeaderLink()
	{
		WebElementFacade time = $(By.xpath("//a[@id='menu_time_viewTimeModule']"));
		withAction().moveToElement(time).build().perform();
	}
	
	
   public void goToReportsDropdown()
   {
	   WebElementFacade reports = $(By.xpath("//a[@id='menu_time_Reports']"));
		withAction().moveToElement(reports).build().perform();
   }
   
   public void clickOnEmployeeReportsLink()
   {
	   WebElementFacade empreports = $(By.xpath("//a[@id='menu_time_displayEmployeeReportCriteria']"));
		withAction().moveToElement(empreports).build().perform();
   }
   
	
	public void logout()
	{
		WebElementFacade welcome = $(By.xpath("//a[@id='welcome']"));
		welcome.waitUntilClickable().click();
		WebElementFacade logout = $(By.xpath("//a[@href='/index.php/auth/logout']"));
		logout.waitUntilClickable().click();
		logout.shouldNotBeCurrentlyVisible();
	}
	
}
