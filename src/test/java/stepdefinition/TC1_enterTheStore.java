package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.enteringPage;
import utility.reportGenerator;
import utility.screenshotGen;

public class TC1_enterTheStore extends reportGenerator{
	WebDriver driver;
	
	
	@Given("the user is in the Petstore application")
	public void the_user_is_in_the_Petstore_application() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver  = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petstore.octoperf.com");
		
		
		
	}
	
	@When("the user clicks enter the Store")
	public void the_user_clicks_enter_the_Store() {
	    // Write code here that turns the phrase above into concrete actions
		enteringPage enterPage = new enteringPage(driver);
		enterPage.clickOnEnterTheStore();
		hooks.driver = driver;
	}
	
	@Then("the user enters the Home page")
	public void the_user_enters_the_Home_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try 
		{	
			test = extent.startTest("TC1", "User enters in the home page");
			driver.findElement(By.xpath("//img[@src='../images/logo-topbar.svg']"));    
			System.out.println("User enters into the home page");
			test.log(LogStatus.PASS, "Test is passed");
			assertTrue(true);
		}
		catch(Exception e) {
			reportGenerator.driver=driver;
			System.out.println("Element not found");
			screenshotGen.takeScreenshot();
			test.log(LogStatus.FAIL, "Test is failed");
			assertTrue(false);
		}
		
	}
}
