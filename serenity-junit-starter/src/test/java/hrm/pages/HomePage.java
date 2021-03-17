package hrm.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	HomePageImplementation home;
	
	@Step("This step will verify the Title")
	public void verifyTitle()

	{
		home.verifyTitle();
	}
	
	@Step("This step will alow to login")
	public void enterCredentials()
	{
		home.enterUsernamePassword();
	}
	
	@Step("This will verify the dashboard")
	public void verifyDashboard()
	{
		home.verifyLogin();
	}
}
