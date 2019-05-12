package Config;

import org.openqa.selenium.By;

import testbase.Testbase;

public class UIActionKeywords extends Testbase {
	
	public static void enterEmail()
	{
		Testbase.driver.findElement(By.id("email")).sendKeys("RahulKumar");
	}
    
	public static void enterPassword()
	{
		Testbase.driver.findElement(By.id("pass")).sendKeys("rahul@123");
	}

	public static void clickLogin()
	{
		Testbase.driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

	
	

}


