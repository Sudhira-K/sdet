import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Activity2 {
	WebDriver  driver;
	
	@BeforeClass
	public void beforeClass()
	{
		
		String MozillaPath =  "C:\\Users\\KIRANCHAVAN\\Documents\\SDET TestNG\\geckodriver-v0.29.0-win64\\geckodriver.exe";		
		System.setProperty("webdriver.gecko.driver", MozillaPath);
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}

	
	@Test
	public void testcase1()
	{
		
		  
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
	}
	

    @Test
    public void testCase2() {
        //This test case will Fail
        WebElement blackButton = driver.findElement(By.xpath("//button[@class='ui black button']"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }
    
    @Test(enabled=false)
    
    public void testcase3()
    {
    	//This test will be skipped and not counted
    	String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    
    @Test
    public void testCase4()
    {
    	//This test will be skipped and will be be shown as skipped
    	throw new SkipException("Skipping the Test Case");
    }

    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}
