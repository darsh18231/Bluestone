package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconst
{
   public static WebDriver driver;
  
   //to open the browser
   @BeforeMethod
   public void preConditions()
   {
	  System.setProperty(GECKO_KEY, GECKO_VALUE);
	   driver=new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.muvi.com/signup");
   }
   
   //to close the browser
   @AfterMethod
   public void postConditions()
   {
	   driver.close();
   }
   
   
}
