package hrm.pages;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePageImplementation extends PageObject {
	
	
	
	
	
	public void navigateToURL()
	{
		open();
	}
	
	
	public void verifyTitle() 
	{
		waitForTitleToAppear("OrangeHRM");
		
	}
	
    public void enterUsernamePassword()

{
	//$(By.id("txtUsername")).type("Admin");

	//$(By.id("txtPassword")).typeAndEnter("admin123");
    	//syntax for xpath=tagname(@attribute='value')
    	//Insted of $, end find/findBy methods can be used to find element
    	//eg : WebElementFacade fac=find(By.xpath("//input[@name='txtUsername']"));
    	//or WebElementFacade fac=findBy("//input[@name='txtUsername']");
    	
	$(By.xpath("//input[@name='txtUsername']"));
	
	$(By.cssSelector("input[id='txtPassword']")).typeAndEnter("admin123");
    	
	
}
    public void enterUsernamePasswordviaCSV(String username, String password)
    {
    	$(By.xpath("//input[@name='txtUsername']")).type(username);
    	
    	$(By.cssSelector("input[id='txtPassword']")).typeAndEnter(password);
    	
    }
    
    
	public void verifyinvalidLogin()
	{
		$(By.xpath("//input[@name='txtUsername']")).type("test");
		$(By.cssSelector("input[id='txtPassword']")).typeAndEnter("test");
		
		// This will capture error message
		String actual_errmsg=$(By.xpath("//span[@id='spanMessage']")).getText();
		
		// Store message in variable
		String expect="Invalid credentials";
		
		// Verify error message
		Assert.assertEquals(actual_errmsg, expect);
	}
}