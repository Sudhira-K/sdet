package OrangeHRM;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRMACT2 {
	
	WebDriver  driver;
	@BeforeMethod
	public void beforeMethod()
	{
//		String MozillaPath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\geckodriver-v0.29.0-win64\\geckodriver.exe";		
//		System.setProperty("webdriver.gecko.driver", MozillaPath);
//		driver = new FirefoxDriver();
		
		String ChromePath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://alchemy.hguy.co/orangehrm");	 
		
	}
	
	@Test
	public void headerURL()
	{
	String urlHeaderIMG = driver.findElement(By.xpath("//div[@id='divLogo']//following::img[1]")).getAttribute("src");
	System.out.println("Header Image URL is  :"+urlHeaderIMG);

	
	}
	
	@AfterMethod
	public void afterMethod() {
	    //Close the browser
	    driver.quit();
	}

}
