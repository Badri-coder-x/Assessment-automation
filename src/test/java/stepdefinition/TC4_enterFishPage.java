package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.homePage;
import utility.reportGenerator;
import utility.screenshotGen;

public class TC4_enterFishPage extends reportGenerator {
	WebDriver driver = TC3_entersFishPage.driver;
	@When("the user clicks on the image Fish")
	public void the_user_clicks_on_the_image_Fish() {
	    // Write code here that turns the phrase above into concrete actions
		homePage home = new homePage(driver);
	    home.clickOnFishImg();
	    hooks.driver = driver;
	}
	
	@Then("the user enters into the Fish page by clicking the image")
	public void the_user_enters_into_the_Fish_page_by_clicking_the_image() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try 
		{	
			test = extent.startTest("TC4", "User enters in the fish page by clicking Fish Image");
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
