package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;

public class hooks {
	public static WebDriver driver;
	
	@After
	public void closeBrowser() {
		if(driver!=null) 
		{
			driver.quit();
		}
		
	}
}
