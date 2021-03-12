package OrangeHRM;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRMACT4 {
	

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
	public void addEmployee() throws Exception
	{
	try {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kiran1");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Chavan1");
		String id = driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
		Thread.sleep(1000);
		System.out.println("Id :"+id);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(id);
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();		
		List<WebElement> searchId = driver.findElements(By.xpath("//td[@class='left']/child::a"));
		System.out.println(searchId.get(0).getText());
		String searchedID=searchId.get(0).getText();
		assertEquals(id, searchedID);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Error Message :"+e.getMessage());
	}
	
	
	}
	
	@AfterMethod
	public void afterMethod() {
	    //Close the browser
	    driver.quit();
	}

}
