package Helperpackage;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testbase.Testbase;

public class ScreenshotCapture 
{
		
	public static String getScreenshot(WebDriver driver, String ScreenshotName) throws Exception
	{
	String dateName = new SimpleDateFormat ("yyyyMMddhhmmss").format(new Date(0));
	
	TakesScreenshot ts = (TakesScreenshot) Testbase.driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	//after execution, you could see a folder "FailedTestsScreenshot
	String destination = System.getProperty("user.dir")+"//FailedTestsScreenshots//"+"ScreenshotName+dateName"+".png";
	File finalDestination = new File(destination);
	FileHandler.copy(source, finalDestination);
	return destination;

}	
}
	


