package testCases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTestCase extends PageObject {
	
	@Managed
	WebDriver driver;
	
	@Test
	public void myGoogleSearch()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		WebElementFacade username=$(By.id("txtUsername"));
        username.shouldBeVisible();
        username.type("Admin");
		$(By.id("txtPassword")).typeAndEnter("admin123");
}

}
