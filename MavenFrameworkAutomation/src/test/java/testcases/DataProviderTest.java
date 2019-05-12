package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testbase.Testbase;
import util.ExcelUtil;

public class DataProviderTest {
	
@DataProvider(name = "Authentication")
	public static Object[][] credentials() throws Exception
	{
//		return new Object[][]
//				{ { "testuser1", "love@123" },{ "testuser_2", "Test@145656"}
	
	ExcelUtil.setExcelData("C:\\NEwWorkspace\\MavenFrameworkAutomation\\src\\main\\resources\\TestUtils.xlsx","Sheet1");
	Object [][] obj = ExcelUtil.getExcelData();
	return obj;
	
	   };

//  }  

	//Here we are calling the Data provider object with its Name

	@Test(dataProvider="Authentication")
	public void test(String sUserName, String sPassword) throws AWTException, IOException {
	Testbase t=new Testbase();
	Testbase.openBrowser();
	Testbase.navigate();
		
	Testbase.driver.findElement(By.id("email")).sendKeys(sUserName);
	Testbase.driver.findElement(By.id("pass")).sendKeys(sPassword);
	Testbase.driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	
}
