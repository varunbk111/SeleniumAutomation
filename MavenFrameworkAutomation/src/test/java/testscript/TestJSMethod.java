package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Helperpackage.JSExecutorMethod;
import testbase.Testbase;

	public class TestJSMethod {
		public static void main(String[] args) throws Exception {
			
		
		Testbase t = new Testbase();
		Testbase.openBrowser();
		Testbase.navigate();
		//t.navigate();
		WebElement forgot = Testbase.driver.findElement(By.linkText("Forgotten account?"));
		JSExecutorMethod.ClickElementByJS(forgot, Testbase.driver);
		
	}
		
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	}
	

