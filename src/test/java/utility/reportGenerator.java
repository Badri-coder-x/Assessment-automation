package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class reportGenerator {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	
	@BeforeSuite
    public void beforeSuite() 
    {
    	extent = new ExtentReports("C:\\Users\\Administrator\\Desktop\\Assessment\\BDDMavenJPetstore\\reports\\report.html", true);
    }
    
    @AfterSuite
    public void afterSuite()
    {
    	extent.flush();
    }
}
