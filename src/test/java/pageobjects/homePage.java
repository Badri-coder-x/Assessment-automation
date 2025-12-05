package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	WebDriver driver;
	WebElement fishText, fishImg;
	
	public homePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickOnFishText() {
		fishText = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
		fishText.click();
	}
	
	
	
	public void clickOnFishImg() {
		fishImg = driver.findElement(By.xpath("//area[@alt='Fish']"));
		fishImg.click();
	}
	
}
