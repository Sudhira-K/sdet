import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Activity3 {
	
	
WebDriver  driver;
	
	@BeforeClass
	public void beforeClass()
	{
		
		String MozillaPath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\geckodriver-v0.29.0-win64\\geckodriver.exe";		
		System.setProperty("webdriver.gecko.driver", MozillaPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.training-support.net/selenium/login-form");
	}

	
	@Test
	public void loginTest()
	{
		WebElement  username = driver.findElement(By.id("username"));
		WebElement  password = driver.findElement(By.id("password"));
		username.sendKeys("admin");
		password.sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click(); 
        String msg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("Title is: " + msg);
        Assert.assertEquals(msg, "Welcome Back, admin");
	}
	

   
    

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }

}
