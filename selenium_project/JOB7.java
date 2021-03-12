package OrangeHRM;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRMACT7 {
	
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
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test
	public void addQualification() throws Exception
	{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
	driver.findElement(By.xpath("//*[@id='sidenav']/li[9]/a")).click();
	driver.findElement(By.xpath("//input[@id='addWorkExperience']")).click();
	driver.findElement(By.xpath("//input[@id='experience_employer']")).sendKeys("IBMNewestest");
	driver.findElement(By.xpath("//input[@id='experience_jobtitle']")).sendKeys("Manager New SDET");
	driver.findElement(By.xpath("//input[@id='experience_from_date']")).click();
	driver.findElement(By.xpath("//input[@id='experience_from_date']")).sendKeys("2010-12-11");
	driver.findElement(By.xpath("//label[@for='experience_comments']")).click();
	driver.findElement(By.xpath("//input[@id='experience_to_date']")).click();
	driver.findElement(By.xpath("//input[@id='experience_to_date']")).sendKeys("2020-12-11");
	driver.findElement(By.xpath("//label[@for='experience_comments']")).click();
	driver.findElement(By.xpath("//textarea[@id='experience_comments']")).click();
	driver.findElement(By.xpath("//textarea[@id='experience_comments']")).sendKeys("Adding new IBM work exp");
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	
	}
	
	@AfterMethod
	public void afterMethod() {
	    //Close the browser
	    driver.quit();
	}

}
