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
import pageobjects.homePage;
import utility.reportGenerator;
import utility.screenshotGen;

public class TC3_entersFishPage extends reportGenerator {
	static WebDriver driver;
	@Given("the user is in Home page")
	public void the_user_is_in_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver  = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petstore.octoperf.com");
		enteringPage enterPage = new enteringPage(driver);
		enterPage.clickOnEnterTheStore();
	}
	
	@When("the user clicks on text logo Fish")
	public void the_user_clicks_on_text_logo_Fish() {
	    // Write code here that turns the phrase above into concrete actions
		
		homePage home = new homePage(driver);
	    home.clickOnFishText();
	    hooks.driver = driver;
	}
	
	@Then("the user enters into the Fish product page")
	public void the_user_enters_into_the_Fish_product_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try 
		{	
			test = extent.startTest("TC3", "User enters in the fish page by clicking Fish text");
			driver.findElement(By.linkText("FI-SW-01"));    
			System.out.println("User enters into the Fish page");
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
