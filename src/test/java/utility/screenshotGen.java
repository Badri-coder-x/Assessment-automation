package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;

public class screenshotGen extends reportGenerator{
	static int i=1;
	
	public static void takeScreenshot() throws IOException 
    {
    	 
    			System.out.println("Taking screenshot");
    			File scrFile;
    			scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    			Files.copy(scrFile, new File("C:\\Users\\Administrator\\Desktop\\Assessment\\BDDMavenJPetstore\\reports\\screenshots\\screenshot"+i+".jpeg"));
    			i++;
    }
}
