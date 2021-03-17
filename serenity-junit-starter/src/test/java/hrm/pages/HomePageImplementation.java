package hrm.pages;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class HomePageImplementation extends PageObject {
	
	
	public void verifyTitle() 
	{
		String title=getDriver().getTitle();
		Assert.assertTrue(title.contains("OrangeHRM"));
		
	}
	
    public void enterUsernamePassword()

{
	$(By.id("txtUsername")).type("Admin");

	$(By.id("txtPassword")).typeAndEnter("admin123");
	
}
    
    public void verifyLogin()
    {
    	String url=getDriver().getCurrentUrl();
    	Assert.assertTrue(url.contains("dashboard"));
    }
}