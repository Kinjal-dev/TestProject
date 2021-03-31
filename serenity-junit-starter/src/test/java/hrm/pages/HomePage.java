package hrm.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	HomePageImplementation home;
	
	
	@Step("This step will open the landing page")
	public void navigateToURL()

	{
		home.navigateToURL();
	}
	
	@Step("This step will verify the Title of the landing page")
	public void verifyTitle()

	{
		home.verifyTitle();
	}
	
	@Step("This step will alow to login")
	public void enterCredentials()
	{
		home.enterUsernamePassword();
	}
	
	
	@Step("This step will read login data from csv")
	
	public void enterCredentialsviacsv(String username, String password)
	{
		home.enterUsernamePasswordviaCSV(username, password);
	}
	
	@Step("This step will verify error message on Invalid login")
	public void verifyinvalidLogin()
	{
		home.verifyinvalidLogin();
	}
	
}
