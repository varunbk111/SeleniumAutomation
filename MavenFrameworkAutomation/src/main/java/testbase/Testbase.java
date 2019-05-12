package testbase;

 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class Testbase {
 public static Properties pro;
 public static WebDriver driver;
 public static FileInputStream fis;

               

public Testbase()
{

try {
	fis=new FileInputStream ("C:\\NEwWorkspace\\MavenFrameworkAutomation\\src\\main\\java\\Config\\config.properties");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
pro =new Properties();
try {
	pro.load(fis);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public static void openBrowser()
{
                String browserName=pro.getProperty("browser");
                if(browserName.equals("chrome"))
                {
                  System.setProperty("webdriver.chrome.driver", "C:\\NEwWorkspace\\MavenFrameworkAutomation\\Driver\\chromedriver.exe");
                  driver=new ChromeDriver();

                }

                else if(browserName.equals("firefox"))

                {

                                System.setProperty("webdriver.gekco.driver", "C:\\NEwWorkspace\\MavenFrameworkAutomation\\Driver\\chromedriver.exe");

                                driver=new FirefoxDriver();

                               

                }

                driver.manage().window().maximize();

                driver.manage().deleteAllCookies();

                driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

 //               driver.get(pro.getProperty("url"));

}
                
                public static void navigate()
                {
                	driver.get(pro.getProperty("url"));	
                }
                

           
}

