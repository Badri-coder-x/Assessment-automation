package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class enteringPage {
	WebDriver driver;
	WebElement enterTheStore;
	
	
	public enteringPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickOnEnterTheStore() {
		enterTheStore = driver.findElement(By.linkText("Enter the Store"));
		enterTheStore.click();
	}
}
