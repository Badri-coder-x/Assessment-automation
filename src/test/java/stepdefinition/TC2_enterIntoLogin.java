package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import utility.reportGenerator;
import utility.screenshotGen;

public class TC2_enterIntoLogin extends reportGenerator{
	WebDriver driver;
	
	@Then("the user enters the login page")
	
	public void the_user_enters_the_login_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try 
		{	
			test = extent.startTest("TC2", "User doesn't enters into login page");
			driver.findElement(By.name("signon"));   
			System.out.println("User enters into the login page");
			reportGenerator.driver=driver;
			screenshotGen.takeScreenshot();
			test.log(LogStatus.FAIL, "Test is failed");
			assertTrue(false);
			
		}
		catch(Exception e) {
			
			System.out.println("User doesn't enter into the login page");
			
			test.log(LogStatus.PASS, "Test is passed");
			assertTrue(true);
		}
		
	}
}
