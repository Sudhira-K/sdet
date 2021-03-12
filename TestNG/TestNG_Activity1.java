import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Activity1 {
	
WebDriver  driver;
@BeforeMethod
public void beforeMethod()
{
	String MozillaPath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\geckodriver-v0.29.0-win64\\geckodriver.exe";		
	System.setProperty("webdriver.gecko.driver", MozillaPath);
	driver = new FirefoxDriver();
	
//	String ChromePath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\chromedriver_win32\\chromedriver.exe";
//	System.setProperty("webdriver.chrome.driver", ChromePath);
//	driver = new ChromeDriver();
	
//	String IEPath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe";
//	System.setProperty("webdriver.ie.driver", IEPath);
//	driver = new InternetExplorerDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.training-support.net");
	 
	
}

@Test
public void exampleTestCase()
{
	
	String title = driver.getTitle();
	//Print the title of the page
    System.out.println("Page title is: " + title);
        
        //Assertion for page title
    Assert.assertEquals("Training Support", title);
                
    //Find the clickable link on the page and click it
    driver.findElement(By.id("about-link")).click();
                
    //Print title of new page
	
    System.out.println("New page title is: " + driver.getTitle());
    
    Assert.assertEquals(driver.getTitle(), "About Training Support");
}
@AfterMethod
public void afterMethod() {
    //Close the browser
    driver.quit();
}
}
